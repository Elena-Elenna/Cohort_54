package Consultation.consultation_13.pizza;

import java.util.Arrays;

public abstract class Pizza {
    private String topping;
    private double price;
    protected Beverage[] beverages;
    private int countBeverages = 0;

    public Pizza(String topping, double price) {
        this.topping = topping;
        this.price = price;
        this.beverages = new Beverage[10];
    }

    public void addBeverage(Beverage beverage) {
        checkLength();

        beverages[countBeverages] = beverage;
        countBeverages++;
    }

    public void checkLength() {
        if (countBeverages > beverages.length) {
            beverages = Arrays.copyOf(beverages, beverages.length * 2);
        }
    }

    public boolean checkIndex(int index) {
        if (index > beverages.length - 1) {
            return false;
        }
        return true;
    }

    public int getCountBeverages() {
        return countBeverages;
    }

    public abstract void order();

    public String getTopping() {
        return topping;
    }

    public double getPrice() {
        return price;
    }
}
