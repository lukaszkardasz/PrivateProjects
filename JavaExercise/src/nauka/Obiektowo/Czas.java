package nauka.Obiektowo;

/*liczymy czas wykonywania czasochłonnego kodu*/

public class Czas {
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();

        for (int i=0; i<1E7; i++){
            double x = Math.pow(Math.random(),Math.random());
        }

        long t2 = System.currentTimeMillis();
        System.out.println((t2-t1)/1000.0);
    }
}
