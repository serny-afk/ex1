public class DepartEvent extends Event {
    private final Customer customer;
    private final double time; // departure time (arrival + service)

    public DepartEvent(Customer customer, double time) {
        super(time);
        this.customer = customer;
        this.time = time;
    }

    @Override 
    public String toString() {
        return super.toString() + String.format(": Customer %d departs", this.customer.getid());
    }

    @Override
    public Event[] simulate() {
        return new Event[] {};
    }
}