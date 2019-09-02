package javastart_exercises.air_conditioner;

import java.time.LocalDateTime;

public class Room {
    private int number;
    private double currentTemperature;
    private double targetTemperature;
    private double cubature;
    private AirConditioner airConditioner;
    private boolean isConditionerEnabled;

    public Room(int number, double currentTemperature, double targetTemperature, double cubature, AirConditioner airConditioner, boolean isConditionerEnabled) {
        this.number = number;
        this.currentTemperature = currentTemperature;
        this.targetTemperature = targetTemperature;
        this.cubature = cubature;
        this.airConditioner = airConditioner;
        this.isConditionerEnabled = isConditionerEnabled;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public double getTargetTemperature() {
        return targetTemperature;
    }

    public void setTargetTemperature(double targetTemperature) {
        this.targetTemperature = targetTemperature;
    }

    public double getCubature() {
        return cubature;
    }

    public void setCubature(double cubature) {
        this.cubature = cubature;
    }

    public AirConditioner getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    public boolean isConditionerEnabled() {
        return isConditionerEnabled;
    }

    public void setConditionerEnabled(boolean conditionerEnabled) {
        isConditionerEnabled = conditionerEnabled;
    }

    public void cool(){
        if (currentTemperature > targetTemperature && isConditionerEnabled){
            currentTemperature = airConditioner.cool(currentTemperature, cubature);
        }
    }

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", currentTemperature=" + String.format("%.2f", currentTemperature) +
                ", targetTemperature=" + targetTemperature +
                ", cubature=" + cubature +
                ", airConditioner=" + airConditioner +
                ", isConditionerEnabled=" + isConditionerEnabled +
                '}';
    }
}
