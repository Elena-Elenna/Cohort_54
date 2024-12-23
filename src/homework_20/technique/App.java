package homework_20.technique;

public class App {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone( "14",2024,"iPhone", "gold");
        System.out.println(smartphone.toString());
        System.out.println(smartphone.getModel());
        smartphone.setBrend("Techno");
        System.out.println(smartphone.getBrend());
        smartphone.makeCall();
        smartphone.setColor("rot");
        System.out.println(smartphone.getColor());

        System.out.println("==========================");
        Laptop laptop = new Laptop("hp", "24", "cерый",2023,3);
        System.out.println(laptop.toString());
        System.out.println(laptop.getBrand());
        System.out.println(laptop.getColor());
        System.out.println(laptop.getRamSize());
        laptop.compileCode();
    }
}
