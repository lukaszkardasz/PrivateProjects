package javastart_exercises.num_precision;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class NumbersPrecision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.UK);
        System.out.println("Podaj liczbê: ");
        double number;
        boolean readComplete = false;
        while (!readComplete) {
            try {
                if ((number = sc.nextDouble()) != 0) {
                    if (number > 0) {
                        for (double i = 0; i < (number + 0.1); i += 0.1) {
                            System.out.printf("%.1f ", i);
                        }
                    } else if (number < 0){
                        for (double i = 0; i > (number - 0.1); i -= 0.1) {
                            System.out.printf("%.1f ", i);
                        }
                    }
                    readComplete = true;
                } else {
                    throw new InputMismatchException("Nie mo¿na wprowadziæ zera!");
                }
            } catch (InputMismatchException e) {
                System.err.println("Wprowadzono niepoprawne dane, zacznij jeszcze raz");
                sc.nextLine();
            }
            sc.close();
        }
    }
}
