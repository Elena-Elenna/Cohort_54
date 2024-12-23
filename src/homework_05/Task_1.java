package homework_05;

import java.util.Scanner;

/*
Task 1
Напишите программу, которая будет просить у пользователя ввести его имя с клавиатуры.
Используя Scanner, сохраните имя в переменную типа String.
Выведите на экран количество символов в имени пользователя.
Создайте две переменные типа char:
одна должна хранить первый символ имени, другая — последний.
Выведите на экран десятичный код (код символа в десятичной системе счисления)
первого и последнего символа имени.
 */
public class Task_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.println(name);

        int nameDlina = name.length();
        System.out.println("Количество символов в имени: " +nameDlina);

        char name1 = name.charAt(0);
        char name2 = name.charAt(nameDlina -1);
        System.out.println("Первый символ имени: " +name1);
        System.out.println("Последний символ имени: " +name2);

        System.out.println("Код первого символа: " +(int)name1);
        System.out.println("Код последнего символа: " +(int)name2);


        // +++++++++++++++++++++++++++++++++++++++++++++++++++++



        System.out.println("Введите ваше имя:");
        String name3 = scanner.nextLine();

        int length = name3.length();
        System.out.println("количество символов в имени пользователя: " + length);

        char firstChar = name3.charAt(0);
        char lastChar = name3.charAt(length -1);

        System.out.println("Код первого символа: " + (int) firstChar);
        System.out.println("Код последнего символа: " + (int) lastChar);
    }
}
