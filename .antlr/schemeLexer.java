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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		BOOLEAN=18, QUOTE=19, STRING=20, NUMBER=21, IDENTIFIER=22, WS=23, COMMENT=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"BOOLEAN", "QUOTE", "STRING", "NUMBER", "IDENTIFIER", "WS", "COMMENT"
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
		"\u0004\u0000\u0018\u0097\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011j\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0005\u0013r\b\u0013\n\u0013\f\u0013u\t\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0003\u0014z\b\u0014\u0001\u0014\u0004\u0014}\b\u0014\u000b"+
		"\u0014\f\u0014~\u0001\u0015\u0001\u0015\u0005\u0015\u0083\b\u0015\n\u0015"+
		"\f\u0015\u0086\t\u0015\u0001\u0016\u0004\u0016\u0089\b\u0016\u000b\u0016"+
		"\f\u0016\u008a\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u0091\b\u0017\n\u0017\f\u0017\u0094\t\u0017\u0001\u0017\u0001\u0017\u0000"+
		"\u0000\u0018\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016"+
		"-\u0017/\u0018\u0001\u0000\u0006\u0003\u0000\n\n\r\r\"\"\u0001\u00000"+
		"9\u0007\u0000*+--//<>AZ__az\u0007\u0000*+--/9<?AZ__az\u0003\u0000\t\n"+
		"\r\r  \u0002\u0000\n\n\r\r\u009e\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00011\u0001\u0000"+
		"\u0000\u0000\u00033\u0001\u0000\u0000\u0000\u00055\u0001\u0000\u0000\u0000"+
		"\u00078\u0001\u0000\u0000\u0000\t=\u0001\u0000\u0000\u0000\u000bA\u0001"+
		"\u0000\u0000\u0000\rG\u0001\u0000\u0000\u0000\u000fI\u0001\u0000\u0000"+
		"\u0000\u0011K\u0001\u0000\u0000\u0000\u0013M\u0001\u0000\u0000\u0000\u0015"+
		"O\u0001\u0000\u0000\u0000\u0017Q\u0001\u0000\u0000\u0000\u0019S\u0001"+
		"\u0000\u0000\u0000\u001bV\u0001\u0000\u0000\u0000\u001dY\u0001\u0000\u0000"+
		"\u0000\u001f[\u0001\u0000\u0000\u0000!^\u0001\u0000\u0000\u0000#i\u0001"+
		"\u0000\u0000\u0000%k\u0001\u0000\u0000\u0000\'m\u0001\u0000\u0000\u0000"+
		")y\u0001\u0000\u0000\u0000+\u0080\u0001\u0000\u0000\u0000-\u0088\u0001"+
		"\u0000\u0000\u0000/\u008e\u0001\u0000\u0000\u000012\u0005(\u0000\u0000"+
		"2\u0002\u0001\u0000\u0000\u000034\u0005)\u0000\u00004\u0004\u0001\u0000"+
		"\u0000\u000056\u0005i\u0000\u000067\u0005f\u0000\u00007\u0006\u0001\u0000"+
		"\u0000\u000089\u0005c\u0000\u00009:\u0005o\u0000\u0000:;\u0005n\u0000"+
		"\u0000;<\u0005d\u0000\u0000<\b\u0001\u0000\u0000\u0000=>\u0005l\u0000"+
		"\u0000>?\u0005e\u0000\u0000?@\u0005t\u0000\u0000@\n\u0001\u0000\u0000"+
		"\u0000AB\u0005q\u0000\u0000BC\u0005u\u0000\u0000CD\u0005o\u0000\u0000"+
		"DE\u0005t\u0000\u0000EF\u0005e\u0000\u0000F\f\u0001\u0000\u0000\u0000"+
		"GH\u0005+\u0000\u0000H\u000e\u0001\u0000\u0000\u0000IJ\u0005-\u0000\u0000"+
		"J\u0010\u0001\u0000\u0000\u0000KL\u0005*\u0000\u0000L\u0012\u0001\u0000"+
		"\u0000\u0000MN\u0005/\u0000\u0000N\u0014\u0001\u0000\u0000\u0000OP\u0005"+
		">\u0000\u0000P\u0016\u0001\u0000\u0000\u0000QR\u0005<\u0000\u0000R\u0018"+
		"\u0001\u0000\u0000\u0000ST\u0005>\u0000\u0000TU\u0005=\u0000\u0000U\u001a"+
		"\u0001\u0000\u0000\u0000VW\u0005<\u0000\u0000WX\u0005=\u0000\u0000X\u001c"+
		"\u0001\u0000\u0000\u0000YZ\u0005=\u0000\u0000Z\u001e\u0001\u0000\u0000"+
		"\u0000[\\\u0005<\u0000\u0000\\]\u0005>\u0000\u0000] \u0001\u0000\u0000"+
		"\u0000^_\u0005d\u0000\u0000_`\u0005e\u0000\u0000`a\u0005f\u0000\u0000"+
		"ab\u0005i\u0000\u0000bc\u0005n\u0000\u0000cd\u0005e\u0000\u0000d\"\u0001"+
		"\u0000\u0000\u0000ef\u0005#\u0000\u0000fj\u0005t\u0000\u0000gh\u0005#"+
		"\u0000\u0000hj\u0005f\u0000\u0000ie\u0001\u0000\u0000\u0000ig\u0001\u0000"+
		"\u0000\u0000j$\u0001\u0000\u0000\u0000kl\u0005\'\u0000\u0000l&\u0001\u0000"+
		"\u0000\u0000ms\u0005\"\u0000\u0000nr\b\u0000\u0000\u0000op\u0005\\\u0000"+
		"\u0000pr\u0005\"\u0000\u0000qn\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000"+
		"\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000"+
		"\u0000\u0000tv\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000vw\u0005"+
		"\"\u0000\u0000w(\u0001\u0000\u0000\u0000xz\u0005-\u0000\u0000yx\u0001"+
		"\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0001\u0000\u0000\u0000"+
		"{}\u0007\u0001\u0000\u0000|{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000"+
		"\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f"+
		"*\u0001\u0000\u0000\u0000\u0080\u0084\u0007\u0002\u0000\u0000\u0081\u0083"+
		"\u0007\u0003\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0086"+
		"\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0001\u0000\u0000\u0000\u0085,\u0001\u0000\u0000\u0000\u0086\u0084\u0001"+
		"\u0000\u0000\u0000\u0087\u0089\u0007\u0004\u0000\u0000\u0088\u0087\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0088\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0006\u0016\u0000\u0000\u008d.\u0001\u0000"+
		"\u0000\u0000\u008e\u0092\u0005;\u0000\u0000\u008f\u0091\b\u0005\u0000"+
		"\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000"+
		"\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000"+
		"\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0006\u0017\u0000\u0000\u00960\u0001\u0000\u0000\u0000"+
		"\t\u0000iqsy~\u0084\u008a\u0092\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}