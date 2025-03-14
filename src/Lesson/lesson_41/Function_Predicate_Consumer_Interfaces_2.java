package Lesson.lesson_41;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Function_Predicate_Consumer_Interfaces_2 {
    public static void main(String[] args) {

        /**
        Consumer<T> - выполняет операцию над объектом типа T, не возвращая никакого результата
        void accept(T t)
         */

        Consumer<String> example = new Consumer<String>() {
            @Override
            public void accept(String str) {

            }
        };

        Consumer<String> printConsumer = str -> System.out.println(str);
        printConsumer.accept("Hello World");
        printConsumer.accept("Java");

        System.out.println("======= составной интерфейс =========\n");

        Consumer<String> consumer1 = str -> System.out.println("1. " + str.length());
        Consumer<String> consumer2 = string -> System.out.println("2. " + string + "!");

        Consumer<String> resultConsumer = consumer1.andThen(consumer2);
        resultConsumer.accept("Test");

        System.out.println("============= Predicate ===========\n");

        /**
        Predicate<T> - функция, которая принимает объект типа T и возвращает булевое значение.
        Проверка объекта на соответствие условию (тестирование).
        boolean test(T t) - основной абстрактный метод

        and() - логическое И (&&)
        or() - логическое ИЛИ (||)
        negate() - логическое отрицание НЕ (!)
         */

        Predicate<String> stringPredicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return false;
            }
        };

        System.out.println("======== Проверяет длину строки ==========");
        Predicate<String> isShort = str -> str.length() < 3;
        boolean result2 = isShort.test("Hello");
        System.out.println(result2);
        System.out.println(isShort.test("JS"));

        System.out.println("======== Проверяет, что строка не пустая ==========");
        // если пустая строку - false, если не пустая - вернется true
        Predicate<String> isNotEmpty = str -> !str.isEmpty();
        boolean result = isNotEmpty.test("Hello, World");
        System.out.println(result);
        System.out.println("isNotEmpty.test(\"\"): " + isNotEmpty.test(""));

        System.out.println("======== Возвращает список всех элементов =======");
        List<Integer> numbers = new ArrayList<>(List.of(-1, 3, 4, 10, -10, -45, 11 , 17, 24, 0, -8));
        System.out.println("numbers: " + numbers);

        System.out.println("======= Список всеx отрицательных чисел =========");
        List<Integer> res1 = filterByPredicate(numbers, i -> i < 0);
        System.out.println(res1);

        System.out.println("======= Список всех положительных чисел ======");
        List<Integer> res2 = filterByPredicate(numbers, i -> i >= 0);
        System.out.println(res2);

        System.out.println("======= Список всех четных элементов ======");
        // Список всех четных элементов (больше нуля и остаток от деления на 2 равен 0)
        List<Integer> res3 = filterByPredicate(numbers, i -> i > 0 && i % 2 == 0);
        System.out.println(res3);

        System.out.println("======== and(Predicate<T>) =========");
        Predicate<String> isLengthGreat6 = str -> str.length() > 6;
        Predicate<String> isContainsJava = str -> str.contains("Java");
        String test = "Java!";
        Predicate<String> combineString = isLengthGreat6.or(isContainsJava);
        System.out.println("combineString.test(test): " + combineString.test(test));

        Predicate<String> negate = isContainsJava.negate();
        System.out.println("negate.test(test): " + negate.test(test));


        System.out.println("\n ========= Function ==========\n");

        /**
        Function<T, R> - производит операцию над объектом типа T и возвращает результат типа R
        R apply(T t)
         */

        Function<String, Integer> integerFunction = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return 0;
            }
        };

        Function<String, Integer> function = string -> string.length();
        int length = function.apply("Hello, World");
        System.out.println("function.apply(\"Hello, World\"): " + length);

        System.out.println("--------------------------------");
//        Function<String, String> toUpperCase = str -> str.toUpperCase();
        Function<String, String> toUpperCase = String::toUpperCase;
        System.out.println(toUpperCase.apply("Test string"));

        System.out.println("---------------------------------");
        Function<String, String> concatenate = Function_Predicate_Consumer_Interfaces_2::test;
        String result1 = concatenate.apply("Hello, World");
        System.out.println(result1);

        System.out.println("---------------------------------");
        Function<String, String> combine = toUpperCase.andThen(concatenate);
        System.out.println(combine.apply("Test string"));
    }

    public static String test(String str) {
        return str + "!!!";
    }

    public static List<Integer> filterByPredicate(List<Integer> integers, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer integer : integers) {
            if (predicate.test(integer)) {
                result.add(integer);
            }
        }
        return result;
    }
}
