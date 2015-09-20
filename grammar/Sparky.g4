grammar Sparky;

/** Lets Define all of our Tokens first **/

/** Character Sets **/
NEWLINE : ('\r'? '\n')+;
DENT : '\t' -> skip;
SPACE : ' ' -> skip;

COMMENT : '#' ~[\r\n]* NEWLINE -> skip;
ALPHA_NUM: [a-zA-Z0-9];
ANY : .;

/** Now lets define parsing rules to build an AST **/

config: NEWLINE? block* EOF;

block: 
	id ':' NEWLINE
	table?
	(block | pair NEWLINE?)*
	NEWLINE?;

id: ALPHA_NUM+;

str: ~('${' | NEWLINE)+;
	
pair: 
	id '=' value;
	
value: 
	(str | expr);
	
expr:
	str? (variable str?);

variable: '${' variable_name '}';
variable_name: id ('.' id)*;
	
table:
	filters?
	table_headers 
	table_row+;
	
filters:
	filter filter* NEWLINE;
	
filter: '[' variable '=' variable ']';

table_headers:
	table_header+ NEWLINE;
	
table_header:
	'/' id+ ;
	
table_row:
	table_cell+  NEWLINE;
	
table_cell:
	'|' cell_value;
	
cell_value:
	~('|' | NEWLINE)+;