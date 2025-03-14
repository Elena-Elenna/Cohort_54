package Consultation.consultation_13.pizza;

public class SoftDrink implements Beverage {
    private String flavor;
    private double cost;

    public SoftDrink(String flavor, double cost) {
        this.flavor = flavor;
        this.cost = cost;
    }

    @Override
    public void prepare() {
        System.out.println("Готовим напиток " + getName());
    }

    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String getName() {
        return flavor;
    }
}
