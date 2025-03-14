package Home_Work.homework_25.gadgetWorkshop;

public class Smartphone extends Gadget{
    public Smartphone(String ownerName, String model, double repairCost) {
        super(ownerName, model, repairCost);
    }

    @Override
    public void diagnose() {
        System.out.printf("Владелец %s; телефон %s;\n",
                ownerName, model);
        System.out.println("Проводится диагностика батареи!");
    }

    @Override
    public void repair() {
        System.out.printf("Ремонт %s начат.\n", model);
        System.out.println("Выполнена замена батареи. Стоимость: " + repairCost + " EUR");
    }
}
