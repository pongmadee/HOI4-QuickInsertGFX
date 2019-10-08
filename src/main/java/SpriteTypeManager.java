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

    private Map<String,ModData> extra_mod;

    private enum Flag {
        INIT,
        EVENT_PIC_DUPLICATE ,GOAL_IMG_DUPLICATE ,INVALID_GAME_PATH ,INVALID_MOD_PATH ,INPUT_EQU_OUTPUT
        , MOD_DUPLICATE
    }
    private EnumSet<Flag> flags;

    public SpriteTypeManager() {
        this.eventSpriteTypes = new LinkedList<>();
        this.goalSpriteTypes = new LinkedList<>();
        this.goal_shineSpriteTypes = new LinkedList<>();
        this.eventSpriteTypesNameSet = new HashSet<>();
        this.goalSpriteTypesNameSet = new HashSet<>();
        this.goal_shineSpriteTypesNameSet = new HashSet<>();
        this.flags = EnumSet.of(Flag.INIT);
        this.extra_mod = new HashMap<>();
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
        this.flags = EnumSet.of(Flag.INIT);
        this.extra_mod = new HashMap<>();
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

        if(!flags.contains(Flag.INVALID_GAME_PATH)){
            return "<html>Game path: <font color='green'>Valid</font></html>";
        } else {
            return "<html>"+ this.getMessage("")+"</html>";
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

            flags.remove(Flag.INVALID_MOD_PATH);
            return "<html>Mod path: <font color='green'>Valid</font></html>";
        } else {
            flags.add(Flag.INVALID_MOD_PATH);
            return "<html>"+this.getMessage("")+"</html>";
        }
    }

    public boolean isReadyToExport() {

        boolean ready = true;

        if(fileEventSrc == null) { flags.add(Flag.INVALID_GAME_PATH); ready = false; }
        if(fileGoalSrc == null) { flags.add(Flag.INVALID_GAME_PATH); ready = false; }
        if(fileGoalShineSrc == null) { flags.add(Flag.INVALID_GAME_PATH); ready = false; }
        if(gamePath == null) { flags.add(Flag.INVALID_GAME_PATH); ready = false; }
        if(modDir == null) { flags.add(Flag.INVALID_MOD_PATH); ready = false; }

        if(!ready) return false;

        if(fileEventSrc.exists() && fileGoalSrc.exists() && fileGoalShineSrc.exists()){
            flags.remove(Flag.INVALID_GAME_PATH);
        } else {
            flags.add(Flag.INVALID_GAME_PATH);
            ready = false;
        }

        if (this.gamePath.equals(modDir.getPath())){
            flags.add(Flag.INPUT_EQU_OUTPUT);
            ready = false;
        } else {
            flags.remove(Flag.INPUT_EQU_OUTPUT);
        }

        if(modDir.isDirectory() && modDir.exists()){
            flags.remove(Flag.INVALID_MOD_PATH);
        } else {
            flags.add(Flag.INVALID_MOD_PATH);
            ready = false;
        }

        return ready;
    }

    public void addExtraMod(ModData mod ,EventHandler handler){
        String msg = "";

        //check duplicate
        if(extra_mod.containsKey(mod.getName()) || modDir.getAbsolutePath().equals(mod.getPath())){
            flags.add(Flag.MOD_DUPLICATE);
            handler.onError("<html>"+ this.getMessage(msg) + "</html>");
        } else {
            flags.remove(Flag.MOD_DUPLICATE);
            //add into mod list
            extra_mod.put(mod.getName() ,mod);
            msg = "Added extra mod folder: " + mod.getName() + ".";
            handler.onSuccess("<html>"+ this.getMessage(msg) + "</html>");
        }

        //return "<html>"+ this.getMessage(msg) + "</html>";
    }

    public String removeExtraMod(String modName){
        String msg = "";

        if(extra_mod.containsKey(modName)){
            extra_mod.remove(modName);
            msg = "removed mod "+ modName;
        }

        return "<html>"+ this.getMessage(msg) + "</html>";
    }

    public void loadSpriteTypes(){

        if(fileEventSrc.exists() && fileGoalSrc.exists() && fileGoalShineSrc.exists() ){

            eventSpriteTypes = getDataFrom(fileEventSrc , eventSpriteTypesNameSet );
            goalSpriteTypes = getDataFrom(fileGoalSrc , goalSpriteTypesNameSet);
            goal_shineSpriteTypes = getDataFrom(fileGoalShineSrc , goal_shineSpriteTypesNameSet);
            flags.remove(Flag.INVALID_GAME_PATH);

        } else {
            //can't load sprite types
            flags.add(Flag.INVALID_GAME_PATH);
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
        if( isReadyToExport() && appendGFX_DDSModData() && appendExtraGFX_DDSModData() ){

            //do export
            exportFile("eventpictures" , eventSpriteTypes);
            exportFile("goals" ,goalSpriteTypes);
            exportFile("goals_shine" ,goal_shineSpriteTypes);

            return "<html>Export: <font color='green'>Done!, cleared all data.</font></html>";

        } else {
            //can't export all files
            System.out.println("can't export all files");
            return "<html>"+ this.getMessage("") + "</html>";
        }
    }

    private boolean exportFile(final String filename ,final List<SpriteType> sprites){

        try {
            FileOutputStream fos = new FileOutputStream(modDir.getPath() + "/interface/" + filename + ".gfx", false);
            PrintWriter printWriter = new PrintWriter(fos ,true );

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

    private boolean appendGFX_DDSModData(){

        boolean result1 = true;
        File[] files_eventpictures = new File(modDir.getPath() +"/gfx/event_pictures").listFiles();
        if (files_eventpictures != null) {
            for (File file_event : files_eventpictures) {
                StringTokenizer tokenizer = new StringTokenizer(file_event.getName(), ".");

                String name = "\"GFX_" + tokenizer.nextToken() + "\"";
                String texturefile = "\"gfx/event_pictures/" + file_event.getName() + "\"";

                if (!eventSpriteTypesNameSet.contains(name)) {
                    eventSpriteTypesNameSet.add(name);
                    eventSpriteTypes.add(new SpriteType(name, texturefile));
                } else {
                    flags.add(Flag.EVENT_PIC_DUPLICATE);
                    result1 = false;
                }
            }
        } //else { result1 = true;} //It has no picture.

        boolean result2 = true;
        File[] files_goals = new File(modDir.getPath() +"/gfx/interface/goals").listFiles();
        if(files_goals != null) {
            for (File file_goal : files_goals) {
                StringTokenizer tokenizer = new StringTokenizer(file_goal.getName(), ".");

                String name = "\"GFX_" + tokenizer.nextToken() + "\"";
                String texturefile = "\"gfx/interface/goals/" + file_goal.getName() + "\"";

                if (!goalSpriteTypesNameSet.contains(name)) {
                    goalSpriteTypesNameSet.add(name);
                    goalSpriteTypes.add(new SpriteType(name, texturefile));

                    name = name.replace("\"", "");

                    if (!goal_shineSpriteTypesNameSet.contains(name + "_shine")) {
                        goal_shineSpriteTypesNameSet.add(name + "_shine");

                        SpriteType new_shineSpriteType = new SpriteType("\"" + name + "_shine\"", texturefile);

                        //animation default value
                        SpriteType.Animation animation0 = new SpriteType.Animation(
                                texturefile,
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
                                texturefile,
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

                }  else {
                    flags.add(Flag.GOAL_IMG_DUPLICATE);
                    result2 = false;
                }
            }
        } //else { result2 = true;} //It has no image.

        return result1 && result2;
    }

    private boolean appendExtraGFX_DDSModData(){

        boolean result = true;

        for(ModData mod : extra_mod.values()){
            if(!appendEachGFX_DDSModData(new File(mod.getPath()))){
                result = false;
            }
        }

        return result;
    }

    private boolean appendEachGFX_DDSModData(File extra_modDir){

        boolean result1 = true;
        File[] files_eventpictures = new File(extra_modDir.getPath() +"/gfx/event_pictures").listFiles();
        if (files_eventpictures != null) {
            for (File file_event : files_eventpictures) {
                StringTokenizer tokenizer = new StringTokenizer(file_event.getName(), ".");

                String name = "\"GFX_" + tokenizer.nextToken() + "\"";
                String texturefile = "\"gfx/event_pictures/" + file_event.getName() + "\"";

                if (!eventSpriteTypesNameSet.contains(name)) {
                    eventSpriteTypesNameSet.add(name);
                    eventSpriteTypes.add(new SpriteType(name, texturefile));
                } else {
                    flags.add(Flag.EVENT_PIC_DUPLICATE);
                    result1 = false;
                }
            }
        } //else { result1 = true;} //It has no picture.

        boolean result2 = true;
        File[] files_goals = new File(extra_modDir.getPath() +"/gfx/interface/goals").listFiles();
        if(files_goals != null) {
            for (File file_goal : files_goals) {
                StringTokenizer tokenizer = new StringTokenizer(file_goal.getName(), ".");

                String name = "\"GFX_" + tokenizer.nextToken() + "\"";
                String texturefile = "\"gfx/interface/goals/" + file_goal.getName() + "\"";

                if (!goalSpriteTypesNameSet.contains(name)) {
                    goalSpriteTypesNameSet.add(name);
                    goalSpriteTypes.add(new SpriteType(name, texturefile));

                    name = name.replace("\"", "");

                    if (!goal_shineSpriteTypesNameSet.contains(name + "_shine")) {
                        goal_shineSpriteTypesNameSet.add(name + "_shine");

                        SpriteType new_shineSpriteType = new SpriteType("\"" + name + "_shine\"", texturefile);

                        //animation default value
                        SpriteType.Animation animation0 = new SpriteType.Animation(
                                texturefile,
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
                                texturefile,
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

                }  else {
                    flags.add(Flag.GOAL_IMG_DUPLICATE);
                    result2 = false;
                }
            }
        } //else { result2 = true;} //It has no image.

        return result1 && result2;
    }

    public String getMessage(String arg){
        StringBuilder message = new StringBuilder();

        if(flags.contains(Flag.EVENT_PIC_DUPLICATE))
            message.append("<font color='red'>Error : EVENT_PIC_DUPLICATE!</font><br>");
        if(flags.contains(Flag.GOAL_IMG_DUPLICATE))
            message.append("<font color='red'>Error : GOAL_IMG_DUPLICATE!</font><br>");
        if(flags.contains(Flag.INVALID_GAME_PATH))
            message.append("<font color='red'>Error : INVALID_GAME_PATH!</font><br>");
        if(flags.contains(Flag.INVALID_MOD_PATH))
            message.append("<font color='red'>Error : INVALID_MOD_PATH!</font><br>");
        if(flags.contains(Flag.INPUT_EQU_OUTPUT))
            message.append("<font color='red'>Error : GAME_PATH equal MOD_PATH!</font><br>");
        if(flags.contains(Flag.MOD_DUPLICATE))
            message.append("<font color='red'>Error : MOD_DUPLICATE!</font><br>");

        if(!arg.isEmpty()) {
            message.append("<font color='green'>");
            message.append(arg);
            message.append("</font><br>");
        }

        return message.toString();
    }

    public void clearData(){

        this.eventSpriteTypes.clear();
        this.goalSpriteTypes.clear();
        this.goal_shineSpriteTypes.clear();
        this.eventSpriteTypesNameSet.clear();
        this.goalSpriteTypesNameSet.clear();
        this.goal_shineSpriteTypesNameSet.clear();
        this.flags.clear();
        this.flags = EnumSet.of(Flag.INIT);
        this.fileEventSrc = null;
        this.fileGoalSrc = null;
        this.fileGoalShineSrc = null;
        this.gamePath = "";
        this.modDir = null;

        System.out.println("Cleared data");
    }
}
