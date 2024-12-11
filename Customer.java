public class Customer {
    private final int id;
    private final double arrivalTime;
    private final double serviceTime;

    public Customer(int id, double arrivalTime, double serviceTime) {
        this.id = id;
        this.arrivalTime = arrivalTime;
        this.serviceTime = serviceTime;
    }

    public int getid() {
        return this.id;
    }

    public double getArrival() {
        return this.arrivalTime;
    }

    public double getService() {
        return this.serviceTime;
    }

    public double getDeparture() {
        return this.arrivalTime + this.serviceTime;
    }

    @Override
    public String toString() {
        return "Customer" + this.id;
    }
}