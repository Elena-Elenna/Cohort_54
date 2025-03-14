package Home_Work.homework_37;

/**
Task 1
Напишите метод, который принимает на вход две реализации интерфейса List.
Метод должен возвращать список состоящий из элементов,
которые присутствуют в обеих коллекциях.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task_1 {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>(List.of(0, 1, 2, 3, 4, 4, 5));
        List<Integer> integers1 = new LinkedList<>(List.of(9, 4, 3, 4, 5, 6, 5, 6, 7, 8));
        System.out.println(lists(integers, integers1));
        System.out.println(lists(integers1, integers));

        List<String> strings = new ArrayList<>(List.of("a", "b", "c", "c", "e"));
        List<String> strings1 = new LinkedList<>(List.of("a", "c", "d", "d"));
        System.out.println(lists(strings, strings1));
        System.out.println(lists(strings1, strings));
    }

    public static <T> List<T> lists (List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>(list1);
        result.retainAll(list2);
        return result;
    }
}
