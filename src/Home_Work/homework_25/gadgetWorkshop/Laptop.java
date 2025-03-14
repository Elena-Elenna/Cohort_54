package Home_Work.homework_25.gadgetWorkshop;

public class Laptop extends Gadget {
    public Laptop(String ownerName, String model, double repairCost) {
        super(ownerName, model, repairCost);
    }


    @Override
    public void diagnose() {
        System.out.printf("Владелец %s; ноутбук %s;\n",
                ownerName, model);
        System.out.println("Проводится диагностика состояния жесткого диска и системы охлаждения!");
    }

    @Override
    public void repair() {
        System.out.printf("Ремонт %s начат.\n", model);
        System.out.println("Выполнена замена кулера. Стоимость: " + repairCost + " EUR");
    }
}
