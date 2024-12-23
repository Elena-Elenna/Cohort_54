package lesson_24.flyers;

public class App {
    public static void main(String[] args) {

        Airplane airplane = new Airplane(15);
        Flyable duck = new Duck();
        Swimmable boat = new Boat(20);

        Flyable[] flyables = new Flyable[2];
        flyables[0] = airplane;
        flyables[1] = duck;

        for (int i = 0; i < flyables.length; i++){
            Flyable flyable = flyables[i];
            flyable.fly();
            if (flyable instanceof Airplane){     // Casting
                Airplane airplane1 = (Airplane) flyable;
                airplane1.takePassengers();
                System.out.println("countPassengers:  " + airplane1.countPassengers());
            }
        }

        System.out.println("+++++++++++++++");

        Transport[] transports = {airplane,(Transport) boat};

        for (int i = 0; i < transports.length; i++) {
            Transport transport = transports[i];
            transport.takePassengers();

            if (transport instanceof Flyable){
                Flyable flyable = (Flyable) transport;
                flyable.fly();
            }

            if (transport instanceof Swimmable){
                Swimmable swimmable = (Swimmable) transport;
                swimmable.swim();
            }
        }

    }
}
