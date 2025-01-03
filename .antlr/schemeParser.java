// Generated from /home/lluc/Documents/Uni/Q5/LP/Compiladors/Compl_mini_scheme/scheme.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class schemeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, BOOLEAN=17, 
		QUOTE=18, STRING=19, NUMBER=20, IDENTIFIER=21, WS=22, COMMENT=23;
	public static final int
		RULE_program = 0, RULE_expr = 1, RULE_operation = 2, RULE_condClause = 3, 
		RULE_letBinding = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expr", "operation", "condClause", "letBinding"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "'define'", "')'", "'let'", "'if'", "'cond'", "'+'", "'-'", 
			"'*'", "'/'", "'>'", "'<'", "'>='", "'<='", "'='", "'<>'", null, "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "BOOLEAN", "QUOTE", "STRING", "NUMBER", 
			"IDENTIFIER", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "scheme.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public schemeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(schemeParser.EOF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4063234L) != 0)) {
				{
				{
				setState(10);
				expr();
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(16);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringExprContext extends ExprContext {
		public TerminalNode STRING() { return getToken(schemeParser.STRING, 0); }
		public StringExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IfExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LetExprContext extends ExprContext {
		public List<LetBindingContext> letBinding() {
			return getRuleContexts(LetBindingContext.class);
		}
		public LetBindingContext letBinding(int i) {
			return getRuleContext(LetBindingContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LetExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperationExprContext extends ExprContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OperationExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondExprContext extends ExprContext {
		public List<CondClauseContext> condClause() {
			return getRuleContexts(CondClauseContext.class);
		}
		public CondClauseContext condClause(int i) {
			return getRuleContext(CondClauseContext.class,i);
		}
		public CondExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDefContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(schemeParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDefContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberExprContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(schemeParser.NUMBER, 0); }
		public NumberExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncDefContext extends ExprContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(schemeParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(schemeParser.IDENTIFIER, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FuncDefContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierExprContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(schemeParser.IDENTIFIER, 0); }
		public IdentifierExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QuoteExprContext extends ExprContext {
		public TerminalNode QUOTE() { return getToken(schemeParser.QUOTE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public QuoteExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(schemeParser.IDENTIFIER, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FunctionCallContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ListExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanExprContext extends ExprContext {
		public TerminalNode BOOLEAN() { return getToken(schemeParser.BOOLEAN, 0); }
		public BooleanExprContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		int _la;
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new FuncDefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				match(T__0);
				setState(19);
				match(T__1);
				setState(20);
				match(T__0);
				setState(21);
				match(IDENTIFIER);
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(22);
					match(IDENTIFIER);
					}
					}
					setState(27);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(28);
				match(T__2);
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(29);
					expr();
					}
					}
					setState(32); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4063234L) != 0) );
				setState(34);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new VarDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				match(T__0);
				setState(37);
				match(T__1);
				setState(38);
				match(IDENTIFIER);
				setState(39);
				expr();
				setState(40);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new LetExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				match(T__0);
				setState(43);
				match(T__3);
				setState(44);
				match(T__0);
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(45);
					letBinding();
					}
					}
					setState(48); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				setState(50);
				match(T__2);
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(51);
					expr();
					}
					}
					setState(54); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4063234L) != 0) );
				setState(56);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new IfExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				match(T__0);
				setState(59);
				match(T__4);
				setState(60);
				expr();
				setState(61);
				expr();
				setState(62);
				expr();
				setState(63);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new CondExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				match(T__0);
				setState(66);
				match(T__5);
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(67);
					condClause();
					}
					}
					setState(70); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				setState(72);
				match(T__2);
				}
				break;
			case 6:
				_localctx = new OperationExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(74);
				match(T__0);
				setState(75);
				operation();
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(76);
					expr();
					}
					}
					setState(79); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4063234L) != 0) );
				setState(81);
				match(T__2);
				}
				break;
			case 7:
				_localctx = new FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(83);
				match(T__0);
				setState(84);
				match(IDENTIFIER);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4063234L) != 0)) {
					{
					{
					setState(85);
					expr();
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(91);
				match(T__2);
				}
				break;
			case 8:
				_localctx = new QuoteExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(92);
				match(QUOTE);
				setState(93);
				expr();
				}
				break;
			case 9:
				_localctx = new NumberExprContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(94);
				match(NUMBER);
				}
				break;
			case 10:
				_localctx = new StringExprContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(95);
				match(STRING);
				}
				break;
			case 11:
				_localctx = new IdentifierExprContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(96);
				match(IDENTIFIER);
				}
				break;
			case 12:
				_localctx = new BooleanExprContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(97);
				match(BOOLEAN);
				}
				break;
			case 13:
				_localctx = new ListExprContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(98);
				match(T__0);
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4063234L) != 0)) {
					{
					{
					setState(99);
					expr();
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(105);
				match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperationContext extends ParserRuleContext {
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 130944L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondClauseContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CondClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condClause; }
	}

	public final CondClauseContext condClause() throws RecognitionException {
		CondClauseContext _localctx = new CondClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__0);
			setState(111);
			expr();
			setState(112);
			expr();
			setState(113);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LetBindingContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(schemeParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LetBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letBinding; }
	}

	public final LetBindingContext letBinding() throws RecognitionException {
		LetBindingContext _localctx = new LetBindingContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_letBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__0);
			setState(116);
			match(IDENTIFIER);
			setState(117);
			expr();
			setState(118);
			match(T__2);
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
		"\u0004\u0001\u0017y\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0005\u0000\f\b\u0000\n\u0000\f\u0000\u000f\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001\u0018\b\u0001\n\u0001\f\u0001\u001b\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0004\u0001\u001f\b\u0001\u000b\u0001\f\u0001 \u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001/\b"+
		"\u0001\u000b\u0001\f\u00010\u0001\u0001\u0001\u0001\u0004\u00015\b\u0001"+
		"\u000b\u0001\f\u00016\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0004\u0001E\b\u0001\u000b\u0001\f\u0001F\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001N\b"+
		"\u0001\u000b\u0001\f\u0001O\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001W\b\u0001\n\u0001\f\u0001Z\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001e\b\u0001\n\u0001\f\u0001h\t"+
		"\u0001\u0001\u0001\u0003\u0001k\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0000\u0000\u0005"+
		"\u0000\u0002\u0004\u0006\b\u0000\u0001\u0001\u0000\u0007\u0010\u0088\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0002j\u0001\u0000\u0000\u0000\u0004l\u0001"+
		"\u0000\u0000\u0000\u0006n\u0001\u0000\u0000\u0000\bs\u0001\u0000\u0000"+
		"\u0000\n\f\u0003\u0002\u0001\u0000\u000b\n\u0001\u0000\u0000\u0000\f\u000f"+
		"\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000\r\u000e\u0001"+
		"\u0000\u0000\u0000\u000e\u0010\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000"+
		"\u0000\u0000\u0010\u0011\u0005\u0000\u0000\u0001\u0011\u0001\u0001\u0000"+
		"\u0000\u0000\u0012\u0013\u0005\u0001\u0000\u0000\u0013\u0014\u0005\u0002"+
		"\u0000\u0000\u0014\u0015\u0005\u0001\u0000\u0000\u0015\u0019\u0005\u0015"+
		"\u0000\u0000\u0016\u0018\u0005\u0015\u0000\u0000\u0017\u0016\u0001\u0000"+
		"\u0000\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000"+
		"\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001c\u0001\u0000"+
		"\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001c\u001e\u0005\u0003"+
		"\u0000\u0000\u001d\u001f\u0003\u0002\u0001\u0000\u001e\u001d\u0001\u0000"+
		"\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000"+
		" !\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"#\u0005\u0003\u0000"+
		"\u0000#k\u0001\u0000\u0000\u0000$%\u0005\u0001\u0000\u0000%&\u0005\u0002"+
		"\u0000\u0000&\'\u0005\u0015\u0000\u0000\'(\u0003\u0002\u0001\u0000()\u0005"+
		"\u0003\u0000\u0000)k\u0001\u0000\u0000\u0000*+\u0005\u0001\u0000\u0000"+
		"+,\u0005\u0004\u0000\u0000,.\u0005\u0001\u0000\u0000-/\u0003\b\u0004\u0000"+
		".-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u00000.\u0001\u0000\u0000"+
		"\u000001\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000024\u0005\u0003"+
		"\u0000\u000035\u0003\u0002\u0001\u000043\u0001\u0000\u0000\u000056\u0001"+
		"\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u0000"+
		"78\u0001\u0000\u0000\u000089\u0005\u0003\u0000\u00009k\u0001\u0000\u0000"+
		"\u0000:;\u0005\u0001\u0000\u0000;<\u0005\u0005\u0000\u0000<=\u0003\u0002"+
		"\u0001\u0000=>\u0003\u0002\u0001\u0000>?\u0003\u0002\u0001\u0000?@\u0005"+
		"\u0003\u0000\u0000@k\u0001\u0000\u0000\u0000AB\u0005\u0001\u0000\u0000"+
		"BD\u0005\u0006\u0000\u0000CE\u0003\u0006\u0003\u0000DC\u0001\u0000\u0000"+
		"\u0000EF\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000"+
		"\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0005\u0003\u0000\u0000Ik\u0001"+
		"\u0000\u0000\u0000JK\u0005\u0001\u0000\u0000KM\u0003\u0004\u0002\u0000"+
		"LN\u0003\u0002\u0001\u0000ML\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000"+
		"\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0001\u0000"+
		"\u0000\u0000QR\u0005\u0003\u0000\u0000Rk\u0001\u0000\u0000\u0000ST\u0005"+
		"\u0001\u0000\u0000TX\u0005\u0015\u0000\u0000UW\u0003\u0002\u0001\u0000"+
		"VU\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000Y[\u0001\u0000\u0000\u0000ZX\u0001\u0000"+
		"\u0000\u0000[k\u0005\u0003\u0000\u0000\\]\u0005\u0012\u0000\u0000]k\u0003"+
		"\u0002\u0001\u0000^k\u0005\u0014\u0000\u0000_k\u0005\u0013\u0000\u0000"+
		"`k\u0005\u0015\u0000\u0000ak\u0005\u0011\u0000\u0000bf\u0005\u0001\u0000"+
		"\u0000ce\u0003\u0002\u0001\u0000dc\u0001\u0000\u0000\u0000eh\u0001\u0000"+
		"\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gi\u0001"+
		"\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000ik\u0005\u0003\u0000\u0000"+
		"j\u0012\u0001\u0000\u0000\u0000j$\u0001\u0000\u0000\u0000j*\u0001\u0000"+
		"\u0000\u0000j:\u0001\u0000\u0000\u0000jA\u0001\u0000\u0000\u0000jJ\u0001"+
		"\u0000\u0000\u0000jS\u0001\u0000\u0000\u0000j\\\u0001\u0000\u0000\u0000"+
		"j^\u0001\u0000\u0000\u0000j_\u0001\u0000\u0000\u0000j`\u0001\u0000\u0000"+
		"\u0000ja\u0001\u0000\u0000\u0000jb\u0001\u0000\u0000\u0000k\u0003\u0001"+
		"\u0000\u0000\u0000lm\u0007\u0000\u0000\u0000m\u0005\u0001\u0000\u0000"+
		"\u0000no\u0005\u0001\u0000\u0000op\u0003\u0002\u0001\u0000pq\u0003\u0002"+
		"\u0001\u0000qr\u0005\u0003\u0000\u0000r\u0007\u0001\u0000\u0000\u0000"+
		"st\u0005\u0001\u0000\u0000tu\u0005\u0015\u0000\u0000uv\u0003\u0002\u0001"+
		"\u0000vw\u0005\u0003\u0000\u0000w\t\u0001\u0000\u0000\u0000\n\r\u0019"+
		" 06FOXfj";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}