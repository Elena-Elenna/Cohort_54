package Consultation.consultation_12.subscribes;

public class MonthlySubscription extends Subscription {
    private int months;

    // Constructor for creating a new monthlySubscription
    public MonthlySubscription(String productName, double cost, int months) {
        super(productName, cost);
        this.months = months;
    }

    // Method to get the number of months
    public int getMonths() {
        return this.months;
    }
}
