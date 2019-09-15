package javastart_exercises.game_statistics;

import java.util.Comparator;

public class NickNameComparatorAsc implements Comparator<Player> {
    @Override
    public int compare(Player p1, Player p2) {
        return p1.getNickName().toLowerCase().compareTo(p2.getNickName().toLowerCase());
    }
}
