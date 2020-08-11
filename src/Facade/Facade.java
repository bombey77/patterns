package Facade;

public class Facade {

    private Connection connection = new Connection();
    private Message message = new Message();
    private Sender sender = new Sender();

    public void sendMessage() {
        connection.connect();
        message.loadMessage();
        sender.sendMessage(message);
    }
}
