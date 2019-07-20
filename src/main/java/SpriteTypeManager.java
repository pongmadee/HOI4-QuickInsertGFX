import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.SpriteTypesLexer;
import parser.SpriteTypesParser;

import java.io.*;
import java.util.*;


public class SpriteTypeManager {

    private static final String EVENT_PICTURE_FILE = "/interface/eventpictures.gfx";
    private static final String GOAL_FILE = "/interface/goals.gfx";
    private static final String GOAL_SHINE_FILE = "/interface/goals_shine.gfx";
    private File fileEventSrc,fileGoalSrc,fileGoalShineSrc;
    private String gamePath;
    private File modDir;

    private List<SpriteType> eventSpriteTypes,goalSpriteTypes,goal_shineSpriteTypes;
    private Set<String> eventSpriteTypesNameSet,goalSpriteTypesNameSet,goal_shineSpriteTypesNameSet;

    public SpriteTypeManager() {
        this.eventSpriteTypes = new LinkedList<>();
        this.goalSpriteTypes = new LinkedList<>();
        this.goal_shineSpriteTypes = new LinkedList<>();
        this.eventSpriteTypesNameSet = new HashSet<>();
        this.goalSpriteTypesNameSet = new HashSet<>();
        this.goal_shineSpriteTypesNameSet = new HashSet<>();
    }

    public SpriteTypeManager(final String gamePath, final String modPath) {
        this.eventSpriteTypes = new LinkedList<>();
        this.goalSpriteTypes = new LinkedList<>();
        this.goal_shineSpriteTypes = new LinkedList<>();
        this.eventSpriteTypesNameSet = new HashSet<>();
        this.goalSpriteTypesNameSet = new HashSet<>();
        this.goal_shineSpriteTypesNameSet = new HashSet<>();
        this.setGamePath(gamePath);
        this.setModPath(modPath);
    }


    public String getGamePath() {

        String result = "";

        if(fileGoalSrc != null && fileGoalShineSrc != null && fileEventSrc != null)
            if(fileEventSrc.exists() && fileGoalShineSrc.exists() && fileGoalSrc.exists())
                result = this.gamePath;
        return result;
    }

    public String setGamePath(String gamePath) {
        fileEventSrc = new File(gamePath + EVENT_PICTURE_FILE);
        fileGoalSrc = new File(gamePath + GOAL_FILE);
        fileGoalShineSrc = new File(gamePath + GOAL_SHINE_FILE);
        this.gamePath = gamePath;
        loadSpriteTypes();

        if(fileEventSrc.exists() && fileGoalSrc.exists() && fileGoalShineSrc.exists()){
            return "<html>Game path: <font color='green'>valid</font></html>";
        } else {
            return "<html>Game path: <font color='red'>invalid</font></html>";
        }

    }

    public String getModPath() {
        String result = "";
        if(modDir.isDirectory() && modDir.exists())
            result = modDir.getPath();

        return result;
    }

    public String setModPath(String modPath) {
        modDir = new File(modPath);
        if(modDir.isDirectory() && modDir.exists()){
            File modInterfaceDir = new File(modDir.getPath() + "/interface");
            if(!modInterfaceDir.exists()) modInterfaceDir.mkdir();

            return "<html>Mod path: <font color='green'>valid</font></html>";
        } else {
            return "<html>Game path: <font color='red'>invalid</font></html>";
        }
    }

    public boolean isReadyToExport() {

        if(fileEventSrc == null) return false;
        if(fileGoalSrc == null) return false;
        if(fileGoalShineSrc == null) return false;
        if(gamePath == null) return false;
        if(modDir == null) return false;

        return fileEventSrc.exists() && fileGoalSrc.exists() && fileGoalShineSrc.exists() && (!this.gamePath.equals(modDir.getPath())) && (modDir.isDirectory() && modDir.exists());
    }

    public void loadSpriteTypes(){

        if(fileEventSrc.exists() && fileGoalSrc.exists() && fileGoalShineSrc.exists() ){

            eventSpriteTypes = getDataFrom(fileEventSrc , eventSpriteTypesNameSet );
            goalSpriteTypes = getDataFrom(fileGoalSrc , goalSpriteTypesNameSet);
            goal_shineSpriteTypes = getDataFrom(fileGoalShineSrc , goal_shineSpriteTypesNameSet);

        } else {
            //can't load sprite types
            System.out.println("can't load sprite types");
        }
    }

    private List<SpriteType> getDataFrom(File file , Set<String> nameSet) {
        List<SpriteType> result = null;

        try {
            ANTLRFileStream fileStream = new ANTLRFileStream(file.getAbsolutePath());
            SpriteTypesLexer lexer = new SpriteTypesLexer(fileStream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            SpriteTypesParser parser = new SpriteTypesParser(tokenStream);
            ParseTree parseTree = parser.start();
            MyVisitor myVisitor = new MyVisitor();
            myVisitor.visit(parseTree);

            nameSet.addAll(myVisitor.getSpriteTypeNameSet());

            result = myVisitor.getSpriteTypesList();

        } catch (Exception e){
            e.printStackTrace();
        }

        return result;
    }

    public String exportAll(){
        if(isReadyToExport()){
            //do export
            appendGFX_DDSModData();

            exportFile("eventpictures" , eventSpriteTypes);
            exportFile("goals" ,goalSpriteTypes);
            exportFile("goals_shine" ,goal_shineSpriteTypes);

            return "<html>Export: <font color='green'>Done!</font></html>";

        } else {
            //can't export all files
            System.out.println("can't export all files");
            return "<html>Export: <font color='red'>Fail!</font></html>";
        }
    }

    private boolean exportFile(final String filename ,final List<SpriteType> sprites){

        try {
            FileOutputStream fos = new FileOutputStream(modDir.getPath() + "/interface/" + filename + ".gfx", false);
            PrintWriter printWriter = new PrintWriter(fos ,true );

            //String sprite_type_element = (filename.equals("eventpictures") ? "spriteType" : "SpriteType");

            printWriter.print("spriteTypes = {\n");

            for(SpriteType spriteType : sprites){

                List<SpriteType.Animation> animations = spriteType.getAnimations();
                if(animations.isEmpty()) {

                    printWriter.print(spriteType);

                } else {
                    String name = spriteType.getName();
                    String texturefile = spriteType.getTexturefile();
                    String effectFile = spriteType.getEffectFile();
                    String legacy_lazy_load = spriteType.getLegacy_lazy_load();

                    printWriter.print("\n\tSpriteType = {\n");
                    printWriter.print("\t\tname = " + name + '\n');
                    printWriter.print("\t\ttexturefile = " + texturefile + '\n' );
                    printWriter.print(( !effectFile.isEmpty()  ? "\t\teffectFile = " + effectFile : ""));

                    for(SpriteType.Animation animation : animations)
                        printWriter.print(animation);

                    printWriter.print(( !legacy_lazy_load.isEmpty() ? "\n\t\tlegacy_lazy_load = " + legacy_lazy_load + '\n' : "") );
                    printWriter.print("\t}\n");

                }


            }

            printWriter.print("\n}");


            printWriter.close();

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            System.out.println("exported data to " + filename);
        }

        return true;
    }

    public void appendGFX_DDSModData(){

        File[] files_eventpictures = new File(modDir.getPath() +"/gfx/event_pictures").listFiles();
        assert files_eventpictures != null;
        for(File file_event : files_eventpictures){
            StringTokenizer tokenizer = new StringTokenizer(file_event.getName() ,".");

            String name  = "\"GFX_" + tokenizer.nextToken() + "\"";
            String texturefile = "\"gfx/event_pictures/" + file_event.getName() +"\"";

            if( !eventSpriteTypesNameSet.contains(name) ) {
                eventSpriteTypesNameSet.add(name);
                eventSpriteTypes.add(new SpriteType(name, texturefile));
            }
        }

        File[] files_goals = new File(modDir.getPath() +"/gfx/interface/goals").listFiles();
        assert files_goals != null;
        for(File file_goal : files_goals){
            StringTokenizer tokenizer = new StringTokenizer(file_goal.getName() ,".");

            String name  = "\"GFX_" + tokenizer.nextToken() +"\"";
            String texturefile = "\"gfx/interface/goals/" + file_goal.getName() + "\"";

            if(!goalSpriteTypesNameSet.contains(name)) {
                goalSpriteTypesNameSet.add(name);
                goalSpriteTypes.add(new SpriteType(name, texturefile));

                name = name.replace("\"" , "");

                if(!goal_shineSpriteTypesNameSet.contains(name +"_shine")){
                    goal_shineSpriteTypesNameSet.add(name +"_shine");

                    SpriteType new_shineSpriteType = new SpriteType("\"" + name +"_shine\"" , texturefile);

                    //animation default value
                    SpriteType.Animation animation0 = new SpriteType.Animation(
                            texturefile ,
                            "\"gfx/interface/goals/shine_overlay.dds\"",
                            "-90.0",
                            "no",
                            "0.75",
                            "0",
                            "\"add\"",
                            "\"scrolling\"",
                            " x = 0.0 y = 0.0 ",
                            " x = 1.0 y = 1.0 "
                    );

                    //animation default value
                    SpriteType.Animation animation1 = new SpriteType.Animation(
                            texturefile ,
                            "\"gfx/interface/goals/shine_overlay.dds\"",
                            "90.0",
                            "no",
                            "0.75",
                            "0",
                            "\"add\"",
                            "\"scrolling\"",
                            " x = 0.0 y = 0.0 ",
                            " x = 1.0 y = 1.0 "
                    );

                    new_shineSpriteType.setEffectFile("\"gfx/FX/buttonstate.lua\"");
                    new_shineSpriteType.addAnimation(animation0);
                    new_shineSpriteType.addAnimation(animation1);
                    new_shineSpriteType.setLegacy_lazy_load("no");

                    goal_shineSpriteTypes.add(new_shineSpriteType);

                }

            }
        }
    }
}
