package Lesson.lesson_23.transport;

public class Car extends Vechikle{
    public Car(Engine engine) {
        super();
        setEngine(engine);
    }

    @Override
    public void startEngine() {
        System.out.println("Car starting engine");
        this.getEngine().start();
    }
}
