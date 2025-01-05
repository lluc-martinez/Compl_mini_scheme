grammar scheme;

// Lexer rules should come before parser rules
BOOLEAN
    : '#t'
    | '#f'
    ;

QUOTE
    : '\''
    ;

STRING
    : '"' (~["\r\n] | '\\"')* '"'
    ;

NUMBER
    : '-'? [0-9]+ ('.' [0-9]+)?  // allow optional decimal part
    ;

IDENTIFIER
    : [a-zA-Z_+\-*/<>=][a-zA-Z_0-9+\-*/<>=?]*
    ;

WS
    : [ \t\r\n]+ -> skip
    ;

COMMENT
    : ';' ~[\r\n]* -> skip
    ;

// Parser rules
program
    : expr* EOF
    ;

expr
    : '(' 'define' '(' IDENTIFIER IDENTIFIER* ')' expr+ ')'  # FuncDef
    | '(' 'define' IDENTIFIER expr ')'                      # VarDef
    | '(' 'let' '(' letBinding+ ')' expr+ ')'              # LetExpr
    | '(' 'if' expr expr expr ')'                          # IfExpr
    | '(' 'cond' condClause+ ')'                           # CondExpr
    | '(' 'lambda' '(' IDENTIFIER* ')' expr+ ')'           # LambdaExpr
    | '(' operation expr+ ')'                              # OperationExpr
    | '(' IDENTIFIER expr* ')'                             # FunctionCall
    | QUOTE expr                                           # QuoteExpr
    | NUMBER                                               # NumberExpr
    | STRING                                               # StringExpr
    | IDENTIFIER                                           # IdentifierExpr
    | BOOLEAN                                              # BooleanExpr
    | '(' expr* ')'                                        # ListExpr
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
