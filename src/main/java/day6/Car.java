package day6;

public class Car {
    //Поля класса
    private String model;
    private String color;
    private int year;
    //Сеттеры и геттеры
    public void setColor(String color) {
        this.color = color;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getYear() {
        return year;
    }
    //Методы класса
    public void info() {
        System.out.println("Это автомобиль");
    }
    public int yearDifference(int inputYear) {
        return year - inputYear;
    }
}
