grammar Calculator;

/* Parser Rules */

number:         Digit+('.'Digit*)?;
bool:           ('false'|'true');

numericExpr:     number |
                '('numericExpr')'|
                '-'numericExpr |
                numericExpr ('*' | '/' | '%') numericExpr |
                numericExpr ('+' | '-') numericExpr;

booleanExpr:    bool|
                '('booleanExpr')'|
                '!'booleanExpr|
                booleanExpr ('==' | '!=') booleanExpr|
                booleanExpr '&&' booleanExpr|
                booleanExpr '||' booleanExpr|
                numericExpr ('<'|'>'|'<='|'>=') numericExpr|
                numericExpr ('=='|'!=') numericExpr;

expression:     booleanExpr |
                numericExpr;

/* Lexer Rules */

Digit:              [0-9];
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
WhiteSpaces:        [ \t\r\n]+ -> skip;