package javastart_exercises.game_automat;

public class Game {
    private String gameTitle;
    private double price;

    public Game(String gameTitle, double price) {
        this.gameTitle = gameTitle;
        this.price = price;
    }

    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameTitle='" + gameTitle + '\'' +
                ", price=" + price +
                '}';
    }
}
