package training;

import java.util.Arrays;
import java.util.Scanner;

class MoneyChange {

    public static final double[] nominals = {200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
    public static int[] nominalsCount = new int[nominals.length];

    public static void main(String[] args) {
        Arrays.fill(nominalsCount, 0);
        Scanner kasa = new Scanner(System.in);
        double kwota = Double.parseDouble( kasa.next().replace(',','.'));
        count(kwota);
    }

    private static void count(double kwota) {

        for (int i = 0; i < nominals.length; i++){
            nominalsCount[i] = (int) Math.floor((kwota / nominals[i]));
            kwota = kwota - nominals[i];
        }
        System.out.println(Arrays.toString(nominalsCount));
    }
}