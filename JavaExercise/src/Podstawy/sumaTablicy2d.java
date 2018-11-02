package Podstawy;


public class sumaTablicy2d {





    public static void main(String[] args) {

    int[][] tablica = new int[][] {{1,5,7,9,11,76,166},{1,3,4,12,43,-12,177777}};
        System.out.println(suma(tablica));
    }

    private static int suma(int[][] tablica) {
        int sum = 0;
        for (int[] i : tablica) {
            for (int j:i) {
                sum += j;
            }
        }
        return sum;
    }


}
