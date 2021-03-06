// Generated from /shuati/intellij/workspace/mycalculator/src/calculator.g4 by ANTLR 4.9.1
package com.antlr.calculator;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class calculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, DOUBLE=2, SCIENTIFIC_NUMBER=3, COS=4, SIN=5, TAN=6, ACOS=7, ASIN=8, 
		ATAN=9, LN=10, LOG=11, SQRT=12, LPAREN=13, RPAREN=14, PLUS=15, MINUS=16, 
		TIMES=17, DIV=18, GT=19, LT=20, EQ=21, COMMA=22, POINT=23, POW=24, PI=25, 
		EULER=26, I=27, VARIABLE=28, NUMBER=29, WS=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "DOUBLE", "SCIENTIFIC_NUMBER", "COS", "SIN", "TAN", "ACOS", "ASIN", 
			"ATAN", "LN", "LOG", "SQRT", "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", 
			"DIV", "GT", "LT", "EQ", "COMMA", "POINT", "POW", "PI", "EULER", "I", 
			"VARIABLE", "VALID_ID_START", "VALID_ID_CHAR", "NUMBER", "E1", "E2", 
			"SIGN", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'cos'", "'sin'", "'tan'", "'acos'", "'asin'", 
			"'atan'", "'ln'", "'log'", "'sqrt'", "'('", "')'", "'+'", "'-'", "'*'", 
			"'/'", "'>'", "'<'", "'='", "','", "'.'", "'^'", "'pi'", null, "'i'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "DOUBLE", "SCIENTIFIC_NUMBER", "COS", "SIN", "TAN", "ACOS", 
			"ASIN", "ATAN", "LN", "LOG", "SQRT", "LPAREN", "RPAREN", "PLUS", "MINUS", 
			"TIMES", "DIV", "GT", "LT", "EQ", "COMMA", "POINT", "POW", "PI", "EULER", 
			"I", "VARIABLE", "NUMBER", "WS"
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


	public calculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "calculator.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00d1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\6\2K\n\2\r\2\16\2L\3\3\6\3P\n\3\r\3\16\3Q"+
		"\3\3\3\3\6\3V\n\3\r\3\16\3W\3\4\3\4\3\4\5\4]\n\4\3\4\5\4`\n\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\7\35\u00ac\n\35\f\35\16"+
		"\35\u00af\13\35\3\36\5\36\u00b2\n\36\3\37\3\37\5\37\u00b6\n\37\3 \6 \u00b9"+
		"\n \r \16 \u00ba\3 \3 \6 \u00bf\n \r \16 \u00c0\5 \u00c3\n \3!\3!\3\""+
		"\3\"\3#\3#\3$\6$\u00cc\n$\r$\16$\u00cd\3$\3$\2\2%\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\2=\2?\37A\2C\2E\2G \3\2"+
		"\6\3\2\62;\5\2C\\aac|\4\2--//\5\2\13\f\17\17\"\"\2\u00d6\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2?\3\2\2\2\2G\3\2\2"+
		"\2\3J\3\2\2\2\5O\3\2\2\2\7Y\3\2\2\2\tc\3\2\2\2\13g\3\2\2\2\rk\3\2\2\2"+
		"\17o\3\2\2\2\21t\3\2\2\2\23y\3\2\2\2\25~\3\2\2\2\27\u0081\3\2\2\2\31\u0085"+
		"\3\2\2\2\33\u008a\3\2\2\2\35\u008c\3\2\2\2\37\u008e\3\2\2\2!\u0090\3\2"+
		"\2\2#\u0092\3\2\2\2%\u0094\3\2\2\2\'\u0096\3\2\2\2)\u0098\3\2\2\2+\u009a"+
		"\3\2\2\2-\u009c\3\2\2\2/\u009e\3\2\2\2\61\u00a0\3\2\2\2\63\u00a2\3\2\2"+
		"\2\65\u00a5\3\2\2\2\67\u00a7\3\2\2\29\u00a9\3\2\2\2;\u00b1\3\2\2\2=\u00b5"+
		"\3\2\2\2?\u00b8\3\2\2\2A\u00c4\3\2\2\2C\u00c6\3\2\2\2E\u00c8\3\2\2\2G"+
		"\u00cb\3\2\2\2IK\t\2\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\4\3"+
		"\2\2\2NP\t\2\2\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RS\3\2\2\2SU\7"+
		"\60\2\2TV\t\2\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\6\3\2\2\2Y"+
		"\\\5? \2Z]\5A!\2[]\5C\"\2\\Z\3\2\2\2\\[\3\2\2\2]_\3\2\2\2^`\5E#\2_^\3"+
		"\2\2\2_`\3\2\2\2`a\3\2\2\2ab\5? \2b\b\3\2\2\2cd\7e\2\2de\7q\2\2ef\7u\2"+
		"\2f\n\3\2\2\2gh\7u\2\2hi\7k\2\2ij\7p\2\2j\f\3\2\2\2kl\7v\2\2lm\7c\2\2"+
		"mn\7p\2\2n\16\3\2\2\2op\7c\2\2pq\7e\2\2qr\7q\2\2rs\7u\2\2s\20\3\2\2\2"+
		"tu\7c\2\2uv\7u\2\2vw\7k\2\2wx\7p\2\2x\22\3\2\2\2yz\7c\2\2z{\7v\2\2{|\7"+
		"c\2\2|}\7p\2\2}\24\3\2\2\2~\177\7n\2\2\177\u0080\7p\2\2\u0080\26\3\2\2"+
		"\2\u0081\u0082\7n\2\2\u0082\u0083\7q\2\2\u0083\u0084\7i\2\2\u0084\30\3"+
		"\2\2\2\u0085\u0086\7u\2\2\u0086\u0087\7s\2\2\u0087\u0088\7t\2\2\u0088"+
		"\u0089\7v\2\2\u0089\32\3\2\2\2\u008a\u008b\7*\2\2\u008b\34\3\2\2\2\u008c"+
		"\u008d\7+\2\2\u008d\36\3\2\2\2\u008e\u008f\7-\2\2\u008f \3\2\2\2\u0090"+
		"\u0091\7/\2\2\u0091\"\3\2\2\2\u0092\u0093\7,\2\2\u0093$\3\2\2\2\u0094"+
		"\u0095\7\61\2\2\u0095&\3\2\2\2\u0096\u0097\7@\2\2\u0097(\3\2\2\2\u0098"+
		"\u0099\7>\2\2\u0099*\3\2\2\2\u009a\u009b\7?\2\2\u009b,\3\2\2\2\u009c\u009d"+
		"\7.\2\2\u009d.\3\2\2\2\u009e\u009f\7\60\2\2\u009f\60\3\2\2\2\u00a0\u00a1"+
		"\7`\2\2\u00a1\62\3\2\2\2\u00a2\u00a3\7r\2\2\u00a3\u00a4\7k\2\2\u00a4\64"+
		"\3\2\2\2\u00a5\u00a6\5C\"\2\u00a6\66\3\2\2\2\u00a7\u00a8\7k\2\2\u00a8"+
		"8\3\2\2\2\u00a9\u00ad\5;\36\2\u00aa\u00ac\5=\37\2\u00ab\u00aa\3\2\2\2"+
		"\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae:\3"+
		"\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b2\t\3\2\2\u00b1\u00b0\3\2\2\2\u00b2"+
		"<\3\2\2\2\u00b3\u00b6\5;\36\2\u00b4\u00b6\4\62;\2\u00b5\u00b3\3\2\2\2"+
		"\u00b5\u00b4\3\2\2\2\u00b6>\3\2\2\2\u00b7\u00b9\4\62;\2\u00b8\u00b7\3"+
		"\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00c2\3\2\2\2\u00bc\u00be\7\60\2\2\u00bd\u00bf\4\62;\2\u00be\u00bd\3"+
		"\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c3\3\2\2\2\u00c2\u00bc\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3@\3\2\2\2"+
		"\u00c4\u00c5\7G\2\2\u00c5B\3\2\2\2\u00c6\u00c7\7g\2\2\u00c7D\3\2\2\2\u00c8"+
		"\u00c9\t\4\2\2\u00c9F\3\2\2\2\u00ca\u00cc\t\5\2\2\u00cb\u00ca\3\2\2\2"+
		"\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf"+
		"\3\2\2\2\u00cf\u00d0\b$\2\2\u00d0H\3\2\2\2\17\2LQW\\_\u00ad\u00b1\u00b5"+
		"\u00ba\u00c0\u00c2\u00cd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}