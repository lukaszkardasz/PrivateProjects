package nauka.Podstawy;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

class TotekTest {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        int userInput = 0;
        System.out.println("Podaj ile liczb wylosować: ");
        int iloscLiczb = userDataEntry(skaner, userInput);
        System.out.println("Podaj zakres od 1 do: ");
        int zakres = userDataEntry(skaner, userInput);

        int[] wyniki = Totek.losuj(iloscLiczb, zakres);
        System.out.println(Arrays.toString(wyniki));
    }

    private static int userDataEntry(Scanner skaner, int userInput) {
        while (true) {
            try {
                userInput = skaner.nextInt();
                if(userInput < 0){
                    throw new IllegalArgumentException();
                }
                break;
            } catch (InputMismatchException | IllegalArgumentException | NegativeArraySizeException e) {
                System.out.println("Podaj poprawną liczbę!");
                skaner.nextLine();
            }
        }

        return userInput;
    }
}
