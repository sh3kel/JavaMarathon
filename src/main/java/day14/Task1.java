package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String path = "Task1Test.txt";
        File file = new File(path);

        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        final int NUMBERS_COUNT = 10;

        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            if (numbers.length != NUMBERS_COUNT) {
                throw new IllegalArgumentException();
            }
            int sum = 0;
            for (String number : numbers) {
                sum += Integer.parseInt(number);
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}
