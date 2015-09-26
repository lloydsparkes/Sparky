// Generated from D:/Projects/Sparky/grammar\Sparky.g4 by ANTLR 4.5.1
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
		NL=12, COMMENT=13, ID=14, ID_START=15, ID_CONT=16, WS=17, ALPHA_NUM=18, 
		ALPHA=19, NUM=20, ANY_NOT_MATCHED=21, INDENT=22, DEDENT=23;
	public static final int
		RULE_config = 0, RULE_block = 1, RULE_table = 2, RULE_filters = 3, RULE_filter = 4, 
		RULE_variable = 5, RULE_var_path = 6, RULE_headers = 7, RULE_header = 8, 
		RULE_row = 9, RULE_cell = 10, RULE_cell_value = 11, RULE_keyvalue = 12, 
		RULE_value = 13, RULE_raw = 14;
	public static final String[] ruleNames = {
		"config", "block", "table", "filters", "filter", "variable", "var_path", 
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
		"COMMENT", "ID", "ID_START", "ID_CONT", "WS", "ALPHA_NUM", "ALPHA", "NUM", 
		"ANY_NOT_MATCHED", "INDENT", "DEDENT"
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitConfig(this);
		}
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
			setState(31);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(30);
				match(NL);
				}
			}

			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INDEXER || _la==ID) {
				{
				{
				setState(33);
				block();
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(SparkyParser.COLON, 0); }
		public TerminalNode NL() { return getToken(SparkyParser.NL, 0); }
		public TerminalNode INDENT() { return getToken(SparkyParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(SparkyParser.DEDENT, 0); }
		public TerminalNode ID() { return getToken(SparkyParser.ID, 0); }
		public TerminalNode INDEXER() { return getToken(SparkyParser.INDEXER, 0); }
		public TerminalNode PATH_SEPERATOR() { return getToken(SparkyParser.PATH_SEPERATOR, 0); }
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(41);
				match(ID);
				}
				break;
			case 2:
				{
				setState(42);
				match(INDEXER);
				}
				break;
			case 3:
				{
				setState(43);
				match(ID);
				setState(44);
				match(PATH_SEPERATOR);
				setState(45);
				match(INDEXER);
				}
				break;
			}
			setState(48);
			match(COLON);
			setState(49);
			match(NL);
			setState(50);
			match(INDENT);
			setState(52);
			_la = _input.LA(1);
			if (_la==F_START || _la==HEADER_SEPERATOR) {
				{
				setState(51);
				table();
				}
			}

			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INDEXER) | (1L << OVERRIDE) | (1L << ID))) != 0)) {
				{
				setState(56);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(54);
					block();
					}
					break;
				case 2:
					{
					setState(55);
					keyvalue();
					}
					break;
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if (_la==F_START) {
				{
				setState(63);
				filters();
				}
			}

			setState(66);
			headers();
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CELL_SEPERATOR) {
				{
				{
				setState(67);
				row();
				}
				}
				setState(72);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterFilters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitFilters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitFilters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FiltersContext filters() throws RecognitionException {
		FiltersContext _localctx = new FiltersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_filters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				filter();
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==F_START );
			setState(78);
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
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode EQ() { return getToken(SparkyParser.EQ, 0); }
		public TerminalNode F_END() { return getToken(SparkyParser.F_END, 0); }
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(F_START);
			setState(81);
			variable();
			setState(82);
			match(EQ);
			setState(83);
			variable();
			setState(84);
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
		public TerminalNode VAR_START() { return getToken(SparkyParser.VAR_START, 0); }
		public Var_pathContext var_path() {
			return getRuleContext(Var_pathContext.class,0);
		}
		public TerminalNode VAR_END() { return getToken(SparkyParser.VAR_END, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(VAR_START);
			setState(87);
			var_path();
			setState(88);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterVar_path(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitVar_path(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitVar_path(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_pathContext var_path() throws RecognitionException {
		Var_pathContext _localctx = new Var_pathContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			switch (_input.LA(1)) {
			case VAR_START:
				{
				setState(90);
				variable();
				}
				break;
			case ID:
				{
				setState(91);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PATH_SEPERATOR) {
				{
				{
				setState(94);
				match(PATH_SEPERATOR);
				setState(97);
				switch (_input.LA(1)) {
				case VAR_START:
					{
					setState(95);
					variable();
					}
					break;
				case ID:
					{
					setState(96);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(103);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterHeaders(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitHeaders(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitHeaders(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadersContext headers() throws RecognitionException {
		HeadersContext _localctx = new HeadersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_headers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(104);
				header();
				}
				}
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==HEADER_SEPERATOR );
			setState(109);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(HEADER_SEPERATOR);
			setState(112);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(114);
				cell();
				}
				}
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CELL_SEPERATOR );
			setState(119);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterCell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitCell(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitCell(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CellContext cell() throws RecognitionException {
		CellContext _localctx = new CellContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cell);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(CELL_SEPERATOR);
			setState(122);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterCell_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitCell_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitCell_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cell_valueContext cell_value() throws RecognitionException {
		Cell_valueContext _localctx = new Cell_valueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cell_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(124);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==CELL_SEPERATOR || _la==NL) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INDEXER) | (1L << COLON) | (1L << F_START) | (1L << F_END) | (1L << EQ) | (1L << VAR_START) | (1L << VAR_END) | (1L << PATH_SEPERATOR) | (1L << HEADER_SEPERATOR) | (1L << OVERRIDE) | (1L << COMMENT) | (1L << ID) | (1L << ID_START) | (1L << ID_CONT) | (1L << WS) | (1L << ALPHA_NUM) | (1L << ALPHA) | (1L << NUM) | (1L << ANY_NOT_MATCHED) | (1L << INDENT) | (1L << DEDENT))) != 0) );
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterKeyvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitKeyvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitKeyvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyvalueContext keyvalue() throws RecognitionException {
		KeyvalueContext _localctx = new KeyvalueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_keyvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_la = _input.LA(1);
			if (_la==OVERRIDE) {
				{
				setState(129);
				match(OVERRIDE);
				}
			}

			setState(132);
			match(ID);
			setState(133);
			match(EQ);
			setState(134);
			value();
			setState(135);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(139);
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
				case WS:
				case ALPHA_NUM:
				case ALPHA:
				case NUM:
				case ANY_NOT_MATCHED:
				case INDENT:
				case DEDENT:
					{
					setState(137);
					raw();
					}
					break;
				case VAR_START:
					{
					setState(138);
					variable();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INDEXER) | (1L << COLON) | (1L << F_START) | (1L << F_END) | (1L << EQ) | (1L << VAR_START) | (1L << VAR_END) | (1L << PATH_SEPERATOR) | (1L << CELL_SEPERATOR) | (1L << HEADER_SEPERATOR) | (1L << OVERRIDE) | (1L << COMMENT) | (1L << ID) | (1L << ID_START) | (1L << ID_CONT) | (1L << WS) | (1L << ALPHA_NUM) | (1L << ALPHA) | (1L << NUM) | (1L << ANY_NOT_MATCHED) | (1L << INDENT) | (1L << DEDENT))) != 0) );
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterRaw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitRaw(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitRaw(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RawContext raw() throws RecognitionException {
		RawContext _localctx = new RawContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_raw);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(143);
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
				setState(146); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u0097\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\5\2\"\n\2\3\2"+
		"\7\2%\n\2\f\2\16\2(\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\61\n\3\3\3\3"+
		"\3\3\3\3\3\5\3\67\n\3\3\3\3\3\7\3;\n\3\f\3\16\3>\13\3\3\3\3\3\3\4\5\4"+
		"C\n\4\3\4\3\4\7\4G\n\4\f\4\16\4J\13\4\3\5\6\5M\n\5\r\5\16\5N\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\5\b_\n\b\3\b\3\b\3\b\5"+
		"\bd\n\b\7\bf\n\b\f\b\16\bi\13\b\3\t\6\tl\n\t\r\t\16\tm\3\t\3\t\3\n\3\n"+
		"\3\n\3\13\6\13v\n\13\r\13\16\13w\3\13\3\13\3\f\3\f\3\f\3\r\6\r\u0080\n"+
		"\r\r\r\16\r\u0081\3\16\5\16\u0085\n\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\6\17\u008e\n\17\r\17\16\17\u008f\3\20\6\20\u0093\n\20\r\20\16\20\u0094"+
		"\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\4\4\2\13\13\16\16"+
		"\4\2\b\b\16\16\u009b\2!\3\2\2\2\4\60\3\2\2\2\6B\3\2\2\2\bL\3\2\2\2\nR"+
		"\3\2\2\2\fX\3\2\2\2\16^\3\2\2\2\20k\3\2\2\2\22q\3\2\2\2\24u\3\2\2\2\26"+
		"{\3\2\2\2\30\177\3\2\2\2\32\u0084\3\2\2\2\34\u008d\3\2\2\2\36\u0092\3"+
		"\2\2\2 \"\7\16\2\2! \3\2\2\2!\"\3\2\2\2\"&\3\2\2\2#%\5\4\3\2$#\3\2\2\2"+
		"%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\')\3\2\2\2(&\3\2\2\2)*\7\2\2\3*\3\3\2"+
		"\2\2+\61\7\20\2\2,\61\7\3\2\2-.\7\20\2\2./\7\n\2\2/\61\7\3\2\2\60+\3\2"+
		"\2\2\60,\3\2\2\2\60-\3\2\2\2\61\62\3\2\2\2\62\63\7\4\2\2\63\64\7\16\2"+
		"\2\64\66\7\30\2\2\65\67\5\6\4\2\66\65\3\2\2\2\66\67\3\2\2\2\67<\3\2\2"+
		"\28;\5\4\3\29;\5\32\16\2:8\3\2\2\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2"+
		"\2\2=?\3\2\2\2><\3\2\2\2?@\7\31\2\2@\5\3\2\2\2AC\5\b\5\2BA\3\2\2\2BC\3"+
		"\2\2\2CD\3\2\2\2DH\5\20\t\2EG\5\24\13\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2"+
		"HI\3\2\2\2I\7\3\2\2\2JH\3\2\2\2KM\5\n\6\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2"+
		"\2NO\3\2\2\2OP\3\2\2\2PQ\7\16\2\2Q\t\3\2\2\2RS\7\5\2\2ST\5\f\7\2TU\7\7"+
		"\2\2UV\5\f\7\2VW\7\6\2\2W\13\3\2\2\2XY\7\b\2\2YZ\5\16\b\2Z[\7\t\2\2[\r"+
		"\3\2\2\2\\_\5\f\7\2]_\7\20\2\2^\\\3\2\2\2^]\3\2\2\2_g\3\2\2\2`c\7\n\2"+
		"\2ad\5\f\7\2bd\7\20\2\2ca\3\2\2\2cb\3\2\2\2df\3\2\2\2e`\3\2\2\2fi\3\2"+
		"\2\2ge\3\2\2\2gh\3\2\2\2h\17\3\2\2\2ig\3\2\2\2jl\5\22\n\2kj\3\2\2\2lm"+
		"\3\2\2\2mk\3\2\2\2mn\3\2\2\2no\3\2\2\2op\7\16\2\2p\21\3\2\2\2qr\7\f\2"+
		"\2rs\7\20\2\2s\23\3\2\2\2tv\5\26\f\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3"+
		"\2\2\2xy\3\2\2\2yz\7\16\2\2z\25\3\2\2\2{|\7\13\2\2|}\5\30\r\2}\27\3\2"+
		"\2\2~\u0080\n\2\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2"+
		"\u0081\u0082\3\2\2\2\u0082\31\3\2\2\2\u0083\u0085\7\r\2\2\u0084\u0083"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7\20\2\2"+
		"\u0087\u0088\7\7\2\2\u0088\u0089\5\34\17\2\u0089\u008a\7\16\2\2\u008a"+
		"\33\3\2\2\2\u008b\u008e\5\36\20\2\u008c\u008e\5\f\7\2\u008d\u008b\3\2"+
		"\2\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\35\3\2\2\2\u0091\u0093\n\3\2\2\u0092\u0091\3\2\2"+
		"\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\37"+
		"\3\2\2\2\25!&\60\66:<BHN^cgmw\u0081\u0084\u008d\u008f\u0094";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}