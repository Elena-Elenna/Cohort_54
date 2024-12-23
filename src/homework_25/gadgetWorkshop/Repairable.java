package homework_25.gadgetWorkshop;

public interface Repairable {
    void diagnose();              //провести диагностику устройства

    void repair();                // выполнить ремонт устройства.

    double getRepairCost();       // получить стоимость ремонта.

}
