package javastart_exercises.geometric_figures;

/**
 * @author n2god on 23/08/2019
 * @project PrivateProjects
 */
public class Point {
    private double a;
    private double b;

    public Point(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Point[" + a +", " + b +"]";
    }
}
