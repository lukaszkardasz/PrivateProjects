package nauka.training.collections.MapExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExercise {

    public static final String ENDING_STATEMENT = "-";

    public static void main(String[] args) {
        Map<String, String> mapa = new HashMap<>();
        Scanner skaner = new Scanner(System.in);
        String imie1, imie2;

        while (true){
            System.out.println("Podaj pierwsze imie z pary: ");
            imie1 = skaner.next();
            if (imie1.equals(ENDING_STATEMENT)){
                break;
            }
            System.out.println("Podaj drugie imie z pary: ");
            imie2 = skaner.next();
            if (imie2.equals(ENDING_STATEMENT)){
                break;
            }
            mapa.put(imie1, imie2);
        }

        System.out.println("Zakonczono podawanie danych.");
        System.out.println("Podaj imie nr. 1, a podam Ci jego pare: ");
            imie1 = skaner.next();
            System.out.println("Imie nr. 2 dla imienia 1: " + imie1 + " to: " + mapa.get(imie1));



    }




}
