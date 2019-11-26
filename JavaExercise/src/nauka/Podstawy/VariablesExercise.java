package nauka.Podstawy;

import java.util.Random;

public class VariablesExercise {

    public static void main(String[] args) {

        Random rand = new Random();


        final int x = rand.nextInt(100);
        final int y = rand.nextInt(100);

        System.out.println("Czy " + x + " jest wiêksze od " + y + "? " + (x > y));
        System.out.println("Czy " + x + " pomno¿one przez 2 jest wiêksze od " + y + " ? " + (x * 2 > y));
        System.out.println("Czy " + y + " jest mniejsze od sumy " + x + " + 3 i jednoczeœnie wiêksze od " + x + " pomniejszonego o 2? "
                + (y < (x + 3) && y > (x - 2)));
        System.out.println("Czy iloczyn liczb " + x + " i " + y + " jest parzysty? " + ((x * y) % 2 == 0));


    }

}
