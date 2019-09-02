package javastart_exercises.air_conditioner;

import java.time.LocalDateTime;

public class Room {
    private double temperature;
    private LocalDateTime time;
    private boolean isConditionerEnabled;

    public Room(double temperature, LocalDateTime time, boolean isConditionerEnabled) {
        this.temperature = temperature;
        this.time = time;
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

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Room{" +
                "temperature=" + temperature +
                ", time=" + time +
                ", isConditionerEnabled=" + isConditionerEnabled +
                '}';
    }
}
