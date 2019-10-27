package javastart_exercises.lotery_statistics;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class LotteryApp {
    public static void main(String[] args) {
        var lotteryFileReader = new LotteryFileReader();
        try {
            List<Result> results = lotteryFileReader
                    .readResultsFromCsvFile("d:/Lottery_Mega_Millions_Winning_Numbers__Beginning_2002.csv");
            System.out.println("10 najpopularniejszych liczb: ");
            LotteryStats.mostPopularNumbers(results)
                    .limit(100)
                    .forEach(System.out::println);
            System.out.println("3 najpopularniejsze liczby MegaBall: ");
            LotteryStats.mostPopularMegaBall(results)
                    .limit(3)
                    .forEach(System.out::println);

        } catch (IOException e) {
            System.err.println("Niepoprawna ścieżka do pliku!");
        }
    }
}
