package Facade;

public class Sender {

    private Message message;

    public void sendMessage(Message message) {
        if (message.hasMessage()) {
            send();
        }
    }

    private void send() {
        System.out.println("Message is sent");
    }
}
