package nauka.lambdaExercise.lambda_exercise;

import java.util.function.BinaryOperator;

/**
 * @author n2god on 03/11/2019
 * @project PrivateProjects
 */
public class BinaryOperatorExercise {

    public static void main(String[] args) {
        BinaryOperator<Double> binaryOperator = (x, y) -> x * y;
        System.out.println(binaryOperator.apply(4.0, 5.0));

        BinaryOperator<Integer> binaryOperatorByMin = BinaryOperator.minBy(Integer::compareTo);
        System.out.println(binaryOperatorByMin.apply(5,7));

        BinaryOperator<Integer> binaryOperatorByMax = BinaryOperator.maxBy(Integer::compareTo);
        System.out.println(binaryOperatorByMax.apply(4, 12));

    }
}

