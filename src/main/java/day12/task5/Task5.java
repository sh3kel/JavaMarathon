package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static day12.task5.MusicBand.transferMembers;

public class Task5 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Queen", 1970, Arrays.asList(new MusicArtist("Фредди Меркьюри", 30), new MusicArtist("Брайан Мэй", 25), new MusicArtist("Жора", 25)));
        MusicBand band2 = new MusicBand("Пошлая Молли", 2016, Arrays.asList(new MusicArtist("Кирилл", 20), new MusicArtist("Жора", 30)));

        transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();
    }
}
