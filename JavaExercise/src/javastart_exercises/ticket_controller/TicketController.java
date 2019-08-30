package javastart_exercises.ticket_controller;

import java.time.*;

/**
 * @author n2god on 28/08/2019
 * @project PrivateProjects
 */
public class TicketController {
    public static void main(String[] args) {

        Passenger[] passengers = new Passenger[5];

        passengers[0] = new Passenger("Jan", "Kowalski");
        passengers[1] = new Passenger("Benek", "Grucha");
        passengers[2] = new Passenger("Wacek", "Fiut");
        passengers[3] = new Passenger("Anna", "Kutasek");
        passengers[4] = new Passenger("Gienia", "Klops");

        TicketMachine.buyTicket(passengers[0], 15);
        TicketMachine.buyTicket(passengers[1], 30);



    }
}
