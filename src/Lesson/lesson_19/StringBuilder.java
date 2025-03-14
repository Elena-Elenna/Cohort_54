package Lesson.lesson_19;

import java.util.Arrays;
import java.util.Scanner;

public class StringBuilder {
    public static void main(String[] args) {
        //Это спец.класс, предназначеный для эффективного создания и модификации изменяемых последовательностей символов
        //В отличии от класса String объекты String Builder могут изменяться без создания новых объектов в памяти,
        //что повышает производительность при частых операциях со строками
        // Имеет брата StringBuffer, в котором все методы работают так же, но немного медленее.
        // StringBuffer - потоко-безопасный.
        String str = "Java" + " " + "is" + " " + "the" + " " + "best";
        System.out.println(str);

        java.lang.StringBuilder sb = new java.lang.StringBuilder(); //Конструктор перегружен, может быть пустым, может принимать String
        java.lang.StringBuilder sb1 = new java.lang.StringBuilder("Hello");

        // append - Метод для добавления в конец строки (приклеять справа) / аналог конкатенации
        sb1.append(" ");
        sb1.append("World").append("!");

        // toString - Получить строковое представление (String)
        String string = sb1.toString();
        System.out.println(string);

        // insert - Вставить символы или слова в указанную позицию
        sb = new java.lang.StringBuilder("Hello World");
        sb.insert(6, "beautiful "); // в какую позицию вставлять, и что вставлять
        System.out.println(sb.toString());
        /*
        //beautiful - нужно вставить в середину строки в 6 индекс
        String s = "Hello World";
        String s1 = s.substring(0,6);
        String s2 = s.substring(6);
        System.out.println(s1);
        System.out.println(s2);
        String res = s1 + "beautiful " + s2;
        System.out.println(res);
         */

        // replace - Заменить подстроку (определяется индексами) на указанное значение
        sb = new java.lang.StringBuilder("Hello World!");
        sb.replace(6,11,"Java"); //верхняя граница не включается
        System.out.println(sb.toString());

        // delete - Удалить подстроку в диапазоне индексов
        sb = new java.lang.StringBuilder("Hello World!");
        sb.delete(5, 11);
        System.out.println(sb.toString());

        // reverse - разворачивает последовательность символов
        sb = new java.lang.StringBuilder("Hello World!");
        sb.reverse();
        System.out.println(sb.toString());

        // length - Колличество символов (длинна)
        System.out.println("sb.length: " + sb.length());

        // charAt - Получить символ по индексу
        char ch = sb.charAt(3);
        System.out.println(ch);

        // substring - Плучить подстроку по индексам
        sb = new java.lang.StringBuilder("Hello World!");
        String subString = sb.substring(1); //от индекса до конца строки
        System.out.println(subString);

        subString = sb.substring(6,9); //от start до end (верхняя граница не включительно
        System.out.println(subString);

        // setLength - Изменять размер последовательности символов
        sb = new java.lang.StringBuilder("Hello");
        System.out.println(sb.length());
        sb.setLength(10);   //если мы увеличиваем строку,она будет заполнена char с кодом 0
        System.out.println("setLength(10): " + sb.toString());

        char ch1 = sb.charAt(8);
        System.out.println("десятичный код символа: sb.charAt(8): " + (int) ch1);

        sb.setLength(3);
        System.out.println("setLength(3): " + sb.toString());

        //join - соединяет строки с учетом разделителя
        String exampl = String.join(" ", "Java","is","the","best");
        System.out.println(exampl);

        // split - обратный процес join (можно с его помощью из предложения сделать массив строк из слов)
        String[] strings = exampl.split(" ");
        System.out.println(Arrays.toString(strings));

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        /*
        Написать метод, который запрашивает у пользователя строку, состоящую из нескольких слов
        и возвращающий аббревиатуру этой фразы (первые буквы каждого слова, записанные в верхнем регистре)
        Привет Джава разработчикам -> ПДР
        Использовать StringBuilder
         */

        String result = pharseString();
        System.out.println(result);
    }

    private static String pharseString() {
        /*
        1. Запросить у пользователя строку
        2. Разбить строку на массив слов
        3. Перебрать все слова в цикле
        4. Из каждого слова взять первую букву, приклеить ее к результату
        5. Когда все слова перебрали - получить строку, привести ее к верхнему регистру -> вернуть
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку, состоящую из нескольких слов");
        String input = scanner.nextLine();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        // String result = "";
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            sb.append(word.charAt(0));
            // result = result + word.charAt(0);
        }
        return sb.toString().toUpperCase();
    }
}
