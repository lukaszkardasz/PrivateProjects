package javastart_exercises.geometric_figures;

/**
 * @author n2god on 23/08/2019
 * @project PrivateProjects
 */
public class Calculator {

    public static double lineLength(Point start, Point end) {
        double xPow = Math.pow(end.getA() - start.getA(), 2);
        double yPow = Math.pow(end.getB() - start.getB(), 2);
        double xyPowSum = xPow + yPow;
        return Math.sqrt(xyPowSum);
    }

    public static double calculateArea(Rectangle rectangle) {
        Point a = rectangle.getA();
        Point b = rectangle.getB();
        Point c = rectangle.getC();
        Point d = rectangle.getD();
        double sideA = lineLength(a, b);
        double sideB = lineLength(a, d);
        return sideA * sideB;
    }

    public static double calculateArea(Circle circle) {
        double field = 0;
        field = Math.PI * Math.pow(circle.getR(), 2);
        return field;
    }

    public static boolean isPointInsideCircle(Circle circle, Point point) {
        double a = point.getA();
        double b = point.getB();

        double centerA = circle.getCenter().getA();
        double centerB = circle.getCenter().getB();
        double result = Math.pow((centerA - a), 2) + Math.pow((centerB - b),2);
        double radiusPow = Math.pow(circle.getR(), 2);
        return result<=radiusPow;
    }
}
