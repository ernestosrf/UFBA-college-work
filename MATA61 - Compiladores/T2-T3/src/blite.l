%option noyywrap yylineno nodefault
%{
#include "blite.tab.h"
%}

%%

"//".*                      { /* Comentário: Ignorar */ }

"void"           { return VOID; }
"boolean"        { return BOOLEAN; }
"integer"        { return INTEGER; }
"function"       { return FUNCTION; }
"if"             { return IF; }
"else"           { return ELSE; }
"while"          { return WHILE; }
"return"         { return RETURN; }
"print"          { return PRINT; }
"true"           { return TRUE; }
"false"          { return FALSE; }

[a-zA-Z][a-zA-Z0-9_]{0,255} { return ID; }

[0-9]+           { return NUMBER; }

"+"		         { return PLUS; }
"-"              { return MINUS; }
"*"              { return MULT; }
"/"              { return DIV; }
"="              { return ASSIGN; }
"<"              { return LT; }
">"              { return GT; }
"<="             { return LTE; }
">="             { return GTE; }
"=="             { return EQ; }
"!="             { return NEQ; }

":"              { return COLON; }
";"              { return SEMICOLON; }
","              { return COMMA; }
"("              { return OPENP; }
")"              { return CLOSEP; }
"{"              { return OPENC; }
"}"              { return CLOSEC; }

[ \t\r\n]        { /* Espaçamento: Ignorar */ }
.                { return ERROR; }

%%
