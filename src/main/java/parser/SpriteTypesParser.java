package parser;// Generated from SpriteTypes.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SpriteTypesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, ID=24, INT=25, 
		FLOAT=26, EXPONENT=27, StringLiteral=28, WS=29, LINE_COMMENT=30;
	public static final int
		RULE_start = 0, RULE_sprite_types = 1, RULE_sprite_type = 2, RULE_elements = 3, 
		RULE_name = 4, RULE_texturefile = 5, RULE_effectFile = 6, RULE_animations = 7, 
		RULE_animation = 8, RULE_animationmaskfile = 9, RULE_animationtexturefile = 10, 
		RULE_animationrotation = 11, RULE_animationlooping = 12, RULE_animationtime = 13, 
		RULE_animationdelay = 14, RULE_animationblendmode = 15, RULE_animationtype = 16, 
		RULE_animationrotationoffset = 17, RULE_animationtexturescale = 18, RULE_point = 19, 
		RULE_legacy_lazy_load = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "sprite_types", "sprite_type", "elements", "name", "texturefile", 
			"effectFile", "animations", "animation", "animationmaskfile", "animationtexturefile", 
			"animationrotation", "animationlooping", "animationtime", "animationdelay", 
			"animationblendmode", "animationtype", "animationrotationoffset", "animationtexturescale", 
			"point", "legacy_lazy_load"
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

	@Override
	public String getGrammarFileName() { return "SpriteTypes.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SpriteTypesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public Sprite_typesContext sprite_types() {
			return getRuleContext(Sprite_typesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SpriteTypesParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpriteTypesVisitor ) return ((SpriteTypesVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			sprite_types();
			setState(43);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sprite_typesContext extends ParserRuleContext {
		public List<Sprite_typeContext> sprite_type() {
			return getRuleContexts(Sprite_typeContext.class);
		}
		public Sprite_typeContext sprite_type(int i) {
			return getRuleContext(Sprite_typeContext.class,i);
		}
		public Sprite_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sprite_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).enterSprite_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).exitSprite_types(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpriteTypesVisitor ) return ((SpriteTypesVisitor<? extends T>)visitor).visitSprite_types(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sprite_typesContext sprite_types() throws RecognitionException {
		Sprite_typesContext _localctx = new Sprite_typesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sprite_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__0);
			setState(46);
			match(T__1);
			setState(47);
			match(T__2);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4 || _la==T__5) {
				{
				{
				setState(48);
				sprite_type();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sprite_typeContext extends ParserRuleContext {
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public Sprite_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sprite_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).enterSprite_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).exitSprite_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpriteTypesVisitor ) return ((SpriteTypesVisitor<? extends T>)visitor).visitSprite_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sprite_typeContext sprite_type() throws RecognitionException {
		Sprite_typeContext _localctx = new Sprite_typeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sprite_type);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				match(T__4);
				setState(57);
				match(T__1);
				setState(58);
				match(T__2);
				setState(59);
				elements();
				setState(60);
				match(T__3);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(T__5);
				setState(63);
				match(T__1);
				setState(64);
				match(T__2);
				setState(65);
				elements();
				setState(66);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementsContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TexturefileContext texturefile() {
			return getRuleContext(TexturefileContext.class,0);
		}
		public List<EffectFileContext> effectFile() {
			return getRuleContexts(EffectFileContext.class);
		}
		public EffectFileContext effectFile(int i) {
			return getRuleContext(EffectFileContext.class,i);
		}
		public List<AnimationsContext> animations() {
			return getRuleContexts(AnimationsContext.class);
		}
		public AnimationsContext animations(int i) {
			return getRuleContext(AnimationsContext.class,i);
		}
		public List<Legacy_lazy_loadContext> legacy_lazy_load() {
			return getRuleContexts(Legacy_lazy_loadContext.class);
		}
		public Legacy_lazy_loadContext legacy_lazy_load(int i) {
			return getRuleContext(Legacy_lazy_loadContext.class,i);
		}
		public ElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).enterElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).exitElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpriteTypesVisitor ) return ((SpriteTypesVisitor<? extends T>)visitor).visitElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementsContext elements() throws RecognitionException {
		ElementsContext _localctx = new ElementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_elements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			name();
			setState(71);
			texturefile();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(72);
				effectFile();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(78);
				animations();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(84);
				legacy_lazy_load();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(SpriteTypesParser.StringLiteral, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpriteTypesVisitor ) return ((SpriteTypesVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__6);
			setState(91);
			match(T__1);
			setState(92);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TexturefileContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(SpriteTypesParser.StringLiteral, 0); }
		public TexturefileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texturefile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).enterTexturefile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).exitTexturefile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpriteTypesVisitor ) return ((SpriteTypesVisitor<? extends T>)visitor).visitTexturefile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TexturefileContext texturefile() throws RecognitionException {
		TexturefileContext _localctx = new TexturefileContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_texturefile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__7);
			setState(95);
			match(T__1);
			setState(96);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EffectFileContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(SpriteTypesParser.StringLiteral, 0); }
		public EffectFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effectFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).enterEffectFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).exitEffectFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpriteTypesVisitor ) return ((SpriteTypesVisitor<? extends T>)visitor).visitEffectFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EffectFileContext effectFile() throws RecognitionException {
		EffectFileContext _localctx = new EffectFileContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_effectFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__8);
			setState(99);
			match(T__1);
			setState(100);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnimationsContext extends ParserRuleContext {
		public AnimationContext animation() {
			return getRuleContext(AnimationContext.class,0);
		}
		public AnimationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_animations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).enterAnimations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).exitAnimations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpriteTypesVisitor ) return ((SpriteTypesVisitor<? extends T>)visitor).visitAnimations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnimationsContext animations() throws RecognitionException {
		AnimationsContext _localctx = new AnimationsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_animations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__9);
			setState(103);
			match(T__1);
			setState(104);
			match(T__2);
			setState(105);
			animation();
			setState(106);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnimationContext extends ParserRuleContext {
		public AnimationmaskfileContext animationmaskfile() {
			return getRuleContext(AnimationmaskfileContext.class,0);
		}
		public AnimationtexturefileContext animationtexturefile() {
			return getRuleContext(AnimationtexturefileContext.class,0);
		}
		public AnimationrotationContext animationrotation() {
			return getRuleContext(AnimationrotationContext.class,0);
		}
		public AnimationloopingContext animationlooping() {
			return getRuleContext(AnimationloopingContext.class,0);
		}
		public AnimationtimeContext animationtime() {
			return getRuleContext(AnimationtimeContext.class,0);
		}
		public AnimationdelayContext animationdelay() {
			return getRuleContext(AnimationdelayContext.class,0);
		}
		public AnimationblendmodeContext animationblendmode() {
			return getRuleContext(AnimationblendmodeContext.class,0);
		}
		public AnimationtypeContext animationtype() {
			return getRuleContext(AnimationtypeContext.class,0);
		}
		public AnimationrotationoffsetContext animationrotationoffset() {
			return getRuleContext(AnimationrotationoffsetContext.class,0);
		}
		public AnimationtexturescaleContext animationtexturescale() {
			return getRuleContext(AnimationtexturescaleContext.class,0);
		}
		public AnimationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_animation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).enterAnimation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).exitAnimation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpriteTypesVisitor ) return ((SpriteTypesVisitor<? extends T>)visitor).visitAnimation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnimationContext animation() throws RecognitionException {
		AnimationContext _localctx = new AnimationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_animation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			animationmaskfile();
			setState(109);
			animationtexturefile();
			setState(110);
			animationrotation();
			setState(111);
			animationlooping();
			setState(112);
			animationtime();
			setState(113);
			animationdelay();
			setState(114);
			animationblendmode();
			setState(115);
			animationtype();
			setState(116);
			animationrotationoffset();
			setState(117);
			animationtexturescale();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnimationmaskfileContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(SpriteTypesParser.StringLiteral, 0); }
		public AnimationmaskfileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_animationmaskfile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).enterAnimationmaskfile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).exitAnimationmaskfile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpriteTypesVisitor ) return ((SpriteTypesVisitor<? extends T>)visitor).visitAnimationmaskfile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnimationmaskfileContext animationmaskfile() throws RecognitionException {
		AnimationmaskfileContext _localctx = new AnimationmaskfileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_animationmaskfile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__10);
			setState(120);
			match(T__1);
			setState(121);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnimationtexturefileContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(SpriteTypesParser.StringLiteral, 0); }
		public AnimationtexturefileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_animationtexturefile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).enterAnimationtexturefile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).exitAnimationtexturefile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpriteTypesVisitor ) return ((SpriteTypesVisitor<? extends T>)visitor).visitAnimationtexturefile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnimationtexturefileContext animationtexturefile() throws RecognitionException {
		AnimationtexturefileContext _localctx = new AnimationtexturefileContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_animationtexturefile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__11);
			setState(124);
			match(T__1);
			setState(125);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnimationrotationContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(SpriteTypesParser.FLOAT, 0); }
		public AnimationrotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_animationrotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).enterAnimationrotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).exitAnimationrotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpriteTypesVisitor ) return ((SpriteTypesVisitor<? extends T>)visitor).visitAnimationrotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnimationrotationContext animationrotation() throws RecognitionException {
		AnimationrotationContext _localctx = new AnimationrotationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_animationrotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__12);
			setState(128);
			match(T__1);
			setState(129);
			match(FLOAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnimationloopingContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SpriteTypesParser.ID, 0); }
		public AnimationloopingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_animationlooping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).enterAnimationlooping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).exitAnimationlooping(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpriteTypesVisitor ) return ((SpriteTypesVisitor<? extends T>)visitor).visitAnimationlooping(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnimationloopingContext animationlooping() throws RecognitionException {
		AnimationloopingContext _localctx = new AnimationloopingContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_animationlooping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__13);
			setState(132);
			match(T__1);
			setState(133);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnimationtimeContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(SpriteTypesParser.FLOAT, 0); }
		public AnimationtimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_animationtime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).enterAnimationtime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).exitAnimationtime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpriteTypesVisitor ) return ((SpriteTypesVisitor<? extends T>)visitor).visitAnimationtime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnimationtimeContext animationtime() throws RecognitionException {
		AnimationtimeContext _localctx = new AnimationtimeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_animationtime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(T__14);
			setState(136);
			match(T__1);
			setState(137);
			match(FLOAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnimationdelayContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(SpriteTypesParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(SpriteTypesParser.INT, 0); }
		public AnimationdelayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_animationdelay; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).enterAnimationdelay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).exitAnimationdelay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpriteTypesVisitor ) return ((SpriteTypesVisitor<? extends T>)visitor).visitAnimationdelay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnimationdelayContext animationdelay() throws RecognitionException {
		AnimationdelayContext _localctx = new AnimationdelayContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_animationdelay);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__15);
			setState(140);
			match(T__1);
			setState(141);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnimationblendmodeContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(SpriteTypesParser.StringLiteral, 0); }
		public AnimationblendmodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_animationblendmode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).enterAnimationblendmode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).exitAnimationblendmode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpriteTypesVisitor ) return ((SpriteTypesVisitor<? extends T>)visitor).visitAnimationblendmode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnimationblendmodeContext animationblendmode() throws RecognitionException {
		AnimationblendmodeContext _localctx = new AnimationblendmodeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_animationblendmode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__16);
			setState(144);
			match(T__1);
			setState(145);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnimationtypeContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(SpriteTypesParser.StringLiteral, 0); }
		public AnimationtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_animationtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).enterAnimationtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).exitAnimationtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpriteTypesVisitor ) return ((SpriteTypesVisitor<? extends T>)visitor).visitAnimationtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnimationtypeContext animationtype() throws RecognitionException {
		AnimationtypeContext _localctx = new AnimationtypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_animationtype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__17);
			setState(148);
			match(T__1);
			setState(149);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnimationrotationoffsetContext extends ParserRuleContext {
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public AnimationrotationoffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_animationrotationoffset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).enterAnimationrotationoffset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).exitAnimationrotationoffset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpriteTypesVisitor ) return ((SpriteTypesVisitor<? extends T>)visitor).visitAnimationrotationoffset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnimationrotationoffsetContext animationrotationoffset() throws RecognitionException {
		AnimationrotationoffsetContext _localctx = new AnimationrotationoffsetContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_animationrotationoffset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__18);
			setState(152);
			match(T__1);
			setState(153);
			match(T__2);
			setState(154);
			point();
			setState(155);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnimationtexturescaleContext extends ParserRuleContext {
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public AnimationtexturescaleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_animationtexturescale; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).enterAnimationtexturescale(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).exitAnimationtexturescale(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpriteTypesVisitor ) return ((SpriteTypesVisitor<? extends T>)visitor).visitAnimationtexturescale(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnimationtexturescaleContext animationtexturescale() throws RecognitionException {
		AnimationtexturescaleContext _localctx = new AnimationtexturescaleContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_animationtexturescale);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__19);
			setState(158);
			match(T__1);
			setState(159);
			match(T__2);
			setState(160);
			point();
			setState(161);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointContext extends ParserRuleContext {
		public List<TerminalNode> FLOAT() { return getTokens(SpriteTypesParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(SpriteTypesParser.FLOAT, i);
		}
		public PointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_point; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).enterPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).exitPoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpriteTypesVisitor ) return ((SpriteTypesVisitor<? extends T>)visitor).visitPoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointContext point() throws RecognitionException {
		PointContext _localctx = new PointContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_point);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__20);
			setState(164);
			match(T__1);
			setState(165);
			match(FLOAT);
			setState(166);
			match(T__21);
			setState(167);
			match(T__1);
			setState(168);
			match(FLOAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Legacy_lazy_loadContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SpriteTypesParser.ID, 0); }
		public Legacy_lazy_loadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_legacy_lazy_load; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).enterLegacy_lazy_load(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpriteTypesListener ) ((SpriteTypesListener)listener).exitLegacy_lazy_load(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpriteTypesVisitor ) return ((SpriteTypesVisitor<? extends T>)visitor).visitLegacy_lazy_load(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Legacy_lazy_loadContext legacy_lazy_load() throws RecognitionException {
		Legacy_lazy_loadContext _localctx = new Legacy_lazy_loadContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_legacy_lazy_load);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__22);
			setState(171);
			match(T__1);
			setState(172);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00b1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7"+
		"\3\64\n\3\f\3\16\3\67\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4G\n\4\3\5\3\5\3\5\7\5L\n\5\f\5\16\5O\13\5\3\5\7\5R\n\5"+
		"\f\5\16\5U\13\5\3\5\7\5X\n\5\f\5\16\5[\13\5\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\3"+
		"\3\2\33\34\2\u00a0\2,\3\2\2\2\4/\3\2\2\2\6F\3\2\2\2\bH\3\2\2\2\n\\\3\2"+
		"\2\2\f`\3\2\2\2\16d\3\2\2\2\20h\3\2\2\2\22n\3\2\2\2\24y\3\2\2\2\26}\3"+
		"\2\2\2\30\u0081\3\2\2\2\32\u0085\3\2\2\2\34\u0089\3\2\2\2\36\u008d\3\2"+
		"\2\2 \u0091\3\2\2\2\"\u0095\3\2\2\2$\u0099\3\2\2\2&\u009f\3\2\2\2(\u00a5"+
		"\3\2\2\2*\u00ac\3\2\2\2,-\5\4\3\2-.\7\2\2\3.\3\3\2\2\2/\60\7\3\2\2\60"+
		"\61\7\4\2\2\61\65\7\5\2\2\62\64\5\6\4\2\63\62\3\2\2\2\64\67\3\2\2\2\65"+
		"\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\289\7\6\2\29\5\3\2\2"+
		"\2:;\7\7\2\2;<\7\4\2\2<=\7\5\2\2=>\5\b\5\2>?\7\6\2\2?G\3\2\2\2@A\7\b\2"+
		"\2AB\7\4\2\2BC\7\5\2\2CD\5\b\5\2DE\7\6\2\2EG\3\2\2\2F:\3\2\2\2F@\3\2\2"+
		"\2G\7\3\2\2\2HI\5\n\6\2IM\5\f\7\2JL\5\16\b\2KJ\3\2\2\2LO\3\2\2\2MK\3\2"+
		"\2\2MN\3\2\2\2NS\3\2\2\2OM\3\2\2\2PR\5\20\t\2QP\3\2\2\2RU\3\2\2\2SQ\3"+
		"\2\2\2ST\3\2\2\2TY\3\2\2\2US\3\2\2\2VX\5*\26\2WV\3\2\2\2X[\3\2\2\2YW\3"+
		"\2\2\2YZ\3\2\2\2Z\t\3\2\2\2[Y\3\2\2\2\\]\7\t\2\2]^\7\4\2\2^_\7\36\2\2"+
		"_\13\3\2\2\2`a\7\n\2\2ab\7\4\2\2bc\7\36\2\2c\r\3\2\2\2de\7\13\2\2ef\7"+
		"\4\2\2fg\7\36\2\2g\17\3\2\2\2hi\7\f\2\2ij\7\4\2\2jk\7\5\2\2kl\5\22\n\2"+
		"lm\7\6\2\2m\21\3\2\2\2no\5\24\13\2op\5\26\f\2pq\5\30\r\2qr\5\32\16\2r"+
		"s\5\34\17\2st\5\36\20\2tu\5 \21\2uv\5\"\22\2vw\5$\23\2wx\5&\24\2x\23\3"+
		"\2\2\2yz\7\r\2\2z{\7\4\2\2{|\7\36\2\2|\25\3\2\2\2}~\7\16\2\2~\177\7\4"+
		"\2\2\177\u0080\7\36\2\2\u0080\27\3\2\2\2\u0081\u0082\7\17\2\2\u0082\u0083"+
		"\7\4\2\2\u0083\u0084\7\34\2\2\u0084\31\3\2\2\2\u0085\u0086\7\20\2\2\u0086"+
		"\u0087\7\4\2\2\u0087\u0088\7\32\2\2\u0088\33\3\2\2\2\u0089\u008a\7\21"+
		"\2\2\u008a\u008b\7\4\2\2\u008b\u008c\7\34\2\2\u008c\35\3\2\2\2\u008d\u008e"+
		"\7\22\2\2\u008e\u008f\7\4\2\2\u008f\u0090\t\2\2\2\u0090\37\3\2\2\2\u0091"+
		"\u0092\7\23\2\2\u0092\u0093\7\4\2\2\u0093\u0094\7\36\2\2\u0094!\3\2\2"+
		"\2\u0095\u0096\7\24\2\2\u0096\u0097\7\4\2\2\u0097\u0098\7\36\2\2\u0098"+
		"#\3\2\2\2\u0099\u009a\7\25\2\2\u009a\u009b\7\4\2\2\u009b\u009c\7\5\2\2"+
		"\u009c\u009d\5(\25\2\u009d\u009e\7\6\2\2\u009e%\3\2\2\2\u009f\u00a0\7"+
		"\26\2\2\u00a0\u00a1\7\4\2\2\u00a1\u00a2\7\5\2\2\u00a2\u00a3\5(\25\2\u00a3"+
		"\u00a4\7\6\2\2\u00a4\'\3\2\2\2\u00a5\u00a6\7\27\2\2\u00a6\u00a7\7\4\2"+
		"\2\u00a7\u00a8\7\34\2\2\u00a8\u00a9\7\30\2\2\u00a9\u00aa\7\4\2\2\u00aa"+
		"\u00ab\7\34\2\2\u00ab)\3\2\2\2\u00ac\u00ad\7\31\2\2\u00ad\u00ae\7\4\2"+
		"\2\u00ae\u00af\7\32\2\2\u00af+\3\2\2\2\7\65FMSY";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}