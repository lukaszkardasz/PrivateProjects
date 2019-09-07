package javastart_exercises.air_conditioner;

public class BuildingController {
    private Building building;

    public BuildingController(Building building) {
        this.building = building;
    }



    public void temperatureShowLoop(){
        while(!building.areAllRoomsCool()){
            System.out.println(building);
            building.enableAirConditioner();
            sleepOneSecond();
        }
        System.out.println("Wszystkie pomieszczenia s¹ sch³odzone!");
    }

    private void sleepOneSecond() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
