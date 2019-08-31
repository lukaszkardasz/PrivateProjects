package javastart_exercises.hangman;

import java.util.Random;

/**
 * @author n2god on 30/08/2019
 * @project PrivateProjects
 */
public class WordBase {
    private Random generator = new Random();

    private final String[] words = {"Ala ma kota",
            "Javastart",
            "Matrix"};

    public String getRandomWord(){
        int randomIndex = generator.nextInt(words.length);
        return words[randomIndex];
    }
}
