package Home_Work.homework_09;
/*
Task 5
Написать метод, который принимает массив строк.
Вывести на экран все символы самой длинной строки из массива.

Пример:

{ "One", "Two", "Twenty" } ->

T
w
e
n
t
y
 */


public class Task_5 {
    public static void main(String[] args) {
        String[] array = {"One", "Two", "Twenty"};
        longestLine(array);

    } // Methods area
    public static void longestLine(String[] strings) {
        if (strings.length == 0) {
            System.out.println("Пустая строка");
            return;
        }
        String str = strings[0];
        int i = 1;
        while (i < strings.length) {
            if (strings[i].length() > str.length()) {
                str = strings[i];
            }
            i++;
        }
        int k =0;
        while (k < str.length()) {
            System.out.println(str.charAt(k));
            k++;
        }
    }
}
