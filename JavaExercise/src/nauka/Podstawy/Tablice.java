package nauka.Podstawy;

public class Tablice {

    public static int biggest(int[] tablica) {

        int max = tablica[0];
        if (tablica[1] > max) max = tablica[1];
        if (tablica[2] > max) max = tablica[2];
        return max;
    }

    public static int biggestWithoutIf(int[] tablica){
        return Math.max(tablica[0], Math.max(tablica[1], tablica[2]));
    }

    public static void main(String[] args) {
        int tablica[] = {12,15,166};
        System.out.println(biggest(tablica));
        System.out.println(biggestWithoutIf(tablica));
    }

}