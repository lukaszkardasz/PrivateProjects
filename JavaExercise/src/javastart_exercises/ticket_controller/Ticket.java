package javastart_exercises.ticket_controller;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * @author n2god on 28/08/2019
 * @project PrivateProjects
 */

public class Ticket {

    private final LocalDateTime timeOfPurchase;
    private final int validityTime;

    public Ticket (int validityTime){
        this(LocalDateTime.now(), validityTime);
    }

    public Ticket(LocalDateTime timeOfPurchase, int validityTime) {
        this.timeOfPurchase = timeOfPurchase;
        this.validityTime = validityTime;
    }

    public LocalDateTime getTimeOfPurchase() {
        return timeOfPurchase;
    }

    public int getValidityTime() {
        return validityTime;
    }

    public boolean isValid(){
        LocalDateTime currentTime = LocalDateTime.now();
        Duration duration = Duration.between(timeOfPurchase, currentTime);
        return duration.toMinutes() < validityTime;
    }
}
