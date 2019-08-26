package javastart_exercises.barman;

import java.util.Scanner;

public class Barman {
    private static Scanner scanner = new Scanner(System.in);

    public static Drink addIngridients() {

        System.out.print("Podaj liczbê drinków: ");
        int ingNumber = scanner.nextInt();
        scanner.nextLine();
        Ingredient[] ingridientsTable = new Ingredient[ingNumber];
        for (int i = 0; i < ingridientsTable.length; i++) {
            //TODO refactor and extract method
            System.out.println("Podaj nazwê " + (i + 1) + " sk³adnika: ");
            String ingridientName = scanner.nextLine();
            System.out.println("Podaj iloœæ " + (i + 1) + " sk³adnika: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();
            ingridientsTable[i] = new Ingredient(ingridientName, amount);
        }
        return new Drink(ingridientsTable);
    }


    public static void printDrink(Drink drink){
        System.out.println("Drink sk³ada siê z " + drink.ingredients.length + " sk³adników:");
        for (Ingredient ingredient : drink.ingredients) {
            System.out.printf("- %s (%.0f)\n", ingredient.getName(), ingredient.getQuantity());
        }
    }
}
