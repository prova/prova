grammar Where;

options {
   k = 2;
   output = AST;
}

tokens {
	IN;
}

@parser::header {
   package org.provarules.parser;
}

@lexer::header {
   package org.provarules.parser;
}

expr  :  xor_expr;

par_expr:	'(' expr ')' -> expr;

xor_expr:	or_expr ('xor'^ or_expr)*;
	
or_expr :	and_expr ('or'^ and_expr)*;

and_expr:	not_expr ('and'^ not_expr)*;

not_expr:	('not'^)? (par_expr | comparison | in );

comparison
 	:	Identifier (Comparison^ (Identifier | T));
	
in
 	:	Identifier 'in' '(' T (',' T)* ')' -> ^(IN Identifier T+);

fragment
Number	:	DIGIT+ ('.' DIGIT+)?;

fragment
String 
	:	'\'' (~('\'' | '\n' | '\r'))* '\'';

T	:	String | Number;

Comparison
   : '!=' |  '<' | '<=' | '>=' | '>';

WhiteSpace	
   :  (' ' | '\t' | '\n' | '\r')+ { skip(); };

Identifier
   :  CHAR (CHAR | DIGIT)*;
	
fragment
CHAR	:	'a'..'z' | 'A'..'Z' | '_';
	
fragment
DIGIT	:	'0'..'9';
