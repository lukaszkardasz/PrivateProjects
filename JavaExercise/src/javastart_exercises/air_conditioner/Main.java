package javastart_exercises.air_conditioner;

public class Main {
    public static void main(String[] args) {
        Building building = new Building(5);
        BuildingController bc = new BuildingController(building);
        bc.temperatureShowLoop();
    }
}
