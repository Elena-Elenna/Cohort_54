package Home_Work.homework_20.technique;

public class Laptop extends ElectronicDevice {
    private String brand;
    private int ramSize;
    private String color;


    public Laptop(String brand, String model, String color,  int year, int ramSize) {
        super(model, year);
        this.ramSize = ramSize;
        this.brand = brand;
        this.color = color;
    }


    public void compileCode() {
        System.out.println("Компиляция на " + this.getBrand() + " "  +  this.getModel());
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRamSize() {
        return this.ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
