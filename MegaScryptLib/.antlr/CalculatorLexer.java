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
		T__0=1, T__1=2, T__2=3, T__3=4, Number=5, True=6, False=7, Var=8, Not=9, 
		And=10, Or=11, Dot=12, Plus=13, Minus=14, Multiply=15, Divide=16, Modulo=17, 
		LeftParenthesis=18, RightParenthesis=19, Greater=20, Less=21, GreaterEqual=22, 
		LessEqual=23, Equal=24, NotEqual=25, Id=26, WhiteSpaces=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "Digit", "Letter", "Number", "True", 
			"False", "Var", "Not", "And", "Or", "Dot", "Plus", "Minus", "Multiply", 
			"Divide", "Modulo", "LeftParenthesis", "RightParenthesis", "Greater", 
			"Less", "GreaterEqual", "LessEqual", "Equal", "NotEqual", "Id", "WhiteSpaces"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'='", "';'", null, "'true'", "'false'", "'var'", 
			"'!'", "'&&'", "'||'", "'.'", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", 
			"')'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "Number", "True", "False", "Var", "Not", 
			"And", "Or", "Dot", "Plus", "Minus", "Multiply", "Divide", "Modulo", 
			"LeftParenthesis", "RightParenthesis", "Greater", "Less", "GreaterEqual", 
			"LessEqual", "Equal", "NotEqual", "Id", "WhiteSpaces"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00a1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\6\bK\n\b\r\b\16\bL\3\b\3\b\7\b"+
		"Q\n\b\f\b\16\bT\13\b\5\bV\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\35\3\35\5\35\u0091\n\35\3\35\3\35\3\35\7\35\u0096\n\35\f"+
		"\35\16\35\u0099\13\35\3\36\6\36\u009c\n\36\r\36\16\36\u009d\3\36\3\36"+
		"\2\2\37\3\3\5\4\7\5\t\6\13\2\r\2\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35"+
		"\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34"+
		";\35\3\2\5\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\2\u00a6\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5?\3\2\2\2\7A\3\2\2\2\t"+
		"C\3\2\2\2\13E\3\2\2\2\rG\3\2\2\2\17J\3\2\2\2\21W\3\2\2\2\23\\\3\2\2\2"+
		"\25b\3\2\2\2\27f\3\2\2\2\31h\3\2\2\2\33k\3\2\2\2\35n\3\2\2\2\37p\3\2\2"+
		"\2!r\3\2\2\2#t\3\2\2\2%v\3\2\2\2\'x\3\2\2\2)z\3\2\2\2+|\3\2\2\2-~\3\2"+
		"\2\2/\u0080\3\2\2\2\61\u0082\3\2\2\2\63\u0085\3\2\2\2\65\u0088\3\2\2\2"+
		"\67\u008b\3\2\2\29\u0090\3\2\2\2;\u009b\3\2\2\2=>\7}\2\2>\4\3\2\2\2?@"+
		"\7\177\2\2@\6\3\2\2\2AB\7?\2\2B\b\3\2\2\2CD\7=\2\2D\n\3\2\2\2EF\t\2\2"+
		"\2F\f\3\2\2\2GH\t\3\2\2H\16\3\2\2\2IK\5\13\6\2JI\3\2\2\2KL\3\2\2\2LJ\3"+
		"\2\2\2LM\3\2\2\2MU\3\2\2\2NR\7\60\2\2OQ\5\13\6\2PO\3\2\2\2QT\3\2\2\2R"+
		"P\3\2\2\2RS\3\2\2\2SV\3\2\2\2TR\3\2\2\2UN\3\2\2\2UV\3\2\2\2V\20\3\2\2"+
		"\2WX\7v\2\2XY\7t\2\2YZ\7w\2\2Z[\7g\2\2[\22\3\2\2\2\\]\7h\2\2]^\7c\2\2"+
		"^_\7n\2\2_`\7u\2\2`a\7g\2\2a\24\3\2\2\2bc\7x\2\2cd\7c\2\2de\7t\2\2e\26"+
		"\3\2\2\2fg\7#\2\2g\30\3\2\2\2hi\7(\2\2ij\7(\2\2j\32\3\2\2\2kl\7~\2\2l"+
		"m\7~\2\2m\34\3\2\2\2no\7\60\2\2o\36\3\2\2\2pq\7-\2\2q \3\2\2\2rs\7/\2"+
		"\2s\"\3\2\2\2tu\7,\2\2u$\3\2\2\2vw\7\61\2\2w&\3\2\2\2xy\7\'\2\2y(\3\2"+
		"\2\2z{\7*\2\2{*\3\2\2\2|}\7+\2\2},\3\2\2\2~\177\7@\2\2\177.\3\2\2\2\u0080"+
		"\u0081\7>\2\2\u0081\60\3\2\2\2\u0082\u0083\7@\2\2\u0083\u0084\7?\2\2\u0084"+
		"\62\3\2\2\2\u0085\u0086\7>\2\2\u0086\u0087\7?\2\2\u0087\64\3\2\2\2\u0088"+
		"\u0089\7?\2\2\u0089\u008a\7?\2\2\u008a\66\3\2\2\2\u008b\u008c\7#\2\2\u008c"+
		"\u008d\7?\2\2\u008d8\3\2\2\2\u008e\u0091\5\r\7\2\u008f\u0091\7a\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\u0097\3\2\2\2\u0092\u0096\5\r"+
		"\7\2\u0093\u0096\7a\2\2\u0094\u0096\5\13\6\2\u0095\u0092\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098:\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009c"+
		"\t\4\2\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\b\36\2\2\u00a0<\3\2\2\2"+
		"\n\2LRU\u0090\u0095\u0097\u009d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}