package homework_41;
/*
Task 1
Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.
В новом списке должны быть только те числа из старого списка,
которые соответствуют всем условиям: четные, больше 10 и меньше 100
Для фильтрации используйте Stream API
Task 2
Дан список строк.
Используя Stream API, отфильтруйте строки,
которые начинаются на определенную букву (например, "A") и отсортируйте их в алфавитном порядке.
Результат сохраните в новый список строк.
 */

import java.util.List;
import java.util.stream.Collectors;

public class Task_1_2 {
    public static void main(String[] args) {

        System.out.println("========== Task_1 ==========");
        List<Integer> list = List.of(5, 12, -10, 48, 102, 8, 96, 100, 50);
        System.out.println(list);
        System.out.println(task_1(list));

        System.out.println("========== Task_2 ==========");
        List<String> list1 = List.of("Ананас", "Кот", "Слон", "Апельсин", "Фрукт");
        System.out.println(list1);
        System.out.println(task_2(list1));
    }

    public static List<Integer> task_1 (List<Integer> list) {
        return list.stream()
                .filter(i -> i > 10 && i < 100 && i % 2 == 0)
                .collect(Collectors.toList());
    }

    public static List<String> task_2 (List<String> list1) {
        return  list1.stream()
                .filter(s -> s.startsWith("А"))
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}
