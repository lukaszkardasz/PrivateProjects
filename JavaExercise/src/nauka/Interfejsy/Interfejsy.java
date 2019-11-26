package nauka.Interfejsy;

import java.util.Scanner;

public class Interfejsy {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Interfejsy interfejs = new Interfejsy();
        Computation computation;

        if (interfejs.shouldMultiply()) {
            computation = new Multiplication(); // zaimplementuj brakującą klasę
        }
        else {
            computation = new Addition(); // zaimplementuj brakującą klasę
        }

        double argument1 = interfejs.getArgument();
        double argument2 = interfejs.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }

    private boolean shouldMultiply() {
        System.out.println("Wykonać dodawanie czy mnozenie? Nacisnij M, nastepnie ENTER, jeżeli mnożenie, cokolwiek innego jeśli dodawanie.");
        return scanner.next().toUpperCase().equals("M"); // tutaj zapytaj użytkownika co chce zrobić (mnożenie czy dodawanie)
    }

    private double getArgument() {
        System.out.println("Podaj liczbę: ");
        return scanner.nextDouble(); // tutaj pobierz liczbę od użytkownika

    }
}
