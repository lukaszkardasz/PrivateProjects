package nauka.Cypher;

import java.util.Scanner;

    class CezarCypher {

        public static final int ALPHABET_LENTH = 26;

        public static void main(String[] args) {
            String plainText = getInputText();

            final int shift = 3;
            String encriptedText = encrypt(plainText, shift);
            String decryptedText = decrypt(encriptedText, shift);

            System.out.println("encriptedText: " + encriptedText);
            System.out.println("decryptedText: " + decryptedText);

        }

        private static String getInputText() {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();
        }

        private static String encrypt(String text, int shift) {

            String result = "";
            for (int i = 0; i < text.length(); i++) {
                result += getShiftedChar(text.charAt(i), shift);
            }
            return result;
        }

        private static char getShiftedChar(char cipherChar, int shift) {
            int charValue = (int) cipherChar;

            if (cipherChar == ' ') {
                return ' ';
            }
//        lub
//        if (cipherChar <= 'A' + ALPHABET_LENTH - shift) {
//            return (char) (charValue + shift);
//        } else {
//            return (char)((int)charValue - ALPHABET_LENTH + shift);
//        }

            return (char) (((charValue + shift - 'A') % ALPHABET_LENTH) + 'A');

        }

        private static char getUnShiftedChar(char cipherChar, int shift) {
            int charValue = (int) cipherChar;

            if (cipherChar == ' ') {
                return ' ';
            }
            return (char) (((charValue - shift - 'A') % ALPHABET_LENTH) + 'A');

        }

        private static String decrypt(String encriptedText, int shift) {


            String resultDecrypted = "";
            for (int i = 0; i < encriptedText.length(); i++) {
                resultDecrypted += getUnShiftedChar(encriptedText.charAt(i), shift);
            }
            return resultDecrypted;
        }
    }
