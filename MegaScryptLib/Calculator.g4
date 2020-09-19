// antlr4 -Dlanguage=CSharp Calculator.g4 -no-listener -visitor -o Generated
// antlr4 Calculator.g4 
// javac Calculator*.java
// grun Calculator program -gui
grammar Calculator;

/* Parser Rules */
program:            (statement | block)*;
block:				'{' statement* '}' | statement;
statement:          declaration';' | assignment | ifStmt | incrementExpr';' | decrementExpr';' | invocation';' | retStmt';' | breakStmt';' | continueStmt';' | loopStmt;
loopStmt:			forStmt | whileStmt | doWhileStmt';' | foreachStmt;
declaration:        'var' Id ('=' expression)?;
funcDeclaration:	'function''('varList?')''{'statement*'}';
varList:			'var' Id (',''var' Id)*;
fieldDeclaration:	Id ':' expression;
array:				'['paramList?']';
object:				'{' (fieldDeclaration ',')* fieldDeclaration'}';
assignment:         expression ('='|'+='|'-='|'*='|'/=') expression';';
forAssign:			assignment | incrementExpr | decrementExpr;
paramList:			expression (','expression)*;
ifStmt:				'if' '(' expression ')' block 
					('else if' '(' expression ')' block)*
					('else' block)?;
forStmt:			'for''('declaration?';'expression?';'forAssign?')'block;
whileStmt:			'while''('expression')'block;
doWhileStmt:		'do'block'while''('expression')';
foreachStmt:		'foreach''('declaration'in'expression')'block;
retStmt:			'return' expression?;
breakStmt:			'break';
continueStmt:		'continue';
incrementExpr:		'++'Id | Id'++';
decrementExpr:		'--'Id | Id'--';
expression:         Number | 'false' | 'true' | Id | String | Null |
					funcDeclaration|
					object |
					array |
					incrementExpr|
					decrementExpr|
					'('expression')'|
					expression '.' expression|
					expression '(' paramList? ')'|
					expression '[' expression ']'|
					('+'|'-'|'!')expression|
					expression ('*' | '/' | '%') expression |
					expression ('+' | '-') expression|
					expression ('<'|'>'|'<='|'>=') expression|
					expression ('=='|'!=') expression|
					expression '&&' expression|
					expression '||' expression;
invocation:			expression '(' paramList? ')';
					

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
LeftBracket:		'[';
RightBracket:		']';
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
Comment:			(('//'.*?('\r\n'|'\n'|'\r'))|('/*'.*?'*/')) -> skip;