package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        //Создаем 6 объектов класса игрок
        Player player1 = new Player(90+rand.nextInt(11));
        Player player2 = new Player(90+rand.nextInt(11));
        Player player3 = new Player(90+rand.nextInt(11));
        Player player4 = new Player(90+rand.nextInt(11));
        Player player5 = new Player(90+rand.nextInt(11));
        Player player6 = new Player(90+rand.nextInt(11));
        Player.info();
        while (player5.getStamina() != 0) {
            player5.run();
        }
        System.out.println(Player.getCountPlayers());
        Player.info();
    }
}
