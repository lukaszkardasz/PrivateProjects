package javastart_exercises.cabrio;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Wo�ga", "KK");
        System.out.println(car);
        car.setRoofOpened(true);
        System.out.println(car);
        car.setMoving(true);
        System.out.println(car);

    }
}
