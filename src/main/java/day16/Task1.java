package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String path = "Task1Test.txt";
        File file = new File(path);

        printResult(file);
    }

    public static void printResult(File file) {
        double sum = 0;
        int count = 0;

        try (Scanner scan = new Scanner(file)) {
            String[] digits = scan.nextLine().split(" ");
            count = digits.length;
            for (String digit: digits) {
                sum += Integer.parseInt(digit);
            }
            double avg = sum/count;
            System.out.println(avg + " --> " + String.format("%.3f", avg));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (NumberFormatException | NoSuchElementException e) {
            System.out.println("Неверный формат данных");
        }
    }
}

