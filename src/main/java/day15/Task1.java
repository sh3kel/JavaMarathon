package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) {
        String sep = File.separator;
        String readPath = "src" + sep + "main" + sep + "resources" + sep + "shoes.csv";
        String writePath = "src" + sep + "main" + sep + "resources" + sep + "missing_shoes.txt";
        File readFile = new File(readPath);
        File writeFile = new File(writePath);

        filterData(readFile, writeFile);
    }

//Функция фильтрации данных. Принимает на вход файл для чтения и файл для записи.
    public static void filterData(File readFile, File writeFile) {
        try(Scanner scan = new Scanner(readFile);
            PrintWriter fileWriter = new PrintWriter(writeFile))
        {
            int count; //переменная для проверки кол-ва товара
            while (scan.hasNextLine()) {
                String[] data = scan.nextLine().split(";"); //разделяем строку с помощью метода split
                if (data.length != 3) { //проверяем, что количество столбцов равно 3
                    throw new IOException();
                }
                count = Integer.parseInt(data[2]);
                if (count == 0) {
                    fileWriter.println(data[0] + ", " + data[1] + ", " + data[2]); //Если кол-во товара 0, записываем в файл
                }
            }
        } catch (FileNotFoundException e) { //если не удается найти файл
            System.out.println("Файл не найден.");
        } catch (IOException e) { //если кол-во столбцов не равно 3
            System.out.println("Некоррентный формат данных");
        } catch (NumberFormatException e) {
            System.out.println("Некорректно указано количество товара.");
        }
    }
}
