package nauka.training.collections.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetExercise {

    public static final String ENDING_STATEMENT = "-";

    public static void main(String[] args) {
        String imie;
        Set<String> listaImion = new HashSet<>();
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        do {
            imie = skaner.next();
            if (!imie.equals(ENDING_STATEMENT)){
                listaImion.add(imie);
            }
        }
        while (!imie.equals(ENDING_STATEMENT));


        System.out.format("Wprowadziles %d unikalnych imion", listaImion.size());
        System.out.println(listaImion.toString());
    }
}
