grammar Sparky;

tokens { INDENT, DEDENT }

@lexer::members {
    private final SparkyIndentationHelper denter = SparkyIndentationHelper.builder()
          .nl(NL)
          .indent(SparkyParser.INDENT)
          .dedent(SparkyParser.DEDENT)
          .pullToken(SparkyLexer.super::nextToken);

    @Override
    public Token nextToken() {
        return denter.nextToken();
    }
}

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

NL: ('\r'? '\n' ' '*);

COMMENT : '#' ~[\r\n]* -> skip; //Strip out any comments

ID: ID_START ID_CONT*;
ID_START: ALPHA;
ID_CONT: ALPHA_NUM;

//Dump all the other whitespace
WS: [ \t]+ -> skip;

/** Lexer Fragments **/
ALPHA_NUM: ALPHA | NUM;
ALPHA : [a-zA-Z];
NUM : [0-9];
ANY_NOT_MATCHED: ~[\r\n];

/** Parser Rules **/

config: NL?
        block+
        EOF
        ;

block: (ID | INDEXER | ID PATH_SEPERATOR INDEXER) COLON NL
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
filter: F_START variable EQ variable F_END;

variable: VAR_START var_path VAR_END;
var_path: (variable | ID)(PATH_SEPERATOR (variable | ID))*;

headers: header+ NL;
header: HEADER_SEPERATOR ID;

row: cell+ NL;
cell: CELL_SEPERATOR cell_value;
cell_value: ~(NL | CELL_SEPERATOR)+;

keyvalue: OVERRIDE? ID EQ value NL;
value: (raw | variable)+;
raw: ~(NL | VAR_START)+;
