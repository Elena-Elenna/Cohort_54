package Consultation.consultation_12.subscribes;

public class AnnualSubscription extends Subscription{
    private int years;

    // Constructor for creating a new annualSubscription
    public AnnualSubscription(String productName, double cost, int years) {
        super(productName, cost);
        this.years = years;
    }

    // Method to get the number of years
    public int getYears() {
        return this.years;
    }
}
