package nauka.Obiektowo;

import java.util.Scanner;

public class TestRownania {

    public static void main(String[] args) {
        System.out.println("Podaj parametry równania a, b i c:");
        Scanner skaner = new Scanner(System.in);
        int a = skaner.nextInt();
        int b = skaner.nextInt();
        int c = skaner.nextInt();
        RownanieKwadratowe r = new RownanieKwadratowe(a,b,c);
        System.out.println(r.rozwiaz());
        System.out.println(r);
        r.setA(100);
        r.setB(-20);
        r.setC(100);
        System.out.println(r.rozwiaz());
        System.out.println(r);


    }
}
