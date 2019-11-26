package nauka.Podstawy.MethodsExercise;

import java.util.Calendar;

public class Funkcje {

    public static void main(String[] args) {
        System.out.println(getMyAge());
        System.out.println(getName());
        printMathEquationResults(5,3);
        System.out.println(isEven(6));
        System.out.println(canBeDividedBy3and5(15));
        System.out.println(powTo3(2));
        System.out.println(square(81));
        System.out.println(canBuildRectangularTriangle(3,4,5));

    }

    private static boolean canBuildRectangularTriangle(int a, int b, int c) {
        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
    }


    private static int getMyAge(){
        return 33;
    }

    private static String getName(){
        return "Lukasz";
    }

    private static void printMathEquationResults(double arg1, double arg2){
        System.out.println(arg1 + arg2);
        System.out.println(arg1 - arg2);
        System.out.println(arg1 * arg2);
    }

    private static boolean isEven(int arg){
        return arg % 2 == 0;
    }

    private static boolean canBeDividedBy3and5(int number) {
        return number % 3 == 0 && number % 5 == 0;
    }

    private static double powTo3(double number){
        return Math.pow(number, 3);
    }

    private static int square(int number){
        return (int) Math.sqrt(number);
    }



}
