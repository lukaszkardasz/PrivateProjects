package nauka.exercise.ExceptionExercise.CalculatorExerciseWithExceptions;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        double firstNumber = 0;
        double secondNumber = 0;
        double result = 0;
        String operator = null;

        boolean readComplete = false;

        while (!readComplete){
            try {
                System.out.println("Podaj pierwsz¹ liczbê: ");
                firstNumber = input.nextDouble();
                input.nextLine();

                System.out.println("Podaj operator arytmetyczny ");
                operator = input.nextLine();
//                input.nextLine();

                System.out.println("Podaj drug¹ liczbê: ");
                secondNumber = input.nextDouble();
                input.nextLine();
                readComplete = true;
            } catch (InputMismatchException ex){
                ex.printStackTrace();
                System.err.println("Wprowadzono niepoprawne dane");
                input.nextLine();
            }
        }
        Calculator calc = new Calculator();
        boolean calculationComplete = false;
        try{
            result = calc.calculate(firstNumber, secondNumber, operator);
            calculationComplete = true;
        } catch (ArithmeticException | UnknownOperatorException ex) {
             System.err.println(ex.getMessage());
        }

        if (calculationComplete){
            System.out.printf("%f + %f = %f", firstNumber, secondNumber, result);
        } else {
            System.out.printf("Nie uda³o siê zakoñczyæ obliczeñ %f + %f = %f", firstNumber, secondNumber, result);
        }




    }

}
