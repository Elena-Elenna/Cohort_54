package Home_Work.homework_25.gadgetWorkshop;

public class Tablet extends Gadget{
    public Tablet(String ownerName, String model, double repairCost) {
        super(ownerName, model, repairCost);
    }

    @Override
    public void diagnose() {
        System.out.printf("Владелец %s; планшет %s;\n", ownerName, model);
        System.out.println("Диагностика сенсорного экрана!");

    }

    @Override
    public void repair() {
        System.out.printf("Ремонт %s начат.\n", model);
        System.out.println("Выполнена замена сенсорного экрана. Стоимость: " + repairCost + " EUR");
    }

}
