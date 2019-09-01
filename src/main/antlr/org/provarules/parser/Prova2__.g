lexer grammar Prova2;
@header {
       package org.provarules.parser;
   }

DOT : '.' ;
PLUS : '+' ;
MINUS : '-' ;
MULT : '*' ;
DIV : '/' ;
COMMA : ',' ;
IF : ':-' ;
CUT : '!' ;
OPEN : '(' ;
CLOSE : ')' ;
BAR : '|' ;
BRA : '[' ;
KET : ']' ;
EQUAL : '=' ;
NOT_EQUAL1 : '<>' ;
NOT_EQUAL2 : '!=' ;
LT : '<' ;
GT : '>' ;
LE : '<=' ;
GE : '>=' ;
REM : '//' ;
T63 : '@' ;

// $ANTLR src "F:\sdp\workspace34\prova-2.0-trunk\src\main\antlr\org\provarules\parser\Prova2.g" 244
EXPONENT
	:	'e' '-'? DIGIT+
;
// $ANTLR src "F:\sdp\workspace34\prova-2.0-trunk\src\main\antlr\org\provarules\parser\Prova2.g" 247
LONG_LITERAL	:	DIGIT+ 'L';

// $ANTLR src "F:\sdp\workspace34\prova-2.0-trunk\src\main\antlr\org\provarules\parser\Prova2.g" 249
INT_LITERAL:
    DIGIT+
;

// $ANTLR src "F:\sdp\workspace34\prova-2.0-trunk\src\main\antlr\org\provarules\parser\Prova2.g" 253
NEWLINE :	('%' (~('\r'|'\n') )*)? ('\r'? '\n')?;

// $ANTLR src "F:\sdp\workspace34\prova-2.0-trunk\src\main\antlr\org\provarules\parser\Prova2.g" 255
fragment LC 	:	'a'..'z';

// $ANTLR src "F:\sdp\workspace34\prova-2.0-trunk\src\main\antlr\org\provarules\parser\Prova2.g" 257
fragment UC 	:	'A'..'Z';

// $ANTLR src "F:\sdp\workspace34\prova-2.0-trunk\src\main\antlr\org\provarules\parser\Prova2.g" 259
LCWORD 	:	(LC | DOLLAR) WORD;

// $ANTLR src "F:\sdp\workspace34\prova-2.0-trunk\src\main\antlr\org\provarules\parser\Prova2.g" 261
fragment WORD
	: (LC | UC | UNDERSCORE | ':' | DIGIT)*;
	
// $ANTLR src "F:\sdp\workspace34\prova-2.0-trunk\src\main\antlr\org\provarules\parser\Prova2.g" 264
fragment UNDERSCORE
	:	'_'
	;

// $ANTLR src "F:\sdp\workspace34\prova-2.0-trunk\src\main\antlr\org\provarules\parser\Prova2.g" 268
fragment DOLLAR
	:	'$'
	;

// $ANTLR src "F:\sdp\workspace34\prova-2.0-trunk\src\main\antlr\org\provarules\parser\Prova2.g" 272
UCWORD 	:	UC (LC | UC | UNDERSCORE | ':' | DIGIT)*;

// $ANTLR src "F:\sdp\workspace34\prova-2.0-trunk\src\main\antlr\org\provarules\parser\Prova2.g" 274
USWORD 	:	UNDERSCORE (LC | UC | UNDERSCORE | DIGIT)*;

// $ANTLR src "F:\sdp\workspace34\prova-2.0-trunk\src\main\antlr\org\provarules\parser\Prova2.g" 276
ML_COMMENT
   :   '/*' (options {greedy=false;} : .)* '*/' {$channel=HIDDEN;}
    ;

// $ANTLR src "F:\sdp\workspace34\prova-2.0-trunk\src\main\antlr\org\provarules\parser\Prova2.g" 280
WS : ( '\t' | ' ' | '\u000C' )+ { $channel = HIDDEN; } ;

// $ANTLR src "F:\sdp\workspace34\prova-2.0-trunk\src\main\antlr\org\provarules\parser\Prova2.g" 282
fragment DIGIT	: '0'..'9' ;

// $ANTLR src "F:\sdp\workspace34\prova-2.0-trunk\src\main\antlr\org\provarules\parser\Prova2.g" 284
STRING1	:	'\'' CLEAN_STRING* (STRING2 CLEAN_STRING*)* '\'';

// $ANTLR src "F:\sdp\workspace34\prova-2.0-trunk\src\main\antlr\org\provarules\parser\Prova2.g" 286
STRING2	:	'"' CLEAN_STRING* (STRING1 CLEAN_STRING*)* '"';

// $ANTLR src "F:\sdp\workspace34\prova-2.0-trunk\src\main\antlr\org\provarules\parser\Prova2.g" 288
CLEAN_STRING
	:	~('\''|'\"') | CHAR_ESC;

// $ANTLR src "F:\sdp\workspace34\prova-2.0-trunk\src\main\antlr\org\provarules\parser\Prova2.g" 291
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

