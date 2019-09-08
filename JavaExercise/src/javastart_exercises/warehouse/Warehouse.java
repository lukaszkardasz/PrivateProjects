package javastart_exercises.warehouse;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Warehouse {
    public static void main(String[] args) {
        System.out.println("Podaj nazwê pliku: ");
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        List<String> allLines = new ArrayList<>();
        File file = new File(filename);

        try {
            allLines = Files.readAllLines(Paths.get(filename));
        } catch (IOException e) {
            System.err.println("No such file " + filename);
            allLines = new ArrayList<>();
        }

    }
}
