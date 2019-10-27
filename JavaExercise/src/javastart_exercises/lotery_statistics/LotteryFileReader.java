package javastart_exercises.lotery_statistics;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LotteryFileReader {

    /*List<Result> readResultsFromFile(String fileName) throws FileNotFoundException {
        List<Result> results = new ArrayList<>();
        Scanner sc = new Scanner(new File(fileName));
        sc.nextLine(); //pominięcie nagłówka
        while(sc.hasNextLine()){
            String csvLine = sc.nextLine();
            Result result = Result.fromCsv(csvLine);
            results.add(result);
        }
        return results;
    }*/

    List<Result> readResultsFromCsvFile(String fileName) throws IOException {
        List<Result> results = new ArrayList<>();
        var fileReader = new FileReader(fileName);
        var bufferedReader = new BufferedReader(fileReader);
        bufferedReader.readLine(); //pomijamy nagłówek pliku
        return bufferedReader.lines()
                .map(Result::fromCsv)
                .collect(Collectors.toList());
    }
}
