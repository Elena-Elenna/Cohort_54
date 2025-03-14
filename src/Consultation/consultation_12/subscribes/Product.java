package Consultation.consultation_12.subscribes;

public abstract class Product {
    protected String productName;

    // Constructor for creating a new product
    public Product(String productName) {
        this.productName = productName;
    }

    // Method to get the product name
    public String getProductName() {
        return this.productName;
    }
}
