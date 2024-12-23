package lesson_21;

public class AutoPark {
    public static void main(String[] args) {

        BusDriver busDriver = new BusDriver("Max","AB - 12345");
        Autobus bus = new Autobus(busDriver, 15);
        System.out.println(bus.toString());

        BusDriver peter = new BusDriver("Peter", "FT - 24573");
        bus.setDriver(peter);
        System.out.println(bus.toString());

        System.out.println(busDriver.toString());

        System.out.println("\n+++++++++++++++++++++++++++++++++++++");

        BusDriver margo = new BusDriver("Margo", "LK-5777");
        Autobus bus1 = new Autobus(margo,24);
        System.out.println(bus1.toString());

        bus1.installNewAutopilot("Gpt-6");
        System.out.println(bus1.toString());

        margo.setName("Margo-Susana");
        System.out.println(bus1.toString());

        bus1 = null;
        System.out.println(margo.toString());

        System.out.println(bus.toString());
        bus.setDriver(margo);
        System.out.println(bus.toString());

        System.out.println("++++++++++++++++++++++++++++\n");
        Passenger passenger = new Passenger("Alex");
        Passenger passenger1 = new Passenger("Max");
        System.out.println(passenger.toString());
        System.out.println(passenger1.toString());

        bus.takePassenger(passenger);
        System.out.println(bus.getCountPassengers());
        bus.takePassenger(passenger1);
        System.out.println(bus.getCountPassengers());
        bus.takePassenger(passenger1);
        System.out.println(bus.getCountPassengers());
        bus.dropPassenger(passenger1);
        System.out.println(bus.getCountPassengers());
        bus.dropPassenger(passenger);
        System.out.println(bus.getCountPassengers());

    }
}
