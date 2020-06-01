package Singleton;

public class SingletonRunner {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        singleton.setText("Roman");
        System.out.println(singleton.getText());
    }
}
