package FactoryMethod;

public class FactoryMethodRunner {

    public static void main(String[] args) {
        IJavaDeveloperFactory javaDeveloperFactory = new JavaDeveloperFactory();
        IDeveloper javaDeveloper = javaDeveloperFactory.createJavaDeveloper();
        javaDeveloper.writeCode();
    }
}
