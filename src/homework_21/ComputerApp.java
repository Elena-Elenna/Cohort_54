package homework_21;

public class ComputerApp {
    public static void main(String[] args) {


        Storage storage = new Storage("HSD", "A-555");
        System.out.println(storage.toString());
        Computer computer = new Computer(storage, "Aple");
        System.out.println(computer.toString());
        System.out.println("Processor: " + computer.getProcessor());
        System.out.println("Processor (brand): " + computer.getProcessor().getBrand());
        System.out.println("Processor (model): " + computer.getProcessor().getModel());
        System.out.println("Storage (brand): " + computer.getStorage().getBrand());
        System.out.println("Storage (model): " + computer.getStorage().getModel());
        System.out.println("Memory (brand): " + computer.getMemory().getBrand());
        System.out.println("Memory (model): " + computer.getMemory().getModel());
        System.out.println("Computer (model):" + computer.getModel());

        Storage storage1 = new Storage("XX", "000");
        computer.setStorage(storage1);
        System.out.println(computer.toString());
    }
}
