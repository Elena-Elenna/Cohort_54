package homework_38.teacherHW;

import java.util.*;

/**
 * @author Sergey Bugaenko
 * {@code @date} 18.02.2025
 */

/*
Task 1
Напишите метод, принимающий строку и возвращающий Список ее слов без повторений,
отсортированный в порядке увеличения длин слов. Если строки имеют одинаковую длину - сортировать в естественном порядке

public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(StringUtil.getUniqueSortedWords(testString));
    }
Copy
// Output:
[для, слов, строка, которые, Тестовая, удаления, повторяются]
 */
public class Task1 {

    public static void main(String[] args) {
        String testString = "Тестовая строка для     удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(getUniqueSortedWords(testString));
    }

    private static List<String> getUniqueSortedWords(String string) {
        /*
        1. Избавиться от знаков препинания
        2. Разбить на слова (массив слов / список сло)
        3. Поместить в коллекцию, которая обеспечит уникальность и сортировку (SortedSet)
        4. Преобразовать результат в список и вернуть
         */

        // "    "


        // regex - s - Специальный знак обозначающий "пробельный символ" - пробел, табуляция, перевод каретки \r, перевод строки \n
        // s+ - пробельный символ в колве 1 или больше
        // массив слов, состоящих только из букв и цифр (без знаков пунктуации)
        String[] words = string.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "").split("\\s+");
//        System.out.println("words: " + Arrays.toString(words));

        Set<String> uniqueWords = new TreeSet<>(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));

        // Arrays.asList(T[] array) - преобразует массив в список
//        List<String> wordsList = Arrays.asList(words);
        uniqueWords.addAll(Arrays.asList(words));


        return new ArrayList<>(uniqueWords);
    }
}

















