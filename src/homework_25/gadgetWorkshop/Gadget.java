package homework_25.gadgetWorkshop;

public abstract class Gadget  implements Repairable{
    protected String ownerName;
    protected String model;
    protected double repairCost;                                // стоимость ремонта.


    public Gadget(String ownerName, String model, double repairCost) {
        this.ownerName = ownerName;
        this.model = model;
        this.repairCost = repairCost;
    }


    @Override
    public String toString() {
        return "Gadget {ownerName: " + ownerName + "; model: " + model + "; repairCost: " + repairCost + "}";
    }

    @Override
    public double getRepairCost() {
        return repairCost;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public String getModel() {
        return this.model;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
