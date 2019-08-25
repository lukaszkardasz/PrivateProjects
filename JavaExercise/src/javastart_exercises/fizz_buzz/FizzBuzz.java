package javastart_exercises.fizz_buzz;

import java.util.Scanner;

/**
 * @author n2god on 24/08/2019
 * @project PrivateProjects
 */
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int number = scan.nextInt();

        if (number % 3 == 0 && number %5 !=0) {
            getFizz();
        }
        if (number % 5 == 0 && number % 3 != 3) {
            getBuzz();
        }
        if (number % 3 == 0 && number % 5 == 0) {
            getFizz();
        }
    }

    private static void getBuzz() {
        System.out.print("Fizz");
    }

    private static void getFizz() {
        System.out.print("Buzz");
    }
}
