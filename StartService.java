public class StartService extends Event {
    private final Customer customer;
    private final Counter counter;
    // double time removed since unnecessary

    public StartService(Customer customer, Counter counter) {
        super(customer.getArrival());
        this.customer = customer;
        this.counter = counter;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(": Customer %d by Counter %d service begins",
        this.customer.getid(), this.counter.getid());
    }

    @Override
    public Event[] simulate() {
        this.counter.setAvailability(false);

        double endTime = this.customer.getArrival() + this.customer.getService();

        return new Event[] {
            new EndService(this.customer, this.counter, endTime)
        };
    }
}