package Prototype;

public class Project implements Copyable {

    private long id;
    private String name;
    private int version;

    public Project(long id, String name, int version) {
        this.id = id;
        this.name = name;
        this.version = version;
    }

    @Override
    public Object copy() {
        Project project = new Project(id, name, version);
        return (Project) project;
    }

    @Override
    public String toString() {
        return "id = " + id + ", name = " + name + ", version = " + version;
    }
}
