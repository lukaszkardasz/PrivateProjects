package javastart_exercises.game_statistics;

public class Player implements Comparable<Player>{
    private String nickName;
    private int score;

    public Player(String nickName, int score) {
        this.nickName = nickName;
        this.score = score;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return nickName + " : " + score;
    }

    @Override
    public int compareTo(Player player) {
        return Integer.compare(player.getScore(), this.score);
    }
}
