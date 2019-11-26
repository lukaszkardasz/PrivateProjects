package nauka.lambdaExercise.lambda_exercise;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author n2god on 03/11/2019
 * @project PrivateProjects
 */
public class BiFunctionExercise {





    public static void main(String[] args) {

        BiFunction<Double, Double, Double> biFunction = (x, y) -> {
            return x + y;
        };

        Function<Double, Double> function = x -> x * Math.PI;

        System.out.println(biFunction.andThen(function).apply(1.0, 1.0));
    }

}
