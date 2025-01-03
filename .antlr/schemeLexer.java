// Generated from /home/lluc/Documents/Uni/Q5/LP/Compiladors/Compl_mini_scheme/scheme.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class schemeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, BOOLEAN=17, 
		QUOTE=18, STRING=19, NUMBER=20, IDENTIFIER=21, WS=22, COMMENT=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "BOOLEAN", 
			"QUOTE", "STRING", "NUMBER", "IDENTIFIER", "WS", "COMMENT"
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


	public schemeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "scheme.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0017\u0097\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010b\b\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012j\b\u0012"+
		"\n\u0012\f\u0012m\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0003\u0013"+
		"r\b\u0013\u0001\u0013\u0004\u0013u\b\u0013\u000b\u0013\f\u0013v\u0001"+
		"\u0013\u0001\u0013\u0004\u0013{\b\u0013\u000b\u0013\f\u0013|\u0003\u0013"+
		"\u007f\b\u0013\u0001\u0014\u0001\u0014\u0005\u0014\u0083\b\u0014\n\u0014"+
		"\f\u0014\u0086\t\u0014\u0001\u0015\u0004\u0015\u0089\b\u0015\u000b\u0015"+
		"\f\u0015\u008a\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0005\u0016"+
		"\u0091\b\u0016\n\u0016\f\u0016\u0094\t\u0016\u0001\u0016\u0001\u0016\u0000"+
		"\u0000\u0017\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016"+
		"-\u0017\u0001\u0000\u0006\u0003\u0000\n\n\r\r\"\"\u0001\u000009\u0007"+
		"\u0000*+--//<>AZ__az\u0007\u0000*+--/9<?AZ__az\u0003\u0000\t\n\r\r  \u0002"+
		"\u0000\n\n\r\r\u00a0\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0001/\u0001\u0000\u0000\u0000\u00031\u0001\u0000\u0000\u0000\u0005"+
		"8\u0001\u0000\u0000\u0000\u0007:\u0001\u0000\u0000\u0000\t>\u0001\u0000"+
		"\u0000\u0000\u000bA\u0001\u0000\u0000\u0000\rF\u0001\u0000\u0000\u0000"+
		"\u000fH\u0001\u0000\u0000\u0000\u0011J\u0001\u0000\u0000\u0000\u0013L"+
		"\u0001\u0000\u0000\u0000\u0015N\u0001\u0000\u0000\u0000\u0017P\u0001\u0000"+
		"\u0000\u0000\u0019R\u0001\u0000\u0000\u0000\u001bU\u0001\u0000\u0000\u0000"+
		"\u001dX\u0001\u0000\u0000\u0000\u001fZ\u0001\u0000\u0000\u0000!a\u0001"+
		"\u0000\u0000\u0000#c\u0001\u0000\u0000\u0000%e\u0001\u0000\u0000\u0000"+
		"\'q\u0001\u0000\u0000\u0000)\u0080\u0001\u0000\u0000\u0000+\u0088\u0001"+
		"\u0000\u0000\u0000-\u008e\u0001\u0000\u0000\u0000/0\u0005(\u0000\u0000"+
		"0\u0002\u0001\u0000\u0000\u000012\u0005d\u0000\u000023\u0005e\u0000\u0000"+
		"34\u0005f\u0000\u000045\u0005i\u0000\u000056\u0005n\u0000\u000067\u0005"+
		"e\u0000\u00007\u0004\u0001\u0000\u0000\u000089\u0005)\u0000\u00009\u0006"+
		"\u0001\u0000\u0000\u0000:;\u0005l\u0000\u0000;<\u0005e\u0000\u0000<=\u0005"+
		"t\u0000\u0000=\b\u0001\u0000\u0000\u0000>?\u0005i\u0000\u0000?@\u0005"+
		"f\u0000\u0000@\n\u0001\u0000\u0000\u0000AB\u0005c\u0000\u0000BC\u0005"+
		"o\u0000\u0000CD\u0005n\u0000\u0000DE\u0005d\u0000\u0000E\f\u0001\u0000"+
		"\u0000\u0000FG\u0005+\u0000\u0000G\u000e\u0001\u0000\u0000\u0000HI\u0005"+
		"-\u0000\u0000I\u0010\u0001\u0000\u0000\u0000JK\u0005*\u0000\u0000K\u0012"+
		"\u0001\u0000\u0000\u0000LM\u0005/\u0000\u0000M\u0014\u0001\u0000\u0000"+
		"\u0000NO\u0005>\u0000\u0000O\u0016\u0001\u0000\u0000\u0000PQ\u0005<\u0000"+
		"\u0000Q\u0018\u0001\u0000\u0000\u0000RS\u0005>\u0000\u0000ST\u0005=\u0000"+
		"\u0000T\u001a\u0001\u0000\u0000\u0000UV\u0005<\u0000\u0000VW\u0005=\u0000"+
		"\u0000W\u001c\u0001\u0000\u0000\u0000XY\u0005=\u0000\u0000Y\u001e\u0001"+
		"\u0000\u0000\u0000Z[\u0005<\u0000\u0000[\\\u0005>\u0000\u0000\\ \u0001"+
		"\u0000\u0000\u0000]^\u0005#\u0000\u0000^b\u0005t\u0000\u0000_`\u0005#"+
		"\u0000\u0000`b\u0005f\u0000\u0000a]\u0001\u0000\u0000\u0000a_\u0001\u0000"+
		"\u0000\u0000b\"\u0001\u0000\u0000\u0000cd\u0005\'\u0000\u0000d$\u0001"+
		"\u0000\u0000\u0000ek\u0005\"\u0000\u0000fj\b\u0000\u0000\u0000gh\u0005"+
		"\\\u0000\u0000hj\u0005\"\u0000\u0000if\u0001\u0000\u0000\u0000ig\u0001"+
		"\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000"+
		"kl\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000"+
		"\u0000no\u0005\"\u0000\u0000o&\u0001\u0000\u0000\u0000pr\u0005-\u0000"+
		"\u0000qp\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rt\u0001\u0000"+
		"\u0000\u0000su\u0007\u0001\u0000\u0000ts\u0001\u0000\u0000\u0000uv\u0001"+
		"\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000"+
		"w~\u0001\u0000\u0000\u0000xz\u0005.\u0000\u0000y{\u0007\u0001\u0000\u0000"+
		"zy\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000"+
		"\u0000|}\u0001\u0000\u0000\u0000}\u007f\u0001\u0000\u0000\u0000~x\u0001"+
		"\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f(\u0001\u0000\u0000"+
		"\u0000\u0080\u0084\u0007\u0002\u0000\u0000\u0081\u0083\u0007\u0003\u0000"+
		"\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000"+
		"\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000"+
		"\u0000\u0085*\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000"+
		"\u0087\u0089\u0007\u0004\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0006\u0015\u0000\u0000\u008d,\u0001\u0000\u0000\u0000\u008e"+
		"\u0092\u0005;\u0000\u0000\u008f\u0091\b\u0005\u0000\u0000\u0090\u008f"+
		"\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0095"+
		"\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0006\u0016\u0000\u0000\u0096.\u0001\u0000\u0000\u0000\u000b\u0000ai"+
		"kqv|~\u0084\u008a\u0092\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}