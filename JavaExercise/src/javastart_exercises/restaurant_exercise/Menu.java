package javastart_exercises.restaurant_exercise;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author n2god on 23/09/2019
 * @project PrivateProjects
 */
class Menu {
    public final static List<Dish> MENU_LIST = List.of(
            new Dish(1, "Pizza Margherita", 24.99),
            new Dish(2, "Pizza Mafioso", 29.99),
            new Dish(3, "Spaghetti Bolognese", 31.99),
            new Dish(4, "Spaghetti Carbonara", 26.99),
            new Dish(5, "Lasagne", 24.99),
            new Dish(6, "Gazpacho", 16.99),
            new Dish(7, "Cannelloni ze szpinakiem", 29.99),
            new Dish(8, "Bruschetta", 13.99),
            new Dish(9, "Tiramisu", 19.99),
            new Dish(10, "Panna Cotta", 19.99)
    );

    public static List<Dish> convertIdToDishes(List<Integer> ids){
        return ids.stream()
                .map(id -> MENU_LIST.get(id - 1))
                .collect(Collectors.toList());
    }
}
