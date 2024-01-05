package day7;

public class Player {
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    public static int countPlayers = 0;
    private int stamina;

    //Создаем конструктор класса, при каждом вызове которого увеличиваем количество игроков
    //если количество игроков меньше 6.
    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }


    public static int getCountPlayers() {
        return countPlayers;
    }

    public int getStamina() {
        return stamina;
    }
    
    public void run() {
        //Проверяем, если выносливость = 0, выводим сообщение, что игрок отдыхает
        if (stamina == 0) {
            System.out.println("Игроку нужен отдых.");
        } else {
            //Проверяем, если выносливость = 1, выводим сообщение, что игроку нужен отдых, выводим его из игры.
            if (stamina == 1) {
                System.out.println("Игроку нужен отдых. Он выбывает с поля.");
                countPlayers--;
            }
            //Отнимаем единицу выносливости.
            stamina--;
        }
    }
    
    public static void info() {
        if(countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест.");
        }
        else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
