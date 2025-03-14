package Lesson.lesson_07;

public class StringEquals {
    public static void main(String[] args) {

        int x=10;
        String str1 = "Java";
        String str2 = "Java";
        String str3 = "JAVA";
        String str4 = new String("Java");

        System.out.println(str1 + "|" + str2 + "|" + str3 + "|" + str4);

        boolean b1 = str1 == str2;
        System.out.println("str1 == str2: " + b1); // true
        System.out.println("str1 == str2: " + (str1 == str3)); //сравнивается значение ссылок.
        // Адрес привязанного обьекта в памяти - true
        System.out.println("str1 == str4: " + (str1 == str4)); // false

        System.out.println("========= Equals ======");

        // ВАЖНО !!!!!!!
        // СРАВНЕНИЕ СТРОК ПО ЗНАЧЕНИЮ МЫ ДОЛЖНЫ ДЕЛАТЬ МЕТОДОМ  equals  !!!!!!!!

        boolean isEquals = str1.equals(str2);

        System.out.println(str1 + ".equals(" + str2 +") -> " + isEquals); //true
        System.out.println(str1 + ".equals(" + str3 +") -> " + str1.equals(str3)); //false
        System.out.println(str1 + ".equals(" + str4 +") -> " + str1.equals(str4)); //true
        System.out.println(str1 + ".equalsIgnoreCase(" + str3 +") -> " + str1.equalsIgnoreCase(str3)); //true

        // equalsIgnoreCase - сравнение двух строк по значению с игнорированием верхнего регистра.

    }
}
