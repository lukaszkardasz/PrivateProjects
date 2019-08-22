package javastart_exercises.arguments_to_program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Arguments {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Brak argumentów!");
            return;
        }
        System.out.println("Liczba przekazanych liczb: " + args.length);
        printArgs(args);
        printSquares(args);
        printSum(args);
    }

    private static void printArgs(String[] args) {
        System.out.print("Przekazane liczby: ");
        for (String argument : args) {
            System.out.print(argument + " ");
        }
        System.out.println();
    }

    private static void printSquares(String[] args) {
        System.out.print("Kwadraty przekazanych liczb: ");
        Arrays.stream(args).map(Integer::valueOf).map(x -> x * x).forEach(x -> System.out.printf("%d ", x));
        System.out.println();
    }

    private static void printSum(String[] args) {
        System.out.print("Suma przekazanych liczb: ");
        List<Integer> ints = Arrays.stream(args).map(Integer::valueOf).collect(Collectors.toCollection(ArrayList::new));
        List<String> stringList = new ArrayList<>(ints.size());
        int sum = 0;
        for (int number : ints) {
            stringList.add(Integer.toString(number));
            sum += number;
        }
        String leftSideSum = String.join(" + ", args);
        System.out.printf("%s = %d", leftSideSum, sum);
    }
}
