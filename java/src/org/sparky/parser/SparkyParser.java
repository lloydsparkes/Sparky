// Generated from D:/Projects/Sparky/grammar\Sparky.g4 by ANTLR 4.5.1

package org.sparky.parser;

import org.sparky.parser.utils.*;

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

			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(33);
				block();
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INDEXER || _la==ID );
			setState(38);
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
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(40);
				match(ID);
				}
				break;
			case 2:
				{
				setState(41);
				match(INDEXER);
				}
				break;
			case 3:
				{
				setState(42);
				match(ID);
				setState(43);
				match(PATH_SEPERATOR);
				setState(44);
				match(INDEXER);
				}
				break;
			}
			setState(47);
			match(COLON);
			setState(48);
			match(NL);
			setState(49);
			match(INDENT);
			setState(51);
			_la = _input.LA(1);
			if (_la==F_START || _la==HEADER_SEPERATOR) {
				{
				setState(50);
				table();
				}
			}

			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INDEXER) | (1L << OVERRIDE) | (1L << ID))) != 0)) {
				{
				setState(55);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(53);
					block();
					}
					break;
				case 2:
					{
					setState(54);
					keyvalue();
					}
					break;
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
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
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_la = _input.LA(1);
			if (_la==F_START) {
				{
				setState(62);
				filters();
				}
			}

			setState(65);
			headers();
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CELL_SEPERATOR) {
				{
				{
				setState(66);
				row();
				}
				}
				setState(71);
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
	}

	public final FiltersContext filters() throws RecognitionException {
		FiltersContext _localctx = new FiltersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_filters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				filter();
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==F_START );
			setState(77);
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
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(F_START);
			setState(80);
			variable();
			setState(81);
			match(EQ);
			setState(82);
			variable();
			setState(83);
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
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(VAR_START);
			setState(86);
			var_path();
			setState(87);
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
	}

	public final Var_pathContext var_path() throws RecognitionException {
		Var_pathContext _localctx = new Var_pathContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			switch (_input.LA(1)) {
			case VAR_START:
				{
				setState(89);
				variable();
				}
				break;
			case ID:
				{
				setState(90);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PATH_SEPERATOR) {
				{
				{
				setState(93);
				match(PATH_SEPERATOR);
				setState(96);
				switch (_input.LA(1)) {
				case VAR_START:
					{
					setState(94);
					variable();
					}
					break;
				case ID:
					{
					setState(95);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(102);
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
	}

	public final HeadersContext headers() throws RecognitionException {
		HeadersContext _localctx = new HeadersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_headers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(103);
				header();
				}
				}
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==HEADER_SEPERATOR );
			setState(108);
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
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(HEADER_SEPERATOR);
			setState(111);
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
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(113);
				cell();
				}
				}
				setState(116); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CELL_SEPERATOR );
			setState(118);
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
	}

	public final CellContext cell() throws RecognitionException {
		CellContext _localctx = new CellContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cell);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(CELL_SEPERATOR);
			setState(121);
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
	}

	public final Cell_valueContext cell_value() throws RecognitionException {
		Cell_valueContext _localctx = new Cell_valueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cell_value);
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
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==CELL_SEPERATOR || _la==NL) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(126); 
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
	}

	public final KeyvalueContext keyvalue() throws RecognitionException {
		KeyvalueContext _localctx = new KeyvalueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_keyvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if (_la==OVERRIDE) {
				{
				setState(128);
				match(OVERRIDE);
				}
			}

			setState(131);
			match(ID);
			setState(132);
			match(EQ);
			setState(133);
			value();
			setState(134);
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
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(138);
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
					setState(136);
					raw();
					}
					break;
				case VAR_START:
					{
					setState(137);
					variable();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(140); 
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
	}

	public final RawContext raw() throws RecognitionException {
		RawContext _localctx = new RawContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_raw);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(142);
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
				setState(145); 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u0096\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\5\2\"\n\2\3\2"+
		"\6\2%\n\2\r\2\16\2&\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\60\n\3\3\3\3\3\3\3"+
		"\3\3\5\3\66\n\3\3\3\3\3\7\3:\n\3\f\3\16\3=\13\3\3\3\3\3\3\4\5\4B\n\4\3"+
		"\4\3\4\7\4F\n\4\f\4\16\4I\13\4\3\5\6\5L\n\5\r\5\16\5M\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\5\b^\n\b\3\b\3\b\3\b\5\bc\n\b"+
		"\7\be\n\b\f\b\16\bh\13\b\3\t\6\tk\n\t\r\t\16\tl\3\t\3\t\3\n\3\n\3\n\3"+
		"\13\6\13u\n\13\r\13\16\13v\3\13\3\13\3\f\3\f\3\f\3\r\6\r\177\n\r\r\r\16"+
		"\r\u0080\3\16\5\16\u0084\n\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\6\17"+
		"\u008d\n\17\r\17\16\17\u008e\3\20\6\20\u0092\n\20\r\20\16\20\u0093\3\20"+
		"\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\4\4\2\13\13\16\16\4\2"+
		"\b\b\16\16\u009a\2!\3\2\2\2\4/\3\2\2\2\6A\3\2\2\2\bK\3\2\2\2\nQ\3\2\2"+
		"\2\fW\3\2\2\2\16]\3\2\2\2\20j\3\2\2\2\22p\3\2\2\2\24t\3\2\2\2\26z\3\2"+
		"\2\2\30~\3\2\2\2\32\u0083\3\2\2\2\34\u008c\3\2\2\2\36\u0091\3\2\2\2 \""+
		"\7\16\2\2! \3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#%\5\4\3\2$#\3\2\2\2%&\3\2\2"+
		"\2&$\3\2\2\2&\'\3\2\2\2\'(\3\2\2\2()\7\2\2\3)\3\3\2\2\2*\60\7\20\2\2+"+
		"\60\7\3\2\2,-\7\20\2\2-.\7\n\2\2.\60\7\3\2\2/*\3\2\2\2/+\3\2\2\2/,\3\2"+
		"\2\2\60\61\3\2\2\2\61\62\7\4\2\2\62\63\7\16\2\2\63\65\7\30\2\2\64\66\5"+
		"\6\4\2\65\64\3\2\2\2\65\66\3\2\2\2\66;\3\2\2\2\67:\5\4\3\28:\5\32\16\2"+
		"9\67\3\2\2\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2"+
		"\2>?\7\31\2\2?\5\3\2\2\2@B\5\b\5\2A@\3\2\2\2AB\3\2\2\2BC\3\2\2\2CG\5\20"+
		"\t\2DF\5\24\13\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\7\3\2\2\2IG"+
		"\3\2\2\2JL\5\n\6\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2NO\3\2\2\2O"+
		"P\7\16\2\2P\t\3\2\2\2QR\7\5\2\2RS\5\f\7\2ST\7\7\2\2TU\5\f\7\2UV\7\6\2"+
		"\2V\13\3\2\2\2WX\7\b\2\2XY\5\16\b\2YZ\7\t\2\2Z\r\3\2\2\2[^\5\f\7\2\\^"+
		"\7\20\2\2][\3\2\2\2]\\\3\2\2\2^f\3\2\2\2_b\7\n\2\2`c\5\f\7\2ac\7\20\2"+
		"\2b`\3\2\2\2ba\3\2\2\2ce\3\2\2\2d_\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2"+
		"\2g\17\3\2\2\2hf\3\2\2\2ik\5\22\n\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3"+
		"\2\2\2mn\3\2\2\2no\7\16\2\2o\21\3\2\2\2pq\7\f\2\2qr\7\20\2\2r\23\3\2\2"+
		"\2su\5\26\f\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\7\16"+
		"\2\2y\25\3\2\2\2z{\7\13\2\2{|\5\30\r\2|\27\3\2\2\2}\177\n\2\2\2~}\3\2"+
		"\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\31\3\2"+
		"\2\2\u0082\u0084\7\r\2\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0086\7\20\2\2\u0086\u0087\7\7\2\2\u0087\u0088\5"+
		"\34\17\2\u0088\u0089\7\16\2\2\u0089\33\3\2\2\2\u008a\u008d\5\36\20\2\u008b"+
		"\u008d\5\f\7\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\35\3\2\2\2\u0090\u0092"+
		"\n\3\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\37\3\2\2\2\25!&/\659;AGM]bflv\u0080\u0083\u008c\u008e"+
		"\u0093";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}