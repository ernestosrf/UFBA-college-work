%option noyywrap yylineno nodefault
%{

// noyywrap    - no need to deal with multiple input files
// yylineno    - variable to track line numbers 
// nodefault   - do not add a default rule at the end of the scanner 
//               that copies otherwise unmatched input to yyout.

#include "blite.tab.h"
#include <stdlib.h>
%}

%%

[ \t\r\n]+ {}

\/\/.* {}

[a-zA-Z][a-zA-Z0-9_]*   {if (strcmp(yytext, "boolean") == 0 ||
        strcmp(yytext, "else") == 0 ||
        strcmp(yytext, "false") == 0 ||
        strcmp(yytext, "function") == 0 ||
        strcmp(yytext, "if") == 0 ||
        strcmp(yytext, "integer") == 0 ||
        strcmp(yytext, "print") == 0 ||
        strcmp(yytext, "return") == 0 ||
        strcmp(yytext, "string") == 0 ||
        strcmp(yytext, "true") == 0 ||
        strcmp(yytext, "void") == 0 ||
        strcmp(yytext, "while") == 0) {
        return KEY;
    } else {
        return ID;
    } }

[0-9]+       { return NUM; }

\"(\\[n0]|[^\"\\\n])*\" { if (yyleng < 256) return STRING; else return ERROR; }

\+|\-|\*|\/|\%|\!|<|>|=|:|;|,|\(|\)|\{|\}   { return SYM; }

\<=|\>=|==|!=|&&|\|\|   { return SYMC; }

.    { return ERROR; }

%%