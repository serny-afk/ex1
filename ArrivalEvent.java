public class ArrivalEvent extends Event {

    private final Customer customer;
    private final Counter[] counter; 

    public ArrivalEvent(Customer customer, Counter[] counter) {
        super(customer.getArrival()); // constructor for superclass with arrival time as param
        this.customer = customer;
        this.counter = counter;
    }
    
    @Override
    public String toString() {
        return super.toString() + String.format(": Customer %d arrives", this.customer.getid());
    }
    
    @Override
    public Event[] simulate() {
        for (Counter i : this.counter) {
            if (i.isAvailable()) {
                return new Event[] {
                    new StartService(this.customer, i)
                };                                
            }
        }       

        return new Event[] {
            new DepartEvent(this.customer, this.customer.getArrival())
        };
    }
}