package Singleton;

public class Singleton {

    private static String text;
    private static Singleton singleton;

    private  Singleton() {}

    public static synchronized Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public String getText() {
        return text;
    }

    public void setText(String expText) {
        text = expText;
    }
}
