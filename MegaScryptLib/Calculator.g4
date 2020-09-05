grammar Calculator;

/* Parser Rules */

number: Digit+('.'Digit*)?;
boolean: (False|True);

expression:
    number |
    '('expression')' |
    '-'expression |
    expression ('*' | '/') expression |
    expression ('+' | '-') expression;

/* Lexer Rules */

Digit:              [0-9];
True:               'true';
False:              'false';
Dot:                '.';
Plus:               '+';
Minus:              '-';
Multiply:           '*';
Divide:             '/';
LeftParenthesis:    '(';
RightParenthesis:   ')';
WhiteSpaces:        [ \t\r\n]+ -> skip;