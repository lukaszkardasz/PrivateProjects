package Podstawy;

public class sredniaZtablicy2d {



    public static void main(String[] args) {
        int[][] tablica2d = new int[][]{{2,4,5,4,5,3,5,5,5,5,5,},{1,4,5,5,6,6,6},{3,2,3,4,6,6,6,6}};
        System.out.println(sredniaOcen(tablica2d));
        System.out.println(sredniaOcen(tablica2d)/liczbaOcen(tablica2d));
    }


    private static int sredniaOcen(int[][] tablica2d) {
        int suma = 0;
        for ( int[] przedmiot : tablica2d) {
            for (int ocena : przedmiot) {
                suma += ocena;
            }
        }
        return suma;
    }

    private static int liczbaOcen(int[][] tablica2d) {
        int liczbaOcen = 0;
        for ( int[] przedmiot : tablica2d) {
            for (int ocena : przedmiot) {
                liczbaOcen ++;
            }
        }
        return liczbaOcen;
    }


}
