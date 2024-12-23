package lesson_05;

public class StringExample {
    public static void main(String[] args) {

        String string = "Java"; // Обьявление и инициализация переменной типа String
        String string1 = new String("Hello"); // Тоже создание новой строки

        System.out.println(string);
        System.out.println(string1);

        // название метода с круглыми скобками - вызов метода
        System.out.println(string.length()); // колличество символов в строке (длина строки)

        // метод позволяет перевести все символы строки в верхний регистр
        System.out.println(string.toUpperCase()); //перевести все символы строки в верхний регистр
        System.out.println(string);

        // String - иммутабельна (неизменяемая)
        //если я хочу сохранить результат работы метода, я должна его сохранить в какую то переменную
        String string2 = string.toUpperCase();
        System.out.println("string2: " +string2);
        System.out.println("string: " +string);

        // toLowerCase() - переводит все символы строки в нижний регистр
        string2 = string2.toLowerCase();
        System.out.println("string2: " +string2);

        System.out.println("++++++++++++++");

        String str1 = "One";
        String str2 = " ";
        String str3 = "hello";

        //различные варианты склеивания/ обьединения/ конкатенации строк
        // Конкатенация строк
        String concatStr = str1 + str2 + str3 + "!!!";
        System.out.println(concatStr);

        String concatStr2 = str1.concat(str2); // str1 + str2
        concatStr2 = concatStr2.concat(str3);
        System.out.println(concatStr2);

        String concatStr3 = str1.concat(str2).concat(str3).concat("???"); // str1 +str2 +str3 +"???"
        System.out.println(concatStr3);

        String concatStr4 = String.join("---",str1, str3, "!!!");
        System.out.println("concatStr4: " + concatStr4);


        System.out.println("========================");

        // Приведение типов
        // когда есть строка - знак "+" -знак конкатенации.
        // И все операнды (учасники операции) преобразуются к строке
        int a = 1; //"1"
        int b = 2;
        String st="Hello";
        // 1+2=3 -> "3" + "hello" + (1+2)
        // приоритет операций мы можем задавать скобками
        System.out.println(a + b + st + "=" + (a+b));


        System.out.println("===========================\n");

        String digits = "0123456789";
        System.out.println(digits.length());
        String digits2 = "9876543210";

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
        String subString = digits.substring(2);//выделить подстроку начиная с индекса 2 до конца строки
        System.out.println("digits.substring(2): " + subString);
        System.out.println("digits: " +digits); // начальная строка остается неизменной
        //           [2,7) -> 2,3,4,5,6
        subString = digits.substring(2,7); //взять подстроку от индекса 2(включительно) до индекса 7(не включительно)
        System.out.println("digits.substring(2,7): " +subString);

        System.out.println("====== Replace ======\n");

        String string4 = "OneTwoOneTwoThree";
        String replase = string4.replace("One","Stop");//заменить все найденые строки "One" на "Stop"
        System.out.println("replece:" +replase);

        replase = string4.replaceFirst("One","Stop");//заменить первое найденое "One" на "Stop"
        System.out.println("repleceFirst: " +replase);

    }
}
