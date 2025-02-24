package homework_38.teacherHW;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Sergey Bugaenko
 * {@code @date} 18.02.2025
 */

/*
Task 3
Опционально
Написать метод, возвращающий первый неповторяющийся символ в строке

public static void main(String[] args) {
        String string = "abcdefj ab,cdf,";
        System.out.println(StrUtil.getFirstUniqueChar(string));
    }

    //Output:
    e

 */

public class Task3 {
    public static void main(String[] args) {
        String string = "AAAabcdefj ab,cdf,";
        System.out.println(getFirstUniqueChar(string));
        System.out.println("\nНе правильный вариант решения!");
        System.out.println(getFirstUniqueChar2(string));
    }

    private static Character getFirstUniqueChar(String string) {
        Set<Character> uniqueChars = new LinkedHashSet<>();
        Set<Character> repeatedChars = new HashSet<>();

        // Перебираем символы в строке
        for (char ch : string.toCharArray()) {

            // Проверяем, присутствует ли текущий символ в сете повторов
            if (repeatedChars.contains(ch)) {
                continue; // если да, переходим к следующему символу
            }

            // Проверяем, присутствует ли он в сете уникальных
            if (uniqueChars.contains(ch)) {
                uniqueChars.remove(ch); // если да, убираем символ из уникальных
                repeatedChars.add(ch); // добавляем в повторяющиеся
            } else {
                uniqueChars.add(ch);
            }
        }

        System.out.println("repeated chars: " + repeatedChars);
        System.out.println("unique chars: " + uniqueChars);

        return uniqueChars.isEmpty() ? null : uniqueChars.iterator().next();

    }



    private static Character getFirstUniqueChar2(String string) {
        // Это решение работает не правильно!

        Set<Character> uniqueChars = new LinkedHashSet<>();

        // string.toCharArray() - > char[] - из строки получить массив char
        for (char ch : string.toCharArray()) {
           if (!uniqueChars.add(ch)) {
               uniqueChars.remove(ch);
           }
        }

        System.out.println(uniqueChars);

        /*
        1. Проверить не пустой ли вообще список.
        2. Как-то взять по другому первый элемент
         */

        return uniqueChars.isEmpty() ? null : uniqueChars.iterator().next();

//        return new ArrayList<>(uniqueChars).get(0); // достучаться до элемента оп индексу, преобразовав set в list


    }
}
