package nauka.lambdaExercise.lambda_exercise;

import java.util.function.BiConsumer;

/**
 * @author n2god on 03/11/2019
 * @project PrivateProjects
 */
public class BiConsumerExercise {



    public static void main(String[] args) {

        BiConsumer<Double, Double> biConsumer0 = (x, y) -> {
            System.out.println("Dodawanie: " + (x + y));
        };

        BiConsumer<Double, Double> biConsumer1 = (x, y) -> {
            System.out.println("Odejmowanie: " + (x - y));
        };

        BiConsumer<Double, Double> biConsumer2 = (x, y) -> {
            System.out.println("Mnożenie: " + (x * y));
        };

        BiConsumer<Double, Double> biConsumer3 = (x, y) -> {
            System.out.println("Dzielenie: " + (x / y));
        };


        biConsumer0
                .andThen(biConsumer1)
                .andThen(biConsumer2)
                .andThen(biConsumer3)
                .accept(5.0, 2.0);
    }
}
