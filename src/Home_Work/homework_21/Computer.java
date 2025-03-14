package Home_Work.homework_21;

public class Computer {
    private Processor processor;
    private Memory memory;
    private Storage storage;

    private String model;


    public Computer(Storage storage, String model) {
        this.storage = storage;
        this.model = model;
        this.processor = new Processor("HP", "JR-1111");
        this.memory = new Memory("Instal", "V-001");
    }

    @Override
    public String toString() {
        return "Computer { model: " + model + "} processor: " + processor +
                "; memory: " + memory + "; storage: " + storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public Processor getProcessor() {
        return this.processor;
    }

    public Memory getMemory() {
        return this.memory;
    }

    public Storage getStorage() {
        return this.storage;
    }

    public String getModel() {
        return this.model;
    }
}
