
grammar Merlynx;

@header {
package com.merlab.merlynx.parser;
}
/*
options {
    language = Java;
}
*/

// Regla principal: un programa es una lista de pipelines o declaraciones
program
    : statement* EOF
    ;

// Una declaración puede ser un pipeline o una declaración simple (por ahora solo pipeline)
statement
    : pipelineDecl
    ;

// Definición simple de pipeline
pipelineDecl
    : 'pipeline' ID '{'
        pipelineBody
      '}'
    ;

// Cuerpo del pipeline: puede tener entradas, procesos y salidas
pipelineBody
    : pipelineStatement*
    ;

pipelineStatement
    : 'input' ':' ID ';'
    | 'process' ':' expression ';'
    | 'output' ':' ID ';'
    ;

// Expresiones sencillas: por ahora solo llamada a función con un argumento
expression
    : ID '(' ID ')'
    ;

// Identificador
ID
    : [a-zA-Z_] [a-zA-Z_0-9]*
    ;

// Espacios y comentarios
WS
    : [ \t\r\n]+ -> skip
    ;

COMMENT
    : '//' ~[\r\n]* -> skip
    ;

MULTILINE_COMMENT
    : '/*' .*? '*/' -> skip
    ;

