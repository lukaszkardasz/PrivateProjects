package nauka.Podstawy;

import java.util.ArrayList;
import java.util.Random;

class Totek {

    public static int[] losuj (int iloscLiczb, int zakres){
        Random crazy = new Random();
        ArrayList<Integer> pula = new ArrayList<Integer>(zakres);
        int[] wylosowane = new int[iloscLiczb];

        for (int i = 1; i <= zakres; i++) pula.add(i);
        int counter = zakres;
        for (int j = 0; j < iloscLiczb; j++) {
            int index = crazy.nextInt(counter);
            wylosowane[j] = pula.get(index);
            pula.remove(index);
            counter--;
        }
        return wylosowane;
    }
}
