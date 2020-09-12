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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, Number=12, True=13, False=14, Var=15, Null=16, Not=17, 
		Increment=18, Decrement=19, And=20, Or=21, Dot=22, Plus=23, Minus=24, 
		Multiply=25, Divide=26, Modulo=27, LeftParenthesis=28, RightParenthesis=29, 
		Greater=30, Less=31, GreaterEqual=32, LessEqual=33, Equal=34, NotEqual=35, 
		AddAss=36, MinusAss=37, MultiplyAss=38, DivideAss=39, String=40, Id=41, 
		WhiteSpaces=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "Digit", "Letter", "Number", "True", "False", "Var", 
			"Null", "Not", "Increment", "Decrement", "And", "Or", "Dot", "Plus", 
			"Minus", "Multiply", "Divide", "Modulo", "LeftParenthesis", "RightParenthesis", 
			"Greater", "Less", "GreaterEqual", "LessEqual", "Equal", "NotEqual", 
			"AddAss", "MinusAss", "MultiplyAss", "DivideAss", "String", "Id", "WhiteSpaces"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "'='", "'function'", "','", "':'", "'if'", 
			"'else if'", "'else'", "'return'", null, "'true'", "'false'", "'var'", 
			"'null'", "'!'", "'++'", "'--'", "'&&'", "'||'", "'.'", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'('", "')'", "'>'", "'<'", "'>='", "'<='", "'=='", 
			"'!='", "'+='", "'-='", "'*='", "'/='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"Number", "True", "False", "Var", "Null", "Not", "Increment", "Decrement", 
			"And", "Or", "Dot", "Plus", "Minus", "Multiply", "Divide", "Modulo", 
			"LeftParenthesis", "RightParenthesis", "Greater", "Less", "GreaterEqual", 
			"LessEqual", "Equal", "NotEqual", "AddAss", "MinusAss", "MultiplyAss", 
			"DivideAss", "String", "Id", "WhiteSpaces"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u0103\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\6\17\u008d\n\17\r\17\16\17\u008e\3\17\3\17\7\17\u0093\n\17\f\17"+
		"\16\17\u0096\13\17\5\17\u0098\n\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3("+
		"\3(\3)\3)\3)\3*\3*\3*\3+\3+\7+\u00ea\n+\f+\16+\u00ed\13+\3+\3+\3,\3,\5"+
		",\u00f3\n,\3,\3,\3,\7,\u00f8\n,\f,\16,\u00fb\13,\3-\6-\u00fe\n-\r-\16"+
		"-\u00ff\3-\3-\3\u00eb\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\2\33\2\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63"+
		"\31\65\32\67\339\34;\35=\36?\37A C!E\"G#I$K%M&O\'Q(S)U*W+Y,\3\2\5\3\2"+
		"\62;\4\2C\\c|\5\2\13\f\17\17\"\"\2\u0109\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3[\3\2\2\2\5]\3\2\2\2\7"+
		"_\3\2\2\2\ta\3\2\2\2\13c\3\2\2\2\rl\3\2\2\2\17n\3\2\2\2\21p\3\2\2\2\23"+
		"s\3\2\2\2\25{\3\2\2\2\27\u0080\3\2\2\2\31\u0087\3\2\2\2\33\u0089\3\2\2"+
		"\2\35\u008c\3\2\2\2\37\u0099\3\2\2\2!\u009e\3\2\2\2#\u00a4\3\2\2\2%\u00a8"+
		"\3\2\2\2\'\u00ad\3\2\2\2)\u00af\3\2\2\2+\u00b2\3\2\2\2-\u00b5\3\2\2\2"+
		"/\u00b8\3\2\2\2\61\u00bb\3\2\2\2\63\u00bd\3\2\2\2\65\u00bf\3\2\2\2\67"+
		"\u00c1\3\2\2\29\u00c3\3\2\2\2;\u00c5\3\2\2\2=\u00c7\3\2\2\2?\u00c9\3\2"+
		"\2\2A\u00cb\3\2\2\2C\u00cd\3\2\2\2E\u00cf\3\2\2\2G\u00d2\3\2\2\2I\u00d5"+
		"\3\2\2\2K\u00d8\3\2\2\2M\u00db\3\2\2\2O\u00de\3\2\2\2Q\u00e1\3\2\2\2S"+
		"\u00e4\3\2\2\2U\u00e7\3\2\2\2W\u00f2\3\2\2\2Y\u00fd\3\2\2\2[\\\7}\2\2"+
		"\\\4\3\2\2\2]^\7\177\2\2^\6\3\2\2\2_`\7=\2\2`\b\3\2\2\2ab\7?\2\2b\n\3"+
		"\2\2\2cd\7h\2\2de\7w\2\2ef\7p\2\2fg\7e\2\2gh\7v\2\2hi\7k\2\2ij\7q\2\2"+
		"jk\7p\2\2k\f\3\2\2\2lm\7.\2\2m\16\3\2\2\2no\7<\2\2o\20\3\2\2\2pq\7k\2"+
		"\2qr\7h\2\2r\22\3\2\2\2st\7g\2\2tu\7n\2\2uv\7u\2\2vw\7g\2\2wx\7\"\2\2"+
		"xy\7k\2\2yz\7h\2\2z\24\3\2\2\2{|\7g\2\2|}\7n\2\2}~\7u\2\2~\177\7g\2\2"+
		"\177\26\3\2\2\2\u0080\u0081\7t\2\2\u0081\u0082\7g\2\2\u0082\u0083\7v\2"+
		"\2\u0083\u0084\7w\2\2\u0084\u0085\7t\2\2\u0085\u0086\7p\2\2\u0086\30\3"+
		"\2\2\2\u0087\u0088\t\2\2\2\u0088\32\3\2\2\2\u0089\u008a\t\3\2\2\u008a"+
		"\34\3\2\2\2\u008b\u008d\5\31\r\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2"+
		"\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0097\3\2\2\2\u0090\u0094"+
		"\7\60\2\2\u0091\u0093\5\31\r\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2"+
		"\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094"+
		"\3\2\2\2\u0097\u0090\3\2\2\2\u0097\u0098\3\2\2\2\u0098\36\3\2\2\2\u0099"+
		"\u009a\7v\2\2\u009a\u009b\7t\2\2\u009b\u009c\7w\2\2\u009c\u009d\7g\2\2"+
		"\u009d \3\2\2\2\u009e\u009f\7h\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7n\2"+
		"\2\u00a1\u00a2\7u\2\2\u00a2\u00a3\7g\2\2\u00a3\"\3\2\2\2\u00a4\u00a5\7"+
		"x\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7t\2\2\u00a7$\3\2\2\2\u00a8\u00a9"+
		"\7p\2\2\u00a9\u00aa\7w\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7n\2\2\u00ac"+
		"&\3\2\2\2\u00ad\u00ae\7#\2\2\u00ae(\3\2\2\2\u00af\u00b0\7-\2\2\u00b0\u00b1"+
		"\7-\2\2\u00b1*\3\2\2\2\u00b2\u00b3\7/\2\2\u00b3\u00b4\7/\2\2\u00b4,\3"+
		"\2\2\2\u00b5\u00b6\7(\2\2\u00b6\u00b7\7(\2\2\u00b7.\3\2\2\2\u00b8\u00b9"+
		"\7~\2\2\u00b9\u00ba\7~\2\2\u00ba\60\3\2\2\2\u00bb\u00bc\7\60\2\2\u00bc"+
		"\62\3\2\2\2\u00bd\u00be\7-\2\2\u00be\64\3\2\2\2\u00bf\u00c0\7/\2\2\u00c0"+
		"\66\3\2\2\2\u00c1\u00c2\7,\2\2\u00c28\3\2\2\2\u00c3\u00c4\7\61\2\2\u00c4"+
		":\3\2\2\2\u00c5\u00c6\7\'\2\2\u00c6<\3\2\2\2\u00c7\u00c8\7*\2\2\u00c8"+
		">\3\2\2\2\u00c9\u00ca\7+\2\2\u00ca@\3\2\2\2\u00cb\u00cc\7@\2\2\u00ccB"+
		"\3\2\2\2\u00cd\u00ce\7>\2\2\u00ceD\3\2\2\2\u00cf\u00d0\7@\2\2\u00d0\u00d1"+
		"\7?\2\2\u00d1F\3\2\2\2\u00d2\u00d3\7>\2\2\u00d3\u00d4\7?\2\2\u00d4H\3"+
		"\2\2\2\u00d5\u00d6\7?\2\2\u00d6\u00d7\7?\2\2\u00d7J\3\2\2\2\u00d8\u00d9"+
		"\7#\2\2\u00d9\u00da\7?\2\2\u00daL\3\2\2\2\u00db\u00dc\7-\2\2\u00dc\u00dd"+
		"\7?\2\2\u00ddN\3\2\2\2\u00de\u00df\7/\2\2\u00df\u00e0\7?\2\2\u00e0P\3"+
		"\2\2\2\u00e1\u00e2\7,\2\2\u00e2\u00e3\7?\2\2\u00e3R\3\2\2\2\u00e4\u00e5"+
		"\7\61\2\2\u00e5\u00e6\7?\2\2\u00e6T\3\2\2\2\u00e7\u00eb\7$\2\2\u00e8\u00ea"+
		"\13\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00ec\3\2\2\2"+
		"\u00eb\u00e9\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef"+
		"\7$\2\2\u00efV\3\2\2\2\u00f0\u00f3\5\33\16\2\u00f1\u00f3\7a\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f9\3\2\2\2\u00f4\u00f8\5\33"+
		"\16\2\u00f5\u00f8\7a\2\2\u00f6\u00f8\5\31\r\2\u00f7\u00f4\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2"+
		"\2\2\u00f9\u00fa\3\2\2\2\u00faX\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fe"+
		"\t\4\2\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\b-\2\2\u0102Z\3\2\2\2\13"+
		"\2\u008e\u0094\u0097\u00eb\u00f2\u00f7\u00f9\u00ff\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}