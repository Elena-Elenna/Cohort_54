package Consultation.consultation_13.pizza;

public class CustomPizza extends Pizza {
    public CustomPizza(String topping, double price) {
        super(topping, price);
    }

    @Override
    public void order() {
        double totalPrice = 0.0;
        for (int i = 0; i < getCountBeverages(); i++) {
            System.out.println("Preparing " + beverages[i].getName());
            totalPrice += beverages[i].cost();
        }
        totalPrice += getPrice();
        System.out.println("Total price: " + totalPrice);
    }
}
