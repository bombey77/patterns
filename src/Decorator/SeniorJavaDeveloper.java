package Decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator {

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public void makeCodeReview() {
        System.out.println("Senior Java developer is making code review");
    }

    @Override
    public void writeCode() {
        super.writeCode();
        makeCodeReview();
    }
}
