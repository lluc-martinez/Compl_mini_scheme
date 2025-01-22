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
		T__0=1, T__1=2, NUMBER=3, BOOLEAN=4, STRING=5, IDENTIFIER=6, QUOTE=7, 
		PLUS=8, MINUS=9, STAR=10, SLASH=11, LT=12, LE=13, GT=14, GE=15, EQUAL=16, 
		NOT_EQUAL=17, WS=18, COMMENT=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "NUMBER", "BOOLEAN", "STRING", "IDENTIFIER", "QUOTE", 
			"PLUS", "MINUS", "STAR", "SLASH", "LT", "LE", "GT", "GE", "EQUAL", "NOT_EQUAL", 
			"WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", null, null, null, null, "'''", "'+'", "'-'", "'*'", 
			"'/'", "'<'", "'<='", "'>'", "'>='", "'='", "'<>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "NUMBER", "BOOLEAN", "STRING", "IDENTIFIER", "QUOTE", 
			"PLUS", "MINUS", "STAR", "SLASH", "LT", "LE", "GT", "GE", "EQUAL", "NOT_EQUAL", 
			"WS", "COMMENT"
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
		"\u0004\u0000\u0013y\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0004\u0002-\b\u0002\u000b\u0002\f\u0002.\u0001\u0002\u0001\u0002"+
		"\u0004\u00023\b\u0002\u000b\u0002\f\u00024\u0003\u00027\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003=\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004C\b\u0004\n\u0004"+
		"\f\u0004F\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005"+
		"\u0005L\b\u0005\n\u0005\f\u0005O\t\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0004\u0011k\b\u0011\u000b\u0011\f\u0011l\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0005\u0012s\b\u0012\n\u0012"+
		"\f\u0012v\t\u0012\u0001\u0012\u0001\u0012\u0000\u0000\u0013\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\u0001\u0000\u0006\u0001\u000009\u0002"+
		"\u0000\"\"\\\\\u0003\u0000AZ__az\u0004\u000009AZ__az\u0003\u0000\t\n\r"+
		"\r  \u0002\u0000\n\n\r\r\u0081\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000\u0000"+
		"\u0003)\u0001\u0000\u0000\u0000\u0005,\u0001\u0000\u0000\u0000\u0007<"+
		"\u0001\u0000\u0000\u0000\t>\u0001\u0000\u0000\u0000\u000bI\u0001\u0000"+
		"\u0000\u0000\rP\u0001\u0000\u0000\u0000\u000fR\u0001\u0000\u0000\u0000"+
		"\u0011T\u0001\u0000\u0000\u0000\u0013V\u0001\u0000\u0000\u0000\u0015X"+
		"\u0001\u0000\u0000\u0000\u0017Z\u0001\u0000\u0000\u0000\u0019\\\u0001"+
		"\u0000\u0000\u0000\u001b_\u0001\u0000\u0000\u0000\u001da\u0001\u0000\u0000"+
		"\u0000\u001fd\u0001\u0000\u0000\u0000!f\u0001\u0000\u0000\u0000#j\u0001"+
		"\u0000\u0000\u0000%p\u0001\u0000\u0000\u0000\'(\u0005(\u0000\u0000(\u0002"+
		"\u0001\u0000\u0000\u0000)*\u0005)\u0000\u0000*\u0004\u0001\u0000\u0000"+
		"\u0000+-\u0007\u0000\u0000\u0000,+\u0001\u0000\u0000\u0000-.\u0001\u0000"+
		"\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/6\u0001"+
		"\u0000\u0000\u000002\u0005.\u0000\u000013\u0007\u0000\u0000\u000021\u0001"+
		"\u0000\u0000\u000034\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u0000"+
		"45\u0001\u0000\u0000\u000057\u0001\u0000\u0000\u000060\u0001\u0000\u0000"+
		"\u000067\u0001\u0000\u0000\u00007\u0006\u0001\u0000\u0000\u000089\u0005"+
		"#\u0000\u00009=\u0005t\u0000\u0000:;\u0005#\u0000\u0000;=\u0005f\u0000"+
		"\u0000<8\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=\b\u0001\u0000"+
		"\u0000\u0000>D\u0005\"\u0000\u0000?C\b\u0001\u0000\u0000@A\u0005\\\u0000"+
		"\u0000AC\t\u0000\u0000\u0000B?\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000"+
		"\u0000CF\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000"+
		"\u0000\u0000EG\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GH\u0005"+
		"\"\u0000\u0000H\n\u0001\u0000\u0000\u0000IM\u0007\u0002\u0000\u0000JL"+
		"\u0007\u0003\u0000\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000"+
		"\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000N\f\u0001\u0000"+
		"\u0000\u0000OM\u0001\u0000\u0000\u0000PQ\u0005\'\u0000\u0000Q\u000e\u0001"+
		"\u0000\u0000\u0000RS\u0005+\u0000\u0000S\u0010\u0001\u0000\u0000\u0000"+
		"TU\u0005-\u0000\u0000U\u0012\u0001\u0000\u0000\u0000VW\u0005*\u0000\u0000"+
		"W\u0014\u0001\u0000\u0000\u0000XY\u0005/\u0000\u0000Y\u0016\u0001\u0000"+
		"\u0000\u0000Z[\u0005<\u0000\u0000[\u0018\u0001\u0000\u0000\u0000\\]\u0005"+
		"<\u0000\u0000]^\u0005=\u0000\u0000^\u001a\u0001\u0000\u0000\u0000_`\u0005"+
		">\u0000\u0000`\u001c\u0001\u0000\u0000\u0000ab\u0005>\u0000\u0000bc\u0005"+
		"=\u0000\u0000c\u001e\u0001\u0000\u0000\u0000de\u0005=\u0000\u0000e \u0001"+
		"\u0000\u0000\u0000fg\u0005<\u0000\u0000gh\u0005>\u0000\u0000h\"\u0001"+
		"\u0000\u0000\u0000ik\u0007\u0004\u0000\u0000ji\u0001\u0000\u0000\u0000"+
		"kl\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000"+
		"\u0000mn\u0001\u0000\u0000\u0000no\u0006\u0011\u0000\u0000o$\u0001\u0000"+
		"\u0000\u0000pt\u0005;\u0000\u0000qs\b\u0005\u0000\u0000rq\u0001\u0000"+
		"\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001"+
		"\u0000\u0000\u0000uw\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000"+
		"wx\u0006\u0012\u0000\u0000x&\u0001\u0000\u0000\u0000\n\u0000.46<BDMlt"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}