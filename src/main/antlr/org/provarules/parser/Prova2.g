grammar Prova2;

options {
	output=AST;
	ASTLabelType=ProvaAST;
}

tokens {
	DOT = '.';
	PLUS 	= '+' ;
	MINUS	= '-' ;
	MULT	= '*' ;
	DIV	= '/' ;
	COMMA = ',';
	IF = ':-';
	CUT = '!';
	OPEN = '(';
	CLOSE = ')';
	BAR = '|';
	BRA = '[';
	KET = ']';
	EQUAL = '=';
	NOT_EQUAL1 = '<>';
	NOT_EQUAL2 = '!=';
	LT = '<';
	GT = '>';
	LE = '<=';
	GE = '>=';
	CLAUSE;
	RULEBASE;
	STATEMENT;
	QUERY;
	LITERAL;
	METADATA;
	RELATION;
	SEMANTIC_ATTACHMENT;
	ARITHMETIC_RELATION;
	PREDICATE;
	TERM;
	INSTANCE_JAVA_CALL;
	STATIC_JAVA_CALL;
	LIST_BODY;
	PROVA_LIST;
	ARGS;
	TYPED_VARIABLE;
	USWORD;
	QUALIFIED_JAVA_CLASS;
	ANNOTATION;
	REM = 'mod';
	DOLLARWORD;
	GUARD;
	ATERM;
	EXPR;
	PROVA_MAP;
	KEY_VALUE;
	FUNCTION;
	FUNCTION_CALL;
}

@header {
       package org.provarules.parser;

	import ProvaAST;
	import ProvaErrorReporter;
}

@lexer::header {
       package org.provarules.parser;
}

@members {
    private ProvaErrorReporter errorReporter = null;

    public void setErrorReporter(ProvaErrorReporter errorReporter) {
        this.errorReporter = errorReporter;
    }

    public void emitErrorMessage(String msg) {
        errorReporter.reportError(msg);
    }

}

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

rulebase 
	:	statement* NEWLINE* EOF-> ^(RULEBASE statement*);

statement 
	:	NEWLINE* stat end_of_statement -> ^(STATEMENT stat);

end_of_statement
	:	NEWLINE* DOT (NEWLINE | EOF);
		
stat 	:	clause
		| query
		| function;

function	
	:	metadata? LCWORD list_body0 ':' list_body0 ('=' literals)? -> ^(CLAUSE metadata? LCWORD list_body0 list_body0 literals?);

function_call	
	:	predicate list_body0 (':' list_body0)? -> ^(FUNCTION_CALL predicate list_body0 list_body0?);

query 	:	IF NEWLINE* query_predicate NEWLINE* '(' NEWLINE* relation NEWLINE* ')' -> ^(QUERY query_predicate relation);

query_predicate 
	:	constant;

clause 	:	metadata? relation (IF literals)? -> ^(CLAUSE metadata? relation literals?);

metadata
	:	(annotation NEWLINE*)+ -> ^(METADATA annotation+)
;

annotation
	:	'@' LCWORD ('(' value (COMMA value)* ')')? -> ^(ANNOTATION LCWORD value*)
;
	
value 
	:	LCWORD | UCWORD | string | number
;

literals 	:	literal (COMMA literal)* -> ^(LITERAL literal+);

literal 	:	NEWLINE* m=metadata? r=relation g=guard? -> ^(RELATION metadata? relation guard?)
			| NEWLINE* m=metadata? semantic_attachment g=guard? -> ^(SEMANTIC_ATTACHMENT metadata? semantic_attachment guard?)
			| NEWLINE* metadata? function_call -> ^(FUNCTION metadata? function_call)
			| NEWLINE* cut -> ^(CUT cut);

cut	:	CUT;

binary_operator
	:	not_equal | LT | GT | LE | GE
	;

relation 
	:	predicate '(' list_body ')' -> ^(PREDICATE predicate list_body);

guard
	:	'[' literals ']' -> ^(GUARD literals)
	;

list_body
 	:	(terms ('|' list_tail)?)? NEWLINE* -> ^(LIST_BODY (terms list_tail?)?);

list_body0
 	:	terms0 ('|' list_tail)? -> ^(LIST_BODY terms0 list_tail?);

list_tail 
	:	variable | prova_list;

left_term 
	:	constant | 
		variable |
		number |
		prova_list;

right_term 
	:	(MINUS? (constant | variable)) | number | prova_list | prova_map;

prova_map	
	:	'{' key_value? (',' key_value)* '}' -> ^(PROVA_MAP key_value*)
	;

key_value
	:	mstring ('->'|':') term -> ^(KEY_VALUE mstring term)	
	;
	
terms 	:	NEWLINE* term (NEWLINE* ',' NEWLINE* term)* -> ^(TERM term+);

terms0 	:	term+ -> ^(TERM term+);

term	:	left_term | func_term | prova_map;

func_term
	:	func args;
	
qualified_java_class 
	:	((LCWORD DOT)+ UCWORD) -> ^(QUALIFIED_JAVA_CLASS (LCWORD DOT)+ UCWORD)
;
	
prova_list 
	:	'[' list_body ']' -> ^(PROVA_LIST list_body);

args 	:	'(' list_body ')' -> ^(ARGS list_body);

semantic_attachment 
	:	predicate_java_call | binary_operation;

binary_operation
	:	left_term
		( EQUAL
			(
			constructor_java_call
			| prova_list
			| constant
			| expr
			)
		| not_equal constant
		| binary_operator expr )
	;

expr	: aterm ((PLUS | MINUS) aterm)*;
	
aterm	: (MINUS? variable | number | MINUS? predicate_java_call | OPEN expr CLOSE) (( MULT | DIV | REM ) aterm)?;

constructor_java_call
	:	(qualified_java_class | UCWORD) args
	;

predicate_java_call
	:	static_java_call | instance_java_call
	;

instance_java_call
	:	instance_call args -> ^(INSTANCE_JAVA_CALL instance_call args)
	;

static_java_call
	:	static_call args -> ^(STATIC_JAVA_CALL static_call args)
	;

method 	:	LCWORD;

func	:	LCWORD | UCWORD | string | typed_variable;

predicate 
	:	LCWORD | UCWORD | string;

variable:	UCWORD | USWORD | typed_variable | DOLLARWORD;

variable_or_number 
	:	variable | number;

word	:	LCWORD | UCWORD;

// The parser does not know exactly what it is.
// It could be in fact a public field in a class.
// The actial decision is done by the tree parser ProvaWalker
typed_variable 
	:
		qualified_java_class DOT word -> ^(TYPED_VARIABLE qualified_java_class word)
		| UCWORD DOT word -> ^(TYPED_VARIABLE UCWORD word)
;

// This case can be reassessed by the tree walker when 'variable' is in fact
//    the name of a class from default packages java.lang or org.provarules
instance_call
	:	variable DOT LCWORD -> variable LCWORD
;
	
static_call
	:	(qualified_java_class DOT LCWORD) -> qualified_java_class LCWORD
;

pos_number	:	INT_LITERAL | LONG_LITERAL | float_literal/*FLOAT_LITERAL*/;

number
	:	('-')? pos_number;

mstring		:
	LCWORD | string;
	
constant	:
	LCWORD | string | qualified_java_class;

string	:	STRING1 | STRING2;

not_equal 
	:	NOT_EQUAL1 | NOT_EQUAL2;

// Must use a parser here because of the conflict with end_of_statement
float_literal 	:	INT_LITERAL DOT INT_LITERAL EXPONENT?;

/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

EXPONENT
	:	'e' '-'? DIGIT+
;
LONG_LITERAL	:	DIGIT+ 'L';

INT_LITERAL:
    DIGIT+
;

NEWLINE :	('%' (~('\r'|'\n') )*)? ('\r'? '\n')?;

fragment LC 	:	'a'..'z';

fragment UC 	:	'A'..'Z';

LCWORD 	:	LC WORD;

DOLLARWORD
	:	DOLLAR WORD;

fragment WORD
	: (LC | UC | UNDERSCORE | DIGIT)*;
	
fragment UNDERSCORE
	:	'_'
	;

fragment DOLLAR
	:	'$'
	;

UCWORD 	:	UC (LC | UC | UNDERSCORE | ':' | DIGIT)*;

USWORD 	:	UNDERSCORE (LC | UC | UNDERSCORE | DIGIT)*;

ML_COMMENT
   :   '/*' (options {greedy=false;} : .)* '*/' {$channel=HIDDEN;}
    ;

WS : ( '\t' | ' ' | '\u000C' )+ { $channel = HIDDEN; } ;

fragment DIGIT	: '0'..'9' ;

STRING1	:	'\'' CLEAN_STRING* (STRING2 CLEAN_STRING*)* '\'';

STRING2	:	'"' CLEAN_STRING* (STRING1 CLEAN_STRING*)* '"';

CLEAN_STRING
	:	~('\''|'\"') | CHAR_ESC;

fragment CHAR_ESC	returns [Character ret]:
    '\\'
    ( 'n'  { $ret='\n'; }
    | 'r'  { $ret='\r'; }
    | 't'  { $ret='\t'; }
    | 'b'  { $ret='\b'; }
    | 'f'  { $ret='\f'; }
    | '\"' { $ret='\"'; }
    | '\'' { $ret='\''; }
    | '\\' { $ret='\\'; }
    )
;

