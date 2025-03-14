package Lesson.lesson_05;

public class Strings {
    public static void main(java.lang.String[] args) {

        java.lang.String string = "Java"; // Обьявление и инициализация переменной типа String
        java.lang.String string1 = new java.lang.String("Hello"); // Тоже создание новой строки

        System.out.println(string);
        System.out.println(string1);

        // название метода с круглыми скобками - вызов метода
        System.out.println(string.length()); // колличество символов в строке (длина строки)

        // метод позволяет перевести все символы строки в верхний регистр
        System.out.println(string.toUpperCase()); //перевести все символы строки в верхний регистр
        System.out.println(string);

        // String - иммутабельна (неизменяемая)
        //если я хочу сохранить результат работы метода, я должна его сохранить в какую то переменную
        java.lang.String string2 = string.toUpperCase();
        System.out.println("string2: " +string2);
        System.out.println("string: " +string);

        // toLowerCase() - переводит все символы строки в нижний регистр
        string2 = string2.toLowerCase();
        System.out.println("string2: " +string2);

        System.out.println("++++++++++++++");

        java.lang.String str1 = "One";
        java.lang.String str2 = " ";
        java.lang.String str3 = "hello";

        //различные варианты склеивания/ обьединения/ конкатенации строк
        // Конкатенация строк
        java.lang.String concatStr = str1 + str2 + str3 + "!!!";
        System.out.println(concatStr);

        java.lang.String concatStr2 = str1.concat(str2); // str1 + str2
        concatStr2 = concatStr2.concat(str3);
        System.out.println(concatStr2);

        java.lang.String concatStr3 = str1.concat(str2).concat(str3).concat("???"); // str1 +str2 +str3 +"???"
        System.out.println(concatStr3);

        java.lang.String concatStr4 = java.lang.String.join("---",str1, str3, "!!!");
        System.out.println("concatStr4: " + concatStr4);


        System.out.println("========================");

        // Приведение типов
        // когда есть строка - знак "+" -знак конкатенации.
        // И все операнды (учасники операции) преобразуются к строке
        int a = 1; //"1"
        int b = 2;
        java.lang.String st="Hello";
        // 1+2=3 -> "3" + "hello" + (1+2)
        // приоритет операций мы можем задавать скобками
        System.out.println(a + b + st + "=" + (a+b));


        System.out.println("===========================\n");

        java.lang.String digits = "0123456789";
        System.out.println(digits.length());
        java.lang.String digits2 = "9876543210";

        char firstChar = digits.charAt(0); // взять символ под индекс (номером) 0 из строки digits
        char firstChar2 = digits2.charAt(0); //взять символ под индекс (номером) 0 из строки digits2
        System.out.println("first from digits: " +firstChar);
        System.out.println( "first from digits2: " +firstChar2);

        int length = digits.length();
        //Независимо от фактической длины строки, индекс последнего элемента всегда равен длина минус 1
        char lastChar = digits.charAt(digits.length() -1);
        System.out.println("last from digits: " + lastChar);
        System.out.println(digits2.charAt(digits2.length() -1)); //последний символ в строке digits2

        System.out.println("======= String ========\n");
        java.lang.String subString = digits.substring(2);//выделить подстроку начиная с индекса 2 до конца строки
        System.out.println("digits.substring(2): " + subString);
        System.out.println("digits: " +digits); // начальная строка остается неизменной
        //           [2,7) -> 2,3,4,5,6
        subString = digits.substring(2,7); //взять подстроку от индекса 2(включительно) до индекса 7(не включительно)
        System.out.println("digits.substring(2,7): " +subString);

        System.out.println("====== Replace ======\n");

        java.lang.String string4 = "OneTwoOneTwoThree";
        java.lang.String replase = string4.replace("One","Stop");//заменить все найденые строки "One" на "Stop"
        System.out.println("replece:" +replase);

        replase = string4.replaceFirst("One","Stop");//заменить первое найденое "One" на "Stop"
        System.out.println("repleceFirst: " +replase);

    }
}
