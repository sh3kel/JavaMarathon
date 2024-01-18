package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) {
        //Создаем объект класса File
        String sep = File.separator;
        String path = "src" + sep + "main" + sep + "resources" + sep + "taxi_cars.txt";
        File file = new File(path);

        //Создаем объект, хранящий в себе информацию о машинах
        Map<Integer, Point> taxiCars = new HashMap<>();

        try (Scanner scan = new Scanner(file)) {
            //В цикле считываем информацию о каждой машине
            while(scan.hasNextInt()) {
                taxiCars.put(scan.nextInt(), new Point(scan.nextInt(), scan.nextInt()));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        //Просим ввести с клавиатуры координаты точек
        System.out.println("Введите координаты x1, y1, x2, y2");
        Scanner coords = new Scanner(System.in);

        int x1 = coords.nextInt();
        int y1 = coords.nextInt();
        int x2 = coords.nextInt();
        int y2 = coords.nextInt();

        //Счетчик кол-ва машин, входящих в заданную область
        int count = 0;

        //В цикле foreach проходимся по taxiCars
        for(Map.Entry<Integer, Point> entry: taxiCars.entrySet()) {
            //Если проверка выполняется успешно, выводим на экран идентификатор авто и инкрементируем count
            if(pointCheck(x1, y1, x2, y2, entry.getValue().getX(), entry.getValue().getY())) {
                System.out.print(entry.getKey() + " ");
                count++;
            }
        }
        System.out.print("\nКоличество машин в заданной области: " + count);
    }

    //Метод для проверки, лежит ли точка в заданной области. Принимает на вход координаты плоскости и точки
    public static boolean pointCheck(int x1, int y1, int x2, int y2, int x, int y) {
        if(x > x1 && x < x2 && y > y1 && y < y2 ) {
            return true;
        } else if (x < x1 && x > x2 && y < y1 && y > y2) {
            return true;
        }
        return false;
    }
}

