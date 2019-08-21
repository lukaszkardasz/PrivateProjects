package javastart_exercises.barman;

public class BarmanTest {
    public static void main(String[] args) {
        Drink mohito = Barman.createDrink("lime juice", 20,
                "rum", 80,
                "sugar syrup", 40);
        Barman.printDrink(mohito);
    }
}
