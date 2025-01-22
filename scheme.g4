grammar scheme;

// Programa principal
program
    : expr* EOF
    ;

// Definición de expresiones
expr
    : '(' IDENTIFIER expr* ')'  // Llamadas a función u operadores
    | NUMBER                    // Números
    | BOOLEAN                   // Booleanos
    | STRING                    // Cadenas de texto
    | IDENTIFIER                // Variables
    | QUOTE expr                // Expresión citada
    ;

// Definición de tokens
NUMBER
    : [0-9]+ ('.' [0-9]+)?      // Enteros y flotantes
    ;

BOOLEAN
    : '#t'                      // Verdadero
    | '#f'                      // Falso
    ;

STRING
    : '"' (~["\\] | '\\' .)* '"' // Cadena de texto entre comillas
    ;

IDENTIFIER
    : [a-zA-Z_][a-zA-Z0-9_]*    // Nombres de variables o funciones
    ;

QUOTE
    : '\''                      // Quote literal
    ;

// Operadores
PLUS      : '+' ;
MINUS     : '-' ;
STAR      : '*' ;
SLASH     : '/' ;
LT        : '<' ;
LE        : '<=' ;
GT        : '>' ;
GE        : '>=' ;
EQUAL     : '=' ;
NOT_EQUAL : '<>' ;

// Espacios en blanco y comentarios
WS
    : [ \t\r\n]+ -> skip         // Ignorar espacios en blanco
    ;

COMMENT
    : ';' ~[\r\n]* -> skip       // Comentarios de una sola línea
    ;
