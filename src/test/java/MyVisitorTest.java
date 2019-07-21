import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;
import parser.SpriteTypesLexer;
import parser.SpriteTypesParser;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class MyVisitorTest {

    @Test
    public void loadSimpleData() throws Exception {

        ClassLoader classLoader = getClass().getClassLoader();
        ANTLRFileStream fileStream = new ANTLRFileStream(classLoader.getResource("test.gfx").getFile());
        SpriteTypesLexer lexer = new SpriteTypesLexer(fileStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SpriteTypesParser parser = new SpriteTypesParser(tokenStream);
        ParseTree parseTree = parser.start();
        MyVisitor myVisitor = new MyVisitor();
        myVisitor.visit(parseTree);


        assertEquals( myVisitor.getSpriteCount() , 2 );

        List<SpriteType> result = myVisitor.getSpriteTypesList();

        System.out.println(result.toString());

        assertEquals(result.get(0).getName() ,"\"GFX_goal_continuous_air_production\"");
        assertEquals(result.get(0).getTexturefile() ,"\"gfx/interface/goals/goal_continuous_air_production.dds\"");
        assertEquals(result.get(0).getAnimations().size() , 0);

        assertEquals(result.get(1).getName() , "\"GFX_goal_continuous_air_production2\"");
        assertEquals(result.get(1).getTexturefile() , "\"gfx/interface/goals/goal_continuous_air_production2.dds\"");
        assertEquals(result.get(1).getAnimations().get(0).getAnimationmaskfile() , "\"gfx/interface/goals/goal_generic_production.dds\"");
        assertEquals(result.get(1).getAnimations().get(0).getAnimationtexturefile() , "\"gfx/interface/goals/shine_overlay.dds\"");
        assertEquals(result.get(1).getAnimations().get(0).getAnimationrotation() , "-90.0");
        assertEquals(result.get(1).getAnimations().get(0).getAnimationlooping() , "yes");
        assertEquals(result.get(1).getAnimations().get(0).getAnimationtime() , "0.75");
        assertEquals(result.get(1).getAnimations().get(0).getAnimationdelay() , "tttt");
        assertEquals(result.get(1).getAnimations().get(0).getAnimationblendmode() , "\"add\"");
        assertEquals(result.get(1).getAnimations().get(0).getAnimationtype() , "\"scrolling\"");
        assertEquals(result.get(1).getAnimations().get(0).getAnimationrotationoffset() , " x = 0.0 y = 0.0 ");
        assertEquals(result.get(1).getAnimations().get(0).getAnimationtexturescale() , " x = 1.0 y = 1.0 ");

        assertEquals(result.get(1).getAnimations().get(1).getAnimationmaskfile() , "\"gfx/interface/goals/goal_generic_production.dds\"");
        assertEquals(result.get(1).getAnimations().get(1).getAnimationtexturefile() , "\"gfx/interface/goals/shine_overlay.dds\"");
        assertEquals(result.get(1).getAnimations().get(1).getAnimationrotation() , "90.0");
        assertEquals(result.get(1).getAnimations().get(1).getAnimationlooping() , "yes");
        assertEquals(result.get(1).getAnimations().get(1).getAnimationtime() , "0.75");
        assertEquals(result.get(1).getAnimations().get(1).getAnimationdelay() , "1.0");
        assertEquals(result.get(1).getAnimations().get(1).getAnimationblendmode() , "\"add\"");
        assertEquals(result.get(1).getAnimations().get(1).getAnimationtype() , "\"scrolling\"");
        assertEquals(result.get(1).getAnimations().get(1).getAnimationrotationoffset() , " x = 0.0 y = 0.0 ");
        assertEquals(result.get(1).getAnimations().get(1).getAnimationtexturescale() , " x = 1.0 y = 1.0 ");

    }

    @Test
    public void loadSourceData1() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        ANTLRFileStream fileStream = new ANTLRFileStream(classLoader.getResource("goals.gfx").getFile());
        SpriteTypesLexer lexer = new SpriteTypesLexer(fileStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SpriteTypesParser parser = new SpriteTypesParser(tokenStream);
        ParseTree parseTree = parser.start();
        MyVisitor myVisitor = new MyVisitor();
        myVisitor.visit(parseTree);


        assertEquals( myVisitor.getSpriteCount() , 296 );
    }

    @Test
    public void loadSourceData2() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        ANTLRFileStream fileStream = new ANTLRFileStream(classLoader.getResource("eventpictures.gfx").getFile());
        SpriteTypesLexer lexer = new SpriteTypesLexer(fileStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SpriteTypesParser parser = new SpriteTypesParser(tokenStream);
        ParseTree parseTree = parser.start();
        MyVisitor myVisitor = new MyVisitor();
        myVisitor.visit(parseTree);


        assertEquals( myVisitor.getSpriteCount() , 440 );
    }

    @Test
    public void loadSourceData3() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        ANTLRFileStream fileStream = new ANTLRFileStream(classLoader.getResource("goals_shine.gfx").getFile());
        SpriteTypesLexer lexer = new SpriteTypesLexer(fileStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SpriteTypesParser parser = new SpriteTypesParser(tokenStream);
        ParseTree parseTree = parser.start();
        MyVisitor myVisitor = new MyVisitor();
        myVisitor.visit(parseTree);


        assertEquals( myVisitor.getSpriteCount() , 297 );
    }

    @Test
    public void appendData() throws Exception{
        ClassLoader classLoader = getClass().getClassLoader();
        ANTLRFileStream fileStream = new ANTLRFileStream(classLoader.getResource("goals.gfx").getFile());
        SpriteTypesLexer lexer = new SpriteTypesLexer(fileStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SpriteTypesParser parser = new SpriteTypesParser(tokenStream);
        ParseTree parseTree = parser.start();
        MyVisitor myVisitor = new MyVisitor();
        myVisitor.visit(parseTree);

        List<SpriteType> result = myVisitor.getSpriteTypesList();

        result.add(new SpriteType(
                "dummy1",
                "dummy1",
                "dummy1",
                new LinkedList<>(),
                "dummy1"
        ));

        result.add(new SpriteType(
                "dummy2",
                "dummy2",
                "dummy2",
                new LinkedList<>(),
                "dummy2"
        ));

        assertEquals( result.size() , 298);

        assertEquals( result.get(result.size()-2).getTexturefile() , "dummy1" );



    }

}