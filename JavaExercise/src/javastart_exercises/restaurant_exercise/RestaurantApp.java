package javastart_exercises.restaurant_exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author n2god on 23/09/2019
 * @project PrivateProjects
 */
public class RestaurantApp {
    public static void main(String[] args) {
        greetings();
        Order order = takeOrder();
        printSummary(order);
    }

    private static void printSummary(Order order) {
        String summary = order.toString();
        System.out.println(summary);
    }

    private static Order takeOrder() {
        List<Integer> dishesIds = getDishesNumbers();
        List<Dish> dishes = Menu.convertIdToDishes(dishesIds);
        return new Order(dishes);
    }

    private static List<Integer> getDishesNumbers() {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] split = line.replace(" ","").split(",");


        return Arrays.stream(split)
                .map(Integer::valueOf)
                .collect(Collectors.toList());
    }

    private static void greetings() {
        System.out.println("Witaj w naszej restauracji:\n Dzisiejsze menu:");
        Menu.MENU_LIST.stream().forEach(System.out::println);
        System.out.println("Zamów wybrane potrawy, wymieniając ich numery po przecinku:\n");
    }
}
