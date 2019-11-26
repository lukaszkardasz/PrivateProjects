package nauka.training.Threads.kolejka;

import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import java.util.concurrent.BlockingQueue;

public class PrzeszukiwaczPlikow implements Runnable {

    BlockingQueue<File> kolejka;
    String szukaneSlowo;

    public PrzeszukiwaczPlikow(BlockingQueue<File> kolejka, String szukaneSlowo) {
        this.kolejka = kolejka;
        this.szukaneSlowo = szukaneSlowo;
    }

    public void run() {
        boolean skonczone = false;
        while (!skonczone) {
            try {
                File przeszukiwanyPlik = kolejka.take();
                if (przeszukiwanyPlik.equals(new File("pusty"))) {
                    kolejka.put(przeszukiwanyPlik);
                    skonczone = true;
                } else
                    szukajSlowa(przeszukiwanyPlik);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void szukajSlowa(File przeszukiwanyPlik) throws FileNotFoundException {
        Scanner reader = new Scanner(new BufferedReader(new FileReader(przeszukiwanyPlik)));

        int numerLini = 0;

        while (reader.hasNextLine()) {
            numerLini++;

            if (reader.nextLine().contains(szukaneSlowo))
                System.out.println("Szukane slowo znajduje sie w pliku: " + przeszukiwanyPlik.getPath() + " w lini " + numerLini);
        }


        reader.close();
    }
}
