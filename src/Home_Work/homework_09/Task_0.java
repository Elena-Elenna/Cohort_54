package Home_Work.homework_09;
/*
Task 0
Написать метод, принимающий на вход строку.
Метод должен вывести на экран число, соответсвующее количеству символов в строке.
Например: Если в метод пришла строка "hello" - метод должен вывести число 5 (так как в строке hello 5 символов)
 */

public class Task_0 {
    public static void main(String[] args) {
        String str = "hello";
        characters(str);


        String hello = "Hello";

        printStringLength(hello);
        printStringLength("Hello World!");

    } // Methods area

    public static void characters (String str) {
        int length = str.length();
        System.out.println("Кол-во символов в строке: " + length);

    }
    // +++++++++++++++++++++++++++++++++++++++++++++++++


    public static void printStringLength (String string){
        System.out.println(string.length());
    }
}
