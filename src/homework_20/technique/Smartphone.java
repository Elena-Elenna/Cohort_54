package homework_20.technique;

public class Smartphone extends ElectronicDevice{
    private String brend;
    private String color;

    public Smartphone(String model, int year, String brend, String color) {
        super(model, year);
        this.brend = brend;
        this.color = color;
    }


    public void makeCall() {
        System.out.println("Звоню c " + brend + " " + this.getModel());
    }

    public String getBrend() {
        return this.brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
