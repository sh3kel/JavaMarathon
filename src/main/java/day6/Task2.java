package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane plane = new Airplane("Boeing", 2012, 36, 36000);

        plane.setYear(2024);
        plane.setLength(40);
        plane.fillUp(40);
        plane.fillUp(20);
        plane.info();
    }
}
