package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        //Создаем массив размерностью 100
        Random rand = new Random();
        int[] numbers = new int[100];

        //Заполняем массив случайными числами
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10000);
        }
        //Создаем переменные - сумма макс.тройки и индекс первого эл-та макс.тройки
        int maxSum = 0;
        int maxFirst = 0;
        //В цикле проходимся по каждому элементу массива от 0 до 97(вкл).
        for (int i = 0; i < numbers.length - 2; i++) {
            //Вычисляем сумму текущей тройки
            int cycleSum = numbers[i] + numbers[i+1] + numbers[i+2];
            //Сравниваем сумму текущей тройки с суммой максимальной тройки
            if (cycleSum > maxSum) {
                maxSum = cycleSum;
                maxFirst = i;
            }
        }
        System.out.println(maxSum);
        System.out.println(maxFirst);
    }
}
