package javastart_exercises.hangman;

import java.util.Scanner;

/**
 * @author n2god on 30/08/2019
 * @project PrivateProjects
 */
public class Game {
    private static final int NEXT_GAME = 1;
    private static final int EXIT_GAME = 2;

    private WordBase wb = new WordBase();
    private Scanner scanner = new Scanner(System.in);

    public void mainLoop() {
        int option = NEXT_GAME;
        while (option != EXIT_GAME) {
            play();
            showOptions();
            option = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("PaPa!");
    }

    private void play() {
        Hangman hangman = new Hangman(wb.getRandomWord());
        do {
            System.out.println("\nHasło do zgadnięcia: ");
            String guessWordDisplay = hangman.getGuessWordDisplay();
            System.out.println(guessWordDisplay);
            System.out.println("Podaj literę:");
            String line = scanner.nextLine();
            char userGuess = line.charAt(0);
            hangman.checkLetter(userGuess);
        } while (!hangman.userLost() && !hangman.userWon());
        System.out.println();
        if (hangman.userWon()) {
            System.out.println("Wygrałeś!");
            System.out.printf("Hasło: %s\n\n", hangman.getGuessWord());
        } else if (hangman.userLost()) {
            System.out.println("Przegrałeś!");
        }
    }

    private void showOptions() {
        System.out.println(NEXT_GAME + " - Continue game");
        System.out.println(EXIT_GAME + " - Exit game");
    }

}
