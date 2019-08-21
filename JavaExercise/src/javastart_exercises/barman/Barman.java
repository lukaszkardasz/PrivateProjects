package javastart_exercises.barman;

public class Barman {

    public static Drink createDrink(String ingridient1, double amount1,
                             String ingridient2, double amount2,
                             String ingridient3, double amount3) {
        Ingredient firstIngridient = new Ingredient(ingridient1, amount1);
        Ingredient secondIngridient = new Ingredient(ingridient2, amount2);
        Ingredient thirdIngridient = new Ingredient(ingridient3, amount3);



        return new Drink(firstIngridient, secondIngridient, thirdIngridient);
    }

    public static void printDrink(Drink drink){
        double quantity1 = drink.getFirstIngridient().getQuantity();
        double quantity2 = drink.getSecondIngridient().getQuantity();
        double quantity3 = drink.getThirdIngridient().getQuantity();
        double ingridientSum = quantity1 + quantity2 + quantity3;

        String name1 = drink.getFirstIngridient().getName();
        String name2 = drink.getSecondIngridient().getName();
        String name3 = drink.getThirdIngridient().getName();
        System.out.printf("Sk³adniki drinka to %s, %s, %s" +
                        "w proporcjach %.2f, %.2f, %.2f," +
                        "jego pojemnoœæ to %.0fml.\n",
                name1, name2, name3, quantity1, quantity2, quantity3, ingridientSum);
    }
}
