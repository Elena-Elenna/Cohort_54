package Home_Work.homework_42.theacherHW;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Sergey Bugaenko
 * {@code @date} 04.03.2025
 */

/*
Task 1
Из списка целых чисел выделите те значения, которые больше 10;
отсортируйте эти значения по значению последней цифры в числе и выведите результат на экране

Task 2
Имеется список строк. Используя Stream API, найдите строку с минимальной длиной.

Task 3
Имеется список целых чисел.

Необходимо отфильтровать этот список,
оставив только чётные числа,
затем каждое число умножить на 2, и
собрать результат в новый список
 */

public class Task1_1to3 {

    public static void main(String[] args) {

//        task1(List.of(9, 17, 18 ,33, 22 , 75, 4, 101, 203, 303));

//        task2(List.of("String", "hello", "Java", "World", "LongString"));

//        System.out.println("\n===============");
//        task2(Arrays.asList(null, null));

        List<Integer> result = task3(List.of(9, 17, 18 ,33, 22 , 75, 4, 101, 203, 52, 303));

        System.out.println(result);


    }

    private static List<Integer> task3(List<Integer> list) {

        return list.stream()
                .filter(e -> e % 2 == 0)
                .peek(System.out::println)
                .map(i -> i * 2)
                .collect(Collectors.toList());


    }

    private static void task2(List<String> strings) {

        Optional<String> optionalString = strings.stream()
                .filter(Objects::nonNull)
                .min(Comparator.comparing(String::length));

        if (optionalString.isPresent()) {
            System.out.println("min length String: " + optionalString.get());
        } else {
            System.out.println("Строки в списке не найдены");
        }

        System.out.println(optionalString.orElse("Что-то пошло не так"));

        optionalString.ifPresent(string -> System.out.println("ifPresent: " + string));
        // optionalString.ifPresent(System.out::println);

        optionalString.ifPresentOrElse(str -> System.out.println("ifPresentOrElse: " + str),
                () -> System.out.println("ifPresentOrElse: Строк не найдено"));

    }

    private static void task1(List<Integer> integers) {
        integers.stream()
                .filter(i -> i > 10)
//                .sorted(Comparator.comparing(i -> i % 10))
                .sorted(Comparator.<Integer>comparingInt(i -> i % 10).thenComparing(Comparator.reverseOrder()))
//                .sorted((i1, i2) -> Integer.compare(i1 % 10, i2 % 10))
                .forEach(e -> System.out.print(e + ", "));
        System.out.println();





    }
}
