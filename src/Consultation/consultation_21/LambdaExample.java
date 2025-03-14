package Consultation.consultation_21;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample {
    public static void main(String[] args) {
        /*
        () -> System.out.println("Hello");
        (x) -> System.out.println(x);
        (x, y) -> System.out.println(x + y);
        (String text) -> System.out.println(text);
        (a, b) -> {
            int result = a + b;
            return result;
        };
         */

        List<String> fruits =
                List.of("Apple", "Banana", "Orange", "Ananas", "Kiwi", "Watermelon", "Strawberry", "Blueberry");

        // Фильтрация
        fruits.stream()
                .filter(fruit -> fruit.startsWith("B"))
                .forEach(System.out::println);

        // Преобразование
        fruits.stream()
                .map(fruit -> fruit.toUpperCase())
                .forEach(System.out::println);

        // Преобразование
        List<Integer> lengthFruits = fruits.stream()
//                .map(String::length)
                .map(fruit -> fruit.length())
                .collect(Collectors.toList());

        System.out.println(lengthFruits);


    }
}
