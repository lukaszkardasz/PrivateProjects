package nauka.exercise.ExceptionExercise.CalculatorExerciseWithExceptions;

public class UnknownOperatorException extends RuntimeException {
    public UnknownOperatorException(String message) {
        super(message);
    }
}
