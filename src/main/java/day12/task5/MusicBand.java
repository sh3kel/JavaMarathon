package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List <MusicArtist> members) {
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

    public void addMembers(List <MusicArtist> list) {
        members.addAll(list);
    }

    public void printMembers() {
        for(MusicArtist member: members) {
            System.out.println(member);
        }
    }

    public List <MusicArtist> getMembers() {
        return members;
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        b.members.addAll(a.getMembers());
        a.members.clear();
    }

    @Override
    public String toString() {
        return "'" + name + "'\n"  + " Год: " + year + "\n" + members.toString();
    }
}
