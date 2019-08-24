package javastart_exercises.geometric_figures;

/**
 * @author n2god on 23/08/2019
 * @project PrivateProjects
 */
class CalculatorTest {
    public static void main(String[] args) {
        Point a = new Point(2.5, 2.5);
        Point b = new Point(5, 2.5);
        Point c = new Point(5, 12);
        Point d = new Point(2.5, 12);

        Rectangle prostokat = new Rectangle(a,b,c,d);
        double area = ShapeCalculator.calculateArea(prostokat);
        System.out.println("Pole powierzchni " + prostokat.toString() + "to: " + area);

        Point center = new Point (0,1);
        Circle kolko = new Circle(5, center);
        Point pointOk = new Point(3,3);
        Point pointNotOk = new Point(12,44);

        boolean pointInsideCircleOk = ShapeCalculator.isPointInsideCircle(kolko, pointOk);
        boolean pointInsideCircleNotOk = ShapeCalculator.isPointInsideCircle(kolko, pointNotOk);

        System.out.println("Pierwszy punkt leży w okręgu: " + pointInsideCircleOk);
        System.out.println("Drugi punkt leży w okręgu: " + pointInsideCircleNotOk);
    }
}
