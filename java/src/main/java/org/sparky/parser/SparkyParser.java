// Generated from Sparky.g4 by ANTLR 4.5.1
package org.sparky.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SparkyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INDEXER=1, COLON=2, F_START=3, F_END=4, EQ=5, VAR_START=6, VAR_END=7, 
		PATH_SEPERATOR=8, CELL_SEPERATOR=9, HEADER_SEPERATOR=10, OVERRIDE=11, 
		NL=12, COMMENT=13, ID=14, ID_START=15, ID_CONT=16, EXTERNAL_ID=17, WS=18, 
		ALPHA_NUM=19, ALPHA_L=20, ALPHA_U=21, NUM=22, ANY_NOT_MATCHED=23, INDENT=24, 
		DEDENT=25;
	public static final int
		RULE_config = 0, RULE_block_name = 1, RULE_block = 2, RULE_table = 3, 
		RULE_filters = 4, RULE_filter = 5, RULE_variable = 6, RULE_simple_variable = 7, 
		RULE_external_variable = 8, RULE_complex_variable = 9, RULE_var_path = 10, 
		RULE_headers = 11, RULE_header = 12, RULE_row = 13, RULE_cell = 14, RULE_cell_value = 15, 
		RULE_keyvalue = 16, RULE_value = 17, RULE_raw = 18;
	public static final String[] ruleNames = {
		"config", "block_name", "block", "table", "filters", "filter", "variable", 
		"simple_variable", "external_variable", "complex_variable", "var_path", 
		"headers", "header", "row", "cell", "cell_value", "keyvalue", "value", 
		"raw"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'$$'", "':'", "'['", "']'", "'='", "'${'", "'}'", "'.'", "'|'", 
		"'/'", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INDEXER", "COLON", "F_START", "F_END", "EQ", "VAR_START", "VAR_END", 
		"PATH_SEPERATOR", "CELL_SEPERATOR", "HEADER_SEPERATOR", "OVERRIDE", "NL", 
		"COMMENT", "ID", "ID_START", "ID_CONT", "EXTERNAL_ID", "WS", "ALPHA_NUM", 
		"ALPHA_L", "ALPHA_U", "NUM", "ANY_NOT_MATCHED", "INDENT", "DEDENT"
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

	@Override
	public String getGrammarFileName() { return "Sparky.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SparkyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ConfigContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SparkyParser.EOF, 0); }
		public TerminalNode NL() { return getToken(SparkyParser.NL, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_config; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigContext config() throws RecognitionException {
		ConfigContext _localctx = new ConfigContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_config);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(38);
				match(NL);
				}
			}

			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41);
				block();
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INDEXER) | (1L << VAR_START) | (1L << ID))) != 0) );
			setState(46);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SparkyParser.ID, 0); }
		public TerminalNode INDEXER() { return getToken(SparkyParser.INDEXER, 0); }
		public Simple_variableContext simple_variable() {
			return getRuleContext(Simple_variableContext.class,0);
		}
		public Block_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitBlock_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_nameContext block_name() throws RecognitionException {
		Block_nameContext _localctx = new Block_nameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block_name);
		try {
			setState(51);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(ID);
				}
				break;
			case INDEXER:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(INDEXER);
				}
				break;
			case VAR_START:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				simple_variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public Block_nameContext block_name() {
			return getRuleContext(Block_nameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SparkyParser.COLON, 0); }
		public TerminalNode NL() { return getToken(SparkyParser.NL, 0); }
		public TerminalNode INDENT() { return getToken(SparkyParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(SparkyParser.DEDENT, 0); }
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<KeyvalueContext> keyvalue() {
			return getRuleContexts(KeyvalueContext.class);
		}
		public KeyvalueContext keyvalue(int i) {
			return getRuleContext(KeyvalueContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			block_name();
			setState(54);
			match(COLON);
			setState(55);
			match(NL);
			setState(56);
			match(INDENT);
			setState(58);
			_la = _input.LA(1);
			if (_la==F_START || _la==HEADER_SEPERATOR) {
				{
				setState(57);
				table();
				}
			}

			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INDEXER) | (1L << VAR_START) | (1L << OVERRIDE) | (1L << ID))) != 0)) {
				{
				setState(62);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(60);
					block();
					}
					break;
				case 2:
					{
					setState(61);
					keyvalue();
					}
					break;
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			match(DEDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableContext extends ParserRuleContext {
		public HeadersContext headers() {
			return getRuleContext(HeadersContext.class,0);
		}
		public FiltersContext filters() {
			return getRuleContext(FiltersContext.class,0);
		}
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if (_la==F_START) {
				{
				setState(69);
				filters();
				}
			}

			setState(72);
			headers();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CELL_SEPERATOR) {
				{
				{
				setState(73);
				row();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FiltersContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(SparkyParser.NL, 0); }
		public List<FilterContext> filter() {
			return getRuleContexts(FilterContext.class);
		}
		public FilterContext filter(int i) {
			return getRuleContext(FilterContext.class,i);
		}
		public FiltersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitFilters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FiltersContext filters() throws RecognitionException {
		FiltersContext _localctx = new FiltersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_filters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(79);
				filter();
				}
				}
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==F_START );
			setState(84);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterContext extends ParserRuleContext {
		public TerminalNode F_START() { return getToken(SparkyParser.F_START, 0); }
		public Simple_variableContext simple_variable() {
			return getRuleContext(Simple_variableContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SparkyParser.EQ, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode F_END() { return getToken(SparkyParser.F_END, 0); }
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(F_START);
			setState(87);
			simple_variable();
			setState(88);
			match(EQ);
			setState(89);
			variable();
			setState(90);
			match(F_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public Simple_variableContext simple_variable() {
			return getRuleContext(Simple_variableContext.class,0);
		}
		public Complex_variableContext complex_variable() {
			return getRuleContext(Complex_variableContext.class,0);
		}
		public External_variableContext external_variable() {
			return getRuleContext(External_variableContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variable);
		try {
			setState(95);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				simple_variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				complex_variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				external_variable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_variableContext extends ParserRuleContext {
		public TerminalNode VAR_START() { return getToken(SparkyParser.VAR_START, 0); }
		public TerminalNode ID() { return getToken(SparkyParser.ID, 0); }
		public TerminalNode VAR_END() { return getToken(SparkyParser.VAR_END, 0); }
		public Simple_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitSimple_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_variableContext simple_variable() throws RecognitionException {
		Simple_variableContext _localctx = new Simple_variableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_simple_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(VAR_START);
			setState(98);
			match(ID);
			setState(99);
			match(VAR_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class External_variableContext extends ParserRuleContext {
		public TerminalNode VAR_START() { return getToken(SparkyParser.VAR_START, 0); }
		public TerminalNode EXTERNAL_ID() { return getToken(SparkyParser.EXTERNAL_ID, 0); }
		public TerminalNode VAR_END() { return getToken(SparkyParser.VAR_END, 0); }
		public External_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitExternal_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final External_variableContext external_variable() throws RecognitionException {
		External_variableContext _localctx = new External_variableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_external_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(VAR_START);
			setState(102);
			match(EXTERNAL_ID);
			setState(103);
			match(VAR_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Complex_variableContext extends ParserRuleContext {
		public TerminalNode VAR_START() { return getToken(SparkyParser.VAR_START, 0); }
		public Var_pathContext var_path() {
			return getRuleContext(Var_pathContext.class,0);
		}
		public TerminalNode VAR_END() { return getToken(SparkyParser.VAR_END, 0); }
		public Complex_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitComplex_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Complex_variableContext complex_variable() throws RecognitionException {
		Complex_variableContext _localctx = new Complex_variableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_complex_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(VAR_START);
			setState(106);
			var_path();
			setState(107);
			match(VAR_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_pathContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(SparkyParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SparkyParser.ID, i);
		}
		public List<TerminalNode> PATH_SEPERATOR() { return getTokens(SparkyParser.PATH_SEPERATOR); }
		public TerminalNode PATH_SEPERATOR(int i) {
			return getToken(SparkyParser.PATH_SEPERATOR, i);
		}
		public Var_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_path; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitVar_path(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_pathContext var_path() throws RecognitionException {
		Var_pathContext _localctx = new Var_pathContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			switch (_input.LA(1)) {
			case VAR_START:
				{
				setState(109);
				variable();
				}
				break;
			case ID:
				{
				setState(110);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PATH_SEPERATOR) {
				{
				{
				setState(113);
				match(PATH_SEPERATOR);
				setState(116);
				switch (_input.LA(1)) {
				case VAR_START:
					{
					setState(114);
					variable();
					}
					break;
				case ID:
					{
					setState(115);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeadersContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(SparkyParser.NL, 0); }
		public List<HeaderContext> header() {
			return getRuleContexts(HeaderContext.class);
		}
		public HeaderContext header(int i) {
			return getRuleContext(HeaderContext.class,i);
		}
		public HeadersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headers; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitHeaders(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadersContext headers() throws RecognitionException {
		HeadersContext _localctx = new HeadersContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_headers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(123);
				header();
				}
				}
				setState(126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==HEADER_SEPERATOR );
			setState(128);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode HEADER_SEPERATOR() { return getToken(SparkyParser.HEADER_SEPERATOR, 0); }
		public TerminalNode ID() { return getToken(SparkyParser.ID, 0); }
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(HEADER_SEPERATOR);
			setState(131);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(SparkyParser.NL, 0); }
		public List<CellContext> cell() {
			return getRuleContexts(CellContext.class);
		}
		public CellContext cell(int i) {
			return getRuleContext(CellContext.class,i);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(133);
				cell();
				}
				}
				setState(136); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CELL_SEPERATOR );
			setState(138);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CellContext extends ParserRuleContext {
		public TerminalNode CELL_SEPERATOR() { return getToken(SparkyParser.CELL_SEPERATOR, 0); }
		public Cell_valueContext cell_value() {
			return getRuleContext(Cell_valueContext.class,0);
		}
		public CellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cell; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitCell(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CellContext cell() throws RecognitionException {
		CellContext _localctx = new CellContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cell);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(CELL_SEPERATOR);
			setState(141);
			cell_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cell_valueContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(SparkyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SparkyParser.NL, i);
		}
		public List<TerminalNode> CELL_SEPERATOR() { return getTokens(SparkyParser.CELL_SEPERATOR); }
		public TerminalNode CELL_SEPERATOR(int i) {
			return getToken(SparkyParser.CELL_SEPERATOR, i);
		}
		public Cell_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cell_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitCell_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cell_valueContext cell_value() throws RecognitionException {
		Cell_valueContext _localctx = new Cell_valueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cell_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(143);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==CELL_SEPERATOR || _la==NL) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INDEXER) | (1L << COLON) | (1L << F_START) | (1L << F_END) | (1L << EQ) | (1L << VAR_START) | (1L << VAR_END) | (1L << PATH_SEPERATOR) | (1L << HEADER_SEPERATOR) | (1L << OVERRIDE) | (1L << COMMENT) | (1L << ID) | (1L << ID_START) | (1L << ID_CONT) | (1L << EXTERNAL_ID) | (1L << WS) | (1L << ALPHA_NUM) | (1L << ALPHA_L) | (1L << ALPHA_U) | (1L << NUM) | (1L << ANY_NOT_MATCHED) | (1L << INDENT) | (1L << DEDENT))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyvalueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SparkyParser.ID, 0); }
		public TerminalNode EQ() { return getToken(SparkyParser.EQ, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode NL() { return getToken(SparkyParser.NL, 0); }
		public TerminalNode OVERRIDE() { return getToken(SparkyParser.OVERRIDE, 0); }
		public KeyvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyvalue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitKeyvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyvalueContext keyvalue() throws RecognitionException {
		KeyvalueContext _localctx = new KeyvalueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_keyvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_la = _input.LA(1);
			if (_la==OVERRIDE) {
				{
				setState(148);
				match(OVERRIDE);
				}
			}

			setState(151);
			match(ID);
			setState(152);
			match(EQ);
			setState(153);
			value();
			setState(154);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public List<RawContext> raw() {
			return getRuleContexts(RawContext.class);
		}
		public RawContext raw(int i) {
			return getRuleContext(RawContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(158);
				switch (_input.LA(1)) {
				case INDEXER:
				case COLON:
				case F_START:
				case F_END:
				case EQ:
				case VAR_END:
				case PATH_SEPERATOR:
				case CELL_SEPERATOR:
				case HEADER_SEPERATOR:
				case OVERRIDE:
				case COMMENT:
				case ID:
				case ID_START:
				case ID_CONT:
				case EXTERNAL_ID:
				case WS:
				case ALPHA_NUM:
				case ALPHA_L:
				case ALPHA_U:
				case NUM:
				case ANY_NOT_MATCHED:
				case INDENT:
				case DEDENT:
					{
					setState(156);
					raw();
					}
					break;
				case VAR_START:
					{
					setState(157);
					variable();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(160); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INDEXER) | (1L << COLON) | (1L << F_START) | (1L << F_END) | (1L << EQ) | (1L << VAR_START) | (1L << VAR_END) | (1L << PATH_SEPERATOR) | (1L << CELL_SEPERATOR) | (1L << HEADER_SEPERATOR) | (1L << OVERRIDE) | (1L << COMMENT) | (1L << ID) | (1L << ID_START) | (1L << ID_CONT) | (1L << EXTERNAL_ID) | (1L << WS) | (1L << ALPHA_NUM) | (1L << ALPHA_L) | (1L << ALPHA_U) | (1L << NUM) | (1L << ANY_NOT_MATCHED) | (1L << INDENT) | (1L << DEDENT))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RawContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(SparkyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SparkyParser.NL, i);
		}
		public List<TerminalNode> VAR_START() { return getTokens(SparkyParser.VAR_START); }
		public TerminalNode VAR_START(int i) {
			return getToken(SparkyParser.VAR_START, i);
		}
		public RawContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitRaw(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RawContext raw() throws RecognitionException {
		RawContext _localctx = new RawContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_raw);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(163); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(162);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==VAR_START || _la==NL) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(165); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\33\u00aa\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\5\2*\n\2\3\2\6\2-\n\2\r\2\16\2.\3\2\3\2\3\3\3"+
		"\3\3\3\5\3\66\n\3\3\4\3\4\3\4\3\4\3\4\5\4=\n\4\3\4\3\4\7\4A\n\4\f\4\16"+
		"\4D\13\4\3\4\3\4\3\5\5\5I\n\5\3\5\3\5\7\5M\n\5\f\5\16\5P\13\5\3\6\6\6"+
		"S\n\6\r\6\16\6T\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\bb\n\b\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\5\fr\n\f\3"+
		"\f\3\f\3\f\5\fw\n\f\7\fy\n\f\f\f\16\f|\13\f\3\r\6\r\177\n\r\r\r\16\r\u0080"+
		"\3\r\3\r\3\16\3\16\3\16\3\17\6\17\u0089\n\17\r\17\16\17\u008a\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\6\21\u0093\n\21\r\21\16\21\u0094\3\22\5\22\u0098"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\6\23\u00a1\n\23\r\23\16\23\u00a2"+
		"\3\24\6\24\u00a6\n\24\r\24\16\24\u00a7\3\24\2\2\25\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&\2\4\4\2\13\13\16\16\4\2\b\b\16\16\u00ac\2)\3\2"+
		"\2\2\4\65\3\2\2\2\6\67\3\2\2\2\bH\3\2\2\2\nR\3\2\2\2\fX\3\2\2\2\16a\3"+
		"\2\2\2\20c\3\2\2\2\22g\3\2\2\2\24k\3\2\2\2\26q\3\2\2\2\30~\3\2\2\2\32"+
		"\u0084\3\2\2\2\34\u0088\3\2\2\2\36\u008e\3\2\2\2 \u0092\3\2\2\2\"\u0097"+
		"\3\2\2\2$\u00a0\3\2\2\2&\u00a5\3\2\2\2(*\7\16\2\2)(\3\2\2\2)*\3\2\2\2"+
		"*,\3\2\2\2+-\5\6\4\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\60\3\2\2"+
		"\2\60\61\7\2\2\3\61\3\3\2\2\2\62\66\7\20\2\2\63\66\7\3\2\2\64\66\5\20"+
		"\t\2\65\62\3\2\2\2\65\63\3\2\2\2\65\64\3\2\2\2\66\5\3\2\2\2\678\5\4\3"+
		"\289\7\4\2\29:\7\16\2\2:<\7\32\2\2;=\5\b\5\2<;\3\2\2\2<=\3\2\2\2=B\3\2"+
		"\2\2>A\5\6\4\2?A\5\"\22\2@>\3\2\2\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3"+
		"\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7\33\2\2F\7\3\2\2\2GI\5\n\6\2HG\3\2\2\2H"+
		"I\3\2\2\2IJ\3\2\2\2JN\5\30\r\2KM\5\34\17\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2"+
		"\2NO\3\2\2\2O\t\3\2\2\2PN\3\2\2\2QS\5\f\7\2RQ\3\2\2\2ST\3\2\2\2TR\3\2"+
		"\2\2TU\3\2\2\2UV\3\2\2\2VW\7\16\2\2W\13\3\2\2\2XY\7\5\2\2YZ\5\20\t\2Z"+
		"[\7\7\2\2[\\\5\16\b\2\\]\7\6\2\2]\r\3\2\2\2^b\5\20\t\2_b\5\24\13\2`b\5"+
		"\22\n\2a^\3\2\2\2a_\3\2\2\2a`\3\2\2\2b\17\3\2\2\2cd\7\b\2\2de\7\20\2\2"+
		"ef\7\t\2\2f\21\3\2\2\2gh\7\b\2\2hi\7\23\2\2ij\7\t\2\2j\23\3\2\2\2kl\7"+
		"\b\2\2lm\5\26\f\2mn\7\t\2\2n\25\3\2\2\2or\5\16\b\2pr\7\20\2\2qo\3\2\2"+
		"\2qp\3\2\2\2rz\3\2\2\2sv\7\n\2\2tw\5\16\b\2uw\7\20\2\2vt\3\2\2\2vu\3\2"+
		"\2\2wy\3\2\2\2xs\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\27\3\2\2\2|z\3"+
		"\2\2\2}\177\5\32\16\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\7\16\2\2\u0083\31\3\2\2"+
		"\2\u0084\u0085\7\f\2\2\u0085\u0086\7\20\2\2\u0086\33\3\2\2\2\u0087\u0089"+
		"\5\36\20\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2"+
		"\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7\16\2\2\u008d\35"+
		"\3\2\2\2\u008e\u008f\7\13\2\2\u008f\u0090\5 \21\2\u0090\37\3\2\2\2\u0091"+
		"\u0093\n\2\2\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095!\3\2\2\2\u0096\u0098\7\r\2\2\u0097\u0096"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\20\2\2"+
		"\u009a\u009b\7\7\2\2\u009b\u009c\5$\23\2\u009c\u009d\7\16\2\2\u009d#\3"+
		"\2\2\2\u009e\u00a1\5&\24\2\u009f\u00a1\5\16\b\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3%\3\2\2\2\u00a4\u00a6\n\3\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\'\3\2\2\2\26)."+
		"\65<@BHNTaqvz\u0080\u008a\u0094\u0097\u00a0\u00a2\u00a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}