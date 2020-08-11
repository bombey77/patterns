package Facade;

public class Runner {

    public static void main(String[] args) {
//        Without facade

//        Connection connection = new Connection();
//        connection.connect();
//
//        Message message = new Message();
//        message.loadMessage();
//
//        Sender sender = new Sender();
//        sender.sendMessage(message);

//        With facade
        Facade facade = new Facade();
        facade.sendMessage();

//        Is connected
//        Message is present
//        Message is sent
    }
}
