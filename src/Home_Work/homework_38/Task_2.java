package Home_Work.homework_38;
/*
Task 2
Создайте два множества строк (Set<String>), каждое из которых будет заполнено различными словами.
Некоторые слова должны повторяться в обоих множествах.

Реализуйте метод union(Set<String> set1, Set<String> set2),
который возвращает множество, содержащее все уникальные элементы из обоих множеств (объединение множеств).

Реализуйте метод intersection(Set<String> set1, Set<String> set2),
который возвращает множество, содержащее только элементы,
которые присутствуют в обоих исходных множествах (пересечение множеств).

Реализуйте метод difference(Set<String> set1, Set<String> set2),
который возвращает множество элементов, которые есть в первом множестве, но отсутствуют во втором (разность множеств).

Результат каждого метода необходимо выводить в консоль для наглядности.

Следует обеспечить, чтобы в исходных множествах были как уникальные, так и общие элементы для наглядности результатов операций.
Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D"));
Set<String> set2 = new HashSet<>(List.of("C", "D", "E", "F"));

System.out.println(SetUtils.union(set1, set2));
System.out.println(SetUtils.intersection(set1, set2));
System.out.println(SetUtils.difference(set1, set2));

// Output:
[A, B, C, D, E, F]
[C, D]
[A, B]
 */

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task_2 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D"));
        Set<String> set2 = new HashSet<>(List.of("C", "D", "E", "F"));
        System.out.println(union(set1, set2));
        System.out.println(intersection(set1, set2));
        System.out.println(difference(set1, set2));
        System.out.println("++++++++++++++++++++++++++++++++++++");
        Set<Integer> set3 = new HashSet<>(List.of(1, 2, 3, 4));
        Set<Integer> set4 = new HashSet<>(List.of(3, 4, 5, 6));
        System.out.println(union(set3, set4));
        System.out.println(intersection(set3, set4));
        System.out.println(difference(set3, set4));
    }

    private static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    private static <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    private static <T> Set<T> difference(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.removeAll(set2);
        return result;
    }
}
