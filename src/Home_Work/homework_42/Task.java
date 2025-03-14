package Home_Work.homework_42;

/*
Task 1
Из списка целых чисел выделите те значения, которые больше 10;
отсортируйте эти значения по значению последней цифры в числе
и выведите результат на экране
-------
Task 2
Имеется список строк. Используя Stream API, найдите строку с минимальной длиной.
-------
Task 3
Имеется список целых чисел.
Необходимо отфильтровать этот список, оставив только чётные числа,
затем каждое число умножить на 2,
и собрать результат в новый список
 */


import java.util.*;
import java.util.stream.Collectors;

public class Task {
    public static void main(String[] args) {

        System.out.println("========== Task_1 ==========");
        task_1_Optional1();
        task_1_Optional2();
        System.out.println("========== Task_2 ==========");
        task_2_Optional1();
        task_2_Optional2();
        System.out.println("========== Task_3 ==========");
        task_3_Optional1();
        task_3_Optional2();
    }

    private static void task_1_Optional1() {
        List<Integer> integers = List.of(-2, 4, 6, 0, 10, 3, 14, 26, 56, 45, 11, 14);
        List<Integer> result = integers.stream()
                .filter(i -> i > 10)
                .sorted((i1, i2) -> i1 % 10 - i2 % 10)
                .collect(Collectors.toList());
        if (!result.isEmpty()) {
            System.out.println(result);
        } else {
            System.out.println("В списке нет чисел больше 10");
        }
    }

    private static void task_1_Optional2() {
        List<Integer> integers = List.of(3, 15, 17, 42, 71, 93, 14, 46, 131, 32, 54, 66);
        Optional<List<Integer>> result = Optional.of(
                integers.stream()
                        .filter(i -> i > 10)
                        .sorted(Comparator.<Integer>comparingInt(i -> i % 10).thenComparing(Comparator.naturalOrder()))
                        .collect(Collectors.toList())
        );
        result.ifPresent(System.out::println);
    }


    private static void task_2_Optional1() {
        List<String> list = Arrays.asList("abc", "apple", "banana", "kiwi", null, "cherry", "fig", "grape");
        Optional<String> minLength = list.stream()
                .filter(Objects::nonNull)
                .min(Comparator.comparing(String::length));
        if (minLength.isPresent()) {
            System.out.println(minLength.get());
        } else {
            System.out.println("Строки не найдены");
        }
    }

    private static void task_2_Optional2() {
        List<String> list = Arrays.asList(null, "Python", "Java", "Cat", "Dog", "Panda", "Abc");
        Optional<String> minLength = list.stream()
                .filter(Objects::nonNull)
                .min(Comparator.comparing(String::length));
        Optional<List<String>> stringList = Optional.of(list.stream()
                .filter(Objects::nonNull)
                .filter(s -> s.length() == minLength.get().length())
                .collect(Collectors.toList()));
        stringList.ifPresent(System.out::println);
    }

    private static void task_3_Optional1() {
        List<Integer> integers = List.of(-2, 5, 10, 1, 14, 26, -27, 45, 12, 15);
        List<Integer> result = integers.stream()
                .filter(i -> i % 2 == 0)
                .peek(System.out::println)
                .map(i -> i = i * 2)
                .collect(Collectors.toList());
        if (!result.isEmpty()) {
            System.out.println(result);
        } else {
            System.out.println("В списке нет четных чисел");
        }
    }

    private static void task_3_Optional2() {
        List<Integer> integers = Arrays.asList(null, -2, 5, 10, 1, 14, 26, -27, 45, 12, 15);
        Optional<List<Integer>> result = Optional.of(integers.stream()
                .filter(Objects::nonNull)
                .filter(i -> i % 2 == 0)
                .peek(System.out::println)
                .map(i -> i = i * 2)
                .collect(Collectors.toList()));
        result.ifPresent(System.out::println);
    }
}



