package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import static java.lang.Math.round;

public class Task2 {
    static final int COUNT_OF_NUMBERS = 1000;
    public static void main(String[] args) {
        String file1Path = "file1.txt";
        String file2Path = "file2.txt";
        File generateFile = new File(file1Path);
        File averagesFile = new File(file2Path);

        generateFile(generateFile);

        averagesFromFile(generateFile, averagesFile);

        printResult(averagesFile);
    }

    public static void generateFile(File file) { //Метод для генерации файла
        try (PrintWriter writer = new PrintWriter(file);) { //Вызываем try-with-resources блок с объектом writer
            for (int i = 0; i < COUNT_OF_NUMBERS; i++) { //Вызываем цикл от 0 до COUNT_OF_NUMBERS(1000)
                writer.print((int) (Math.random() * 100) + " "); //Печатаем в файл случайное число от 0 до 100
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    //Метод для нахождения ср.арифметического 20 элементов. Принимает на вход файл для чтения и файл для записи
    public static void averagesFromFile(File fileWithNumbers, File fileWithAverages) {
        try (Scanner scan = new Scanner(fileWithNumbers);
             PrintWriter writer = new PrintWriter(fileWithAverages)) //Вызываем try-with-resources блок с объектами writer и scan
        {
            String[] numbers = scan.nextLine().split(" "); //Массив с данными из прочитанного файла
            double sum = 0; //Сумма элементов в цикле
            int j = 0; //Внешний счетчик для цикла, обнуляется когда достигает 20
            for (int i = 0; i < COUNT_OF_NUMBERS; i++) {
                //Прибавляем к сумме numbers[i], инкрементируем счетчик
                sum += Integer.parseInt(numbers[i]);
                j++;
                if (j == 20) { //Когда счетчик достигает 20, выполняем блок кода
                    //Записываем в файл среднее арифметическое, обнуляем счетчик и сумму
                    writer.print(sum/20 + " ");
                    j = 0;
                    sum = 0;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void printResult(File file) {
        try (Scanner scan = new Scanner(file)) { //Вызываем try-with-resources блок с объектом scan
            int sum = 0;
            //Из считанной из файла строки создаем массив чисел.
            String[] numbers = scan.nextLine().split(" ");
            //Проходимся по массиву с помощью цикла foreach, в массиве преобразуем String в double, округляем и прибавляем к sum
            for (String number: numbers) {
                sum += (int) round(Double.parseDouble(number));
            }
            //Выводим результат на экран
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
