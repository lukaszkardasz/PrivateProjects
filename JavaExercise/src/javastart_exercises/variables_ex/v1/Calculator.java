package javastart_exercises.variables_ex.v1;

/**
 * @author n2god on 18/08/2019
 * @project PrivateProjects
 */
public class Calculator {
    private double a;
    private double b;
    private double c;


    public Calculator(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void add (){
        double sum = a + b + c;

        System.out.printf("%.2f + %.2f + %.2f = %.2f", a, b, c, sum);
    }

    public void multiplicate() {
       double multi=a*b*c;
        System.out.printf("%.2f * %.2f * %.2f = %.2f", a, b, c, multi);


    }
}
