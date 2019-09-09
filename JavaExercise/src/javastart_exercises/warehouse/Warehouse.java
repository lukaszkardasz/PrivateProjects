package javastart_exercises.warehouse;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Warehouse {
    public static void main(String[] args) {
        String filename = getFilename();
        List<String> allLines = readFile(filename);

        Map<String, String> map = allLines
                .stream()
                .map(s -> s.split(";"))
                .collect(Collectors.toMap());

        String content = map.entrySet()
                .stream()
                .map(e -> e.getKey() + "=\"" + e.getValue() + "\"")
                .collect(Collectors.joining(", "));

        System.out.println(content);


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
