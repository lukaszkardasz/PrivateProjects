package javastart_exercises.game_automat;

import javastart_exercises.game_automat.exceptions.GameNotFoundException;
import javastart_exercises.game_automat.exceptions.NotEnougMoneyExcetpion;

import java.util.HashMap;
import java.util.Map;

public class GameMachine {
    Map<String, Game> gameCollection = Map.of(
            "GTA V", new Game("GTA V", 99),
            "Legend of Zelda", new Game("Legend of Zelda", 129),
            "Wiedźmin III", new Game("Wiedźmin III", 79));

    Game buy(String gameTitle, double money){
        if (!gameCollection.containsKey(gameTitle)){
            throw new GameNotFoundException(gameTitle);
        }
        Game game = gameCollection.get(gameTitle);
        if (money < game.getPrice()){
            throw new NotEnougMoneyExcetpion(game.getPrice(), money);
        }
        return game;
    }
}
