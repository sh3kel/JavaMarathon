package day8;

public class Task1 {
    public static void main(String[] args) {
        //Работа программы конкатенацией строк.
        long startTime = System.currentTimeMillis();
        String result = "";
        for(int i = 0; i <= 20000; i++) {
            result += i + " ";
        }
        System.out.println(result);
        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));

        //Работа программы с использованием StringBuilder.
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <= 20000; i++) {
            sb.append(i + " ");
        }
        stopTime = System.currentTimeMillis();
        System.out.println(sb);
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));
    }
}
