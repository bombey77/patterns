package FactoryMethod;

public class JavaDeveloperFactory implements IJavaDeveloperFactory {
    @Override
    public JavaIDeveloper createJavaDeveloper() {
        return new JavaIDeveloper();
    }
}
