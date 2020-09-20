package delegation_demo;

public class TicketBookingByAgent  implements TravelBooking {

    TravelBooking t;

    public TicketBookingByAgent(TravelBooking t) {
        this.t = t;
    }

    // Delegation --- Here ticket booking responsibility
    // is delegated to other class using polymorphism (upcasting and using parent ref for child mem).

    //@Override
    public void bookTicket() {

        t.bookTicket();

    }
}
