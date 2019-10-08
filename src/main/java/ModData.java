public class ModData implements Comparable<ModData> {
    private String name;
    private String path;

    public ModData(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public int compareTo(ModData o) {
        return this.name.compareTo(o.getName());
    }
}
