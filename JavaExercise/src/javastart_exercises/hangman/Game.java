package javastart_exercises.hangman;

import java.util.Scanner;

/**
 * @author n2god on 30/08/2019
 * @project PrivateProjects
 */
public class Game {
    private static final int NEXT_GAME = 1;
    private static final int EXIT_GAME = 1;

    private WordBase wb = new WordBase();
    private Scanner scanner = new Scanner(System.in);

    public void mainLoop(){
        int option = NEXT_GAME;
        while (option != EXIT_GAME){
            play();
            showOptions();
            option = scanner.nextInt();
            scanner.nextLine()
        }
        System.out.println("PaPa!");
    }

}
