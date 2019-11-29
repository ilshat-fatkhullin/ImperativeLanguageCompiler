grammar ImperativeLanguage;

fragment DIGIT : [0-9] ;
fragment LOWERCASE : [a-z] ;
fragment UPPERCASE : [A-Z] ;

IDENTIFIER : (LOWERCASE | UPPERCASE) (LOWERCASE | UPPERCASE | DIGIT | '_')* ;
WHITESPACE : (' ' | '\t')* ;

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