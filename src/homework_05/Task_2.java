package homework_05;
/*
Task 2
Создайте строки:
"Java"
"is"
"a"
"powerful"
"language"
Склейте эти строки двумя разными способами,
чтобы получить строку: "Java is a powerful language".
Выведите на экран получившуюся строку и её длину.
 */

public class Task_2 {
    public static void main(String[] args) {

        String str = "Java";
        String str1 = "is";
        String str2 = "a";
        String str3 = "powerful";
        String str4 = "language.";
        String concatStr = String.join(" ",str,str1,str2,str3,str4);
        System.out.println(concatStr);
        System.out.println(concatStr.length());


        String a = "Java";
        String a1 = " ";
        String b = "is";
        String b1 = " ";
        String c = "a";
        String c1 = " ";
        String d = "powerful";
        String d1 = " ";
        String e = "language";
        String concatString = a+a1+b+b1+c+c1+d+d1+e+"!";
        System.out.println(concatString);
        System.out.println(concatString.length());

        // +++++++++++++++++++++++++++++++++++++++++++++++++++
        String st = "Java";
        String st1 = "is";
        String st2 = "a";
        String st3 = "powerful";
        String st4 = "language";

        String space = " ";

        String concatSt = String.join(space, st, st1, st2, st3, st4);
        System.out.println("concatStr1: " + concatSt + "; длина строки: " + concatSt.length());

        concatSt = st.concat(space)
                .concat(st1).concat(space)
                .concat(st2).concat(space)
                .concat(st3).concat(space)
                .concat(st4);

        System.out.println("concatStr2: " + concatSt + "; длина строки: " + concatSt.length());

        String result = concatSt.replace("powerful", "super");
        System.out.println("result: " + result);


        // Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
        boolean isContains = result.contains("age");

    }
}
