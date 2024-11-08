%{
#include <stdio.h>
#include <stdlib.h>

/* interface to lexer */

extern int yylineno; /* from lexer */
void yyerror(const char *);
int yylex();
%}

%token VOID INTEGER BOOLEAN FUNCTION TRUE FALSE ID PLUS MINUS MULT DIV LT LTE GT GTE EQ NEQ NUMBER IF ELSE WHILE RETURN PRINT COLON SEMICOLON COMMA OPENP CLOSEP OPENC CLOSEC ERROR EQUAL ASSIGN

%%

program: /* empty */
       | program declaration
       ;

declaration: variable_declaration SEMICOLON
           | function_declaration
           ;

variable_declaration: ID COLON type
                  | ID COLON type ASSIGN expression
                  ;

type: INTEGER
    | BOOLEAN
    ;

function_declaration: ID COLON FUNCTION type OPENP parameters CLOSEP ASSIGN block
               ;

parameters: /* empty */
          | param_list
          ;

param_list: param_list COMMA param
          | param
          ;

param: ID COLON type
     ;

block: OPENC statements CLOSEC
     ;

statements: /* empty */
          | statements statement
          ;

statement: assignment_statement
         | return_statement
         | if_statement
         | while_statement
         | print_statement
         ;

assignment_statement: ID ASSIGN expression SEMICOLON
                    ;

return_statement: RETURN expression SEMICOLON
               | RETURN SEMICOLON
               ;

if_statement: IF OPENP expression CLOSEP block
           | IF OPENP expression CLOSEP block ELSE block
           ;

while_statement: WHILE OPENP expression CLOSEP block
               ;

print_statement: PRINT expression_list SEMICOLON
               ;

expression_list: /* empty */
              | expr_list
              ;

expr_list: expr_list COMMA expression
         | expression
         ;

expression: INTEGER
          | BOOLEAN
          | OPENP expression CLOSEP
          | expression PLUS term
          | expression MINUS term
          | term
          ;

term: term MULT factor
    | term DIV factor
    | factor
    ;

factor: factor LT unary
      | factor LTE unary
      | factor GT unary
      | factor GTE unary
      | factor EQ unary
      | factor NEQ unary
      | unary
      ;

unary: ID
     | NUMBER
     | TRUE
     | FALSE
     | function_call
     ;

function_call: ID OPENP expression_list CLOSEP
             ;

%%

void yyerror(const char *s) {
   fprintf(stdout, "%s\n", s);
}