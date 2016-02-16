grammar Sparky;

tokens { INDENT, DEDENT }

/** Token section **/

//New line, needs to consume the spaces after the new line - note that it doesnt support \t yet....
INDEXER         : '$$';
COLON           : ':';
F_START         : '[';
F_END           : ']';
EQ              : '=';
VAR_START       : '${';
VAR_END         : '}';
PATH_SEPERATOR  : '.';
CELL_SEPERATOR   : '|';
HEADER_SEPERATOR   : '/';
OVERRIDE        : '!';

NL: ('\r'? '\n' (' ' | '\t')*);

COMMENT : '#' ~[\r\n]* -> skip; //Strip out any comments

ID: ID_START ID_CONT*;
ID_START: ALPHA_L;
ID_CONT: ALPHA_NUM;
EXTERNAL_ID: ALPHA_U+;

//Dump all the other whitespace
WS: [ \t]+ -> skip;

/** Lexer Fragments **/
ALPHA_NUM: ALPHA_L | NUM;
ALPHA_L : [a-z];
ALPHA_U	: [A-Z];
NUM : [0-9];
ANY_NOT_MATCHED: ~[\r\n];

/** Parser Rules **/

config: NL?
        block+
        EOF
        ;

block_name: ID | INDEXER | simple_variable;
		
block: block_name COLON NL
       INDENT
       table?
       (block | keyvalue)*
       DEDENT
       ;

table: filters?
       headers
       row*
       ;

filters: filter+ NL;
filter: F_START simple_variable EQ variable F_END;

variable: simple_variable | complex_variable | external_variable;
simple_variable: VAR_START ID VAR_END;
external_variable: VAR_START EXTERNAL_ID VAR_END;
complex_variable: VAR_START var_path VAR_END;
var_path: (variable | ID)(PATH_SEPERATOR (variable | ID))*;

headers: header+ NL;
header: HEADER_SEPERATOR ID;

row: cell+ NL;
cell: CELL_SEPERATOR cell_value;
cell_value: ~(NL | CELL_SEPERATOR)+;

keyvalue: OVERRIDE? ID EQ value NL;
value: (raw | variable)+;
raw: ~(NL | VAR_START)+;
