package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane air1 = new Airplane("Boeing 737", 2020, 100, 36);
        Airplane air2 = new Airplane("Sukhoy SJ", 2023, 85, 31);
        Airplane.compareAirplanes(air1, air2);
    }
}