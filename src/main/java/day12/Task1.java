package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Ford", "Lada", "Kia", "Nissan", "Mercedes"));

        list.add(2, "BMW");
        list.remove(0);

        System.out.println(list);
        System.out.println();
    }
}
