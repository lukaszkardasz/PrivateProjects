package javastart_exercises.game_statistics.java7_style;

import java.util.Arrays;
import java.util.Comparator;

public class PlayerSorting {
    public static void main(String[] args) {
        Player[] players = {
            new Player("John", 200),
            new Player("Frank", 320),
            new Player("Zenek", 120),
            new Player("n2God", 470),
            new Player("Alex", 370)
        };

        //sortowanie po punktach z klasy Player
        Arrays.sort(players);
        System.out.println(Arrays.toString(players));

        Arrays.sort(players, (p1, p2) -> Integer.compare(p1.getScore(), p2.getScore()));

        System.out.println("Posortowane po punktach rosn¹co: ");
        System.out.println(Arrays.toString(players));

        Arrays.sort(players, new NickNameComparatorAsc());
        System.out.println("Posortowane alfabetycznie (rosn¹co)");
        System.out.println(Arrays.toString(players));

        Arrays.sort(players, new NickNameComparatorDesc());
        System.out.println("Posortowane alfabetycznie (malej¹co)");
        System.out.println(Arrays.toString(players));
    }
}
