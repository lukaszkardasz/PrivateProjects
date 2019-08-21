package javastart_exercises.barman;

public class Drink {
    Ingredient firstIngridient;
    Ingredient secondIngridient;
    Ingredient thirdIngridient;

    public Drink(Ingredient firstIngridient, Ingredient secondIngridient, Ingredient thirdIngridient) {
        this.firstIngridient = firstIngridient;
        this.secondIngridient = secondIngridient;
        this.thirdIngridient = thirdIngridient;
    }

    public Ingredient getFirstIngridient() {
        return firstIngridient;
    }

    public void setFirstIngridient(Ingredient firstIngridient) {
        this.firstIngridient = firstIngridient;
    }

    public Ingredient getSecondIngridient() {
        return secondIngridient;
    }

    public void setSecondIngridient(Ingredient secondIngridient) {
        this.secondIngridient = secondIngridient;
    }

    public Ingredient getThirdIngridient() {
        return thirdIngridient;
    }

    public void setThirdIngridient(Ingredient thirdIngridient) {
        this.thirdIngridient = thirdIngridient;
    }


}
