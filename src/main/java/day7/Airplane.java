package day7;

public class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void info() {
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + year + ", длина: " + length
                            + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }
    public void fillUp(int n) {
        fuel += n;
    }

    public static void compareAirplanes (Airplane air1, Airplane air2) {
        //Создаем переменную result для сохранения результата сравнения.
        String result;
        //С помощью if проверяем 3 возможных случая, сохраняем результат проверки в переменную result
        if (air1.length > air2.length) {
            result = "Первый самолет длиннее";
        } else if (air1.length < air2.length) {
            result = "Второй самолет длиннее";
        } else {
            result = "Длины самолетов равны";
        }
        //Выводим в консоль результат проверки
        System.out.println(result);
    }
}
