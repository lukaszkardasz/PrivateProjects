package javastart_exercises.diamond;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbê: ");
        int number = sc.nextInt();
        sc.close();
        draw(number);
    }

    private static void draw(int number) {
        for (int i = 0; i < number; i++) {
            drawSpaces(number - i - 1);
            drawStars(number);
            System.out.println();
        }
    }

    private static void drawStars(int number) {
        for (int j = 0; j < number; j++) {
            System.out.print("*");
        }
    }

    private static void drawSpaces(int number) {
        for (int k = 0; k < number; k++) {
            System.out.print(" ");
        }
    }
}
