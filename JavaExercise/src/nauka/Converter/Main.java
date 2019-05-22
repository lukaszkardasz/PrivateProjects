package nauka.Converter;

import java.sql.Time;

public class Main {

    public static void main(String[] args) {
        MetricConverter metricConverter = new MetricConverter();
        double m = 2.6;
        int hour = 16;
        System.out.println(metricConverter.cmToM(m));
        TimeConverter timeConverter = new TimeConverter();
        int min = timeConverter.hToMin(hour);
        int sec = timeConverter.minToSec(min);
        System.out.println(hour + " godzin to: " + timeConverter.secToMs(sec) + " ms");
    }

}
