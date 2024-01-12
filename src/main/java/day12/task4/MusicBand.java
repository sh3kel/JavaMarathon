package day12.task4;

import day12.task5.MusicArtist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List <String> members) {
        this.name = name;
        this.year = year;
        this.members = new ArrayList<>(members);
    }

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
        this.members = new ArrayList<>();
    }

    public int getYear() {
        return year;
    }

    public void printMembers() {
        System.out.println(members);
    }

    public void addMembers(List <String> list) {
        members.addAll(list);
    }

    public List <String> getMembers() {
        return members;
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        b.members.addAll(a.getMembers());
        a.members.clear();
    }

    @Override
    public String toString() {
        return "'" + name + "'" + " Год: " + year;
    }
}
