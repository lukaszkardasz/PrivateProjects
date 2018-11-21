package nauka.training.core.inOut;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class FileExerciseEx3 {

    public static void main(String[] args) throws IOException {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj lokalizacje i nazwe pliku: ");
        String fileName = skaner.next();
        DataOutputStream dataStream = null;
        System.out.println("Podaj swoją datę urodzenia: ");
        System.out.println("Podaj dzień: ");
        int day = skaner.nextInt();
        System.out.println("Podaj miesiac: ");
        int month = skaner.nextInt();
        System.out.println("Podaj rok: ");
        int year = skaner.nextInt();

        try {
            dataStream = new DataOutputStream(new FileOutputStream(fileName));
            dataStream.writeInt(day);
            dataStream.writeInt(month);
            dataStream.writeInt(year);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
        if (dataStream != null){
            dataStream.close();
        }
    }

    }
}
