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
		T__9=10, T__10=11, T__11=12, T__12=13, Number=14, True=15, False=16, Var=17, 
		Null=18, Not=19, Increment=20, Decrement=21, And=22, Or=23, Dot=24, Plus=25, 
		Minus=26, Multiply=27, Divide=28, Modulo=29, LeftParenthesis=30, RightParenthesis=31, 
		Greater=32, Less=33, GreaterEqual=34, LessEqual=35, Equal=36, NotEqual=37, 
		AddAss=38, MinusAss=39, MultiplyAss=40, DivideAss=41, Indexer=42, String=43, 
		Id=44, WhiteSpaces=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "Digit", "Letter", "Number", "True", 
			"False", "Var", "Null", "Not", "Increment", "Decrement", "And", "Or", 
			"Dot", "Plus", "Minus", "Multiply", "Divide", "Modulo", "LeftParenthesis", 
			"RightParenthesis", "Greater", "Less", "GreaterEqual", "LessEqual", "Equal", 
			"NotEqual", "AddAss", "MinusAss", "MultiplyAss", "DivideAss", "Indexer", 
			"String", "Id", "WhiteSpaces"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "'='", "'function'", "','", "':'", "'['", 
			"']'", "'if'", "'else if'", "'else'", "'return'", null, "'true'", "'false'", 
			"'var'", "'null'", "'!'", "'++'", "'--'", "'&&'", "'||'", "'.'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'('", "')'", "'>'", "'<'", "'>='", "'<='", 
			"'=='", "'!='", "'+='", "'-='", "'*='", "'/='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "Number", "True", "False", "Var", "Null", "Not", "Increment", 
			"Decrement", "And", "Or", "Dot", "Plus", "Minus", "Multiply", "Divide", 
			"Modulo", "LeftParenthesis", "RightParenthesis", "Greater", "Less", "GreaterEqual", 
			"LessEqual", "Equal", "NotEqual", "AddAss", "MinusAss", "MultiplyAss", 
			"DivideAss", "Indexer", "String", "Id", "WhiteSpaces"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u0111\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\6\21\u0097\n\21\r\21"+
		"\16\21\u0098\3\21\3\21\7\21\u009d\n\21\f\21\16\21\u00a0\13\21\5\21\u00a2"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'"+
		"\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3.\3"+
		".\7.\u00f8\n.\f.\16.\u00fb\13.\3.\3.\3/\3/\5/\u0101\n/\3/\3/\3/\7/\u0106"+
		"\n/\f/\16/\u0109\13/\3\60\6\60\u010c\n\60\r\60\16\60\u010d\3\60\3\60\3"+
		"\u00f9\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\2\37\2!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\33"+
		"9\34;\35=\36?\37A C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-]._/\3\2\5\3\2\62;\4\2C"+
		"\\c|\5\2\13\f\17\17\"\"\2\u0117\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2!\3\2\2\2\2"+
		"#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3"+
		"\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2"+
		"\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G"+
		"\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2"+
		"\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2"+
		"\3a\3\2\2\2\5c\3\2\2\2\7e\3\2\2\2\tg\3\2\2\2\13i\3\2\2\2\rr\3\2\2\2\17"+
		"t\3\2\2\2\21v\3\2\2\2\23x\3\2\2\2\25z\3\2\2\2\27}\3\2\2\2\31\u0085\3\2"+
		"\2\2\33\u008a\3\2\2\2\35\u0091\3\2\2\2\37\u0093\3\2\2\2!\u0096\3\2\2\2"+
		"#\u00a3\3\2\2\2%\u00a8\3\2\2\2\'\u00ae\3\2\2\2)\u00b2\3\2\2\2+\u00b7\3"+
		"\2\2\2-\u00b9\3\2\2\2/\u00bc\3\2\2\2\61\u00bf\3\2\2\2\63\u00c2\3\2\2\2"+
		"\65\u00c5\3\2\2\2\67\u00c7\3\2\2\29\u00c9\3\2\2\2;\u00cb\3\2\2\2=\u00cd"+
		"\3\2\2\2?\u00cf\3\2\2\2A\u00d1\3\2\2\2C\u00d3\3\2\2\2E\u00d5\3\2\2\2G"+
		"\u00d7\3\2\2\2I\u00d9\3\2\2\2K\u00dc\3\2\2\2M\u00df\3\2\2\2O\u00e2\3\2"+
		"\2\2Q\u00e5\3\2\2\2S\u00e8\3\2\2\2U\u00eb\3\2\2\2W\u00ee\3\2\2\2Y\u00f1"+
		"\3\2\2\2[\u00f5\3\2\2\2]\u0100\3\2\2\2_\u010b\3\2\2\2ab\7}\2\2b\4\3\2"+
		"\2\2cd\7\177\2\2d\6\3\2\2\2ef\7=\2\2f\b\3\2\2\2gh\7?\2\2h\n\3\2\2\2ij"+
		"\7h\2\2jk\7w\2\2kl\7p\2\2lm\7e\2\2mn\7v\2\2no\7k\2\2op\7q\2\2pq\7p\2\2"+
		"q\f\3\2\2\2rs\7.\2\2s\16\3\2\2\2tu\7<\2\2u\20\3\2\2\2vw\7]\2\2w\22\3\2"+
		"\2\2xy\7_\2\2y\24\3\2\2\2z{\7k\2\2{|\7h\2\2|\26\3\2\2\2}~\7g\2\2~\177"+
		"\7n\2\2\177\u0080\7u\2\2\u0080\u0081\7g\2\2\u0081\u0082\7\"\2\2\u0082"+
		"\u0083\7k\2\2\u0083\u0084\7h\2\2\u0084\30\3\2\2\2\u0085\u0086\7g\2\2\u0086"+
		"\u0087\7n\2\2\u0087\u0088\7u\2\2\u0088\u0089\7g\2\2\u0089\32\3\2\2\2\u008a"+
		"\u008b\7t\2\2\u008b\u008c\7g\2\2\u008c\u008d\7v\2\2\u008d\u008e\7w\2\2"+
		"\u008e\u008f\7t\2\2\u008f\u0090\7p\2\2\u0090\34\3\2\2\2\u0091\u0092\t"+
		"\2\2\2\u0092\36\3\2\2\2\u0093\u0094\t\3\2\2\u0094 \3\2\2\2\u0095\u0097"+
		"\5\35\17\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2"+
		"\u0098\u0099\3\2\2\2\u0099\u00a1\3\2\2\2\u009a\u009e\7\60\2\2\u009b\u009d"+
		"\5\35\17\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2"+
		"\u009e\u009f\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u009a"+
		"\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\"\3\2\2\2\u00a3\u00a4\7v\2\2\u00a4"+
		"\u00a5\7t\2\2\u00a5\u00a6\7w\2\2\u00a6\u00a7\7g\2\2\u00a7$\3\2\2\2\u00a8"+
		"\u00a9\7h\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7u\2\2"+
		"\u00ac\u00ad\7g\2\2\u00ad&\3\2\2\2\u00ae\u00af\7x\2\2\u00af\u00b0\7c\2"+
		"\2\u00b0\u00b1\7t\2\2\u00b1(\3\2\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7"+
		"w\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7n\2\2\u00b6*\3\2\2\2\u00b7\u00b8"+
		"\7#\2\2\u00b8,\3\2\2\2\u00b9\u00ba\7-\2\2\u00ba\u00bb\7-\2\2\u00bb.\3"+
		"\2\2\2\u00bc\u00bd\7/\2\2\u00bd\u00be\7/\2\2\u00be\60\3\2\2\2\u00bf\u00c0"+
		"\7(\2\2\u00c0\u00c1\7(\2\2\u00c1\62\3\2\2\2\u00c2\u00c3\7~\2\2\u00c3\u00c4"+
		"\7~\2\2\u00c4\64\3\2\2\2\u00c5\u00c6\7\60\2\2\u00c6\66\3\2\2\2\u00c7\u00c8"+
		"\7-\2\2\u00c88\3\2\2\2\u00c9\u00ca\7/\2\2\u00ca:\3\2\2\2\u00cb\u00cc\7"+
		",\2\2\u00cc<\3\2\2\2\u00cd\u00ce\7\61\2\2\u00ce>\3\2\2\2\u00cf\u00d0\7"+
		"\'\2\2\u00d0@\3\2\2\2\u00d1\u00d2\7*\2\2\u00d2B\3\2\2\2\u00d3\u00d4\7"+
		"+\2\2\u00d4D\3\2\2\2\u00d5\u00d6\7@\2\2\u00d6F\3\2\2\2\u00d7\u00d8\7>"+
		"\2\2\u00d8H\3\2\2\2\u00d9\u00da\7@\2\2\u00da\u00db\7?\2\2\u00dbJ\3\2\2"+
		"\2\u00dc\u00dd\7>\2\2\u00dd\u00de\7?\2\2\u00deL\3\2\2\2\u00df\u00e0\7"+
		"?\2\2\u00e0\u00e1\7?\2\2\u00e1N\3\2\2\2\u00e2\u00e3\7#\2\2\u00e3\u00e4"+
		"\7?\2\2\u00e4P\3\2\2\2\u00e5\u00e6\7-\2\2\u00e6\u00e7\7?\2\2\u00e7R\3"+
		"\2\2\2\u00e8\u00e9\7/\2\2\u00e9\u00ea\7?\2\2\u00eaT\3\2\2\2\u00eb\u00ec"+
		"\7,\2\2\u00ec\u00ed\7?\2\2\u00edV\3\2\2\2\u00ee\u00ef\7\61\2\2\u00ef\u00f0"+
		"\7?\2\2\u00f0X\3\2\2\2\u00f1\u00f2\7]\2\2\u00f2\u00f3\5!\21\2\u00f3\u00f4"+
		"\7_\2\2\u00f4Z\3\2\2\2\u00f5\u00f9\7$\2\2\u00f6\u00f8\13\2\2\2\u00f7\u00f6"+
		"\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa"+
		"\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd\7$\2\2\u00fd\\\3\2\2\2"+
		"\u00fe\u0101\5\37\20\2\u00ff\u0101\7a\2\2\u0100\u00fe\3\2\2\2\u0100\u00ff"+
		"\3\2\2\2\u0101\u0107\3\2\2\2\u0102\u0106\5\37\20\2\u0103\u0106\7a\2\2"+
		"\u0104\u0106\5\35\17\2\u0105\u0102\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0104"+
		"\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"^\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010c\t\4\2\2\u010b\u010a\3\2\2\2"+
		"\u010c\u010d\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f"+
		"\3\2\2\2\u010f\u0110\b\60\2\2\u0110`\3\2\2\2\13\2\u0098\u009e\u00a1\u00f9"+
		"\u0100\u0105\u0107\u010d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}