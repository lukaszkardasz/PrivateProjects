package nauka.Podstawy;

import java.util.Scanner;

public class SredniaZtablicy2d2 {

        private final int liczbaOcen;
        private final int liczbaPrzedmiotow;
        private int[][] dziennik;

    public SredniaZtablicy2d2(int ocena, int liczbaPrzedmiotow) {
        this.liczbaOcen = ocena;
        this.liczbaPrzedmiotow = liczbaPrzedmiotow;
        utworzDziennik();
    }

    private void utworzDziennik(){
        dziennik = new int[liczbaPrzedmiotow][];
        for(int lekcja = 0; lekcja < dziennik.length; lekcja++ ){
            dziennik[lekcja] = new int[liczbaOcen];
        }
    }

    public void wpiszOceny(){
        Scanner scanner = new Scanner(System.in);
        for (int lekcjaIndex = 0; lekcjaIndex < liczbaPrzedmiotow; lekcjaIndex++) {
            for (int ocenaIndex = 0; ocenaIndex < liczbaOcen; ocenaIndex++) {
            System.out.println("Podaj ocene nr: " + (ocenaIndex + 1) + " dla przedmiotu nr: " + (lekcjaIndex + 1) + " :");
            dziennik[lekcjaIndex][ocenaIndex] = scanner.nextInt();
            }
        }
    }

    public void wypiszSrednia(){
        float srednia = 0;
        for (int lekcja = 0; lekcja < liczbaPrzedmiotow; lekcja++ ){
            float sredniaPrzedmiotu = 0;
            for (int ocena:dziennik[lekcja]){
                sredniaPrzedmiotu += ocena;
            }
            sredniaPrzedmiotu /= liczbaOcen;
            System.out.println("Srednia dla przedmiotu " + (lekcja + 1) + " wynosi " + sredniaPrzedmiotu);
            srednia += sredniaPrzedmiotu;
        }
        srednia /= liczbaPrzedmiotow;
        System.out.println("Srednia dla wszystkich przedmiotow wynosi: " + srednia);
    }


    public static void main(String[] args) {
        int liczbaPrzedmiotow = 3;
        int liczbaOcen = 4;
        SredniaZtablicy2d2 sredniaZtablicy2d2 = new SredniaZtablicy2d2(liczbaOcen, liczbaPrzedmiotow);
        sredniaZtablicy2d2.wpiszOceny();
        sredniaZtablicy2d2.wypiszSrednia();
    }

}
