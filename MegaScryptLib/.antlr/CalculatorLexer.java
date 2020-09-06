// Generated from /Users/pascerveau/ANTLR/Calculator/MegaScryptLib/Calculator.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, Number=8, True=9, 
		False=10, Var=11, Null=12, Not=13, Increment=14, Decrement=15, And=16, 
		Or=17, Dot=18, Plus=19, Minus=20, Multiply=21, Divide=22, Modulo=23, LeftParenthesis=24, 
		RightParenthesis=25, Greater=26, Less=27, GreaterEqual=28, LessEqual=29, 
		Equal=30, NotEqual=31, AddAss=32, MinusAss=33, MultiplyAss=34, DivideAss=35, 
		String=36, Id=37, WhiteSpaces=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "Digit", "Letter", 
			"Number", "True", "False", "Var", "Null", "Not", "Increment", "Decrement", 
			"And", "Or", "Dot", "Plus", "Minus", "Multiply", "Divide", "Modulo", 
			"LeftParenthesis", "RightParenthesis", "Greater", "Less", "GreaterEqual", 
			"LessEqual", "Equal", "NotEqual", "AddAss", "MinusAss", "MultiplyAss", 
			"DivideAss", "String", "Id", "WhiteSpaces"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "'='", "'if'", "'else if'", "'else'", null, 
			"'true'", "'false'", "'var'", "'null'", "'!'", "'++'", "'--'", "'&&'", 
			"'||'", "'.'", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'>'", 
			"'<'", "'>='", "'<='", "'=='", "'!='", "'+='", "'-='", "'*='", "'/='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "Number", "True", "False", 
			"Var", "Null", "Not", "Increment", "Decrement", "And", "Or", "Dot", "Plus", 
			"Minus", "Multiply", "Divide", "Modulo", "LeftParenthesis", "RightParenthesis", 
			"Greater", "Less", "GreaterEqual", "LessEqual", "Equal", "NotEqual", 
			"AddAss", "MinusAss", "MultiplyAss", "DivideAss", "String", "Id", "WhiteSpaces"
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


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u00e7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\6\13q\n\13\r\13\16\13r\3\13\3\13\7\13"+
		"w\n\13\f\13\16\13z\13\13\5\13|\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#"+
		"\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\7\'\u00ce\n\'\f\'\16\'\u00d1\13\'"+
		"\3\'\3\'\3(\3(\5(\u00d7\n(\3(\3(\3(\7(\u00dc\n(\f(\16(\u00df\13(\3)\6"+
		")\u00e2\n)\r)\16)\u00e3\3)\3)\3\u00cf\2*\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\2\23\2\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-"+
		"\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G#I$K%M&O\'Q(\3"+
		"\2\5\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\2\u00ed\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\3S\3\2\2\2\5U\3\2\2\2\7W\3\2\2\2\tY\3\2\2\2\13[\3\2\2\2\r^\3"+
		"\2\2\2\17f\3\2\2\2\21k\3\2\2\2\23m\3\2\2\2\25p\3\2\2\2\27}\3\2\2\2\31"+
		"\u0082\3\2\2\2\33\u0088\3\2\2\2\35\u008c\3\2\2\2\37\u0091\3\2\2\2!\u0093"+
		"\3\2\2\2#\u0096\3\2\2\2%\u0099\3\2\2\2\'\u009c\3\2\2\2)\u009f\3\2\2\2"+
		"+\u00a1\3\2\2\2-\u00a3\3\2\2\2/\u00a5\3\2\2\2\61\u00a7\3\2\2\2\63\u00a9"+
		"\3\2\2\2\65\u00ab\3\2\2\2\67\u00ad\3\2\2\29\u00af\3\2\2\2;\u00b1\3\2\2"+
		"\2=\u00b3\3\2\2\2?\u00b6\3\2\2\2A\u00b9\3\2\2\2C\u00bc\3\2\2\2E\u00bf"+
		"\3\2\2\2G\u00c2\3\2\2\2I\u00c5\3\2\2\2K\u00c8\3\2\2\2M\u00cb\3\2\2\2O"+
		"\u00d6\3\2\2\2Q\u00e1\3\2\2\2ST\7}\2\2T\4\3\2\2\2UV\7\177\2\2V\6\3\2\2"+
		"\2WX\7=\2\2X\b\3\2\2\2YZ\7?\2\2Z\n\3\2\2\2[\\\7k\2\2\\]\7h\2\2]\f\3\2"+
		"\2\2^_\7g\2\2_`\7n\2\2`a\7u\2\2ab\7g\2\2bc\7\"\2\2cd\7k\2\2de\7h\2\2e"+
		"\16\3\2\2\2fg\7g\2\2gh\7n\2\2hi\7u\2\2ij\7g\2\2j\20\3\2\2\2kl\t\2\2\2"+
		"l\22\3\2\2\2mn\t\3\2\2n\24\3\2\2\2oq\5\21\t\2po\3\2\2\2qr\3\2\2\2rp\3"+
		"\2\2\2rs\3\2\2\2s{\3\2\2\2tx\7\60\2\2uw\5\21\t\2vu\3\2\2\2wz\3\2\2\2x"+
		"v\3\2\2\2xy\3\2\2\2y|\3\2\2\2zx\3\2\2\2{t\3\2\2\2{|\3\2\2\2|\26\3\2\2"+
		"\2}~\7v\2\2~\177\7t\2\2\177\u0080\7w\2\2\u0080\u0081\7g\2\2\u0081\30\3"+
		"\2\2\2\u0082\u0083\7h\2\2\u0083\u0084\7c\2\2\u0084\u0085\7n\2\2\u0085"+
		"\u0086\7u\2\2\u0086\u0087\7g\2\2\u0087\32\3\2\2\2\u0088\u0089\7x\2\2\u0089"+
		"\u008a\7c\2\2\u008a\u008b\7t\2\2\u008b\34\3\2\2\2\u008c\u008d\7p\2\2\u008d"+
		"\u008e\7w\2\2\u008e\u008f\7n\2\2\u008f\u0090\7n\2\2\u0090\36\3\2\2\2\u0091"+
		"\u0092\7#\2\2\u0092 \3\2\2\2\u0093\u0094\7-\2\2\u0094\u0095\7-\2\2\u0095"+
		"\"\3\2\2\2\u0096\u0097\7/\2\2\u0097\u0098\7/\2\2\u0098$\3\2\2\2\u0099"+
		"\u009a\7(\2\2\u009a\u009b\7(\2\2\u009b&\3\2\2\2\u009c\u009d\7~\2\2\u009d"+
		"\u009e\7~\2\2\u009e(\3\2\2\2\u009f\u00a0\7\60\2\2\u00a0*\3\2\2\2\u00a1"+
		"\u00a2\7-\2\2\u00a2,\3\2\2\2\u00a3\u00a4\7/\2\2\u00a4.\3\2\2\2\u00a5\u00a6"+
		"\7,\2\2\u00a6\60\3\2\2\2\u00a7\u00a8\7\61\2\2\u00a8\62\3\2\2\2\u00a9\u00aa"+
		"\7\'\2\2\u00aa\64\3\2\2\2\u00ab\u00ac\7*\2\2\u00ac\66\3\2\2\2\u00ad\u00ae"+
		"\7+\2\2\u00ae8\3\2\2\2\u00af\u00b0\7@\2\2\u00b0:\3\2\2\2\u00b1\u00b2\7"+
		">\2\2\u00b2<\3\2\2\2\u00b3\u00b4\7@\2\2\u00b4\u00b5\7?\2\2\u00b5>\3\2"+
		"\2\2\u00b6\u00b7\7>\2\2\u00b7\u00b8\7?\2\2\u00b8@\3\2\2\2\u00b9\u00ba"+
		"\7?\2\2\u00ba\u00bb\7?\2\2\u00bbB\3\2\2\2\u00bc\u00bd\7#\2\2\u00bd\u00be"+
		"\7?\2\2\u00beD\3\2\2\2\u00bf\u00c0\7-\2\2\u00c0\u00c1\7?\2\2\u00c1F\3"+
		"\2\2\2\u00c2\u00c3\7/\2\2\u00c3\u00c4\7?\2\2\u00c4H\3\2\2\2\u00c5\u00c6"+
		"\7,\2\2\u00c6\u00c7\7?\2\2\u00c7J\3\2\2\2\u00c8\u00c9\7\61\2\2\u00c9\u00ca"+
		"\7?\2\2\u00caL\3\2\2\2\u00cb\u00cf\7$\2\2\u00cc\u00ce\13\2\2\2\u00cd\u00cc"+
		"\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0"+
		"\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\7$\2\2\u00d3N\3\2\2\2\u00d4"+
		"\u00d7\5\23\n\2\u00d5\u00d7\7a\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2"+
		"\2\2\u00d7\u00dd\3\2\2\2\u00d8\u00dc\5\23\n\2\u00d9\u00dc\7a\2\2\u00da"+
		"\u00dc\5\21\t\2\u00db\u00d8\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00da\3"+
		"\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"P\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e2\t\4\2\2\u00e1\u00e0\3\2\2\2"+
		"\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5"+
		"\3\2\2\2\u00e5\u00e6\b)\2\2\u00e6R\3\2\2\2\13\2rx{\u00cf\u00d6\u00db\u00dd"+
		"\u00e3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}