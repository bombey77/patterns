package Prototype;

public class ProjectFactory {

    private Project project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public Project getCopyProject() {
        return (Project) project.copy();
    }
}
