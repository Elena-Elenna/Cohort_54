package homework_38;
/*
Task 1
Напишите метод, принимающий строку и возвращающий Список ее слов без повторений,
отсортированный в порядке увеличения длин слов.
Если строки имеют одинаковую длину - сортировать в естественном порядке

public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(StringUtil.getUniqueSortedWords(testString));
    }
Copy
// Output:
[для, слов, строка, которые, Тестовая, удаления, повторяются]
 */

import java.util.*;

public class Task_1 {
    public static void main(String[] args) {
        String strings = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println("Список слов: " + getUniqueSortedWords(strings));
    }

    private static List<String> getUniqueSortedWords(String strings) {
        String[] words = strings.trim().replaceAll("[^a-zA-Z0-9а-яА-Я ]", "").split("\\s+");
        System.out.println("Array: " + Arrays.toString(words));
        Set<String> words1 = new TreeSet<>(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));
        words1.addAll(Arrays.asList(words));
        System.out.println("Set: " + words1);
        return new ArrayList<>(words1);
    }
}
