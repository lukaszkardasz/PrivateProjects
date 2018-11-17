package nauka.training.core.inOut;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class FileExerciseEx1 {
    public static void main(String[] args) throws IOException {
        Scanner skaner = new Scanner(System.in);
        String path = null;
        System.out.println("Podaj ścieżkę i nazwę pliku: ");
        FileWriter fileWriter = null;
        path = skaner.nextLine();
        if (path != null) {
            String linia = null;
            fileWriter = new FileWriter(path);
            try {
                do {
                    System.out.println("Podaj dane do zapisania w linii - \"-\" aby zakończyć!");
                    linia = skaner.nextLine();
                    if (linia.equals("-")) {
                        break;
                    }
                    fileWriter.write(linia);
                    fileWriter.write(System.lineSeparator());
                } while (true);
            } finally {
                if (fileWriter != null) {
                    fileWriter.close();
                }
                skaner.close();
            }
        } else {
            throw new FileNotFoundException("Nie znaleziono takiego pliku ani katalogu!!!");
        }
    }
}
