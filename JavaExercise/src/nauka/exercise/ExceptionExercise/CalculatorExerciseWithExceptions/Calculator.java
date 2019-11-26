package nauka.exercise.ExceptionExercise.CalculatorExerciseWithExceptions;

public class Calculator {

    public static final String PLUS = "+";
    public static final String MINUS = "-";
    public static final String MULTIPLY = "*";
    public static final String DIVIDE = "/";

    public double calculate(double firstNumber, double secondNumber, String operator) {
        double result = 0;

        switch (operator) {
            case PLUS:
                result = firstNumber + secondNumber;
                break;
            case MINUS:
                result = firstNumber - secondNumber;
                break;
            case MULTIPLY:
                result = firstNumber * secondNumber;
                break;
            case DIVIDE:
                if (secondNumber == 0) {
                    result = firstNumber / secondNumber;
                } else {
                    throw new ArithmeticException("Nie mo¿na dzieliæ przez zero!");
                }
                break;
             default:
                throw new UnknownOperatorException("Nieznany operator");
        }
        return result;
    }


}
