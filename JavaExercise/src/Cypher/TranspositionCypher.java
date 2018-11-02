package Cypher;

import java.util.Scanner;

class TranspositionCypher {

    public static final int ALPHABET_LENTH = 26;

    public static void main(String[] args) {
        String plainText = getInputText();
        char[] TablePlainText = plainText.toCharArray();
        encrypt(TablePlainText);

    }

    private static void encrypt(char[] tablePlainText) {
        char firstChar = ' ';
        char secondChar = ' ';
        if(tablePlainText.length%2 != 0) {
            char[] copyTablePlainText = new char[tablePlainText.length +1];
            for (int i=0; i<tablePlainText.length; i++){
                copyTablePlainText[i] = tablePlainText[i];
            }
            copyTablePlainText[copyTablePlainText.length] = ' ';
        }   else{
            for (int i = 0; i < tablePlainText.length; i += 2) {
                secondChar = tablePlainText[i + 1];
                firstChar = tablePlainText[i];
                System.out.printf("%c", secondChar);
                System.out.printf("%c", firstChar);
            }
        }
    }

    private static String getInputText() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
