package javastart_exercises.game_statistics.java8_style;

import javastart_exercises.game_statistics.java7_style.Player;

import java.util.Arrays;
import java.util.Comparator;

public class PlayerSortingJava8 {
    public static void main(String[] args) {
        Player[] players = {
            new Player("John", 200),
            new Player("Frank", 320),
            new Player("Zenek", 120),
            new Player("n2God", 470),
            new Player("Alex", 370)
        };

        Arrays.sort(players);
        //sortowanie po punktach z klasy Player
        System.out.println("Posortowane po punktach (malej¹co):");
        System.out.println(Arrays.toString(players));


        Arrays.sort(players, Comparator.comparingInt(Player::getScore));
        System.out.println("Posortowane po punktach (rosn¹co): ");
        System.out.println(Arrays.toString(players));

        Arrays.sort(players, Comparator.comparing(p -> p.getNickName().toLowerCase()));
        System.out.println("Posortowane alfabetycznie (rosn¹co):");
        System.out.println(Arrays.toString(players));

        Arrays.sort(players, Comparator.comparing((Player p) -> p.getNickName().toLowerCase()).reversed());
        System.out.println("Posortowane alfabetycznie (malej¹co):");
        System.out.println(Arrays.toString(players));
    }
}
