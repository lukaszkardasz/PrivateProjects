package javastart_exercises.ticket_controller;

import java.time.LocalDateTime;

/**
 * @author n2god on 28/08/2019
 * @project PrivateProjects
 */
public class TicketMachine {
    public void buyTicket(Passenger passenger, int lenght){
        passenger.setTicket(new Ticket(LocalDateTime.now(), lenght));
    }
}
