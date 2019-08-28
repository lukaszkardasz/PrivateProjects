package javastart_exercises.ticket_controller;

import java.time.LocalDateTime;

/**
 * @author n2god on 28/08/2019
 * @project PrivateProjects
 */
public class Ticket {
    private LocalDateTime TicketDeletedTime;
    private int duration;

    public Ticket(LocalDateTime ticketDeletedTime, int duration) {
        TicketDeletedTime = ticketDeletedTime;
        this.duration = duration;;
    }

    public LocalDateTime getTicketDeletedTime() {
        return TicketDeletedTime;
    }

    public void setTicketDeletedTime(LocalDateTime ticketDeletedTime) {
        TicketDeletedTime = ticketDeletedTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

}
