package javastart_exercises.playlist;

/**
 * @author n2god on 28/08/2019
 * @project PrivateProjects
 */
public class Song {
    private String songName;
    private int songLenght;

    public Song(String songName, int songLenght) {
        this.songName = songName;
        this.songLenght = songLenght;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public int getSongLenght() {
        return songLenght;
    }

    public void setSongLenght(int songLenght) {
        this.songLenght = songLenght;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songName='" + songName + '\'' +
                ", songLenght=" + songLenght +
                '}';
    }
}
