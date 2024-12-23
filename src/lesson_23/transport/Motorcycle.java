package lesson_23.transport;

public class Motorcycle extends Vechikle{
    public Motorcycle(Engine engine) {
        super();
        setEngine(engine);
    }


    @Override
    public void startEngine() {
        System.out.println("Starting the Motocycle engine");
        this.getEngine().start();
    }
}
