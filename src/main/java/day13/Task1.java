package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Паша Дуров");
        User user2 = new User("Майк Вазовски");
        User user3 = new User("ПРО100ВАНЯ");

        user1.sendMessage(user2, "Привет");
        user1.sendMessage(user2, "Аууу");
        user2.sendMessage(user1, "Привет");
        user2.sendMessage(user1, "Как дела?");
        user2.sendMessage(user1, "Давно не виделись");
        user3.sendMessage(user1, "123");
        user3.sendMessage(user1, "456");
        user3.sendMessage(user1, "789");
        user1.sendMessage(user3, "абв");
        user1.sendMessage(user3, "wasd");
        user1.sendMessage(user3, "$$$");
        user3.sendMessage(user1, "Sleeping...");

        MessageDatabase.showDialog(user1, user3);

    }
}
