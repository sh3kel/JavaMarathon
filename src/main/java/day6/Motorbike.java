package day6;

public class Motorbike {
    //Поля класса
    private String model;
    private String color;
    private int year;
    //Конструктор класса
    public Motorbike(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }
    //Геттеры и сеттеры
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getYear() {
        return year;
    }
    //Методы
    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear) {
        return year - inputYear;
    }
}
