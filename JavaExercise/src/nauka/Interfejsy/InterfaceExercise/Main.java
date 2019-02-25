package nauka.Interfejsy.InterfaceExercise;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        int[] tablica = new int[3];
        tablica[0] = 10;
        tablica[1] = -5;
        tablica[2] = 133;
        System.out.println("przed sortowaniem");

        for (int tab:tablica) {
            System.out.println(tab);
        }

        System.out.println("po sortowaniu w odwrotnej kolejnosci");

        Pracownik[] pracownik = new Pracownik[3];
        pracownik[0] = new Pracownik(10000);
        pracownik[1] = new Pracownik(5000);
        pracownik[2] = new Pracownik(1000);

        Arrays.sort(pracownik, Collections.reverseOrder());

        for (Pracownik p: pracownik){
            System.out.println(p);
        }



    }
}

interface nazwaInterfejsu{
    double PI = 3.14; // public static final

    void metodaRobiacaCos(); //public abstract - must be overwritten

}

interface cosik{

}
    class Pracownik implements nazwaInterfejsu, cosik, Comparable{
        double pensja;
        public Pracownik(double pensja) {
            this.pensja = pensja;
        }

        @Override
        public void metodaRobiacaCos() {

        }

        @Override
        public int compareTo(Object o) {
            return 0;
        }

        @Override
        public String toString() {
            return "Pracownik{" +
                    "pensja=" + pensja +
                    '}';
        }
    }