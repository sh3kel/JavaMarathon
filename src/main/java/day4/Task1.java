package day4;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        //Считываем с клавиатуры размер массива
        int n = scan.nextInt();
        int[] numbers = new int[n];
        //Заполняем массив случайными числами
        for (int i = 0; i < n; i++) {
            numbers[i] = rand.nextInt(11);
        }
        //Выводим массив в консоль
        System.out.println(Arrays.toString(numbers));

        int moreEight = 0;
        int equalsOne = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;
        int arrSum = 0;

        for(int x:numbers) {
            arrSum += x;
            if (x > 8) {
                moreEight++;
            }
            if (x == 1) {
                equalsOne++;
            }
            if (x % 2 == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }
        }
        System.out.println("Длина массива: " + n);
        System.out.println("Количество чисел больше 8: " + moreEight);
        System.out.println("Количество чисел равных 1: " + equalsOne);
        System.out.println("Количество четных чисел: " + evenNumbers);
        System.out.println("Количество нечетных чисел: " + oddNumbers);
        System.out.println("Сумма всех элементов массива: " + arrSum);
    }
}
