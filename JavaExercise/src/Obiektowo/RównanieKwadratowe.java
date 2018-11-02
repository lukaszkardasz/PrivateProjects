package Obiektowo;

public class RównanieKwadratowe {

    private int a;
    private int b;
    private int c;


    public RównanieKwadratowe(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String  rozwiaz(){

        String rozwiazanie = "";
        double delta = b*b-4*a*c;

        if (delta > 0)
        {
            delta = Math.sqrt(delta);
            double x1 = (-b - delta)/(2*a);
            double x2 = (-b + delta)/(2*a);
            rozwiazanie = "Pierwiastki równania to: " + x1 + " oraz " + x2;
        } else if (delta == 0)
        {
            double x0 = -b/(2*a);
            rozwiazanie = "Pierwiastek podwojny rownania to: " + x0;
        } else if (delta <0)
        {
            rozwiazanie = "Nie ma piperwiastków";
        }
        return rozwiazanie;
    }

    @Override
    public String toString() {
        return "Równanie kwadratowe: " + a + "x^2"+ b + "x + " + c ;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public static void main(String[] args) {
        RównanieKwadratowe równanie = new RównanieKwadratowe(1,4,1);
        System.out.println(równanie.rozwiaz());
    }

}
