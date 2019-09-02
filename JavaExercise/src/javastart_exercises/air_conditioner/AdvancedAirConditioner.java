package javastart_exercises.air_conditioner;

public class AdvancedAirConditioner implements AirConditioner {
    private static double COOLING_PER_MINUTE = 1;

    @Override
    public double cool(double temperature, double cubature) {
        return temperature - (COOLING_PER_MINUTE / cubature);
    }

    @Override
    public String toString() {
        return "AdvancedAirConditioner";
    }
}
