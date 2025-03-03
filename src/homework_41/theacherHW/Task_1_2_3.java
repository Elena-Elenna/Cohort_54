package homework_41.theacherHW;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author Sergey Bugaenko
 * {@code @date} 27.02.2025
 */

/*
Task 1
Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.

В новом списке должны быть только те числа из старого списка, которые соответствуют всем условиям:
- четные,
- больше 10 и
- меньше 100

Для фильтрации используйте Stream API

 */

    /*
    Task 2
Дан список строк.

Используя Stream API, отфильтруйте строки,
которые начинаются на определенную букву (например, "A") и отсортируйте их в алфавитном порядке.

Результат сохраните в новый список строк.
     */

    /*
    Используйте Stream API для фильтрации людей, которые старше определенного возраста и проживают в определенном городе, а затем соберите их в список.

Например, старше 25 лет и проживающих в городе "Berlin"
     */

public class Task_1_2_3 {
    public static void main(String[] args) {

        List<String> strings = List.of("test", "Abba", "Arrow", "Java", "A");

        System.out.println(filterStrings(strings));

        List<Person> people = new ArrayList<>(
                List.of(
                        new Person("Person", 21, "Munchin"),
                        new Person("Person2", 28, "Berlin"),
                        new Person("Person3", 27, "Koln"),
                        new Person("Person4", 25, "Berlin"),
                        new Person("Person5", 35, "Berlin"),
                        new Person("Person5", 35, null)
                )
        );
        people.add(null);

        List<Person> personList = people.stream()
                .filter(Objects::nonNull)
                .filter(p -> p.getAge() > 25)
                .filter(p -> Objects.nonNull(p.getCity()))
                .filter(p -> p.getCity().equals("Berlin"))
                .collect(Collectors.toList());

        System.out.println(personList);

    }

    public static List<Integer> filterList(List<Integer> integers) {
        return integers.stream()
                .filter(i -> i > 10 && i < 100)
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
    }

    public static List<String> filterStrings(List<String> strings) {

        return strings.stream()
//                .filter(s -> s.charAt(0) == 'A')
//                .filter(s -> s.substring(0, 1).equals("A") )
//                .peek(s-> System.out.println(s.substring(0, 1)))
//                .filter(str -> str.endsWith("a")) // проверяет, заканчивается ли строка на строку "а"
//                .filter(s -> s.contains("a")) // проверяет, содержит ли строка букву "a"
                .filter(str -> str.startsWith("A")) // проверяет, начинается ли строка на строку "A"
                .sorted()
                .collect(Collectors.toList());
    }


}
