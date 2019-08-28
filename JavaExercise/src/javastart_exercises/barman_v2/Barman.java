package javastart_exercises.barman_v2;

import java.util.Scanner;

public class Barman {
    private static Scanner scanner = new Scanner(System.in);

    public static Drink addIngridients() {

        System.out.print("Podaj liczb� drink�w: ");
        int ingNumber = scanner.nextInt();
        scanner.nextLine();
        Ingredient[] ingridientsTable = new Ingredient[ingNumber];
        for (int i = 0; i < ingridientsTable.length; i++) {
            ingridientsTable[i] = getIngredient(i);
        }
        return new Drink(ingridientsTable);
    }

    public static Ingredient getIngredient(int i) {
        System.out.println("Podaj nazw� " + (i + 1) + " sk�adnika: ");
        String ingridientName = scanner.nextLine();
        System.out.println("Podaj ilo�� " + (i + 1) + " sk�adnika: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        return new Ingredient(ingridientName, amount);
    }


    public static void printDrink(Drink drink){
        System.out.println("Drink sk�ada si� z " + drink.ingredients.length + " sk�adnik�w:");
        for (Ingredient ingredient : drink.ingredients) {
            System.out.printf("- %s (%.0f)\n", ingredient.getName(), ingredient.getQuantity());
        }
    }
}
