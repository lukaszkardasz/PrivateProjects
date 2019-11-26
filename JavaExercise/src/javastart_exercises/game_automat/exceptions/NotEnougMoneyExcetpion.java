package javastart_exercises.game_automat.exceptions;

public class NotEnougMoneyExcetpion extends RuntimeException {
    public NotEnougMoneyExcetpion(double gamePrice, double moneyPaid) {
        super(String.format("The game cost is %.2f, you paid only %.2f", gamePrice, moneyPaid));
    }
}
