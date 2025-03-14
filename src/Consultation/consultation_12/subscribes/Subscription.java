package Consultation.consultation_12.subscribes;

public abstract class Subscription {
    protected String productName;
    protected double cost;

    // Constructor for creating a new subscription
    public Subscription(String productName, double cost) {
        this.productName = productName;
        this.cost = cost;
    }

    // Method to get the product name
    public String getProduct_name() {
        return this.productName;
    }

    // Method to get the cost of the subscription
    public double getCost() {
        return this.cost;
    }
}
