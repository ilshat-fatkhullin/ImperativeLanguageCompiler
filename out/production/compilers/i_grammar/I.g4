grammar I;

fragment DIGIT : [0-9] ;
fragment LOWERCASE : [a-z] ;
fragment UPPERCASE : [A-Z] ;

PLUS : '+' ;
MINUS: '-' ;
MULTIPLICATION: '*' ;
DIVISION: '/' ;
MOD: '%' ;
TRUE: 'true' ;
FALSE: 'false' ;
LESS: '<' ;
LESS_OR_EQUAL: '<=' ;
GREATER: '>' ;
GREATER_OR_EQUAL : '>=' ;
EQUAL : '=' ;
NOT_EQUAL : '/=' ;
ASSIGN : ':=' ;
AND : 'and' ;
OR : 'or' ;
XOR : 'xor' ;
IF : 'if' ;
THEN : 'then' ;
ELSE : 'else' ;
END : 'end' ;
FOREACH : 'foreach' ;
FROM : 'from' ;
LOOP : 'loop' ;
IN : 'in' ;
REVERSE : 'reverse' ;
FOR : 'for' ;
WHILE : 'while' ;
ARRAY : 'array' ;
RECORD : 'record' ;
INTEGER : 'integer' ;
REAL : 'real' ;
BOOLEAN : 'boolean' ;
ROUTINE : 'routine' ;
RETURN : 'return' ;
TYPE : 'type' ;
IS : 'is' ;
VAR : 'var' ;
COLON : ':';
DOT : '.' ;
DOTDOT : '..' ;
COMMA : ',' ;
LPAREN : '(';
RPAREN : ')';
IDENTIFIER : (LOWERCASE | UPPERCASE) (LOWERCASE | UPPERCASE | DIGIT | '_')* ;
INTEGER_LITERAL : ('0' .. '9') + ;
REAL_LITERAL : ('0' .. '9') + (('.' ('0' .. '9') + (EXPONENT)?)? | EXPONENT) ;

WS : [ \t\r\n^Z]+ -> skip ;

fragment EXPONENT : ('e') ('+' | '-')? ('0' .. '9') + ;

program
    : ( simple_declaration | routine_declaration )*
    ;

simple_declaration
    : (variable_declaration | type_declaration )+
    ;

variable_declaration
    : VAR IDENTIFIER COLON type ( IS expression )? | VAR IDENTIFIER IS expression
    ;

type_declaration
    : TYPE IDENTIFIER IS type
    ;

routine_declaration
    : ROUTINE IDENTIFIER parameters (COLON type)? IS body END
    ;

parameters
    : LPAREN (parameter_declaration ( COMMA parameter_declaration )*)? RPAREN
    ;

parameter_declaration
    : IDENTIFIER COLON type
    ;

type
    : primitive_type | array_type | record_type | IDENTIFIER
    ;

primitive_type
    : INTEGER | REAL | BOOLEAN
    ;

record_type
    : RECORD ( variable_declaration ) END
    ;

array_type
    : ARRAY LPAREN expression RPAREN type
    ;

body
    : (simple_declaration)* (statement)* (return_statement)?
    ;

statement
    : assignment | routine_call | while_loop | for_loop | foreach_loop | if_statement
    ;

return_statement
    : RETURN IDENTIFIER
    ;

assignment
    : modifiable_primary ASSIGN expression
    ;

routine_call
    : IDENTIFIER LPAREN ( expression ( COMMA expression )*)? RPAREN
    ;

while_loop
    : WHILE expression LOOP body END
    ;

for_loop
    : FOR IDENTIFIER range LOOP body END
    ;

range
    : IN REVERSE? expression DOTDOT expression
    ;

foreach_loop
    : FOREACH IDENTIFIER FROM modifiable_primary LOOP body END
    ;

if_statement
    : IF expression THEN body ( ELSE body )? END
    ;

expression
    : relation ( ( AND | OR | XOR ) relation )?
    ;

relation
    : simple ( ( LESS | LESS_OR_EQUAL | GREATER | GREATER_OR_EQUAL | EQUAL | NOT_EQUAL ) simple )?
    ;

simple
    : factor ( ( MULTIPLICATION | DIVISION | MOD ) factor )?
    ;

factor
    : summand ( ( PLUS | MINUS ) summand )?
    ;

summand
    : routine_call | primary | ( LPAREN expression RPAREN )
    ;

primary
    : INTEGER_LITERAL | REAL_LITERAL | TRUE | FALSE | modifiable_primary
    ;

modifiable_primary
    : IDENTIFIER ( DOT IDENTIFIER )* (LPAREN expression RPAREN)* ( DOT IDENTIFIER )*
    ;