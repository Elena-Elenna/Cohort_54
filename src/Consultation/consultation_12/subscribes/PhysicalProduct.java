package Consultation.consultation_12.subscribes;

public class PhysicalProduct extends Product {
    private double weight;

    // Constructor for creating a new physicalProduct
    public PhysicalProduct(String productName, double weight) {
        super(productName);
        this.weight = weight;
    }

    // Method to get the weight of the product
    public double getWeight() {
        return this.weight;
    }
}
