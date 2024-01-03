package day4;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[100];

        for (int i = 0; i < 100; i++) {
            numbers[i] = rand.nextInt(10001);
        }
        int max = numbers[0];
        int min = numbers[0];
        int zeroEndCount = 0;
        int zeroEndSum = 0;
        for(int x:numbers) {
            if (x > max) {
                max = x;
            }
            if (x < min) {
                min = x;
            }
            if (x % 10 == 0) {
                zeroEndCount++;
                zeroEndSum += x;
            }
        }
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + zeroEndCount);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + zeroEndSum);
    }
}
