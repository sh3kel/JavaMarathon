package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        //Создаем массив размерностью 12x8
        int[][] numbers = new int[12][8];
        //Заполняем массив случайными числами
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = rand.nextInt(50);
            }
        }
        //Инициализируем переменные - индекс строки с макс. суммой и сумму эл-тов строки
        int maxIndex = 0;
        int maxSum = 0;
        //Проходимся по каждой строке
        for (int i = 0; i < numbers.length; i++) {
            //Иницилизируем переменную для вычисления суммы в каждой строке
            int cycleSum = 0;
            //Считаем сумму эл-тов строки
            for(int x:numbers[i]) {
                cycleSum += x;
            }
            //Сравниваем сумму эл-тов каждой строки с максимальной суммой элементов.
            if (cycleSum >= maxSum) {
                maxSum = cycleSum;
                maxIndex = i;
            }
        }
        System.out.println("Индекс строки, сумма чисел в которой максимальна: " + maxIndex);
    }
}
