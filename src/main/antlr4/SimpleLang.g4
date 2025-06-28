grammar SimpleLang;

// Parser rules

program
    : statement* EOF
    ;

statement
    : printStmt
    | assignStmt
    | exprStmt
    ;

printStmt
    : 'print' expr ';'
    ;

assignStmt
    : ID '=' expr ';'
    ;

exprStmt
    : expr ';'
    ;

expr
    : expr op=('*'|'/') expr
    | expr op=('+'|'-') expr
    | INT
    | ID
    | '(' expr ')'
    ;

// Lexer rules

ID  : [a-zA-Z_][a-zA-Z_0-9]* ;
INT : [0-9]+ ;

WS  : [ \t\r\n]+ -> skip ;

