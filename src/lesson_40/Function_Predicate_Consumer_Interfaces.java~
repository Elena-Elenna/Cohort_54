package lesson_40;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 Stream API.
 Функциональные интерфейсы Function, Predicate, Consumer
 являются частью Lambda Expressions, введенном в Java 8
 */


public class InterfacesExample {

    public static void main(String[] args) {
        /**
         Consumer<T> - выполняет операцию над объектом типа T, не возвращая никакого результата
         void accept(T t)
         */

        Consumer<String> example = new Consumer<String>() {
            @Override
            public void accept(String str) {
                System.out.println(str + "!!!");
            }
        };

        Consumer<String> printConsumer = str -> System.out.println(str + "!!!");
        printConsumer.accept("Hello World");
        printConsumer.accept("Java");

        /**
        Составной интерфейс
         */
        Consumer<String> consumer1 = str -> System.out.println("1. " + str.length());
        Consumer<String> consumer2 = string -> System.out.println("2. " + string + "!");

        Consumer<String> resultConsumer = consumer1.andThen(consumer2);
        resultConsumer.accept("Test");

        /**
         Predicate<T> - Проверка объекта на соответствие условию (тестирование)
         boolean test(T t) - основной (абстрактный) метод
         and() - логическое И
         or() - логическое ИЛИ
         negate() - логическое отрицание
         */

        Predicate<String> examplePredicate = new Predicate<String>() {
            @Override
            public boolean test(String string) {
                return false;
            }
        };

        Predicate<String> isShort = str -> str.length() < 3;
        boolean result = isShort.test("Java");
        System.out.println("isShort.test(\"Java\"): " + result);
        System.out.println("isShort.test(\"JS\"): " + isShort.test("JS"));

        System.out.println("\n========================");
        List<Integer> list = new ArrayList<>(List.of(-1, 3, 4, 0 ,34, -45, 11, 45, 10, -50));

        // Список всех отрицательных элементов
        List<Integer> res = filterListByPredicate(list, i -> i < 0);
        System.out.println("filterListByPredicate(list, i -> i < 0): " + res);

        // Список всех четных чисел больше 5
        res = filterListByPredicate(list, i -> i > 5 && i % 2 == 0);
        System.out.println("filterListByPredicate(list, i -> i % 2 == 0): " + res);

        System.out.println("\n ==================");

        Predicate<String> isLengthGreaterThan4 = str -> str.length() > 4;
        Predicate<String> isContainsJava = str -> str.contains("Java");

        String test = "Java";

        Predicate<String> combinedPredicate = isLengthGreaterThan4.and(isContainsJava);
        System.out.println(combinedPredicate.test(test));

        Predicate<String> combinedPredicate2 = isContainsJava.negate();
        combinedPredicate2.test("Java");

        // Function<T, R> - производит операцию над объектом типа T, возвращает результат типа R
        // R apply(T t)


    }

    // создать список, удовлетворяющие предикату (прошедших проверку)
    public static List<Integer> filterListByPredicate(List<Integer> integers, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();

        for (Integer value : integers) {
            if (predicate.test(value)) {
                result.add(value);
            }
        }
        return result;
    }
}
