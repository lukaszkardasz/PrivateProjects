package javastart_exercises.lotery_statistics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LotteryFileReader {

    List<Result> readResultsFromFile(String fileName) throws FileNotFoundException {
        List<Result> results = new ArrayList<>();
        Scanner sc = new Scanner(new File(fileName));
        sc.nextLine(); //pominięcie nagłówka
        while(sc.hasNextLine()){
            String csvLine = sc.nextLine();

        }
    }

}
