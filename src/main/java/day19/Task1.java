package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {
        //Сканируем файл
        String sep = File.separator;
        String path = "src" + sep + "main" + sep + "resources" + sep + "dushi.txt";
        File text = new File(path);
        //Создаем words - объект типа hashMap для хранения слов в кач-ве ключа и кол-ва их упоминаний в кач-ве значения
        Map<String, Integer> words = new HashMap<>();

        try {
            //Объект типа scan, принимающий на вход файл
            Scanner scan = new Scanner(text);
            scan.useDelimiter("[.,:;()?!\"\\s–]+");
            //В цикле проходимся по всем словам в тексте
            while(scan.hasNext()) {
                //Создаем переменную word - текущее слово в нижнем регистре
                String word = scan.next().toLowerCase();
                //Если слово уже есть в words, увеличиваем value на 1
                if (words.containsKey(word)) {
                    words.replace(word, words.get(word) + 1);
                //Иначе добавляем слово в words со значением 1
                } else {
                    words.put(word, 1);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.print("Файл не найден");
        }
        //Инициализируем цикл в промежутке [0;100)
        for(int i = 0; i < 100; i++) {
            //Инициализируем объект типа Entry wordToOut, который будет словом для вывода на экран
            Map.Entry<String, Integer> wordToOut = null;
            //Во вложенном цикле проходимся по всем элементам words
            for (Map.Entry<String, Integer> entry : words.entrySet()) {
                //Если wordToOut == null, приравниваем его к первому элементу из words
                if(wordToOut == null) {
                    wordToOut = entry;
                }
                //Если значение wordToOut меньше чем значение текущего элемента words в цикле, то прирваниваем wordToOut
                //к этому элементу.
                if (wordToOut.getValue() < entry.getValue()) {
                    wordToOut = entry;
                }
            }
            //Выводим на экран слово с максимальным количеством упоминаний
            System.out.println(wordToOut);
            //Удаляем это слово из words
            words.remove(wordToOut.getKey());
            //ОТВЕТ: КОЛИЧЕСТВО УПОМИНАНИЙ "ЧИЧИКОВ" = 601
        }
    }
}
