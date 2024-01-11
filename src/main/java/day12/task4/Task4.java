package day12.task4;

import java.util.Arrays;

import static day12.task4.MusicBand.transferMembers;

public class Task4 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Queen", 1970);
        MusicBand band2 = new MusicBand("Пошлая Молли", 2016, Arrays.asList("Кирилл Тимошенко", "Жора"));

        band1.addMembers(Arrays.asList("Фредди Меркьюри", "Брайан Мэй", "Джон Дикон", "Рэджер Тэйлор"));
        band2.addMembers(Arrays.asList("Дмитрий Гончаренко", "Константин Пыжов", "Павел Холодянский"));

        transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();


    }
}
