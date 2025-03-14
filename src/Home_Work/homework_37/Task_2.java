package Home_Work.homework_37;
/**
Task 2
Создайте два списка. Один на реализации ArrayList, второй на LinkedList.
Заполните их 5_000 одинаковыми случайными значениями от 0 до 1_000.
Создайте 4 метода, принимающий реализацию интерфейса List.
В первом методе - получение всех значений элементов списка по его индексу
Второй метод - вставка 2_000 новых значений по случайному индексу (диапазон индексов от 0 до размера списка)
Третий метод - удалить 1_000 элементов по случайному индексу. (диапазон индексов от 0 до размера коллекции)
Удалить 1_000 элементов по значению (диапазон случайных значений от 0 до 10_000)
Все методы должны возвращать время, затраченное на выполнение метода в миллисекундах.
Сравните для каждого из списка время выполнения каждого метода.
И сравните время последовательного выполнения всех методов для каждой реализации List-а.
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task_2 {
    private static final int CAPACITY = 5000;
    private static final int ADD_ELEMENTS = 2000;
    private static final int MAX_NUMBER_RANDOM = 1000;
    private static final int REMOVE_ELEMENTS = 1000;
    private static final int MAX_NUMBER_RANDOM2 = 10000;

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(CAPACITY);
        List<Integer> linkedList = new LinkedList<>();

        Random random = new Random();
        for (int i = 0; i < CAPACITY; i++) {
            int value = random.nextInt(MAX_NUMBER_RANDOM + 1);
            arrayList.add(value);
            linkedList.add(value);
        }

        long start = System.currentTimeMillis();

        System.out.println("getAllElements (array): " + getAllElements(arrayList));
        System.out.println("addElements (array): " + addElements(arrayList));
        System.out.println("deleteElementsByIndex (array): " + deleteElementsByIndex(arrayList));
        System.out.println("deleteElementsByValue (array): " + deleteElementsByValue(arrayList));

        long end = System.currentTimeMillis();

        System.out.println("\nОбщее время для ArrayList: " + (end - start));

        System.out.println("\n +++++++++++++++++++++++++++++++++++++++++++ \n");

        start = System.currentTimeMillis();

        System.out.println("getAllElements (linked): " + getAllElements(linkedList));
        System.out.println("addElements (linked): " + addElements(linkedList));
        System.out.println("deleteElementsByIndex (linked): " + deleteElementsByIndex(linkedList));
        System.out.println("deleteElementsByValue (linked): " + deleteElementsByValue(linkedList));

        end = System.currentTimeMillis();

        System.out.println("\nОбщее время для LinkedList: " + (end - start));
    }

    public static long getAllElements(List<Integer> integers) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < integers.size(); i++) {
            int value = integers.get(i);
        }
        long end = System.currentTimeMillis();
        return (end - start);
    }

    public static long addElements(List<Integer> integers) {
        Random random = new Random();
        long start = System.currentTimeMillis();
        for (int i = 0; i < ADD_ELEMENTS; i++) {
            integers.add(random.nextInt(integers.size()), random.nextInt(MAX_NUMBER_RANDOM + 1));
        }
        long end = System.currentTimeMillis();
        return (end - start);
    }

    public static long deleteElementsByIndex(List<Integer> integers) {
        Random random = new Random();
        long start = System.currentTimeMillis();
        for (int i = 0; i < REMOVE_ELEMENTS; i++) {
            integers.remove(random.nextInt(integers.size()));
        }
        long end = System.currentTimeMillis();
        return (end - start);
    }

    public static long deleteElementsByValue(List<Integer> integers) {
        Random random = new Random();
        long start = System.currentTimeMillis();
        for (int i = 0; i < REMOVE_ELEMENTS; i++) {
            integers.remove(Integer.valueOf(random.nextInt(MAX_NUMBER_RANDOM2 + 1)));
        }
        long end = System.currentTimeMillis();
        return (end - start);
    }
}
