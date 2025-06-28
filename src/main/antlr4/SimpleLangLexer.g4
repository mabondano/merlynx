lexer grammar SimpleLangLexer;

// Lexer rules

ID  : [a-zA-Z_][a-zA-Z_0-9]* ;
INT : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip ;

PRINT : 'print' ;
SEMI  : ';' ;
EQ    : '=' ;
LPAREN : '(' ;
RPAREN : ')' ;
PLUS  : '+' ;
MINUS : '-' ;
MULT  : '*' ;
DIV   : '/' ;
