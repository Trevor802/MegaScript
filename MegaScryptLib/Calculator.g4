grammar Calculator;

/* Parser Rules */
program:            (statement | block)*;
block:				'{' statement* '}';
statement:          (declaration | assignment);
declaration:        'var' Id ('=' expression)?';';
assignment:         Id '=' expression';';

expression:         Number | 'false' | 'true' | Id |
					'('expression')'|
					'-'expression|
					'!'expression|
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
Not:                '!';
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
Id:                 (Letter|'_')(Letter|'_'|Digit)*;
WhiteSpaces:        [ \t\r\n]+ -> skip;