package Facade;

public class Message {

    private boolean hasMessage;

    public boolean hasMessage() {
        return hasMessage;
    }

    public void loadMessage() {
        System.out.println("Message is present");
        hasMessage = true;
    }

    public void unloadMessage() {
        System.out.println("Message isn't present");
        hasMessage = false;
    }
}
