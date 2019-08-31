package javastart_exercises.hangman;

/**
 * @author n2god on 30/08/2019
 * @project PrivateProjects
 */
public class Hangman {

    private static final int MAX_MISTAKES = 8;

    private String guessWord;
    private String guessWordDisplay;
    private char[] userGuesses;
    private int guess;
    private int mistakes;

    public Hangman(String guessWord) {
        this.guessWord = guessWord;
        userGuesses = new char[32];
        generateDisplay();
    }

    public String getGuessWord() {
        return guessWord;
    }

    public String getGuessWordDisplay() {
        return guessWordDisplay;
    }

    private void generateDisplay() {
        String display = "";
        for (int i = 0; i < guessWord.length(); i++) {
            char nextChar = guessWord.charAt(i);
            if(arrayContains(userGuesses, nextChar)){
                display += nextChar;
            } else if(nextChar == ' '){
                display += ' ';
            } else display += '*';
        }
        this.guessWordDisplay = display;
    }

    private boolean arrayContains(char[] array, char letter) {
        for (char element : array) {
            if (element == letter)
                return true;
        }
        return false;
    }
}
