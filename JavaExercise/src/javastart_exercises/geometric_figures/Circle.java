package javastart_exercises.geometric_figures;

/**
 * @author n2god on 23/08/2019
 * @project PrivateProjects
 */
public class Circle {
    private double r;
    private Point center;

    public Circle(double r, Point center) {
        this.r = r;
        this.center = center;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "\nr=" + r +
                "\n, center=" + center.toString() +
                '}';
    }
}
