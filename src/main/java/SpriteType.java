import java.util.LinkedList;
import java.util.List;

public class SpriteType implements Comparable<SpriteType> {

    private String name;
    private String texturefile;
    private String effectFile;
    private List<Animation> animations;
    private String legacy_lazy_load;

    public SpriteType() {
        name = "";
        texturefile = "";
        effectFile = "";
        animations = new LinkedList<>();
        legacy_lazy_load = "";
    }

    public SpriteType(String name, String texturefile, String effectFile, List<Animation> animations, String legacy_lazy_load) {
        this.name = name;
        this.texturefile = texturefile;
        this.effectFile = effectFile;
        this.animations = animations;
        this.legacy_lazy_load = legacy_lazy_load;
    }

    public SpriteType(String name, String texturefile) {
        this.name = name;
        this.texturefile = texturefile;
        effectFile = "";
        animations = new LinkedList<>();
        legacy_lazy_load = "";
    }

    public SpriteType(SpriteType another){
        this.name = another.getName();
        this.texturefile = another.getTexturefile();
        this.effectFile = another.getEffectFile();
        this.animations = another.getAnimations();
        this.legacy_lazy_load = another.getLegacy_lazy_load();
    }

    @Override
    public int compareTo(SpriteType o) {

        return o.getName().compareTo(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTexturefile() {
        return texturefile;
    }

    public void setTexturefile(String texturefile) {
        this.texturefile = texturefile;
    }

    public String getEffectFile() {
        return effectFile;
    }

    public void setEffectFile(String effectFile) {
        this.effectFile = effectFile;
    }

    public String getLegacy_lazy_load() {
        return legacy_lazy_load;
    }

    public void setLegacy_lazy_load(String legacy_lazy_load) {
        this.legacy_lazy_load = legacy_lazy_load;
    }

    public void addAnimation(Animation animation){
        animations.add(animation);
    }

    public List<Animation> getAnimations(){
        return animations;
    }

    @Override
    public String toString() {
        return "\n\tSpriteType = {\n" +
                "\t\tname = " + name + '\n' +
                "\t\ttexturefile = " + texturefile + '\n' +
                ( !effectFile.isEmpty()  ? "\t\teffectFile = " + effectFile + '\n' : "")   +
                ( !animations.isEmpty() ?  "" + animations + '\n' : "")  +
                ( !legacy_lazy_load.isEmpty() ? "\t\tlegacy_lazy_load = " + legacy_lazy_load + '\n' : "")  +
                "\t}";
    }

    public static class Animation {
        private String animationmaskfile;
        private String animationtexturefile;
        private String animationrotation;  //float
        private String animationlooping;
        private String animationtime; //float
        private String animationdelay; //float
        private String animationblendmode;
        private String animationtype;
        private String animationrotationoffset; //point 2D
        private String animationtexturescale; //point 2D

        public Animation() {

        }

        public Animation(String animationmaskfile, String animationtexturefile, String animationrotation, String animationlooping, String animationtime, String animationdelay, String animationblendmode, String animationtype, String animationrotationoffset, String animationtexturescale) {
            this.animationmaskfile = animationmaskfile;
            this.animationtexturefile = animationtexturefile;
            this.animationrotation = animationrotation;
            this.animationlooping = animationlooping;
            this.animationtime = animationtime;
            this.animationdelay = animationdelay;
            this.animationblendmode = animationblendmode;
            this.animationtype = animationtype;
            this.animationrotationoffset = animationrotationoffset;
            this.animationtexturescale = animationtexturescale;
        }

        public String getAnimationmaskfile() {
            return animationmaskfile;
        }

        public void setAnimationmaskfile(String animationmaskfile) {
            this.animationmaskfile = animationmaskfile;
        }

        public String getAnimationtexturefile() {
            return animationtexturefile;
        }

        public void setAnimationtexturefile(String animationtexturefile) {
            this.animationtexturefile = animationtexturefile;
        }

        public String getAnimationrotation() {
            return animationrotation;
        }

        public void setAnimationrotation(String animationrotation) {
            this.animationrotation = animationrotation;
        }

        public String getAnimationlooping() {
            return animationlooping;
        }

        public void setAnimationlooping(String animationlooping) {
            this.animationlooping = animationlooping;
        }

        public String getAnimationtime() {
            return animationtime;
        }

        public void setAnimationtime(String animationtime) {
            this.animationtime = animationtime;
        }

        public String getAnimationdelay() {
            return animationdelay;
        }

        public void setAnimationdelay(String animationdelay) {
            this.animationdelay = animationdelay;
        }

        public String getAnimationblendmode() {
            return animationblendmode;
        }

        public void setAnimationblendmode(String animationblendmode) {
            this.animationblendmode = animationblendmode;
        }

        public String getAnimationtype() {
            return animationtype;
        }

        public void setAnimationtype(String animationtype) {
            this.animationtype = animationtype;
        }

        public String getAnimationrotationoffset() {
            return animationrotationoffset;
        }

        public void setAnimationrotationoffset(String animationrotationoffset) {
            this.animationrotationoffset = animationrotationoffset;
        }

        public String getAnimationtexturescale() {
            return animationtexturescale;
        }

        public void setAnimationtexturescale(String animationtexturescale) {
            this.animationtexturescale = animationtexturescale;
        }

        @Override
        public String toString() {
            return "\n\t\tanimation = {\n" +
                    "\t\t\tanimationmaskfile = " + animationmaskfile + '\n' +
                    "\t\t\tanimationtexturefile = " + animationtexturefile + '\n' +
                    "\t\t\tanimationrotation = " + animationrotation + '\n' +
                    "\t\t\tanimationlooping = " + animationlooping + '\n' +
                    "\t\t\tanimationtime = " + animationtime + '\n' +
                    "\t\t\tanimationdelay = " + animationdelay + '\n' +
                    "\t\t\tanimationblendmode = " + animationblendmode + '\n' +
                    "\t\t\tanimationtype = " + animationtype + '\n' +
                    "\t\t\tanimationrotationoffset = {" + animationrotationoffset + "}\n" +
                    "\t\t\tanimationtexturescale = {" + animationtexturescale + "}\n" +
                    "\t\t}";
        }
    }
}
