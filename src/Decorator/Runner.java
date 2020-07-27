package Decorator;

public class Runner {

    public static void main(String[] args) {
        Developer seniorJavaDeveloper = new SeniorJavaDeveloper(new JavaDeveloper());
        seniorJavaDeveloper.writeCode();

//        Java developer is writing Java code
//        Senior Java developer is making code review
    }
}
