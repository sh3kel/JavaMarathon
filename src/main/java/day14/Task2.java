package day14;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        String path = "people.txt";
        File file = new File(path);

        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {
        //Создаем список который вернет метод после успешного выполнения
        List <String> list = new ArrayList<>();
        try {
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()) {
                String curLine = scan.nextLine(); //Сохраняем строку в переменную, переходим на следующую строку
                String[] curLineSplit = curLine.split(" "); //Каждую строку разделим на список с помощью метода split
                int age = Integer.parseInt(curLineSplit[1]); //Второй элемент списка приводим к типу Integer и присваиваем переменной age
                if (age < 0) { //Проверяем что возраст больше 0
                    throw new IOException(); //Иначе выбрасываем исключение
                }
                list.add(curLine); //Добавляем элемент к конечному списку
            }
            return list; //Возвращаем конечный список после полного успешного выполнения метода.
        } catch (FileNotFoundException e) { //Если файл не найден
            System.out.println("Файл не найден");
            return null;
        } catch (IOException e) { //Если в файле присутствует отрицательный возраст
            System.out.println("Неверный формат файла");
            return null;
        }
    }
}
