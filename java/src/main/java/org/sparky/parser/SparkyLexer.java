// Generated from Sparky.g4 by ANTLR 4.5.1

package org.sparky.parser;

import org.sparky.parser.utils.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SparkyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INDEXER=1, COLON=2, F_START=3, F_END=4, EQ=5, VAR_START=6, VAR_END=7, 
		PATH_SEPERATOR=8, CELL_SEPERATOR=9, HEADER_SEPERATOR=10, OVERRIDE=11, 
		NL=12, COMMENT=13, ID=14, ID_START=15, ID_CONT=16, WS=17, ALPHA_NUM=18, 
		ALPHA=19, NUM=20, ANY_NOT_MATCHED=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INDEXER", "COLON", "F_START", "F_END", "EQ", "VAR_START", "VAR_END", 
		"PATH_SEPERATOR", "CELL_SEPERATOR", "HEADER_SEPERATOR", "OVERRIDE", "NL", 
		"COMMENT", "ID", "ID_START", "ID_CONT", "WS", "ALPHA_NUM", "ALPHA", "NUM", 
		"ANY_NOT_MATCHED"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'$$'", "':'", "'['", "']'", "'='", "'${'", "'}'", "'.'", "'|'", 
		"'/'", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INDEXER", "COLON", "F_START", "F_END", "EQ", "VAR_START", "VAR_END", 
		"PATH_SEPERATOR", "CELL_SEPERATOR", "HEADER_SEPERATOR", "OVERRIDE", "NL", 
		"COMMENT", "ID", "ID_START", "ID_CONT", "WS", "ALPHA_NUM", "ALPHA", "NUM", 
		"ANY_NOT_MATCHED"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	    private final SparkyIndentationHelper denter = SparkyIndentationHelper.builder()
	          .nl(NL)
	          .indent(SparkyParser.INDENT)
	          .dedent(SparkyParser.DEDENT)
	          .pullToken(SparkyLexer.super::nextToken);

	    @Override
	    public Token nextToken() {
	        return denter.nextToken();
	    }


	public SparkyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Sparky.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27t\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\5\rG\n\r\3\r\3\r\7\rK\n\r\f\r\16\rN\13\r\3\16\3\16\7\16R\n\16\f\16"+
		"\16\16U\13\16\3\16\3\16\3\17\3\17\7\17[\n\17\f\17\16\17^\13\17\3\20\3"+
		"\20\3\21\3\21\3\22\6\22e\n\22\r\22\16\22f\3\22\3\22\3\23\3\23\5\23m\n"+
		"\23\3\24\3\24\3\25\3\25\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"\3\2\6\4\2\13\13\"\"\4\2\f\f\17\17\4\2C\\c|\3\2\62;y\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5\60\3\2\2\2\7\62\3\2\2\2\t"+
		"\64\3\2\2\2\13\66\3\2\2\2\r8\3\2\2\2\17;\3\2\2\2\21=\3\2\2\2\23?\3\2\2"+
		"\2\25A\3\2\2\2\27C\3\2\2\2\31F\3\2\2\2\33O\3\2\2\2\35X\3\2\2\2\37_\3\2"+
		"\2\2!a\3\2\2\2#d\3\2\2\2%l\3\2\2\2\'n\3\2\2\2)p\3\2\2\2+r\3\2\2\2-.\7"+
		"&\2\2./\7&\2\2/\4\3\2\2\2\60\61\7<\2\2\61\6\3\2\2\2\62\63\7]\2\2\63\b"+
		"\3\2\2\2\64\65\7_\2\2\65\n\3\2\2\2\66\67\7?\2\2\67\f\3\2\2\289\7&\2\2"+
		"9:\7}\2\2:\16\3\2\2\2;<\7\177\2\2<\20\3\2\2\2=>\7\60\2\2>\22\3\2\2\2?"+
		"@\7~\2\2@\24\3\2\2\2AB\7\61\2\2B\26\3\2\2\2CD\7#\2\2D\30\3\2\2\2EG\7\17"+
		"\2\2FE\3\2\2\2FG\3\2\2\2GH\3\2\2\2HL\7\f\2\2IK\t\2\2\2JI\3\2\2\2KN\3\2"+
		"\2\2LJ\3\2\2\2LM\3\2\2\2M\32\3\2\2\2NL\3\2\2\2OS\7%\2\2PR\n\3\2\2QP\3"+
		"\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2VW\b\16\2\2W\34"+
		"\3\2\2\2X\\\5\37\20\2Y[\5!\21\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2"+
		"\2\2]\36\3\2\2\2^\\\3\2\2\2_`\5\'\24\2` \3\2\2\2ab\5%\23\2b\"\3\2\2\2"+
		"ce\t\2\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\b\22\2"+
		"\2i$\3\2\2\2jm\5\'\24\2km\5)\25\2lj\3\2\2\2lk\3\2\2\2m&\3\2\2\2no\t\4"+
		"\2\2o(\3\2\2\2pq\t\5\2\2q*\3\2\2\2rs\n\3\2\2s,\3\2\2\2\t\2FLS\\fl\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}