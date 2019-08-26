package javastart_exercises.barman;

import java.util.Arrays;

public class Drink {

    Ingredient[] ingredients;

    public Drink(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }
}
