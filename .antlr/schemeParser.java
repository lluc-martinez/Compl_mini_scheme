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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		BOOLEAN=18, QUOTE=19, STRING=20, NUMBER=21, IDENTIFIER=22, WS=23, COMMENT=24;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_expr = 2, RULE_operation = 3, 
		RULE_condClause = 4, RULE_letBinding = 5, RULE_funcDef = 6, RULE_consDef = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "expr", "operation", "condClause", "letBinding", 
			"funcDef", "consDef"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'if'", "'cond'", "'let'", "'quote'", "'+'", "'-'", 
			"'*'", "'/'", "'>'", "'<'", "'>='", "'<='", "'='", "'<>'", "'define'", 
			null, "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "BOOLEAN", "QUOTE", "STRING", "NUMBER", 
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				statement();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 7602178L) != 0) );
			setState(21);
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
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpressionStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefinitionContext extends StatementContext {
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public FunctionDefinitionContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstantDefinitionContext extends StatementContext {
		public ConsDefContext consDef() {
			return getRuleContext(ConsDefContext.class,0);
		}
		public ConstantDefinitionContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(26);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				expr();
				}
				break;
			case 2:
				_localctx = new FunctionDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				funcDef();
				}
				break;
			case 3:
				_localctx = new ConstantDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				consDef();
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
	public static class NumberExprContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(schemeParser.NUMBER, 0); }
		public NumberExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LetExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<LetBindingContext> letBinding() {
			return getRuleContexts(LetBindingContext.class);
		}
		public LetBindingContext letBinding(int i) {
			return getRuleContext(LetBindingContext.class,i);
		}
		public LetExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierExprContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(schemeParser.IDENTIFIER, 0); }
		public IdentifierExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QuoteExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public QuoteExprContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class BooleanExprContext extends ExprContext {
		public TerminalNode BOOLEAN() { return getToken(schemeParser.BOOLEAN, 0); }
		public BooleanExprContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		int _la;
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new OperationExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(T__0);
				setState(29);
				operation();
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(30);
					expr();
					}
					}
					setState(33); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 7602178L) != 0) );
				setState(35);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new IfExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(T__0);
				setState(38);
				match(T__2);
				setState(39);
				expr();
				setState(40);
				expr();
				setState(41);
				expr();
				setState(42);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new CondExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				match(T__0);
				setState(45);
				match(T__3);
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(46);
					condClause();
					}
					}
					setState(49); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				setState(51);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new LetExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				match(T__0);
				setState(54);
				match(T__4);
				setState(55);
				match(T__0);
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(56);
					letBinding();
					}
					}
					setState(59); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				setState(61);
				match(T__1);
				setState(62);
				expr();
				setState(63);
				match(T__1);
				}
				break;
			case 5:
				_localctx = new FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				match(T__0);
				setState(66);
				match(IDENTIFIER);
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7602178L) != 0)) {
					{
					{
					setState(67);
					expr();
					}
					}
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(73);
				match(T__1);
				}
				break;
			case 6:
				_localctx = new QuoteExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(74);
				match(T__0);
				setState(75);
				match(T__5);
				setState(76);
				expr();
				setState(77);
				match(T__1);
				}
				break;
			case 7:
				_localctx = new NumberExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(79);
				match(NUMBER);
				}
				break;
			case 8:
				_localctx = new StringExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(80);
				match(STRING);
				}
				break;
			case 9:
				_localctx = new IdentifierExprContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(81);
				match(IDENTIFIER);
				}
				break;
			case 10:
				_localctx = new BooleanExprContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(82);
				match(BOOLEAN);
				}
				break;
			case 11:
				_localctx = new ListExprContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(83);
				match(T__0);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7602178L) != 0)) {
					{
					{
					setState(84);
					expr();
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(90);
				match(T__1);
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
		enterRule(_localctx, 6, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
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
		enterRule(_localctx, 8, RULE_condClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__0);
			setState(96);
			expr();
			setState(97);
			expr();
			setState(98);
			match(T__1);
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
		enterRule(_localctx, 10, RULE_letBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__0);
			setState(101);
			match(IDENTIFIER);
			setState(102);
			expr();
			setState(103);
			match(T__1);
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
	public static class FuncDefContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(schemeParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(schemeParser.IDENTIFIER, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__0);
			setState(106);
			match(T__16);
			setState(107);
			match(T__0);
			setState(108);
			match(IDENTIFIER);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(109);
				match(IDENTIFIER);
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			match(T__1);
			setState(116);
			expr();
			setState(117);
			match(T__1);
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
	public static class ConsDefContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(schemeParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ConsDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consDef; }
	}

	public final ConsDefContext consDef() throws RecognitionException {
		ConsDefContext _localctx = new ConsDefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_consDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__0);
			setState(120);
			match(T__16);
			setState(121);
			match(IDENTIFIER);
			setState(122);
			expr();
			setState(123);
			match(T__1);
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
		"\u0004\u0001\u0018~\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0004\u0000\u0012\b\u0000\u000b\u0000\f\u0000\u0013\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001b\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002 \b\u0002\u000b\u0002"+
		"\f\u0002!\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0004\u00020\b\u0002\u000b\u0002\f\u00021\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002:\b"+
		"\u0002\u000b\u0002\f\u0002;\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002E\b\u0002\n\u0002"+
		"\f\u0002H\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002V\b\u0002\n\u0002\f\u0002Y\t\u0002\u0001"+
		"\u0002\u0003\u0002\\\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006o\b\u0006\n\u0006\f\u0006r\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0000\u0000\b\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0000\u0001\u0001\u0000\u0007\u0010\u0088"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0002\u001a\u0001\u0000\u0000\u0000"+
		"\u0004[\u0001\u0000\u0000\u0000\u0006]\u0001\u0000\u0000\u0000\b_\u0001"+
		"\u0000\u0000\u0000\nd\u0001\u0000\u0000\u0000\fi\u0001\u0000\u0000\u0000"+
		"\u000ew\u0001\u0000\u0000\u0000\u0010\u0012\u0003\u0002\u0001\u0000\u0011"+
		"\u0010\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013"+
		"\u0011\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014"+
		"\u0015\u0001\u0000\u0000\u0000\u0015\u0016\u0005\u0000\u0000\u0001\u0016"+
		"\u0001\u0001\u0000\u0000\u0000\u0017\u001b\u0003\u0004\u0002\u0000\u0018"+
		"\u001b\u0003\f\u0006\u0000\u0019\u001b\u0003\u000e\u0007\u0000\u001a\u0017"+
		"\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u0019"+
		"\u0001\u0000\u0000\u0000\u001b\u0003\u0001\u0000\u0000\u0000\u001c\u001d"+
		"\u0005\u0001\u0000\u0000\u001d\u001f\u0003\u0006\u0003\u0000\u001e \u0003"+
		"\u0004\u0002\u0000\u001f\u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000"+
		"\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"#\u0001"+
		"\u0000\u0000\u0000#$\u0005\u0002\u0000\u0000$\\\u0001\u0000\u0000\u0000"+
		"%&\u0005\u0001\u0000\u0000&\'\u0005\u0003\u0000\u0000\'(\u0003\u0004\u0002"+
		"\u0000()\u0003\u0004\u0002\u0000)*\u0003\u0004\u0002\u0000*+\u0005\u0002"+
		"\u0000\u0000+\\\u0001\u0000\u0000\u0000,-\u0005\u0001\u0000\u0000-/\u0005"+
		"\u0004\u0000\u0000.0\u0003\b\u0004\u0000/.\u0001\u0000\u0000\u000001\u0001"+
		"\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u0000"+
		"23\u0001\u0000\u0000\u000034\u0005\u0002\u0000\u00004\\\u0001\u0000\u0000"+
		"\u000056\u0005\u0001\u0000\u000067\u0005\u0005\u0000\u000079\u0005\u0001"+
		"\u0000\u00008:\u0003\n\u0005\u000098\u0001\u0000\u0000\u0000:;\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0001"+
		"\u0000\u0000\u0000=>\u0005\u0002\u0000\u0000>?\u0003\u0004\u0002\u0000"+
		"?@\u0005\u0002\u0000\u0000@\\\u0001\u0000\u0000\u0000AB\u0005\u0001\u0000"+
		"\u0000BF\u0005\u0016\u0000\u0000CE\u0003\u0004\u0002\u0000DC\u0001\u0000"+
		"\u0000\u0000EH\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001"+
		"\u0000\u0000\u0000GI\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000"+
		"I\\\u0005\u0002\u0000\u0000JK\u0005\u0001\u0000\u0000KL\u0005\u0006\u0000"+
		"\u0000LM\u0003\u0004\u0002\u0000MN\u0005\u0002\u0000\u0000N\\\u0001\u0000"+
		"\u0000\u0000O\\\u0005\u0015\u0000\u0000P\\\u0005\u0014\u0000\u0000Q\\"+
		"\u0005\u0016\u0000\u0000R\\\u0005\u0012\u0000\u0000SW\u0005\u0001\u0000"+
		"\u0000TV\u0003\u0004\u0002\u0000UT\u0001\u0000\u0000\u0000VY\u0001\u0000"+
		"\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XZ\u0001"+
		"\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z\\\u0005\u0002\u0000\u0000"+
		"[\u001c\u0001\u0000\u0000\u0000[%\u0001\u0000\u0000\u0000[,\u0001\u0000"+
		"\u0000\u0000[5\u0001\u0000\u0000\u0000[A\u0001\u0000\u0000\u0000[J\u0001"+
		"\u0000\u0000\u0000[O\u0001\u0000\u0000\u0000[P\u0001\u0000\u0000\u0000"+
		"[Q\u0001\u0000\u0000\u0000[R\u0001\u0000\u0000\u0000[S\u0001\u0000\u0000"+
		"\u0000\\\u0005\u0001\u0000\u0000\u0000]^\u0007\u0000\u0000\u0000^\u0007"+
		"\u0001\u0000\u0000\u0000_`\u0005\u0001\u0000\u0000`a\u0003\u0004\u0002"+
		"\u0000ab\u0003\u0004\u0002\u0000bc\u0005\u0002\u0000\u0000c\t\u0001\u0000"+
		"\u0000\u0000de\u0005\u0001\u0000\u0000ef\u0005\u0016\u0000\u0000fg\u0003"+
		"\u0004\u0002\u0000gh\u0005\u0002\u0000\u0000h\u000b\u0001\u0000\u0000"+
		"\u0000ij\u0005\u0001\u0000\u0000jk\u0005\u0011\u0000\u0000kl\u0005\u0001"+
		"\u0000\u0000lp\u0005\u0016\u0000\u0000mo\u0005\u0016\u0000\u0000nm\u0001"+
		"\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000"+
		"pq\u0001\u0000\u0000\u0000qs\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000"+
		"\u0000st\u0005\u0002\u0000\u0000tu\u0003\u0004\u0002\u0000uv\u0005\u0002"+
		"\u0000\u0000v\r\u0001\u0000\u0000\u0000wx\u0005\u0001\u0000\u0000xy\u0005"+
		"\u0011\u0000\u0000yz\u0005\u0016\u0000\u0000z{\u0003\u0004\u0002\u0000"+
		"{|\u0005\u0002\u0000\u0000|\u000f\u0001\u0000\u0000\u0000\t\u0013\u001a"+
		"!1;FW[p";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}