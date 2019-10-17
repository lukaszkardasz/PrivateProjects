package javastart_exercises.files_line_counter;

import java.io.*;
import java.util.Scanner;

public class FileLineCounter {
    private String path;
    private int totalCounter;

    public static void main(String[] args) {

        try {
            new FileLineCounter().run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void run() throws IOException {
        System.out.print("Podaj ścieżkę do folderu który ma zostać przeskanowany: ");

        Scanner scanner = new Scanner(System.in);
        String directoryLocation = scanner.nextLine();

        File dir = new File(directoryLocation);
        if (dir.exists()){
            path = directoryLocation;
            processDirectory(dir);
            System.out.println("W sumie folder " + path + " ma " + totalCounter + " linii.");
        } else {
            System.out.println("Wskazany folder nie istnieje!");
        }
    }

    private void processDirectory(File dir) throws IOException {
        for (File file : dir.listFiles()) {
            if(file.isDirectory()){
                processDirectory(file);
            } else {
                int lines = countLinesForFile(file);
                totalCounter += lines;

                String replacedName = file.getAbsolutePath().replace(path, "");
                System.out.println(replacedName + " --> " + lines);
            }
        }
    }

    private static int countLinesForFile(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        int counter = 0;
        while (br.readLine() != null){
            counter++;
        }
        return counter;
    }
}
