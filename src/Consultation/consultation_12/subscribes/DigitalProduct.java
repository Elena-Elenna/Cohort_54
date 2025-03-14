package Consultation.consultation_12.subscribes;

public class DigitalProduct extends Product {
    private int downloads;

    // Constructor for creating a new digitalProduct
    public DigitalProduct(String productName, int downloads) {
        super(productName);
        this.downloads = downloads;
    }

    // Method to get the number of downloads
    public int getDownloads() {
        return this.downloads;
    }
}
