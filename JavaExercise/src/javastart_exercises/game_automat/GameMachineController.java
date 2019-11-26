package javastart_exercises.game_automat;

import javastart_exercises.game_automat.exceptions.GameNotFoundException;
import javastart_exercises.game_automat.exceptions.NotEnougMoneyExcetpion;

import java.util.Scanner;

public class GameMachineController {
    public static void main(String[] args) {
        buyGame();
    }

    private static void buyGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj tytuł gry: ");
        String gameToBuy = sc.nextLine();
        System.out.println("Wpłać pieniądze!");
        double price = sc.nextDouble();
        GameMachine gameMachine = new GameMachine();
        try {
            Game game = gameMachine.buy(gameToBuy, price);
            System.out.println("Odbierz grę: " + game.getGameTitle());
            System.out.println("Odbierz resztę" + (price - game.getPrice()));
        } catch (GameNotFoundException | NotEnougMoneyExcetpion e) {
            System.err.println(e.getMessage());
        }
    }
}
