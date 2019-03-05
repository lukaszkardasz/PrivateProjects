package nauka.Podstawy;

import java.util.Random;
import java.util.Scanner;

public class Lotto {

    /**
     * @param args
     * @apiNote
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] skresloneLiczby = new int[6];
        boolean czyZostalySkresloneLiczby = false;

        while (!czyZostalySkresloneLiczby) {
            System.out.println("Podaj 6 liczb od 1 do 49 oddzielając je przecinkiem");
            String wprowadzoneLiczby[] = scanner.nextLine().split(",");
            if (wprowadzoneLiczby != null && wprowadzoneLiczby.length == 6) {
                boolean blad = false;
                for (int i = 0; i < wprowadzoneLiczby.length; i++) {
                    try {
                        int liczba = Integer.valueOf(wprowadzoneLiczby[i]);
                        if (liczba > 0 && liczba < 50) {
                            skresloneLiczby[i] = liczba;
                        } else {
                            throw new NumberFormatException();
                        }
                    } catch (NumberFormatException e) {
                        blad = true;
                        System.out.println(wprowadzoneLiczby[i] + " Nie jest poprawną liczbą!");
                        break;
                    }
                }
                if (blad) {
                    System.out.println("Czy chcesz podać liczby jeszcze raz ? T/N");
                    String decyzja = scanner.nextLine();
                    if (decyzja == null || !decyzja.equalsIgnoreCase("T")) {
                        break;
                    }
                } else {
                    czyZostalySkresloneLiczby = true;
                }
            } else {
                System.out.println("Wprowadzono niepoprawną liczbę cyfr, czy chcesz podać liczby jeszcze raz ? T/N");
                String decyzja = scanner.nextLine();
                if (decyzja == null || !decyzja.equalsIgnoreCase("T")) {
                    break;
                }
            }
        }

        scanner.close();

        if (czyZostalySkresloneLiczby) {
            int[] wylosowaneLiczby = new int[6];
            Random random = new Random();
            for (int i = 0; i < 6; i++) {
                wylosowaneLiczby[i] = random.nextInt(49) + 1;
                System.out.print(wylosowaneLiczby[i] + " ");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
            }
            System.out.println("");
            int trafioneLiczby = 0;
            for (int i = 0; i < wylosowaneLiczby.length; i++) {
                for (int j = 0; j < skresloneLiczby.length; j++) {
                    if (wylosowaneLiczby[i] == skresloneLiczby[j]) {
                        System.out.println("Trafiona liczba!: " + wylosowaneLiczby[i]);
                        trafioneLiczby++;
                    }
                }
            }
            System.out.println("Ilość trafionych liczb: " + trafioneLiczby);
        }
        System.out.println("koniec");
    }
}
