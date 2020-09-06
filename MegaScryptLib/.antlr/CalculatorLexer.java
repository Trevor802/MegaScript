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
		Number=10, True=11, False=12, Var=13, Null=14, Not=15, Increment=16, Decrement=17, 
		And=18, Or=19, Dot=20, Plus=21, Minus=22, Multiply=23, Divide=24, Modulo=25, 
		LeftParenthesis=26, RightParenthesis=27, Greater=28, Less=29, GreaterEqual=30, 
		LessEqual=31, Equal=32, NotEqual=33, AddAss=34, MinusAss=35, MultiplyAss=36, 
		DivideAss=37, String=38, Id=39, WhiteSpaces=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"Digit", "Letter", "Number", "True", "False", "Var", "Null", "Not", "Increment", 
			"Decrement", "And", "Or", "Dot", "Plus", "Minus", "Multiply", "Divide", 
			"Modulo", "LeftParenthesis", "RightParenthesis", "Greater", "Less", "GreaterEqual", 
			"LessEqual", "Equal", "NotEqual", "AddAss", "MinusAss", "MultiplyAss", 
			"DivideAss", "String", "Id", "WhiteSpaces"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "'='", "':'", "','", "'if'", "'else if'", 
			"'else'", null, "'true'", "'false'", "'var'", "'null'", "'!'", "'++'", 
			"'--'", "'&&'", "'||'", "'.'", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", 
			"')'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'+='", "'-='", 
			"'*='", "'/='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "Number", 
			"True", "False", "Var", "Null", "Not", "Increment", "Decrement", "And", 
			"Or", "Dot", "Plus", "Minus", "Multiply", "Divide", "Modulo", "LeftParenthesis", 
			"RightParenthesis", "Greater", "Less", "GreaterEqual", "LessEqual", "Equal", 
			"NotEqual", "AddAss", "MinusAss", "MultiplyAss", "DivideAss", "String", 
			"Id", "WhiteSpaces"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u00ef\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\6\ry\n"+
		"\r\r\r\16\rz\3\r\3\r\7\r\177\n\r\f\r\16\r\u0082\13\r\5\r\u0084\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3"+
		"\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\7)\u00d6"+
		"\n)\f)\16)\u00d9\13)\3)\3)\3*\3*\5*\u00df\n*\3*\3*\3*\7*\u00e4\n*\f*\16"+
		"*\u00e7\13*\3+\6+\u00ea\n+\r+\16+\u00eb\3+\3+\3\u00d7\2,\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\2\27\2\31\f\33\r\35\16\37\17!\20#\21%\22"+
		"\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G"+
		"#I$K%M&O\'Q(S)U*\3\2\5\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\2\u00f5\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5Y\3\2\2"+
		"\2\7[\3\2\2\2\t]\3\2\2\2\13_\3\2\2\2\ra\3\2\2\2\17c\3\2\2\2\21f\3\2\2"+
		"\2\23n\3\2\2\2\25s\3\2\2\2\27u\3\2\2\2\31x\3\2\2\2\33\u0085\3\2\2\2\35"+
		"\u008a\3\2\2\2\37\u0090\3\2\2\2!\u0094\3\2\2\2#\u0099\3\2\2\2%\u009b\3"+
		"\2\2\2\'\u009e\3\2\2\2)\u00a1\3\2\2\2+\u00a4\3\2\2\2-\u00a7\3\2\2\2/\u00a9"+
		"\3\2\2\2\61\u00ab\3\2\2\2\63\u00ad\3\2\2\2\65\u00af\3\2\2\2\67\u00b1\3"+
		"\2\2\29\u00b3\3\2\2\2;\u00b5\3\2\2\2=\u00b7\3\2\2\2?\u00b9\3\2\2\2A\u00bb"+
		"\3\2\2\2C\u00be\3\2\2\2E\u00c1\3\2\2\2G\u00c4\3\2\2\2I\u00c7\3\2\2\2K"+
		"\u00ca\3\2\2\2M\u00cd\3\2\2\2O\u00d0\3\2\2\2Q\u00d3\3\2\2\2S\u00de\3\2"+
		"\2\2U\u00e9\3\2\2\2WX\7}\2\2X\4\3\2\2\2YZ\7\177\2\2Z\6\3\2\2\2[\\\7=\2"+
		"\2\\\b\3\2\2\2]^\7?\2\2^\n\3\2\2\2_`\7<\2\2`\f\3\2\2\2ab\7.\2\2b\16\3"+
		"\2\2\2cd\7k\2\2de\7h\2\2e\20\3\2\2\2fg\7g\2\2gh\7n\2\2hi\7u\2\2ij\7g\2"+
		"\2jk\7\"\2\2kl\7k\2\2lm\7h\2\2m\22\3\2\2\2no\7g\2\2op\7n\2\2pq\7u\2\2"+
		"qr\7g\2\2r\24\3\2\2\2st\t\2\2\2t\26\3\2\2\2uv\t\3\2\2v\30\3\2\2\2wy\5"+
		"\25\13\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\u0083\3\2\2\2|\u0080"+
		"\7\60\2\2}\177\5\25\13\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0083|\3\2\2\2"+
		"\u0083\u0084\3\2\2\2\u0084\32\3\2\2\2\u0085\u0086\7v\2\2\u0086\u0087\7"+
		"t\2\2\u0087\u0088\7w\2\2\u0088\u0089\7g\2\2\u0089\34\3\2\2\2\u008a\u008b"+
		"\7h\2\2\u008b\u008c\7c\2\2\u008c\u008d\7n\2\2\u008d\u008e\7u\2\2\u008e"+
		"\u008f\7g\2\2\u008f\36\3\2\2\2\u0090\u0091\7x\2\2\u0091\u0092\7c\2\2\u0092"+
		"\u0093\7t\2\2\u0093 \3\2\2\2\u0094\u0095\7p\2\2\u0095\u0096\7w\2\2\u0096"+
		"\u0097\7n\2\2\u0097\u0098\7n\2\2\u0098\"\3\2\2\2\u0099\u009a\7#\2\2\u009a"+
		"$\3\2\2\2\u009b\u009c\7-\2\2\u009c\u009d\7-\2\2\u009d&\3\2\2\2\u009e\u009f"+
		"\7/\2\2\u009f\u00a0\7/\2\2\u00a0(\3\2\2\2\u00a1\u00a2\7(\2\2\u00a2\u00a3"+
		"\7(\2\2\u00a3*\3\2\2\2\u00a4\u00a5\7~\2\2\u00a5\u00a6\7~\2\2\u00a6,\3"+
		"\2\2\2\u00a7\u00a8\7\60\2\2\u00a8.\3\2\2\2\u00a9\u00aa\7-\2\2\u00aa\60"+
		"\3\2\2\2\u00ab\u00ac\7/\2\2\u00ac\62\3\2\2\2\u00ad\u00ae\7,\2\2\u00ae"+
		"\64\3\2\2\2\u00af\u00b0\7\61\2\2\u00b0\66\3\2\2\2\u00b1\u00b2\7\'\2\2"+
		"\u00b28\3\2\2\2\u00b3\u00b4\7*\2\2\u00b4:\3\2\2\2\u00b5\u00b6\7+\2\2\u00b6"+
		"<\3\2\2\2\u00b7\u00b8\7@\2\2\u00b8>\3\2\2\2\u00b9\u00ba\7>\2\2\u00ba@"+
		"\3\2\2\2\u00bb\u00bc\7@\2\2\u00bc\u00bd\7?\2\2\u00bdB\3\2\2\2\u00be\u00bf"+
		"\7>\2\2\u00bf\u00c0\7?\2\2\u00c0D\3\2\2\2\u00c1\u00c2\7?\2\2\u00c2\u00c3"+
		"\7?\2\2\u00c3F\3\2\2\2\u00c4\u00c5\7#\2\2\u00c5\u00c6\7?\2\2\u00c6H\3"+
		"\2\2\2\u00c7\u00c8\7-\2\2\u00c8\u00c9\7?\2\2\u00c9J\3\2\2\2\u00ca\u00cb"+
		"\7/\2\2\u00cb\u00cc\7?\2\2\u00ccL\3\2\2\2\u00cd\u00ce\7,\2\2\u00ce\u00cf"+
		"\7?\2\2\u00cfN\3\2\2\2\u00d0\u00d1\7\61\2\2\u00d1\u00d2\7?\2\2\u00d2P"+
		"\3\2\2\2\u00d3\u00d7\7$\2\2\u00d4\u00d6\13\2\2\2\u00d5\u00d4\3\2\2\2\u00d6"+
		"\u00d9\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00da\3\2"+
		"\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7$\2\2\u00dbR\3\2\2\2\u00dc\u00df"+
		"\5\27\f\2\u00dd\u00df\7a\2\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df"+
		"\u00e5\3\2\2\2\u00e0\u00e4\5\27\f\2\u00e1\u00e4\7a\2\2\u00e2\u00e4\5\25"+
		"\13\2\u00e3\u00e0\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4"+
		"\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6T\3\2\2\2"+
		"\u00e7\u00e5\3\2\2\2\u00e8\u00ea\t\4\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00ee\b+\2\2\u00eeV\3\2\2\2\13\2z\u0080\u0083\u00d7\u00de\u00e3\u00e5"+
		"\u00eb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}