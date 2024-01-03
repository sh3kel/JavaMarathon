package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x = scan.nextDouble();
        if (x >= 5) {
            System.out.println((x * x - 10) / (x + 7));
        } else if (x < 5 && x > -3) {
            System.out.println((x + 3) * (x * x - 2));
        } else {
            System.out.println(420.0 );
        }
    }
}