package lesson_20;

public class App {
    public static void main(String[] args) {

        Bus bus = new Bus("Bus-X1",  10,2020);
        System.out.println(bus.toString());

        bus.start();
        bus.stop();

        System.out.println("bus.getModel: " + bus.getModel());
        System.out.println("bus.getCapacity: " + bus.getCapacity());

        System.out.println("\n==========================\n");

        Train train = new Train("Train M-1",2024,4,15);

        System.out.println(train.toString());
        System.out.println(train.getModel());
        System.out.println(train.getYear());

        System.out.println("train capacity: " + train.getCapacity());
        train.setCountWagons(6);
        System.out.println("train capacity: " + train.getCapacity());
        train.setCountWagons(1);
        System.out.println("train capacity: " + train.getCapacity());

        System.out.println("++++++++++++++++++++++++++");

        Bus bus1 = new Bus("Bus B-2",  3, 2024);
        System.out.println(bus1.takePassengers());
        System.out.println("2=========");
        System.out.println(bus1.takePassengers());
        System.out.println("3=========");
        System.out.println(bus1.takePassengers());
        System.out.println("4=========");
        System.out.println(bus1.takePassengers());

        System.out.println("count: " + bus1.getCountPassengers());

        System.out.println("1. " + bus1.dropPassengers());
        System.out.println("2. " + bus1.dropPassengers());
        System.out.println("3. " + bus1.dropPassengers());
        System.out.println("4. " + bus1.dropPassengers());
        System.out.println("count: " + bus1.getCountPassengers());

        System.out.println("\n++++++++++++++++++++++++\n");

        //UML СХЕМЫ
        // Unified Modeling Language - Единый язык моделирования
        // Диаграмма классов

        InternationalBus internationalBus = new InternationalBus("MAN-I1",2000,40,
                new String[] {"Italy", "France", "Spain", "Monaco"});

        System.out.println("year: " + internationalBus.getYear()); //метод и поле Vehicle
        System.out.println("take Pass: " + internationalBus.takePassengers());//метод из Bus
        System.out.println("toString: " + internationalBus.toString()); //метод из Vehicle
        System.out.println("capacity: " + internationalBus.getCapacity()); // метод и поле из Bus
        internationalBus.goToRoute(); // метод из InternationalBus

        System.out.println("\n+++++++++++++++++++++++++++++++\n");

        String[] strings = {"Italy", "France", "Spain", "Monaco"}; //явная инициализация (укороченая)
        String[] strings1 = new String[] {"Italy", "France", "Spain", "Monaco"}; //явная инициализация (полная)
//        strings = {"Java", "Python"}; - присвоение новой ссылки - ТАК НЕ РАБОТАЕТ
        strings = new String[]{"Java", "Python"};
    }
}
