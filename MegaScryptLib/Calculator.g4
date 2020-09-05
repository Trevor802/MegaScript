grammar Calculator;

/* Parser Rules */

number:         Digit+('.'Digit*)?;
bool:           (False|True);

booleanExpr:    bool|
                '('booleanExpr')'|
                '!'booleanExpr|
                booleanExpr '&&' booleanExpr|
                booleanExpr '||' booleanExpr;

numericExpr:     number |
                '('numericExpr')'|
                '-'numericExpr |
                numericExpr ('*' | '/') numericExpr |
                numericExpr ('+' | '-') numericExpr;

expression:     booleanExpr |
                numericExpr;

/* Lexer Rules */

Digit:              [0-9];
True:               'true';
False:              'false';
Not:                '!';
And:                '&&';
Or:                 '||';
Dot:                '.';
Plus:               '+';
Minus:              '-';
Multiply:           '*';
Divide:             '/';
LeftParenthesis:    '(';
RightParenthesis:   ')';
WhiteSpaces:        [ \t\r\n]+ -> skip;