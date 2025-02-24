package homework_37.teacherHW;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * @author Sergey Bugaenko
 * {@code @date} 13.02.2025
 */

/*
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

public class CompareListsWorkTime {
    private static final int CAPACITY = 150_000;
    private static final int BOUND = 1000;
    private static final int INSERT_COUNT = 10_000;


    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        Random random = new Random();

        for (int i = 0; i < CAPACITY; i++) {
            int value = random.nextInt(BOUND + 1);
            arrayList.add(value);
            linkedList.add(value);
        }

        System.out.println("array size: " + arrayList.size());
        System.out.println("linked size: " + linkedList.size());

        long start = System.currentTimeMillis();
        arrayList.contains(2000);
        long end = System.currentTimeMillis();
        System.out.println("Time array contains: " + (end - start));

        start = System.currentTimeMillis();
        linkedList.contains(2000);
        end = System.currentTimeMillis();
        System.out.println("Time array contains: " + (end - start));

        System.out.println("\n======================\n");

        start = System.currentTimeMillis();

        System.out.println("get array: " + getElements(arrayList));
        System.out.println("insert array: " + insertElements(arrayList));
        System.out.println("deleteByIndex array: " + deleteElementsByIndex(arrayList));
        System.out.println("deleteByValue array: " + deleteElementsByValue(arrayList));

        end = System.currentTimeMillis();

        System.out.println("\nОбщее время выполнения для ArrayList: " + (end - start));

        System.out.println("\n ============================= \n");

        start = System.currentTimeMillis();

        System.out.println("get linked: " + getElements(linkedList));
        System.out.println("insert linked: " + insertElements(linkedList));
        System.out.println("deleteByIndex linked: " + deleteElementsByIndex(linkedList));
        System.out.println("deleteByValue linked: " + deleteElementsByValue(linkedList));

        end = System.currentTimeMillis();

        System.out.println("\nОбщее время выполнения для LinkedList: " + (end - start));


    }

    // вставка 2_000 новых значений по случайному индексу (диапазон индексов от 0 до размера списка)
    public static long insertElements(List<Integer> integers) {
        long start = System.currentTimeMillis();

        Random random = new Random();

        for (int i = 0; i < INSERT_COUNT; i++) {
            integers.add(random.nextInt(integers.size()), random.nextInt(BOUND + 1));
        }

        long end = System.currentTimeMillis();
        return end - start;
    }

    // Получение всех элементов
    public static long getElements(List<Integer> integers) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < integers.size(); i++) {
            int value = integers.get(i);
        }

        long end = System.currentTimeMillis();
        return end - start;
    }

    // удалить 1_000 элементов по случайному индексу. (диапазон индексов от 0 до размера коллекции)
    public static long deleteElementsByIndex(List<Integer> integers) {
        long start = System.currentTimeMillis();

        Random random = new Random();

        for (int i = 0; i < INSERT_COUNT; i++) {
            integers.remove(random.nextInt(integers.size()));
        }

        long end = System.currentTimeMillis();
        return end - start;
    }

//    1_000 элементов по значению (диапазон случайных значений от 0 до 10_000)
public static long deleteElementsByValue(List<Integer> integers) {
    long start = System.currentTimeMillis();

    Random random = new Random();

    for (int i = 0; i < INSERT_COUNT; i++) {
        integers.remove(Integer.valueOf(random.nextInt(10000 + 1)));
    }
    long end = System.currentTimeMillis();
    return end - start;
}




}

























