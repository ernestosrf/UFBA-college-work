#include <stdio.h> 
#include <stdlib.h> 
#include "e8.tab.h"
#include "ast.h"

/* parser */

int yyparse();
extern int parser_result; /* definir e atribuir valor a parser_result em e8.y */

int main()
{
    if (yyparse()) 
	fprintf(stdout, "syntax error\n");
    else {
        AstNode* root = createValueNode(parser_result);
        if (root) {
            int result = evaluate(root);
            printf("%d\n", result);
            freeTree(root);
        } else {
            printf("syntax error\n");
        }
    }
     
    exit(0);
}
