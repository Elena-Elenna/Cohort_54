package Consultation.consultation_13.pizza;

public class IcedBeverage implements Beverage {
    private String name;
    private double cost;

    public IcedBeverage(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public void prepare() {
        System.out.println("Готовим напиток " + getName() + "...");
        System.out.println("Добавили лед...");
    }

    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }
}
