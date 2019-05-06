package nauka.training.Threads.kolejka;

import java.io.File;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) {
        BlockingQueue<File> kolejkaBlokujaca = new ArrayBlockingQueue<File>(5);

        new Thread(new PoszukiwaczSciezek(kolejkaBlokujaca, sciezkaGlowna)).start();

        for (int i = 0; i < 50; i++)
            new Thread(new PrzeszukiwaczPlikow(kolejkaBlokujaca, slowoSzukane)).start();
    }

    final static private File sciezkaGlowna = new File(System.getProperty("user.dir"));
    final static private String slowoSzukane = "informatyka";

}
