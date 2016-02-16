// Generated from Sparky.g4 by ANTLR 4.5.1
package org.sparky.parser;
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
		NL=12, COMMENT=13, ID=14, ID_START=15, ID_CONT=16, EXTERNAL_ID=17, WS=18, 
		ALPHA_NUM=19, ALPHA_L=20, ALPHA_U=21, NUM=22, ANY_NOT_MATCHED=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INDEXER", "COLON", "F_START", "F_END", "EQ", "VAR_START", "VAR_END", 
		"PATH_SEPERATOR", "CELL_SEPERATOR", "HEADER_SEPERATOR", "OVERRIDE", "NL", 
		"COMMENT", "ID", "ID_START", "ID_CONT", "EXTERNAL_ID", "WS", "ALPHA_NUM", 
		"ALPHA_L", "ALPHA_U", "NUM", "ANY_NOT_MATCHED"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'$$'", "':'", "'['", "']'", "'='", "'${'", "'}'", "'.'", "'|'", 
		"'/'", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INDEXER", "COLON", "F_START", "F_END", "EQ", "VAR_START", "VAR_END", 
		"PATH_SEPERATOR", "CELL_SEPERATOR", "HEADER_SEPERATOR", "OVERRIDE", "NL", 
		"COMMENT", "ID", "ID_START", "ID_CONT", "EXTERNAL_ID", "WS", "ALPHA_NUM", 
		"ALPHA_L", "ALPHA_U", "NUM", "ANY_NOT_MATCHED"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\177\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\5\rK\n\r\3\r\3\r\7\rO\n\r\f\r\16\rR\13\r\3\16\3"+
		"\16\7\16V\n\16\f\16\16\16Y\13\16\3\16\3\16\3\17\3\17\7\17_\n\17\f\17\16"+
		"\17b\13\17\3\20\3\20\3\21\3\21\3\22\6\22i\n\22\r\22\16\22j\3\23\6\23n"+
		"\n\23\r\23\16\23o\3\23\3\23\3\24\3\24\5\24v\n\24\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\7"+
		"\4\2\13\13\"\"\4\2\f\f\17\17\3\2c|\3\2C\\\3\2\62;\u0085\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2"+
		"\5\64\3\2\2\2\7\66\3\2\2\2\t8\3\2\2\2\13:\3\2\2\2\r<\3\2\2\2\17?\3\2\2"+
		"\2\21A\3\2\2\2\23C\3\2\2\2\25E\3\2\2\2\27G\3\2\2\2\31J\3\2\2\2\33S\3\2"+
		"\2\2\35\\\3\2\2\2\37c\3\2\2\2!e\3\2\2\2#h\3\2\2\2%m\3\2\2\2\'u\3\2\2\2"+
		")w\3\2\2\2+y\3\2\2\2-{\3\2\2\2/}\3\2\2\2\61\62\7&\2\2\62\63\7&\2\2\63"+
		"\4\3\2\2\2\64\65\7<\2\2\65\6\3\2\2\2\66\67\7]\2\2\67\b\3\2\2\289\7_\2"+
		"\29\n\3\2\2\2:;\7?\2\2;\f\3\2\2\2<=\7&\2\2=>\7}\2\2>\16\3\2\2\2?@\7\177"+
		"\2\2@\20\3\2\2\2AB\7\60\2\2B\22\3\2\2\2CD\7~\2\2D\24\3\2\2\2EF\7\61\2"+
		"\2F\26\3\2\2\2GH\7#\2\2H\30\3\2\2\2IK\7\17\2\2JI\3\2\2\2JK\3\2\2\2KL\3"+
		"\2\2\2LP\7\f\2\2MO\t\2\2\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\32"+
		"\3\2\2\2RP\3\2\2\2SW\7%\2\2TV\n\3\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX"+
		"\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\b\16\2\2[\34\3\2\2\2\\`\5\37\20\2]_\5!"+
		"\21\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\36\3\2\2\2b`\3\2\2\2cd"+
		"\5)\25\2d \3\2\2\2ef\5\'\24\2f\"\3\2\2\2gi\5+\26\2hg\3\2\2\2ij\3\2\2\2"+
		"jh\3\2\2\2jk\3\2\2\2k$\3\2\2\2ln\t\2\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2"+
		"op\3\2\2\2pq\3\2\2\2qr\b\23\2\2r&\3\2\2\2sv\5)\25\2tv\5-\27\2us\3\2\2"+
		"\2ut\3\2\2\2v(\3\2\2\2wx\t\4\2\2x*\3\2\2\2yz\t\5\2\2z,\3\2\2\2{|\t\6\2"+
		"\2|.\3\2\2\2}~\n\3\2\2~\60\3\2\2\2\n\2JPW`jou\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}