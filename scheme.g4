grammar scheme;

program: statement+ EOF;

statement
    : expr                             # ExpressionStatement
    | functionDefinition               # FuncDef
    | constantDefinition               # ConsDef
    ;

expr
    : '(' operation expr+ ')'          # OperationExpr
    | '(' 'if' expr expr expr ')'      # IfExpr
    | '(' 'cond' condClause+ ')'      # CondExpr
    | '(' 'let' '(' letBinding+ ')' expr ')'  # LetExpr
    | '(' IDENTIFIER expr* ')'         # FunctionCall 
    | '(' 'quote' expr ')'            # QuoteExpr
    | NUMBER                           # NumberExpr
    | IDENTIFIER                       # IdentifierExpr
    | boolean                          # BooleanExpr
    | list                             # ListExpr
    ;

operation
    : '+' | '-' | '*' | '/' | '>' | '<' | '>=' | '<=' | '=' | '<>'
    ;

condClause
    : '(' expr expr ')'
    ;

letBinding
    : '(' IDENTIFIER expr ')'
    ;

list
    : '(' expr* ')'
    ;

functionDefinition
    : '(' 'define' '(' IDENTIFIER IDENTIFIER* ')' expr ')'
    ;

constantDefinition
    : '(' 'define' IDENTIFIER expr ')'
    ;

boolean
    : 'true'
    | 'false'
    ;

NUMBER: [0-9]+;
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;

WS: [ \t\r\n]+ -> skip;
COMMENT: ';' ~[\r\n]* -> skip;