package parser;// Generated from SpriteTypes.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SpriteTypesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SpriteTypesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SpriteTypesParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(SpriteTypesParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpriteTypesParser#sprite_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSprite_types(SpriteTypesParser.Sprite_typesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpriteTypesParser#sprite_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSprite_type(SpriteTypesParser.Sprite_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpriteTypesParser#elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElements(SpriteTypesParser.ElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpriteTypesParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(SpriteTypesParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpriteTypesParser#texturefile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexturefile(SpriteTypesParser.TexturefileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpriteTypesParser#effectFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEffectFile(SpriteTypesParser.EffectFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpriteTypesParser#animations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnimations(SpriteTypesParser.AnimationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpriteTypesParser#animation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnimation(SpriteTypesParser.AnimationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpriteTypesParser#animationmaskfile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnimationmaskfile(SpriteTypesParser.AnimationmaskfileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpriteTypesParser#animationtexturefile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnimationtexturefile(SpriteTypesParser.AnimationtexturefileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpriteTypesParser#animationrotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnimationrotation(SpriteTypesParser.AnimationrotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpriteTypesParser#animationlooping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnimationlooping(SpriteTypesParser.AnimationloopingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpriteTypesParser#animationtime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnimationtime(SpriteTypesParser.AnimationtimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpriteTypesParser#animationdelay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnimationdelay(SpriteTypesParser.AnimationdelayContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpriteTypesParser#animationblendmode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnimationblendmode(SpriteTypesParser.AnimationblendmodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpriteTypesParser#animationtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnimationtype(SpriteTypesParser.AnimationtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpriteTypesParser#animationrotationoffset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnimationrotationoffset(SpriteTypesParser.AnimationrotationoffsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpriteTypesParser#animationtexturescale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnimationtexturescale(SpriteTypesParser.AnimationtexturescaleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpriteTypesParser#point}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoint(SpriteTypesParser.PointContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpriteTypesParser#legacy_lazy_load}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLegacy_lazy_load(SpriteTypesParser.Legacy_lazy_loadContext ctx);
}