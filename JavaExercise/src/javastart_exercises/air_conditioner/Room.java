package javastart_exercises.air_conditioner;

import java.time.LocalDateTime;

public class Room {
    private double temperature;
    private double cubature;
    private boolean isConditionerEnabled;

    public Room(double temperature, double cubature, boolean isConditionerEnabled) {
        this.temperature = temperature;
        this.cubature = cubature;
        this.isConditionerEnabled = isConditionerEnabled;
    }

    public boolean isConditionerEnabled() {
        return isConditionerEnabled;
    }

    public void setConditionerEnabled(boolean conditionerEnabled) {
        isConditionerEnabled = conditionerEnabled;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getCubature() {
        return cubature;
    }

    public void setcubature(double cubature) {
        this.cubature = cubature;
    }

    @Override
    public String toString() {
        return "Room{" +
                "temperature=" + temperature +
                ", cubature=" + cubature +
                ", isConditionerEnabled=" + isConditionerEnabled +
                '}';
    }
}
