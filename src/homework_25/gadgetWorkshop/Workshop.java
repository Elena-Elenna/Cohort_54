package homework_25.gadgetWorkshop;

public class Workshop {
    public void processRepair (Gadget gadget) {
        gadget.diagnose();
        gadget.repair();
        System.out.println("Стоимость ремонта: " + gadget.getRepairCost() + " EUR");
    }


    public int estimateRepairTime (Gadget gadget){
        if (gadget instanceof Smartphone){
            System.out.println("Необходимо 3 часа на ремонт телефона.");
            return 3;
        } else if (gadget instanceof Laptop) {
            System.out.println("Необходимо 7 часов на ремонт ноутбука.");
            return 7;
        } else if (gadget instanceof Tablet){
            System.out.println("Необходимо 5 часов на ремонт планшета.");
            return 5;
        }  else {
            System.out.println("Это устройство мы не ремонтируем.");
            return 0;
        }
    }
}
