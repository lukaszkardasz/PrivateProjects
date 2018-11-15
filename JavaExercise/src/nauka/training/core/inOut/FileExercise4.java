package nauka.training.core.inOut;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class FileExercise4 {

    public static void main(String[] args) throws IOException {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj lokalizacje pliku: ");
        String fileName = skaner.next();
        DataInputStream inputStream = null;
        int day,month,year;
        try {
            inputStream = new DataInputStream(new FileInputStream(fileName));
            day = inputStream.readInt();
            month = inputStream.readInt();
            year = inputStream.readInt();
            System.out.format("Twoja data urodzenia to: %s.%s.%sr.", day, month, year);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
        if (inputStream != null) {
            inputStream.close();
        }
    }
    }
}
