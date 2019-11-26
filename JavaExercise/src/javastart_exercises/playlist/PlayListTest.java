package javastart_exercises.playlist;

import static javastart_exercises.playlist.Playlist.getFormattedTime;

/**
 * @author n2god on 28/08/2019
 * @project PrivateProjects
 */
public class PlayListTest {


    public static void main(String[] args) {


        Song song1 = new Song("ulululull", 320);
        Song song2 = new Song("Nothing Else Matters", 410);
        Song song3 = new Song("Gregory", 250);
        Song song4 = new Song("Du hast", 4590);

        int playlistLenghtInSeconds = Playlist.playlistLength(song1, song2, song3, song4);
        System.out.println("Wszystkie piosenki trwają w sumie: " + playlistLenghtInSeconds + "sec");
        System.out.println(getFormattedTime(playlistLenghtInSeconds));
    }


}
