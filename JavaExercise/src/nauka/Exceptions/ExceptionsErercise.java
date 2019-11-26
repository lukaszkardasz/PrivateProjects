package nauka.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsErercise {

    public static void main(String[] args) {
        boolean isNotCorrect = true;
        Scanner skaner = new Scanner((System.in));
        do {
            try {
                System.out.println("Wprowadz licznik: ");
                int l = skaner.nextInt();
                System.out.println("Wprowadz mianownik: ");
                int m = skaner.nextInt();
                System.out.println("Wynik dzielenia l/m to: " + l / m);
                isNotCorrect = false;
            } catch (ArithmeticException ae) {
                //ae.printStackTrace();
                System.err.println("Dzielenie przez zero");
            } catch (InputMismatchException ime) {
                //ime.printStackTrace();
                System.err.println("Niewlaściwe dane wejsciowe");
                skaner.nextLine();
                System.out.println("Wprowadz dane ponownie: ");
            }
        } while (isNotCorrect);
        skaner.close();
    }
}

