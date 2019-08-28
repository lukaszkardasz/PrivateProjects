package javastart_exercises.playlist;

import java.time.Duration;

/**
 * @author n2god on 28/08/2019
 * @project PrivateProjects
 */
public class Playlist {
    final static  int SECOND_IN_HOURS = 60 * 60;
    final static int SECOND_IN_MINUTE = 60;

    private Playlist(){

    }

    public static int playlistLength(Song... args){
        int lenght = 0;
        for (int i = 0; i < args.length; i++) {
            lenght += args[i].getSongLenght();
        }
        return lenght;
    }

    public static String getFormattedTime(int seconds) {
        Duration duration = Duration.ofSeconds(seconds);
        int hours = duration.toHoursPart();
        int minutes = duration.toMinutesPart();
        seconds = duration.toSecondsPart();
        String hoursPart = timeToString(hours);
        String minutePart = timeToString(minutes);
        String secondsPart = timeToString(seconds);

        return hoursPart + ":" + minutePart + ":" + secondsPart;
    }

    private static String timeToString(int hours){
        String time;
        if (hours == 0) time = "00";
        else if (hours < 10) time = "0" + hours;
        else time = Integer.toString(hours);
        return time;
    }

}
