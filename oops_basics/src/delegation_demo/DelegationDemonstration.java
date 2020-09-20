package delegation_demo;

public class DelegationDemonstration {

    public static void main(String[] args) {
        // Here TicketBookingByAgent class is internally(by creating a reference(upcast type)
        // delegating train ticket booking responsibility to other class
        TicketBookingByAgent agent = new TicketBookingByAgent(new TrainBooking());
        agent.bookTicket();

        agent = new TicketBookingByAgent(new AirBooking());
        agent.bookTicket();

        TicketBookingByAgent finalAgent = agent;


        TicketBookingByAgent agent2 = new TicketBookingByAgent(new TravelBooking() {
            public void bookTicket() {
                finalAgent.bookTicket();
            }
        });


    }

}

