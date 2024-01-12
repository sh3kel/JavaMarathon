package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static  void addNewMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        //Проходимся по массиву сообщений с помощью цикла foreach
        for (Message message: messages) {
            //Если отправитель = u1 или u2
            if(message.getSender() == u1 || message.getSender() == u2) {
                //Если получатель = u1 или u2
                if(message.getReceiver() == u1 || message.getReceiver() == u2) {
                    //Выводим на экран сообщение
                    System.out.println(message.getSender() + ": " + message.getText());
                }
            }
        }
    }
}
