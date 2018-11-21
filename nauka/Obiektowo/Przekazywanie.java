package nauka.Obiektowo;

public class Przekazywanie {
    
    public static void podwojenie (int[] x){
        for (int i = 0; i<x.length; i++){
            x[i] = x[i] * 2;
        }

        /*for (int i : x) {
            System.out.println(i);
        }*/
    }

    public static void main(String[] args) {
        int[] x = new int[1]; //tworzymy tablicę 1 elementową
        x[0] = 10;
        System.out.println("Wartość przed podwojeniem: " + x[0]);
        podwojenie(x);
        System.out.println("Wartość po podwojeniu: " + x[0]);
    }

}
