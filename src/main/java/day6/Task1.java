package day6;

public class Task1 {
    public static void main(String[] args) {
        Motorbike bike1 = new Motorbike("Yamaha", "White", 2020);
        bike1.info();
        System.out.println(bike1.yearDifference(2010));
    }
}
