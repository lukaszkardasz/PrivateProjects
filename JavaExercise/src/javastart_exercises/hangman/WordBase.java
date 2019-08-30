package javastart_exercises.hangman;

import java.util.Random;

/**
 * @author n2god on 30/08/2019
 * @project PrivateProjects
 */
public class WordBase {
    public String[] words = {"Ala ma kota", "Javastart", "Matrix"};

    public WordBase(String[] words) {
        this.words = words;
    }

    public String[] getWords() {
        return words;
    }

    public String getRandomWord(){
        Random generator = new Random();
        return words[generator.nextInt(words.length)];
    }
}
