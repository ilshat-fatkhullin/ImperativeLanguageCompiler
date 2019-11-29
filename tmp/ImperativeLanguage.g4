grammar ImperativeLanguage;

fragment DIGIT : [0-9] ;
fragment LOWERCASE : [a-z] ;
fragment UPPERCASE : [A-Z] ;

IDENTIFIER : (LOWERCASE | UPPERCASE) (LOWERCASE | UPPERCASE | DIGIT | '_')* ;
WHITESPACE : (' ' | '\t')* ;

PLUS : '+' ;
MINUS: '-' ;
MINUS: '*' ;
MINUS: '/' ;
MINUS: '%' ;