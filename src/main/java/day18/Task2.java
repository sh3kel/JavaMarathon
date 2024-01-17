package day18;

import static java.lang.Math.floor;

public class Task2 {
    public static void main(String[] args) {
        int n = 717771237;
        System.out.println(count7(n));
    }

    public static int count7(int number) {
        if (number == 0) {
            return 0;
        }
        if (number % 10 == 7) {
            return 1 + count7(number / 10);
        }
        return count7(number/10);
    }
}
