package javastart_exercises.ticket_controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author n2god on 28/08/2019
 * @project PrivateProjects
 */
public class TicketController {
    public static void main(String[] args) {
        Passenger passenger1 = new Passenger("Piotr",
                "Klamka",
                new Ticket(new LocalDateTime(LocalDate.now(), LocalTime.of(11,00,00,00))));
    }
}
