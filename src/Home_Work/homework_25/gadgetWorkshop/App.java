package Home_Work.homework_25.gadgetWorkshop;
/*
Task2: Мастерская ремонта гаджетов
Создать систему для моделирования работы мастерской по ремонту различных гаджетов, таких как смартфоны и ноутбуки.

Условия задачи:
Создайте интерфейс Repairable, который содержит методы:
diagnose() — провести диагностику устройства.
repair() — выполнить ремонт устройства.
getRepairCost() — получить стоимость ремонта. +++

У всех гаджетов должны быть:
Поля:
ownerName — имя владельца гаджета.
model — модель устройства.
repairCost — стоимость ремонта.
Конструктор для инициализации этих полей.
Реализацию метода getRepairCost(), который возвращает значение поля repairCost.+++

Реализуйте два класса:
Smartphone (подкласс Gadget):
Реализуйте метод diagnose() (например, проверка экрана и батареи).
метод repair() с учетом особенностей ремонта смартфона (например, "Замена экрана завершена").
Laptop (подкласс Gadget):
Реализуйте метод diagnose() (например, проверка состояния жесткого диска и системы охлаждения).
Дополните метод repair() с учетом ремонта ноутбука (например, "Замена кулера завершена"). +++

Создайте класс Workshop, который выполняет:
Метод processRepair(Gadget gadget), который:
Проводит диагностику устройства.
Ремонтирует устройство.
Выводит информацию о завершении ремонта и его стоимости.
Пример вывода программы:
Диагностика устройства: iPhone 13 владельца Alex.
Проверка экрана и батареи...
Ремонт начат.
Замена экрана завершена.
Стоимость ремонта: 150.0 USD

Диагностика устройства: MacBook Pro владельца Sarah.
Проверка жесткого диска и системы охлаждения...
Ремонт начат.
Замена кулера завершена.
Стоимость ремонта: 200.0 USD

Опционально:
Реализуйте метод estimateRepairTime(), который возвращает время ремонта в зависимости от сложности устройства.
Добавьте класс Tablet как еще один подкласс Gadget, чтобы показать расширяемость системы.
 */

public class App {
    public static void main(String[] args) {

        Smartphone smart = new Smartphone("Bob", "Samaung", 100);
        smart.diagnose();
        smart.repair();
        System.out.println("repairCost: " + smart.getRepairCost());
        System.out.println(smart.repairCost);
        System.out.println(smart.ownerName);
        System.out.println(smart.getModel());
        System.out.println(smart.toString());

        System.out.println("+++++++++++++++++");

        Laptop laptop = new Laptop("Alex", "HP", 300);
        laptop.diagnose();
        laptop.repair();
        System.out.println(laptop.toString());

        System.out.println("+++++++++++++++++++");

        Tablet tablet = new Tablet("Kris", "iPhone", 500);
        tablet.diagnose();
        tablet.repair();
        System.out.println(tablet.getRepairCost());

        System.out.println("============================");

        Workshop workshop = new Workshop();
        workshop.processRepair(smart);
        System.out.println("_______________");
        workshop.processRepair(laptop);
        System.out.println("_______________");
        workshop.processRepair(tablet);

        System.out.println("++++++++++++++++++++++");


        workshop.estimateRepairTime(tablet);
        workshop.estimateRepairTime(smart);
        workshop.estimateRepairTime(laptop);

    }

}
