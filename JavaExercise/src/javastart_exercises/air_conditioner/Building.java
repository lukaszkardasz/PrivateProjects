package javastart_exercises.air_conditioner;

import java.util.Arrays;
import java.util.Random;

public class Building {
    private Room[] rooms;

    public Building(int numberOfRooms) {
        rooms = new Room[numberOfRooms];
        generateRooms();
    }

    private void generateRooms() {
        Random random = new Random();
        for (int i = 0; i < rooms.length; i++) {
            int currentTemperature = 20 + random.nextInt(15);
            int targetTemperature = currentTemperature - random.nextInt(15);
            int cubature = 20 + random.nextInt(30);
            AirConditioner airConditioner = getRandomAirConditioner();
            rooms[i] = new Room((i + 1), currentTemperature, targetTemperature, cubature, airConditioner, true);
        }
    }

    private AirConditioner getRandomAirConditioner() {
        Random random = new Random();
        double value = random.nextDouble();
        if (value > 0.5) {
            return new BasicAirConditioner();
        } else if (value < 0.5) {
            return new AdvancedAirConditioner();
        }

        return null;
    }

    public boolean areAllRoomsCool() {
        for (Room room : rooms) {
            if (room.getCurrentTemperature() >= room.getTargetTemperature()) {
                return false;
            }
        }
        return true;
    }

    public void enableAirConditioner() {
        for (Room room : rooms) {
            room.setConditionerEnabled(true);
            room.cool();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Room room : rooms) {
            sb.append(room.toString()).append("\n");
        }
        return sb.toString();
    }
}
