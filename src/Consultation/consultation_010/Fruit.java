package Consultation.consultation_010;

public class Fruit {
    String title;
    boolean isReady;

    public Fruit(String title) {
        this.title = title;
    }

    public void ripen() {
        System.out.println("Ripen from Fruit");
        isReady = true;
    }

    @Override
    public String toString() {
        System.out.println("toString Fruit");
        return "{Fruit title=" + title + ", isReady=" + isReady + "}";
    }
}
