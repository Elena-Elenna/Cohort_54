package Consultation.consultation_13.pizza;

public class PizzaApp {
    public static void main(String[] args) {

        Pizza pizza = new CustomPizza("Pepperoni", 9.99);
        pizza.addBeverage(new IcedBeverage("Cola", 2.5));
        pizza.addBeverage(new SoftDrink("Lemonade", 3.0));

        System.out.println(pizza.getTopping()); // Output: Pepperoni
        System.out.println(pizza.getPrice());  // Output: 9.99

        pizza.order();
    }
}
