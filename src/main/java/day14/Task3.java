package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String path = "people.txt";
        File file = new File(path);

        System.out.println(parseFileToObjList(file));
    }

    public static List <Person> parseFileToObjList(File file) {
        //Создаем список который вернет метод после успешного выполнения
        List <Person> personList = new ArrayList<>();
        try (Scanner scan = new Scanner(file)) {
            while(scan.hasNextLine()) {
                String[] curLine = scan.nextLine().split(" "); //Создаем из строки список, переходим к следующей строке
                String name = curLine[0]; //Сохраняем имя
                int age = Integer.parseInt(curLine[1]); //Сохраняем возраст
                if(age < 0) { //Проверяем что возраст больше нуля
                    throw new IOException(); //Иначе выбрасываем исключение
                }
                personList.add(new Person(name, age)); //Добавляем объект к конечному списку
            }
            return personList; // Возращаем конечный список
        } catch (FileNotFoundException e) { //Если файл не найден
            System.out.println("Файл не найден");
            return null;
        } catch (IOException | NumberFormatException | ArrayIndexOutOfBoundsException e) { //Если в файле присутствует отрицательный возраст
            System.out.println("Неверный формат файла");
            return null;
        }
    }
}
