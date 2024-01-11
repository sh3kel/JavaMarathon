package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        listFill(0, 30, list);
        listFill(300, 350, list);

        System.out.println(list);

    }

    public static void listFill(int start, int end, List list) {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
    }
}
