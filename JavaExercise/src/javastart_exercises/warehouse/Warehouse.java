package javastart_exercises.warehouse;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Warehouse {
    public static void main(String[] args) {
        String filename = getFilename();
        Map<String, Integer> map = readProductsFromList(filename);

        map.

    }

    private static Map<String, Integer> readProductsFromList(String filename){
        List<String> allLines = readFileToList(filename);
        Map<String, Integer> result = new HashMap<>();
        for (String line : allLines) {
            String[] elements = line.split(";");
            result.put(elements[0],Integer.valueOf(elements[1]));
        }
        return result;
    }

    private static String getFilename() {
        System.out.println("Podaj nazw� pliku: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    //2400

    private static List<String> readFileToList(String filename){
        try {
            return Files.readAllLines(Paths.get(filename));
        } catch (IOException e) {
            System.err.println("No such file " + filename);
        }
        return new ArrayList<>();
    }
}
