public class EndService extends Event {
    private final Customer customer;
    private final Counter counter;
    private final double time;

    public EndService(Customer customer, Counter counter, double time) {
        super(time);
        this.customer = customer;
        this.counter = counter;
        this.time = time;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(": Customer %d by Counter %d service begins",
        this.customer.getid(), this.counter.getid());
    }

    @Override 
    public Event[] simulate() {
        this.counter.setAvailability(true);
        return new Event[] {
            new DepartEvent(this.customer, this.time)
        };
    }
}