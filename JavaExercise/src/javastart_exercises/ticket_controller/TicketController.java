package javastart_exercises.ticket_controller;

import java.time.*;
import java.util.Arrays;
import java.util.stream.Stream;

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

        Ticket notGoodTicket = new Ticket(LocalDateTime.now().minusMinutes(20), 15);
        passengers[2].setTicket(notGoodTicket);

        Passenger[] passengersWithoutTicket = validateTickets(passengers);
        System.out.println("Jadą na gapę: ");
        for (Passenger passenger : passengersWithoutTicket) {
            System.out.println(passenger.getFirstName() + " " + passenger.getLastName());
        }

    }

    private static Passenger[] validateTickets(Passenger[] passengers) {
        int passengersWithoutTicket = 0;
        for (Passenger passenger : passengers) {
            Ticket ticket = passenger.getTicket();
            if(ticket == null || !ticket.isValid())
                passengersWithoutTicket++;
        }

        Passenger[] withoutTicket = new Passenger[passengersWithoutTicket];
        for (int i = 0, j = 0; i < passengers.length; i++) {
            Ticket ticket = passengers[i].getTicket();
            if(ticket == null || !ticket.isValid()) {
                withoutTicket[j] = passengers[i];
                j++;
            }
        }

        return withoutTicket;
    }
}
