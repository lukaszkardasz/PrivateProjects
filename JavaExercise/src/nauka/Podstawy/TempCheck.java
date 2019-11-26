package nauka.Podstawy;

public class TempCheck {

    public static void main(String[] args) {

        int tempPositive = 10;
        int tempNegative = -10;

        tempCheck(tempPositive);
        tempCheck(tempNegative);
    }



    static boolean tempCheck(int temp){
        boolean isPositive = temp > 0;

        if (isPositive){
            System.out.println("Temperatura " + temp + " jest dodatnia.");
        } else {
            System.out.println("Temperatura " + temp + " jest ujemna.");
        }
        return isPositive;
    }
}
