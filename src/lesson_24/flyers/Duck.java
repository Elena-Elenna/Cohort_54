package lesson_24.flyers;

public class Duck implements Flyable, Swimmable{

    @Override
    public void fly() {
        System.out.println("Duck flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck swimming");

    }
}
