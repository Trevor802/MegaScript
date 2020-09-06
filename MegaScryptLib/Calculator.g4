grammar Calculator;

/* Parser Rules */
program:            (statement | block)*;
block:				'{' statement* '}' | statement;
statement:          declaration | assignment | ifStmt | incrementExpr';' | decrementExpr';';
declaration:        'var' Id ('=' expression)?';';
fieldDeclaration:	Id ':' (expression | object);
object:				'{' (fieldDeclaration ',')* fieldDeclaration'}';
assignment:         (Id('.'Id)*) ('='|'+='|'-='|'*='|'/=') expression';';
ifStmt:				'if' '(' expression ')' block 
					('else if' '(' expression ')' block)*
					('else' block)?;
incrementExpr:		'++'Id | Id'++';
decrementExpr:		'--'Id | Id'--';
expression:         Number | 'false' | 'true' | Id | String | Null |
					object |
					incrementExpr|
					decrementExpr|
					'('expression')'|
					expression '.' expression|
					('+'|'-'|'!')expression|
					expression ('*' | '/' | '%') expression |
					expression ('+' | '-') expression|
					expression ('<'|'>'|'<='|'>=') expression|
					expression ('=='|'!=') expression|
					expression '&&' expression|
					expression '||' expression;
					

/* Lexer Rules */

fragment Digit:     [0-9];
fragment Letter:    [a-zA-Z];
Number:             Digit+('.'Digit*)?;
True:				'true';
False:				'false';
Var:                'var';
Null:				'null';
Not:                '!';
Increment:			'++';
Decrement:			'--';
And:                '&&';
Or:                 '||';
Dot:                '.';
Plus:               '+';
Minus:              '-';
Multiply:           '*';
Divide:             '/';
Modulo:             '%';
LeftParenthesis:    '(';
RightParenthesis:   ')';
Greater:            '>';
Less:               '<';
GreaterEqual:       '>=';
LessEqual:          '<=';
Equal:              '==';
NotEqual:           '!=';
AddAss:				'+=';
MinusAss:			'-=';
MultiplyAss:		'*=';
DivideAss:			'/=';
String:				'"'.*?'"';
Id:                 (Letter|'_')(Letter|'_'|Digit)*;
WhiteSpaces:        [ \t\r\n]+ -> skip;