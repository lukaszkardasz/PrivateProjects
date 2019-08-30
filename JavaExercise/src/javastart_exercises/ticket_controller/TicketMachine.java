package javastart_exercises.ticket_controller;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * @author n2god on 28/08/2019
 * @project PrivateProjects
 */
public class TicketMachine {
    public static void buyTicket(Passenger passenger, int timeInMinutes){
        Ticket ticket = new Ticket(timeInMinutes);
        passenger.setTicket(ticket);
    }
}
