package day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.shuffle;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>(Arrays.asList(new MusicBand("Queen", 1970),
                new MusicBand("BTS", 2013),
                new MusicBand("Френдзона", 2018),
                new MusicBand("Imagine Dragons", 2008),
                new MusicBand("Руки Вверх", 1994),
                new MusicBand("21 Pilots", 2009),
                new MusicBand("Nirvana", 1987),
                new MusicBand("The Beatles", 1960),
                new MusicBand("Пошлая Молли", 2016),
                new MusicBand("Би-2", 1989)));

        shuffle(bands);

        System.out.println(bands);
        System.out.println(groupsAfter2000(bands));
    }

    public static List<MusicBand> groupsAfter2000(List <MusicBand> bands) {
        List <MusicBand> bandsAfter2000 = new ArrayList<>();
        for(MusicBand band: bands) {
            if(band.getYear() > 2000) {
                bandsAfter2000.add(band);
            }
        }
        return bandsAfter2000;
    }
}
