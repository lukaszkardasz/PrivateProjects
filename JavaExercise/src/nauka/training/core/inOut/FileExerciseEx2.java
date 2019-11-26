package nauka.training.core.inOut;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class FileExerciseEx2 {
    public static void main(String[] args) throws IOException {
        Scanner skaner = new Scanner(System.in);
        String path = null;
        System.out.println("Podaj ścieżkę do pliku do odczytu: ");
        BufferedReader fileReader = null;
        int numberOfLines = 0;
        String linia;

        try{
            path = skaner.nextLine();
            fileReader = new BufferedReader( (new FileReader(path)));
            System.out.println("Zawartosc pliku: ");
            while (true){
                linia = fileReader.readLine();
                if (linia == null){
                    break;
                }
                numberOfLines++;
                System.out.println(linia);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.err.println("Nie znaleziono pliku!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null){
                fileReader.close();
            }
        }
        System.out.println("Plik ma " + numberOfLines + " linii.");
    }
}
