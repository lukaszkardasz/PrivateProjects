package javastart_exercises.files_line_counter;

import java.io.*;
import java.util.Objects;
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

    private String run() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj ścieżkę do folderu który ma zostać przeskanowany: ");
        String directoryPath = scanner.nextLine();

        System.out.println("Podaj ścieżkę do umieszczenia pliku XML: ");
        String resultPath = scanner.nextLine();

        File dir = new File(directoryPath);
        if (dir.exists()){
            path = directoryPath;
            processDirectory(dir);
            System.out.println("W sumie folder " + path + " ma " + totalCounter + " linii.");
        } else {
            System.out.println("Wskazany folder nie istnieje!");
        }

        String xmlFilename = resultPath + File.separator + "LineCounter.xml";
        File resultFile = new File(xmlFilename);
        if (!resultFile.exists()){
            try {
                resultFile.createNewFile();
                System.out.println(xmlFilename);
            } catch (IOException e) {
                System.out.println("Nie udało się utworzyć pliku, ścieżka: " + xmlFilename + " jest nieprawidłowa!");
            }
        } else {
            System.out.println("Plik " + resultFile.getAbsolutePath() + " już istnieje.");
        }
        scanner.close();
        return xmlFilename;
    }

    private void processDirectory(File dir) throws IOException {
        for (File file : Objects.requireNonNull(dir.listFiles())) {
            if(file.isDirectory()){
                processDirectory(file);
            } else {
                int lines = countLinesForFile(file);
                totalCounter += lines;

                String replacedName = file.getAbsolutePath().replace(path, "");

                //System.out.println(replacedName + " --> " + lines);
                //TODO dodać implementację dodawania do XML nazwy pliku, folderu i liczby plików
                //problem w tym, że do metody rekurencyjnej nie mogę dodać ko0lejnego parametru, z nazwą podawanego pliku
                //nie mogę tego zrobić statycznie
/*                try (
                        var fileWriter = new FileWriter(xmlFilename);
                        var writer = new BufferedWriter(fileWriter);
                ) {
                    writer.write("Bolek");
                    writer.newLine();
                    writer.write("Lolek");
                    writer.newLine();
                    writer.write("Karolek");
                } catch (IOException e) {
                    System.err.println("Nie udało się zapisać pliku " + fileName);
                }*/

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
