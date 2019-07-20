package parser;// Generated from SpriteTypes.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SpriteTypesParser}.
 */
public interface SpriteTypesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SpriteTypesParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(SpriteTypesParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpriteTypesParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(SpriteTypesParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpriteTypesParser#sprite_types}.
	 * @param ctx the parse tree
	 */
	void enterSprite_types(SpriteTypesParser.Sprite_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpriteTypesParser#sprite_types}.
	 * @param ctx the parse tree
	 */
	void exitSprite_types(SpriteTypesParser.Sprite_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpriteTypesParser#sprite_type}.
	 * @param ctx the parse tree
	 */
	void enterSprite_type(SpriteTypesParser.Sprite_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpriteTypesParser#sprite_type}.
	 * @param ctx the parse tree
	 */
	void exitSprite_type(SpriteTypesParser.Sprite_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpriteTypesParser#elements}.
	 * @param ctx the parse tree
	 */
	void enterElements(SpriteTypesParser.ElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpriteTypesParser#elements}.
	 * @param ctx the parse tree
	 */
	void exitElements(SpriteTypesParser.ElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpriteTypesParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(SpriteTypesParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpriteTypesParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(SpriteTypesParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpriteTypesParser#texturefile}.
	 * @param ctx the parse tree
	 */
	void enterTexturefile(SpriteTypesParser.TexturefileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpriteTypesParser#texturefile}.
	 * @param ctx the parse tree
	 */
	void exitTexturefile(SpriteTypesParser.TexturefileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpriteTypesParser#effectFile}.
	 * @param ctx the parse tree
	 */
	void enterEffectFile(SpriteTypesParser.EffectFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpriteTypesParser#effectFile}.
	 * @param ctx the parse tree
	 */
	void exitEffectFile(SpriteTypesParser.EffectFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpriteTypesParser#animations}.
	 * @param ctx the parse tree
	 */
	void enterAnimations(SpriteTypesParser.AnimationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpriteTypesParser#animations}.
	 * @param ctx the parse tree
	 */
	void exitAnimations(SpriteTypesParser.AnimationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpriteTypesParser#animation}.
	 * @param ctx the parse tree
	 */
	void enterAnimation(SpriteTypesParser.AnimationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpriteTypesParser#animation}.
	 * @param ctx the parse tree
	 */
	void exitAnimation(SpriteTypesParser.AnimationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpriteTypesParser#animationmaskfile}.
	 * @param ctx the parse tree
	 */
	void enterAnimationmaskfile(SpriteTypesParser.AnimationmaskfileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpriteTypesParser#animationmaskfile}.
	 * @param ctx the parse tree
	 */
	void exitAnimationmaskfile(SpriteTypesParser.AnimationmaskfileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpriteTypesParser#animationtexturefile}.
	 * @param ctx the parse tree
	 */
	void enterAnimationtexturefile(SpriteTypesParser.AnimationtexturefileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpriteTypesParser#animationtexturefile}.
	 * @param ctx the parse tree
	 */
	void exitAnimationtexturefile(SpriteTypesParser.AnimationtexturefileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpriteTypesParser#animationrotation}.
	 * @param ctx the parse tree
	 */
	void enterAnimationrotation(SpriteTypesParser.AnimationrotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpriteTypesParser#animationrotation}.
	 * @param ctx the parse tree
	 */
	void exitAnimationrotation(SpriteTypesParser.AnimationrotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpriteTypesParser#animationlooping}.
	 * @param ctx the parse tree
	 */
	void enterAnimationlooping(SpriteTypesParser.AnimationloopingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpriteTypesParser#animationlooping}.
	 * @param ctx the parse tree
	 */
	void exitAnimationlooping(SpriteTypesParser.AnimationloopingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpriteTypesParser#animationtime}.
	 * @param ctx the parse tree
	 */
	void enterAnimationtime(SpriteTypesParser.AnimationtimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpriteTypesParser#animationtime}.
	 * @param ctx the parse tree
	 */
	void exitAnimationtime(SpriteTypesParser.AnimationtimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpriteTypesParser#animationdelay}.
	 * @param ctx the parse tree
	 */
	void enterAnimationdelay(SpriteTypesParser.AnimationdelayContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpriteTypesParser#animationdelay}.
	 * @param ctx the parse tree
	 */
	void exitAnimationdelay(SpriteTypesParser.AnimationdelayContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpriteTypesParser#animationblendmode}.
	 * @param ctx the parse tree
	 */
	void enterAnimationblendmode(SpriteTypesParser.AnimationblendmodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpriteTypesParser#animationblendmode}.
	 * @param ctx the parse tree
	 */
	void exitAnimationblendmode(SpriteTypesParser.AnimationblendmodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpriteTypesParser#animationtype}.
	 * @param ctx the parse tree
	 */
	void enterAnimationtype(SpriteTypesParser.AnimationtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpriteTypesParser#animationtype}.
	 * @param ctx the parse tree
	 */
	void exitAnimationtype(SpriteTypesParser.AnimationtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpriteTypesParser#animationrotationoffset}.
	 * @param ctx the parse tree
	 */
	void enterAnimationrotationoffset(SpriteTypesParser.AnimationrotationoffsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpriteTypesParser#animationrotationoffset}.
	 * @param ctx the parse tree
	 */
	void exitAnimationrotationoffset(SpriteTypesParser.AnimationrotationoffsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpriteTypesParser#animationtexturescale}.
	 * @param ctx the parse tree
	 */
	void enterAnimationtexturescale(SpriteTypesParser.AnimationtexturescaleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpriteTypesParser#animationtexturescale}.
	 * @param ctx the parse tree
	 */
	void exitAnimationtexturescale(SpriteTypesParser.AnimationtexturescaleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpriteTypesParser#point}.
	 * @param ctx the parse tree
	 */
	void enterPoint(SpriteTypesParser.PointContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpriteTypesParser#point}.
	 * @param ctx the parse tree
	 */
	void exitPoint(SpriteTypesParser.PointContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpriteTypesParser#legacy_lazy_load}.
	 * @param ctx the parse tree
	 */
	void enterLegacy_lazy_load(SpriteTypesParser.Legacy_lazy_loadContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpriteTypesParser#legacy_lazy_load}.
	 * @param ctx the parse tree
	 */
	void exitLegacy_lazy_load(SpriteTypesParser.Legacy_lazy_loadContext ctx);
}