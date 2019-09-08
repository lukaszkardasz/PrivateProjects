package javastart_exercises.warehouse;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Warehouse {
    public static void main(String[] args) {
        String filename = getFilename();
        List<String> allLines = readFile(filename);

        Map<String, Integer> map = allLines.stream()
                .map(s -> s.split(";"))
                .collect(Collectors.groupingBy(Map.Entry::getKey,
                        Collectors.mapping(Map.Entry::getValue,
                                Collectors.toList())));




    }

    private static String getFilename() {
        System.out.println("Podaj nazwê pliku: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static List<String> readFile(String filename){
        try {
            return Files.readAllLines(Paths.get(filename));
        } catch (IOException e) {
            System.err.println("No such file " + filename);
        }
        return new ArrayList<>();
    }
}
