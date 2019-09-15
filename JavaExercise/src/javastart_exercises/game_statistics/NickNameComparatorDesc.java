package javastart_exercises.game_statistics;

import java.util.Comparator;

public class NickNameComparatorDesc implements Comparator<Player> {
    @Override
    public int compare(Player p1, Player p2) {
        return p2.getNickName().compareTo(p1.getNickName());
    }
}
