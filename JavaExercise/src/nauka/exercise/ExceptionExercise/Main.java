package nauka.exercise.ExceptionExercise;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        int liczba = getNumberFromUser(skaner);
        System.out.println(mnozenie(liczba));
        System.out.println((int) mnozenie(liczba));

    }

    private static int getNumberFromUser(Scanner skaner) {
        System.out.println("Podaj liczbę całkowitą: ");
        while (true) {
            try {
                return skaner.nextInt();
            }
            catch (NoSuchElementException | IllegalStateException exception){
                System.out.println("Niepoprawna liczba, spróbuj jeszcze raz!");
                skaner.next();
            }
        }
    }

    private static double mnozenie(int liczba) {
        return Math.PI*liczba;
    }
}
