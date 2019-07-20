/*This program uses the ANTLR library.*/

import org.antlr.v4.runtime.tree.ParseTree;
import parser.SpriteTypesBaseVisitor;
import parser.SpriteTypesParser;

import java.util.*;

public class MyVisitor extends SpriteTypesBaseVisitor<String> {
    int spriteCount;
    List<SpriteType> spriteTypesList;
    Set<String> spriteTypeNameSet;

    public MyVisitor() {
        spriteTypesList = new LinkedList<>();
        spriteCount =0;
        spriteTypeNameSet = new HashSet<>();
    }

    public int getSpriteCount() {
        return spriteCount;
    }

    public List<SpriteType> getSpriteTypesList() {
        return spriteTypesList;
    }

    public Set<String> getSpriteTypeNameSet() {
        return spriteTypeNameSet;
    }

    @Override
    public String visit(ParseTree tree) {
        return super.visit(tree);
    }

    @Override
    public String visitStart(SpriteTypesParser.StartContext ctx) {
        return super.visitStart(ctx);
    }

    @Override
    public String visitSprite_types(SpriteTypesParser.Sprite_typesContext ctx) {
        return super.visitSprite_types(ctx);
    }

    @Override
    public String visitSprite_type(SpriteTypesParser.Sprite_typeContext ctx) {
        spriteTypesList.add(new SpriteType());
        spriteCount++;
        return super.visitSprite_type(ctx);
    }

    @Override
    public String visitElements(SpriteTypesParser.ElementsContext ctx) {
        //System.out.println("ele:" + spriteCount + " name =" + visit(ctx.name()) + ", texture =" + visit(ctx.texturefile()));

        int index = spriteCount - 1;

        String name = visit(ctx.name());
        spriteTypesList.get(index).setName( name ); spriteTypeNameSet.add( name );
        spriteTypesList.get(index).setTexturefile(  visit(ctx.texturefile()) );
        //spriteTypesList.get(index).setEffectFile( visit(ctx.effectFile(0)) );
        //spriteTypesList.get(index).setLegacy_lazy_load( visit(ctx.legacy_lazy_load(0)) );

        return super.visitElements(ctx);
    }

    @Override
    public String visitName(SpriteTypesParser.NameContext ctx) {
        return ctx.StringLiteral().getText();
    }

    @Override
    public String visitTexturefile(SpriteTypesParser.TexturefileContext ctx) {
        return ctx.StringLiteral().getText();
    }

    @Override
    public String visitEffectFile(SpriteTypesParser.EffectFileContext ctx) {

        spriteTypesList.get(spriteCount-1).setEffectFile( ctx.StringLiteral().toString() );

        return super.visitEffectFile(ctx);
    }

    @Override
    public String visitAnimations(SpriteTypesParser.AnimationsContext ctx) {
        return super.visitAnimations(ctx);
    }

    @Override
    public String visitAnimation(SpriteTypesParser.AnimationContext ctx) {

//            System.out.println("======Animation=========");
//            System.out.println("animationmaskfile =" + visit(ctx.animationmaskfile()));
//            System.out.println("animationtexturefile =" + visit(ctx.animationtexturefile()));
//            System.out.println("animationrotation =" + visit(ctx.animationrotation()));
//            System.out.println("animationlooping =" + visit(ctx.animationlooping()));
//            System.out.println("animationtime =" + visit(ctx.animationtime()));
//            System.out.println("animationdelay =" + visit(ctx.animationdelay()));
//            System.out.println("animationblendmode =" + visit(ctx.animationblendmode()) );
//            System.out.println("animationtype ="+ visit(ctx.animationtype()));
//            System.out.println("animationrotationoffset:" + visit(ctx.animationrotationoffset().point()));
//            System.out.println("animationtexturescale:" + visit(ctx.animationtexturescale().point()));


        SpriteType.Animation animation = new SpriteType.Animation();
        animation.setAnimationmaskfile( visit(ctx.animationmaskfile()) );
        animation.setAnimationtexturefile( visit(ctx.animationtexturefile()) );
        animation.setAnimationrotation( visit(ctx.animationrotation()) );
        animation.setAnimationlooping( visit(ctx.animationlooping()) );
        animation.setAnimationtime( visit(ctx.animationtime()) );
        animation.setAnimationdelay( visit(ctx.animationdelay()) );
        animation.setAnimationblendmode( visit(ctx.animationblendmode()) );
        animation.setAnimationtype( visit(ctx.animationtype()) );
        animation.setAnimationrotationoffset( visit(ctx.animationrotationoffset().point()) );
        animation.setAnimationtexturescale( visit(ctx.animationtexturescale().point()) );

        spriteTypesList.get(spriteCount-1).addAnimation(animation);

        return super.visitAnimation(ctx);
    }

    @Override
    public String visitAnimationmaskfile(SpriteTypesParser.AnimationmaskfileContext ctx) {
        return ctx.StringLiteral().getText();
    }

    @Override
    public String visitAnimationtexturefile(SpriteTypesParser.AnimationtexturefileContext ctx) {
        return ctx.StringLiteral().getText();
    }

    @Override
    public String visitAnimationrotation(SpriteTypesParser.AnimationrotationContext ctx) {
        return ctx.FLOAT().getText();
    }

    @Override
    public String visitAnimationlooping(SpriteTypesParser.AnimationloopingContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public String visitAnimationtime(SpriteTypesParser.AnimationtimeContext ctx) {
        return ctx.FLOAT().getText();
    }

    @Override
    public String visitAnimationdelay(SpriteTypesParser.AnimationdelayContext ctx) {
        if( ctx.INT() == null )
            return ctx.FLOAT().getText();
        else
            return ctx.INT().getText();
    }

    @Override
    public String visitAnimationblendmode(SpriteTypesParser.AnimationblendmodeContext ctx) {
        return ctx.StringLiteral().getText();
    }

    @Override
    public String visitAnimationtype(SpriteTypesParser.AnimationtypeContext ctx) {
        return ctx.StringLiteral().getText();
    }

    @Override
    public String visitAnimationrotationoffset(SpriteTypesParser.AnimationrotationoffsetContext ctx) {
        return super.visitAnimationrotationoffset(ctx);
    }

    @Override
    public String visitAnimationtexturescale(SpriteTypesParser.AnimationtexturescaleContext ctx) {
        return super.visitAnimationtexturescale(ctx);
    }

    @Override
    public String visitPoint(SpriteTypesParser.PointContext ctx) {
        //System.out.println(" x "+ctx.FLOAT(0) + " y "+ctx.FLOAT(1));
        return " x = "+ctx.FLOAT(0) + " y = "+ctx.FLOAT(1) + " " ;
    }

    @Override
    public String visitLegacy_lazy_load(SpriteTypesParser.Legacy_lazy_loadContext ctx) {

        spriteTypesList.get(spriteCount-1).setLegacy_lazy_load( ctx.ID().toString() );
        return super.visitLegacy_lazy_load(ctx);
    }
}