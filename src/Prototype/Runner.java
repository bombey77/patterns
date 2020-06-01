package Prototype;

public class Runner {

    public static void main(String[] args) {
        Project project = new Project(1, "Big Mac", 1);
        System.out.println(project);

        ProjectFactory copyProject = new ProjectFactory(project);
        System.out.println(copyProject.getCopyProject());
    }
}
