package parser;// Generated from SpriteTypes.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SpriteTypesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, ID=24, INT=25, 
		FLOAT=26, EXPONENT=27, StringLiteral=28, WS=29, LINE_COMMENT=30;
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
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "ID", "INT", "FLOAT", 
			"EXPONENT", "SIGN", "StringLiteral", "StringCharacters", "StringCharacter", 
			"WS", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'spriteTypes'", "'='", "'{'", "'}'", "'spriteType'", "'SpriteType'",
			"'name'", "'texturefile'", "'effectFile'", "'animation'", "'animationmaskfile'", 
			"'animationtexturefile'", "'animationrotation'", "'animationlooping'", 
			"'animationtime'", "'animationdelay'", "'animationblendmode'", "'animationtype'", 
			"'animationrotationoffset'", "'animationtexturescale'", "'x'", "'y'", 
			"'legacy_lazy_load'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"ID", "INT", "FLOAT", "EXPONENT", "StringLiteral", "WS", "LINE_COMMENT"
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


	public SpriteTypesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SpriteTypes.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u01bc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\7\31\u0161"+
		"\n\31\f\31\16\31\u0164\13\31\3\32\5\32\u0167\n\32\3\32\6\32\u016a\n\32"+
		"\r\32\16\32\u016b\3\33\5\33\u016f\n\33\3\33\6\33\u0172\n\33\r\33\16\33"+
		"\u0173\3\33\3\33\7\33\u0178\n\33\f\33\16\33\u017b\13\33\3\33\5\33\u017e"+
		"\n\33\3\33\5\33\u0181\n\33\3\33\3\33\6\33\u0185\n\33\r\33\16\33\u0186"+
		"\3\33\5\33\u018a\n\33\3\33\5\33\u018d\n\33\3\33\6\33\u0190\n\33\r\33\16"+
		"\33\u0191\3\33\5\33\u0195\n\33\3\34\3\34\5\34\u0199\n\34\3\34\6\34\u019c"+
		"\n\34\r\34\16\34\u019d\3\35\3\35\3\36\3\36\3\36\3\36\3\37\6\37\u01a7\n"+
		"\37\r\37\16\37\u01a8\3 \3 \3!\6!\u01ae\n!\r!\16!\u01af\3!\3!\3\"\3\"\7"+
		"\"\u01b6\n\"\f\"\16\"\u01b9\13\"\3\"\3\"\2\2#\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\2;\36=\2?\2A\37C \3\2\t\5\2C\\a"+
		"ac|\6\2\62;C\\aac|\4\2GGgg\4\2--//\6\2\f\f\17\17$$^^\5\2\13\f\16\17\""+
		"\"\4\2\f\f\17\17\2\u01cb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\2;\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5Q\3\2\2\2\7S\3\2\2"+
		"\2\tU\3\2\2\2\13W\3\2\2\2\rb\3\2\2\2\17m\3\2\2\2\21r\3\2\2\2\23~\3\2\2"+
		"\2\25\u0089\3\2\2\2\27\u0093\3\2\2\2\31\u00a5\3\2\2\2\33\u00ba\3\2\2\2"+
		"\35\u00cc\3\2\2\2\37\u00dd\3\2\2\2!\u00eb\3\2\2\2#\u00fa\3\2\2\2%\u010d"+
		"\3\2\2\2\'\u011b\3\2\2\2)\u0133\3\2\2\2+\u0149\3\2\2\2-\u014b\3\2\2\2"+
		"/\u014d\3\2\2\2\61\u015e\3\2\2\2\63\u0166\3\2\2\2\65\u0194\3\2\2\2\67"+
		"\u0196\3\2\2\29\u019f\3\2\2\2;\u01a1\3\2\2\2=\u01a6\3\2\2\2?\u01aa\3\2"+
		"\2\2A\u01ad\3\2\2\2C\u01b3\3\2\2\2EF\7u\2\2FG\7r\2\2GH\7t\2\2HI\7k\2\2"+
		"IJ\7v\2\2JK\7g\2\2KL\7V\2\2LM\7{\2\2MN\7r\2\2NO\7g\2\2OP\7u\2\2P\4\3\2"+
		"\2\2QR\7?\2\2R\6\3\2\2\2ST\7}\2\2T\b\3\2\2\2UV\7\177\2\2V\n\3\2\2\2WX"+
		"\7u\2\2XY\7r\2\2YZ\7t\2\2Z[\7k\2\2[\\\7v\2\2\\]\7g\2\2]^\7V\2\2^_\7{\2"+
		"\2_`\7r\2\2`a\7g\2\2a\f\3\2\2\2bc\7U\2\2cd\7r\2\2de\7t\2\2ef\7k\2\2fg"+
		"\7v\2\2gh\7g\2\2hi\7V\2\2ij\7{\2\2jk\7r\2\2kl\7g\2\2l\16\3\2\2\2mn\7p"+
		"\2\2no\7c\2\2op\7o\2\2pq\7g\2\2q\20\3\2\2\2rs\7v\2\2st\7g\2\2tu\7z\2\2"+
		"uv\7v\2\2vw\7w\2\2wx\7t\2\2xy\7g\2\2yz\7h\2\2z{\7k\2\2{|\7n\2\2|}\7g\2"+
		"\2}\22\3\2\2\2~\177\7g\2\2\177\u0080\7h\2\2\u0080\u0081\7h\2\2\u0081\u0082"+
		"\7g\2\2\u0082\u0083\7e\2\2\u0083\u0084\7v\2\2\u0084\u0085\7H\2\2\u0085"+
		"\u0086\7k\2\2\u0086\u0087\7n\2\2\u0087\u0088\7g\2\2\u0088\24\3\2\2\2\u0089"+
		"\u008a\7c\2\2\u008a\u008b\7p\2\2\u008b\u008c\7k\2\2\u008c\u008d\7o\2\2"+
		"\u008d\u008e\7c\2\2\u008e\u008f\7v\2\2\u008f\u0090\7k\2\2\u0090\u0091"+
		"\7q\2\2\u0091\u0092\7p\2\2\u0092\26\3\2\2\2\u0093\u0094\7c\2\2\u0094\u0095"+
		"\7p\2\2\u0095\u0096\7k\2\2\u0096\u0097\7o\2\2\u0097\u0098\7c\2\2\u0098"+
		"\u0099\7v\2\2\u0099\u009a\7k\2\2\u009a\u009b\7q\2\2\u009b\u009c\7p\2\2"+
		"\u009c\u009d\7o\2\2\u009d\u009e\7c\2\2\u009e\u009f\7u\2\2\u009f\u00a0"+
		"\7m\2\2\u00a0\u00a1\7h\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7n\2\2\u00a3"+
		"\u00a4\7g\2\2\u00a4\30\3\2\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7p\2\2\u00a7"+
		"\u00a8\7k\2\2\u00a8\u00a9\7o\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7v\2\2"+
		"\u00ab\u00ac\7k\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af"+
		"\7v\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7z\2\2\u00b1\u00b2\7v\2\2\u00b2"+
		"\u00b3\7w\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7h\2\2"+
		"\u00b6\u00b7\7k\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9\7g\2\2\u00b9\32\3\2"+
		"\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be"+
		"\7o\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7v\2\2\u00c0\u00c1\7k\2\2\u00c1"+
		"\u00c2\7q\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\7q\2\2"+
		"\u00c5\u00c6\7v\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9"+
		"\7k\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7p\2\2\u00cb\34\3\2\2\2\u00cc\u00cd"+
		"\7c\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0\7o\2\2\u00d0"+
		"\u00d1\7c\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7q\2\2"+
		"\u00d4\u00d5\7p\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8"+
		"\7q\2\2\u00d8\u00d9\7r\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7p\2\2\u00db"+
		"\u00dc\7i\2\2\u00dc\36\3\2\2\2\u00dd\u00de\7c\2\2\u00de\u00df\7p\2\2\u00df"+
		"\u00e0\7k\2\2\u00e0\u00e1\7o\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7v\2\2"+
		"\u00e3\u00e4\7k\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6\7p\2\2\u00e6\u00e7"+
		"\7v\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7o\2\2\u00e9\u00ea\7g\2\2\u00ea"+
		" \3\2\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7p\2\2\u00ed\u00ee\7k\2\2\u00ee"+
		"\u00ef\7o\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7k\2\2"+
		"\u00f2\u00f3\7q\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5\7f\2\2\u00f5\u00f6"+
		"\7g\2\2\u00f6\u00f7\7n\2\2\u00f7\u00f8\7c\2\2\u00f8\u00f9\7{\2\2\u00f9"+
		"\"\3\2\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc\7p\2\2\u00fc\u00fd\7k\2\2\u00fd"+
		"\u00fe\7o\2\2\u00fe\u00ff\7c\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7k\2\2"+
		"\u0101\u0102\7q\2\2\u0102\u0103\7p\2\2\u0103\u0104\7d\2\2\u0104\u0105"+
		"\7n\2\2\u0105\u0106\7g\2\2\u0106\u0107\7p\2\2\u0107\u0108\7f\2\2\u0108"+
		"\u0109\7o\2\2\u0109\u010a\7q\2\2\u010a\u010b\7f\2\2\u010b\u010c\7g\2\2"+
		"\u010c$\3\2\2\2\u010d\u010e\7c\2\2\u010e\u010f\7p\2\2\u010f\u0110\7k\2"+
		"\2\u0110\u0111\7o\2\2\u0111\u0112\7c\2\2\u0112\u0113\7v\2\2\u0113\u0114"+
		"\7k\2\2\u0114\u0115\7q\2\2\u0115\u0116\7p\2\2\u0116\u0117\7v\2\2\u0117"+
		"\u0118\7{\2\2\u0118\u0119\7r\2\2\u0119\u011a\7g\2\2\u011a&\3\2\2\2\u011b"+
		"\u011c\7c\2\2\u011c\u011d\7p\2\2\u011d\u011e\7k\2\2\u011e\u011f\7o\2\2"+
		"\u011f\u0120\7c\2\2\u0120\u0121\7v\2\2\u0121\u0122\7k\2\2\u0122\u0123"+
		"\7q\2\2\u0123\u0124\7p\2\2\u0124\u0125\7t\2\2\u0125\u0126\7q\2\2\u0126"+
		"\u0127\7v\2\2\u0127\u0128\7c\2\2\u0128\u0129\7v\2\2\u0129\u012a\7k\2\2"+
		"\u012a\u012b\7q\2\2\u012b\u012c\7p\2\2\u012c\u012d\7q\2\2\u012d\u012e"+
		"\7h\2\2\u012e\u012f\7h\2\2\u012f\u0130\7u\2\2\u0130\u0131\7g\2\2\u0131"+
		"\u0132\7v\2\2\u0132(\3\2\2\2\u0133\u0134\7c\2\2\u0134\u0135\7p\2\2\u0135"+
		"\u0136\7k\2\2\u0136\u0137\7o\2\2\u0137\u0138\7c\2\2\u0138\u0139\7v\2\2"+
		"\u0139\u013a\7k\2\2\u013a\u013b\7q\2\2\u013b\u013c\7p\2\2\u013c\u013d"+
		"\7v\2\2\u013d\u013e\7g\2\2\u013e\u013f\7z\2\2\u013f\u0140\7v\2\2\u0140"+
		"\u0141\7w\2\2\u0141\u0142\7t\2\2\u0142\u0143\7g\2\2\u0143\u0144\7u\2\2"+
		"\u0144\u0145\7e\2\2\u0145\u0146\7c\2\2\u0146\u0147\7n\2\2\u0147\u0148"+
		"\7g\2\2\u0148*\3\2\2\2\u0149\u014a\7z\2\2\u014a,\3\2\2\2\u014b\u014c\7"+
		"{\2\2\u014c.\3\2\2\2\u014d\u014e\7n\2\2\u014e\u014f\7g\2\2\u014f\u0150"+
		"\7i\2\2\u0150\u0151\7c\2\2\u0151\u0152\7e\2\2\u0152\u0153\7{\2\2\u0153"+
		"\u0154\7a\2\2\u0154\u0155\7n\2\2\u0155\u0156\7c\2\2\u0156\u0157\7|\2\2"+
		"\u0157\u0158\7{\2\2\u0158\u0159\7a\2\2\u0159\u015a\7n\2\2\u015a\u015b"+
		"\7q\2\2\u015b\u015c\7c\2\2\u015c\u015d\7f\2\2\u015d\60\3\2\2\2\u015e\u0162"+
		"\t\2\2\2\u015f\u0161\t\3\2\2\u0160\u015f\3\2\2\2\u0161\u0164\3\2\2\2\u0162"+
		"\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\62\3\2\2\2\u0164\u0162\3\2\2"+
		"\2\u0165\u0167\59\35\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169"+
		"\3\2\2\2\u0168\u016a\4\62;\2\u0169\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\64\3\2\2\2\u016d\u016f\59\35"+
		"\2\u016e\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u0172"+
		"\4\62;\2\u0171\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0171\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0179\7\60\2\2\u0176\u0178\4"+
		"\62;\2\u0177\u0176\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017e\5\67"+
		"\34\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0195\3\2\2\2\u017f"+
		"\u0181\59\35\2\u0180\u017f\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\3\2"+
		"\2\2\u0182\u0184\7\60\2\2\u0183\u0185\4\62;\2\u0184\u0183\3\2\2\2\u0185"+
		"\u0186\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0189\3\2"+
		"\2\2\u0188\u018a\5\67\34\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u0195\3\2\2\2\u018b\u018d\59\35\2\u018c\u018b\3\2\2\2\u018c\u018d\3\2"+
		"\2\2\u018d\u018f\3\2\2\2\u018e\u0190\4\62;\2\u018f\u018e\3\2\2\2\u0190"+
		"\u0191\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2"+
		"\2\2\u0193\u0195\5\67\34\2\u0194\u016e\3\2\2\2\u0194\u0180\3\2\2\2\u0194"+
		"\u018c\3\2\2\2\u0195\66\3\2\2\2\u0196\u0198\t\4\2\2\u0197\u0199\t\5\2"+
		"\2\u0198\u0197\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019b\3\2\2\2\u019a\u019c"+
		"\4\62;\2\u019b\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019b\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019e8\3\2\2\2\u019f\u01a0\t\5\2\2\u01a0:\3\2\2\2\u01a1"+
		"\u01a2\7$\2\2\u01a2\u01a3\5=\37\2\u01a3\u01a4\7$\2\2\u01a4<\3\2\2\2\u01a5"+
		"\u01a7\5? \2\u01a6\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a6\3\2\2"+
		"\2\u01a8\u01a9\3\2\2\2\u01a9>\3\2\2\2\u01aa\u01ab\n\6\2\2\u01ab@\3\2\2"+
		"\2\u01ac\u01ae\t\7\2\2\u01ad\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01ad"+
		"\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\b!\2\2\u01b2"+
		"B\3\2\2\2\u01b3\u01b7\7%\2\2\u01b4\u01b6\n\b\2\2\u01b5\u01b4\3\2\2\2\u01b6"+
		"\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01ba\3\2"+
		"\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01bb\b\"\2\2\u01bbD\3\2\2\2\25\2\u0162"+
		"\u0166\u016b\u016e\u0173\u0179\u017d\u0180\u0186\u0189\u018c\u0191\u0194"+
		"\u0198\u019d\u01a8\u01af\u01b7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}