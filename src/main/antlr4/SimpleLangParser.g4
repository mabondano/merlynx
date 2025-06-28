parser grammar SimpleLangParser;

options { tokenVocab=SimpleLangLexer; }

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
    : PRINT expr SEMI
    ;

assignStmt
    : ID EQ expr SEMI
    ;

exprStmt
    : expr SEMI
    ;

expr
    : expr op=(MULT | DIV) expr
    | expr op=(PLUS | MINUS) expr
    | INT
    | ID
    | LPAREN expr RPAREN
    ;
