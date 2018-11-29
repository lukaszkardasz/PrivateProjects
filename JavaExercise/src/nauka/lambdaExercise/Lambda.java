package nauka.lambdaExercise;

public class Lambda {

    public static void main(String[] args) {

        ObliczInterface dodaj = (a,b) -> a+b;
        ObliczInterface odejmij = (a,b) -> a-b;

        System.out.println(dodaj.oblicz(2,2));
        System.out.println(odejmij.oblicz(5,2));


    }
}
