// Generated from C:/Repositories/ImperativeLanguageCompiler/src/i_grammar\I.g4 by ANTLR 4.7.2
package i_grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ILexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, MULTIPLICATION=3, DIVISION=4, MOD=5, TRUE=6, FALSE=7, 
		LESS=8, LESS_OR_EQUAL=9, GREATER=10, GREATER_OR_EQUAL=11, EQUAL=12, NOT_EQUAL=13, 
		ASSIGN=14, AND=15, OR=16, XOR=17, IF=18, THEN=19, ELSE=20, END=21, FOREACH=22, 
		FROM=23, LOOP=24, IN=25, REVERSE=26, FOR=27, WHILE=28, ARRAY=29, RECORD=30, 
		INTEGER=31, REAL=32, BOOLEAN=33, ROUTINE=34, RETURN=35, TYPE=36, IS=37, 
		VAR=38, COLON=39, DOT=40, DOTDOT=41, COMMA=42, LPAREN=43, RPAREN=44, IDENTIFIER=45, 
		INTEGER_LITERAL=46, REAL_LITERAL=47, WS=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DIGIT", "LOWERCASE", "UPPERCASE", "PLUS", "MINUS", "MULTIPLICATION", 
			"DIVISION", "MOD", "TRUE", "FALSE", "LESS", "LESS_OR_EQUAL", "GREATER", 
			"GREATER_OR_EQUAL", "EQUAL", "NOT_EQUAL", "ASSIGN", "AND", "OR", "XOR", 
			"IF", "THEN", "ELSE", "END", "FOREACH", "FROM", "LOOP", "IN", "REVERSE", 
			"FOR", "WHILE", "ARRAY", "RECORD", "INTEGER", "REAL", "BOOLEAN", "ROUTINE", 
			"RETURN", "TYPE", "IS", "VAR", "COLON", "DOT", "DOTDOT", "COMMA", "LPAREN", 
			"RPAREN", "IDENTIFIER", "INTEGER_LITERAL", "REAL_LITERAL", "WS", "EXPONENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'true'", "'false'", "'<'", 
			"'<='", "'>'", "'>='", "'='", "'/='", "':='", "'and'", "'or'", "'xor'", 
			"'if'", "'then'", "'else'", "'end'", "'foreach'", "'from'", "'loop'", 
			"'in'", "'reverse'", "'for'", "'while'", "'array'", "'record'", "'integer'", 
			"'real'", "'boolean'", "'routine'", "'return'", "'type'", "'is'", "'var'", 
			"':'", "'.'", "'..'", "','", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS", "MINUS", "MULTIPLICATION", "DIVISION", "MOD", "TRUE", "FALSE", 
			"LESS", "LESS_OR_EQUAL", "GREATER", "GREATER_OR_EQUAL", "EQUAL", "NOT_EQUAL", 
			"ASSIGN", "AND", "OR", "XOR", "IF", "THEN", "ELSE", "END", "FOREACH", 
			"FROM", "LOOP", "IN", "REVERSE", "FOR", "WHILE", "ARRAY", "RECORD", "INTEGER", 
			"REAL", "BOOLEAN", "ROUTINE", "RETURN", "TYPE", "IS", "VAR", "COLON", 
			"DOT", "DOTDOT", "COMMA", "LPAREN", "RPAREN", "IDENTIFIER", "INTEGER_LITERAL", 
			"REAL_LITERAL", "WS"
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


	public ILexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "I.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u015a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3(\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3+\3+\3,\3,\3-\3-\3-\3.\3.\3/\3/"+
		"\3\60\3\60\3\61\3\61\5\61\u0128\n\61\3\61\3\61\3\61\3\61\7\61\u012e\n"+
		"\61\f\61\16\61\u0131\13\61\3\62\6\62\u0134\n\62\r\62\16\62\u0135\3\63"+
		"\6\63\u0139\n\63\r\63\16\63\u013a\3\63\3\63\6\63\u013f\n\63\r\63\16\63"+
		"\u0140\3\63\5\63\u0144\n\63\5\63\u0146\n\63\3\63\5\63\u0149\n\63\3\64"+
		"\6\64\u014c\n\64\r\64\16\64\u014d\3\64\3\64\3\65\3\65\5\65\u0154\n\65"+
		"\3\65\6\65\u0157\n\65\r\65\16\65\u0158\2\2\66\3\2\5\2\7\2\t\3\13\4\r\5"+
		"\17\6\21\7\23\b\25\t\27\n\31\13\33\f\35\r\37\16!\17#\20%\21\'\22)\23+"+
		"\24-\25/\26\61\27\63\30\65\31\67\329\33;\34=\35?\36A\37C E!G\"I#K$M%O"+
		"&Q\'S(U)W*Y+[,]-_.a/c\60e\61g\62i\2\3\2\7\3\2\62;\3\2c|\3\2C\\\7\2\13"+
		"\f\17\17\"\"\\\\``\4\2--//\2\u0163\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\3k\3\2\2\2\5m\3\2\2\2\7o\3\2\2\2"+
		"\tq\3\2\2\2\13s\3\2\2\2\ru\3\2\2\2\17w\3\2\2\2\21y\3\2\2\2\23{\3\2\2\2"+
		"\25\u0080\3\2\2\2\27\u0086\3\2\2\2\31\u0088\3\2\2\2\33\u008b\3\2\2\2\35"+
		"\u008d\3\2\2\2\37\u0090\3\2\2\2!\u0092\3\2\2\2#\u0095\3\2\2\2%\u0098\3"+
		"\2\2\2\'\u009c\3\2\2\2)\u009f\3\2\2\2+\u00a3\3\2\2\2-\u00a6\3\2\2\2/\u00ab"+
		"\3\2\2\2\61\u00b0\3\2\2\2\63\u00b4\3\2\2\2\65\u00bc\3\2\2\2\67\u00c1\3"+
		"\2\2\29\u00c6\3\2\2\2;\u00c9\3\2\2\2=\u00d1\3\2\2\2?\u00d5\3\2\2\2A\u00db"+
		"\3\2\2\2C\u00e1\3\2\2\2E\u00e8\3\2\2\2G\u00f0\3\2\2\2I\u00f5\3\2\2\2K"+
		"\u00fd\3\2\2\2M\u0105\3\2\2\2O\u010c\3\2\2\2Q\u0111\3\2\2\2S\u0114\3\2"+
		"\2\2U\u0118\3\2\2\2W\u011a\3\2\2\2Y\u011c\3\2\2\2[\u011f\3\2\2\2]\u0121"+
		"\3\2\2\2_\u0123\3\2\2\2a\u0127\3\2\2\2c\u0133\3\2\2\2e\u0138\3\2\2\2g"+
		"\u014b\3\2\2\2i\u0151\3\2\2\2kl\t\2\2\2l\4\3\2\2\2mn\t\3\2\2n\6\3\2\2"+
		"\2op\t\4\2\2p\b\3\2\2\2qr\7-\2\2r\n\3\2\2\2st\7/\2\2t\f\3\2\2\2uv\7,\2"+
		"\2v\16\3\2\2\2wx\7\61\2\2x\20\3\2\2\2yz\7\'\2\2z\22\3\2\2\2{|\7v\2\2|"+
		"}\7t\2\2}~\7w\2\2~\177\7g\2\2\177\24\3\2\2\2\u0080\u0081\7h\2\2\u0081"+
		"\u0082\7c\2\2\u0082\u0083\7n\2\2\u0083\u0084\7u\2\2\u0084\u0085\7g\2\2"+
		"\u0085\26\3\2\2\2\u0086\u0087\7>\2\2\u0087\30\3\2\2\2\u0088\u0089\7>\2"+
		"\2\u0089\u008a\7?\2\2\u008a\32\3\2\2\2\u008b\u008c\7@\2\2\u008c\34\3\2"+
		"\2\2\u008d\u008e\7@\2\2\u008e\u008f\7?\2\2\u008f\36\3\2\2\2\u0090\u0091"+
		"\7?\2\2\u0091 \3\2\2\2\u0092\u0093\7\61\2\2\u0093\u0094\7?\2\2\u0094\""+
		"\3\2\2\2\u0095\u0096\7<\2\2\u0096\u0097\7?\2\2\u0097$\3\2\2\2\u0098\u0099"+
		"\7c\2\2\u0099\u009a\7p\2\2\u009a\u009b\7f\2\2\u009b&\3\2\2\2\u009c\u009d"+
		"\7q\2\2\u009d\u009e\7t\2\2\u009e(\3\2\2\2\u009f\u00a0\7z\2\2\u00a0\u00a1"+
		"\7q\2\2\u00a1\u00a2\7t\2\2\u00a2*\3\2\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5"+
		"\7h\2\2\u00a5,\3\2\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7j\2\2\u00a8\u00a9"+
		"\7g\2\2\u00a9\u00aa\7p\2\2\u00aa.\3\2\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad"+
		"\7n\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af\7g\2\2\u00af\60\3\2\2\2\u00b0\u00b1"+
		"\7g\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7f\2\2\u00b3\62\3\2\2\2\u00b4\u00b5"+
		"\7h\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7g\2\2\u00b8"+
		"\u00b9\7c\2\2\u00b9\u00ba\7e\2\2\u00ba\u00bb\7j\2\2\u00bb\64\3\2\2\2\u00bc"+
		"\u00bd\7h\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0\7o\2\2"+
		"\u00c0\66\3\2\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4\7"+
		"q\2\2\u00c4\u00c5\7r\2\2\u00c58\3\2\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8"+
		"\7p\2\2\u00c8:\3\2\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc"+
		"\7x\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7u\2\2\u00cf"+
		"\u00d0\7g\2\2\u00d0<\3\2\2\2\u00d1\u00d2\7h\2\2\u00d2\u00d3\7q\2\2\u00d3"+
		"\u00d4\7t\2\2\u00d4>\3\2\2\2\u00d5\u00d6\7y\2\2\u00d6\u00d7\7j\2\2\u00d7"+
		"\u00d8\7k\2\2\u00d8\u00d9\7n\2\2\u00d9\u00da\7g\2\2\u00da@\3\2\2\2\u00db"+
		"\u00dc\7c\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7c\2\2"+
		"\u00df\u00e0\7{\2\2\u00e0B\3\2\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3\7g\2"+
		"\2\u00e3\u00e4\7e\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7"+
		"\7f\2\2\u00e7D\3\2\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb"+
		"\7v\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7i\2\2\u00ed\u00ee\7g\2\2\u00ee"+
		"\u00ef\7t\2\2\u00efF\3\2\2\2\u00f0\u00f1\7t\2\2\u00f1\u00f2\7g\2\2\u00f2"+
		"\u00f3\7c\2\2\u00f3\u00f4\7n\2\2\u00f4H\3\2\2\2\u00f5\u00f6\7d\2\2\u00f6"+
		"\u00f7\7q\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9\7n\2\2\u00f9\u00fa\7g\2\2"+
		"\u00fa\u00fb\7c\2\2\u00fb\u00fc\7p\2\2\u00fcJ\3\2\2\2\u00fd\u00fe\7t\2"+
		"\2\u00fe\u00ff\7q\2\2\u00ff\u0100\7w\2\2\u0100\u0101\7v\2\2\u0101\u0102"+
		"\7k\2\2\u0102\u0103\7p\2\2\u0103\u0104\7g\2\2\u0104L\3\2\2\2\u0105\u0106"+
		"\7t\2\2\u0106\u0107\7g\2\2\u0107\u0108\7v\2\2\u0108\u0109\7w\2\2\u0109"+
		"\u010a\7t\2\2\u010a\u010b\7p\2\2\u010bN\3\2\2\2\u010c\u010d\7v\2\2\u010d"+
		"\u010e\7{\2\2\u010e\u010f\7r\2\2\u010f\u0110\7g\2\2\u0110P\3\2\2\2\u0111"+
		"\u0112\7k\2\2\u0112\u0113\7u\2\2\u0113R\3\2\2\2\u0114\u0115\7x\2\2\u0115"+
		"\u0116\7c\2\2\u0116\u0117\7t\2\2\u0117T\3\2\2\2\u0118\u0119\7<\2\2\u0119"+
		"V\3\2\2\2\u011a\u011b\7\60\2\2\u011bX\3\2\2\2\u011c\u011d\7\60\2\2\u011d"+
		"\u011e\7\60\2\2\u011eZ\3\2\2\2\u011f\u0120\7.\2\2\u0120\\\3\2\2\2\u0121"+
		"\u0122\7*\2\2\u0122^\3\2\2\2\u0123\u0124\7+\2\2\u0124`\3\2\2\2\u0125\u0128"+
		"\5\5\3\2\u0126\u0128\5\7\4\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128"+
		"\u012f\3\2\2\2\u0129\u012e\5\5\3\2\u012a\u012e\5\7\4\2\u012b\u012e\5\3"+
		"\2\2\u012c\u012e\7a\2\2\u012d\u0129\3\2\2\2\u012d\u012a\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2"+
		"\2\2\u012f\u0130\3\2\2\2\u0130b\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0134"+
		"\4\62;\2\u0133\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136d\3\2\2\2\u0137\u0139\4\62;\2\u0138\u0137\3\2\2\2"+
		"\u0139\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0148"+
		"\3\2\2\2\u013c\u013e\7\60\2\2\u013d\u013f\4\62;\2\u013e\u013d\3\2\2\2"+
		"\u013f\u0140\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143"+
		"\3\2\2\2\u0142\u0144\5i\65\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0146\3\2\2\2\u0145\u013c\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0149\3\2"+
		"\2\2\u0147\u0149\5i\65\2\u0148\u0145\3\2\2\2\u0148\u0147\3\2\2\2\u0149"+
		"f\3\2\2\2\u014a\u014c\t\5\2\2\u014b\u014a\3\2\2\2\u014c\u014d\3\2\2\2"+
		"\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150"+
		"\b\64\2\2\u0150h\3\2\2\2\u0151\u0153\7g\2\2\u0152\u0154\t\6\2\2\u0153"+
		"\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u0157\4\62"+
		";\2\u0156\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0156\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159j\3\2\2\2\17\2\u0127\u012d\u012f\u0135\u013a\u0140"+
		"\u0143\u0145\u0148\u014d\u0153\u0158\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}