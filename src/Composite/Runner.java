package Composite;

public class Runner {

    public static void main(String[] args) {
        Developer javaDeveloper1 = new JavaDeveloper();
        Developer javaDeveloper2 = new JavaDeveloper();
        Developer javaDeveloper3 = new JavaDeveloper();

        Developer phpDeveloper = new PHPDeveloper();
        Developer javaScriptDeveloper = new JavaScriptDeveloper();

        Team backEndTeam = new Team();
        Team frontEndTeam = new Team();

        backEndTeam.addComponent(javaDeveloper1);
        backEndTeam.addComponent(javaDeveloper2);
        backEndTeam.addComponent(javaDeveloper3);

        frontEndTeam.addComponent(phpDeveloper);
        frontEndTeam.addComponent(javaScriptDeveloper);

        backEndTeam.writeCode();
        frontEndTeam.writeCode();

//        Java developer is writing Java code...
//        Java developer is writing Java code...
//        Java developer is writing Java code...
//        PHP developer is writing PHP code...
//        JavaScript developer is writing JavaScript code...
    }
}
