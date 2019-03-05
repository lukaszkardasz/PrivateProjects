package nauka.Podstawy;

public class DefaultClassExercise {

    public static void main(String[] args) {




    }

}

interface Formula{
    double calculate (int a);

    default double sqrt(int a){
        return Math.sqrt(a);
    }
}

class A implements Formula{
    @Override
    public double calculate(int a) {
       return this.sqrt(a * 5);
    }
}