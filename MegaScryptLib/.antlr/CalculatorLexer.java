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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, Number=19, True=20, False=21, Var=22, Null=23, Not=24, Increment=25, 
		Decrement=26, And=27, Or=28, Dot=29, Plus=30, Minus=31, Multiply=32, Divide=33, 
		Modulo=34, LeftParenthesis=35, RightParenthesis=36, LeftBracket=37, RightBracket=38, 
		Greater=39, Less=40, GreaterEqual=41, LessEqual=42, Equal=43, NotEqual=44, 
		AddAss=45, MinusAss=46, MultiplyAss=47, DivideAss=48, String=49, Id=50, 
		WhiteSpaces=51;
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
			"T__17", "Digit", "Letter", "Number", "True", "False", "Var", "Null", 
			"Not", "Increment", "Decrement", "And", "Or", "Dot", "Plus", "Minus", 
			"Multiply", "Divide", "Modulo", "LeftParenthesis", "RightParenthesis", 
			"LeftBracket", "RightBracket", "Greater", "Less", "GreaterEqual", "LessEqual", 
			"Equal", "NotEqual", "AddAss", "MinusAss", "MultiplyAss", "DivideAss", 
			"String", "Id", "WhiteSpaces"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "'='", "'function'", "','", "':'", "'if'", 
			"'else if'", "'else'", "'for'", "'while'", "'do'", "'foreach'", "'in'", 
			"'return'", "'break'", "'continue'", null, "'true'", "'false'", "'var'", 
			"'null'", "'!'", "'++'", "'--'", "'&&'", "'||'", "'.'", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'('", "')'", "'['", "']'", "'>'", "'<'", "'>='", 
			"'<='", "'=='", "'!='", "'+='", "'-='", "'*='", "'/='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "Number", "True", "False", 
			"Var", "Null", "Not", "Increment", "Decrement", "And", "Or", "Dot", "Plus", 
			"Minus", "Multiply", "Divide", "Modulo", "LeftParenthesis", "RightParenthesis", 
			"LeftBracket", "RightBracket", "Greater", "Less", "GreaterEqual", "LessEqual", 
			"Equal", "NotEqual", "AddAss", "MinusAss", "MultiplyAss", "DivideAss", 
			"String", "Id", "WhiteSpaces"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0140\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\6\26\u00c6\n\26\r\26\16\26\u00c7\3\26\3\26\7\26\u00cc\n\26\f\26"+
		"\16\26\u00cf\13\26\5\26\u00d1\n\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3"+
		"+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3"+
		"\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\7\64\u0127\n\64\f\64\16\64\u012a"+
		"\13\64\3\64\3\64\3\65\3\65\5\65\u0130\n\65\3\65\3\65\3\65\7\65\u0135\n"+
		"\65\f\65\16\65\u0138\13\65\3\66\6\66\u013b\n\66\r\66\16\66\u013c\3\66"+
		"\3\66\3\u0128\2\67\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\2)\2+\25-\26/\27\61\30\63\31\65"+
		"\32\67\339\34;\35=\36?\37A C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-]._/a\60c\61e\62"+
		"g\63i\64k\65\3\2\5\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\2\u0146\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\2i\3\2\2\2\2k\3\2\2\2\3m\3\2\2\2\5o\3\2\2\2\7q\3\2\2\2\ts\3\2\2"+
		"\2\13u\3\2\2\2\r~\3\2\2\2\17\u0080\3\2\2\2\21\u0082\3\2\2\2\23\u0085\3"+
		"\2\2\2\25\u008d\3\2\2\2\27\u0092\3\2\2\2\31\u0096\3\2\2\2\33\u009c\3\2"+
		"\2\2\35\u009f\3\2\2\2\37\u00a7\3\2\2\2!\u00aa\3\2\2\2#\u00b1\3\2\2\2%"+
		"\u00b7\3\2\2\2\'\u00c0\3\2\2\2)\u00c2\3\2\2\2+\u00c5\3\2\2\2-\u00d2\3"+
		"\2\2\2/\u00d7\3\2\2\2\61\u00dd\3\2\2\2\63\u00e1\3\2\2\2\65\u00e6\3\2\2"+
		"\2\67\u00e8\3\2\2\29\u00eb\3\2\2\2;\u00ee\3\2\2\2=\u00f1\3\2\2\2?\u00f4"+
		"\3\2\2\2A\u00f6\3\2\2\2C\u00f8\3\2\2\2E\u00fa\3\2\2\2G\u00fc\3\2\2\2I"+
		"\u00fe\3\2\2\2K\u0100\3\2\2\2M\u0102\3\2\2\2O\u0104\3\2\2\2Q\u0106\3\2"+
		"\2\2S\u0108\3\2\2\2U\u010a\3\2\2\2W\u010c\3\2\2\2Y\u010f\3\2\2\2[\u0112"+
		"\3\2\2\2]\u0115\3\2\2\2_\u0118\3\2\2\2a\u011b\3\2\2\2c\u011e\3\2\2\2e"+
		"\u0121\3\2\2\2g\u0124\3\2\2\2i\u012f\3\2\2\2k\u013a\3\2\2\2mn\7}\2\2n"+
		"\4\3\2\2\2op\7\177\2\2p\6\3\2\2\2qr\7=\2\2r\b\3\2\2\2st\7?\2\2t\n\3\2"+
		"\2\2uv\7h\2\2vw\7w\2\2wx\7p\2\2xy\7e\2\2yz\7v\2\2z{\7k\2\2{|\7q\2\2|}"+
		"\7p\2\2}\f\3\2\2\2~\177\7.\2\2\177\16\3\2\2\2\u0080\u0081\7<\2\2\u0081"+
		"\20\3\2\2\2\u0082\u0083\7k\2\2\u0083\u0084\7h\2\2\u0084\22\3\2\2\2\u0085"+
		"\u0086\7g\2\2\u0086\u0087\7n\2\2\u0087\u0088\7u\2\2\u0088\u0089\7g\2\2"+
		"\u0089\u008a\7\"\2\2\u008a\u008b\7k\2\2\u008b\u008c\7h\2\2\u008c\24\3"+
		"\2\2\2\u008d\u008e\7g\2\2\u008e\u008f\7n\2\2\u008f\u0090\7u\2\2\u0090"+
		"\u0091\7g\2\2\u0091\26\3\2\2\2\u0092\u0093\7h\2\2\u0093\u0094\7q\2\2\u0094"+
		"\u0095\7t\2\2\u0095\30\3\2\2\2\u0096\u0097\7y\2\2\u0097\u0098\7j\2\2\u0098"+
		"\u0099\7k\2\2\u0099\u009a\7n\2\2\u009a\u009b\7g\2\2\u009b\32\3\2\2\2\u009c"+
		"\u009d\7f\2\2\u009d\u009e\7q\2\2\u009e\34\3\2\2\2\u009f\u00a0\7h\2\2\u00a0"+
		"\u00a1\7q\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7c\2\2"+
		"\u00a4\u00a5\7e\2\2\u00a5\u00a6\7j\2\2\u00a6\36\3\2\2\2\u00a7\u00a8\7"+
		"k\2\2\u00a8\u00a9\7p\2\2\u00a9 \3\2\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac"+
		"\7g\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7w\2\2\u00ae\u00af\7t\2\2\u00af"+
		"\u00b0\7p\2\2\u00b0\"\3\2\2\2\u00b1\u00b2\7d\2\2\u00b2\u00b3\7t\2\2\u00b3"+
		"\u00b4\7g\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6\7m\2\2\u00b6$\3\2\2\2\u00b7"+
		"\u00b8\7e\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb\7v\2\2"+
		"\u00bb\u00bc\7k\2\2\u00bc\u00bd\7p\2\2\u00bd\u00be\7w\2\2\u00be\u00bf"+
		"\7g\2\2\u00bf&\3\2\2\2\u00c0\u00c1\t\2\2\2\u00c1(\3\2\2\2\u00c2\u00c3"+
		"\t\3\2\2\u00c3*\3\2\2\2\u00c4\u00c6\5\'\24\2\u00c5\u00c4\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00d0\3\2"+
		"\2\2\u00c9\u00cd\7\60\2\2\u00ca\u00cc\5\'\24\2\u00cb\u00ca\3\2\2\2\u00cc"+
		"\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d1\3\2"+
		"\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00c9\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		",\3\2\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5\7w\2\2\u00d5"+
		"\u00d6\7g\2\2\u00d6.\3\2\2\2\u00d7\u00d8\7h\2\2\u00d8\u00d9\7c\2\2\u00d9"+
		"\u00da\7n\2\2\u00da\u00db\7u\2\2\u00db\u00dc\7g\2\2\u00dc\60\3\2\2\2\u00dd"+
		"\u00de\7x\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7t\2\2\u00e0\62\3\2\2\2\u00e1"+
		"\u00e2\7p\2\2\u00e2\u00e3\7w\2\2\u00e3\u00e4\7n\2\2\u00e4\u00e5\7n\2\2"+
		"\u00e5\64\3\2\2\2\u00e6\u00e7\7#\2\2\u00e7\66\3\2\2\2\u00e8\u00e9\7-\2"+
		"\2\u00e9\u00ea\7-\2\2\u00ea8\3\2\2\2\u00eb\u00ec\7/\2\2\u00ec\u00ed\7"+
		"/\2\2\u00ed:\3\2\2\2\u00ee\u00ef\7(\2\2\u00ef\u00f0\7(\2\2\u00f0<\3\2"+
		"\2\2\u00f1\u00f2\7~\2\2\u00f2\u00f3\7~\2\2\u00f3>\3\2\2\2\u00f4\u00f5"+
		"\7\60\2\2\u00f5@\3\2\2\2\u00f6\u00f7\7-\2\2\u00f7B\3\2\2\2\u00f8\u00f9"+
		"\7/\2\2\u00f9D\3\2\2\2\u00fa\u00fb\7,\2\2\u00fbF\3\2\2\2\u00fc\u00fd\7"+
		"\61\2\2\u00fdH\3\2\2\2\u00fe\u00ff\7\'\2\2\u00ffJ\3\2\2\2\u0100\u0101"+
		"\7*\2\2\u0101L\3\2\2\2\u0102\u0103\7+\2\2\u0103N\3\2\2\2\u0104\u0105\7"+
		"]\2\2\u0105P\3\2\2\2\u0106\u0107\7_\2\2\u0107R\3\2\2\2\u0108\u0109\7@"+
		"\2\2\u0109T\3\2\2\2\u010a\u010b\7>\2\2\u010bV\3\2\2\2\u010c\u010d\7@\2"+
		"\2\u010d\u010e\7?\2\2\u010eX\3\2\2\2\u010f\u0110\7>\2\2\u0110\u0111\7"+
		"?\2\2\u0111Z\3\2\2\2\u0112\u0113\7?\2\2\u0113\u0114\7?\2\2\u0114\\\3\2"+
		"\2\2\u0115\u0116\7#\2\2\u0116\u0117\7?\2\2\u0117^\3\2\2\2\u0118\u0119"+
		"\7-\2\2\u0119\u011a\7?\2\2\u011a`\3\2\2\2\u011b\u011c\7/\2\2\u011c\u011d"+
		"\7?\2\2\u011db\3\2\2\2\u011e\u011f\7,\2\2\u011f\u0120\7?\2\2\u0120d\3"+
		"\2\2\2\u0121\u0122\7\61\2\2\u0122\u0123\7?\2\2\u0123f\3\2\2\2\u0124\u0128"+
		"\7$\2\2\u0125\u0127\13\2\2\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0128\3\2"+
		"\2\2\u012b\u012c\7$\2\2\u012ch\3\2\2\2\u012d\u0130\5)\25\2\u012e\u0130"+
		"\7a\2\2\u012f\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130\u0136\3\2\2\2\u0131"+
		"\u0135\5)\25\2\u0132\u0135\7a\2\2\u0133\u0135\5\'\24\2\u0134\u0131\3\2"+
		"\2\2\u0134\u0132\3\2\2\2\u0134\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137j\3\2\2\2\u0138\u0136\3\2\2\2"+
		"\u0139\u013b\t\4\2\2\u013a\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013a"+
		"\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\b\66\2\2"+
		"\u013fl\3\2\2\2\13\2\u00c7\u00cd\u00d0\u0128\u012f\u0134\u0136\u013c\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}