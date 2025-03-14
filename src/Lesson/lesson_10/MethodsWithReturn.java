package Lesson.lesson_10;

import java.util.Random;

public class MethodsWithReturn {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        int sum = a + b;
        System.out.println("sum: " + sum);

        int result = calculateSum(a, b);
        System.out.println("result: " + result);

        System.out.println(calculateSum(3, 7));

        double square = squareNumber(2.5);
        System.out.println("square: " + square);

        System.out.println("squareNumber(4.0): " + squareNumber(4.0));
        System.out.println("squareNumber(5): " + squareNumber(5));

        String res = concatString("Java", 17);
        System.out.println("res: " + res);

        // Заполнение массива
        int[] ints = fillArray();

        System.out.print("[");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + (i != ints.length - 1 ? ", " : "]\n"));
        }
    }  ///////

    // Метод, который возвращает массив интов на 10 элементов, заполненный случайными значениями
    public static int[] fillArray() {
        int[] result = new int[10];

        Random random = new Random();
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt();
        }

        return result;
    }


    public static String concatString(String str, int x) {
        String result = str + x + "!!!";
        return result;
    }

    // Написать метод возвращающий квадрат числа
    public static double squareNumber(double number) {
        return number * number;
    }

    public static int calculateSum(int a, int b) {

        int sum = a + b;
        // System.out.println(sum);
        return sum; // завершение работы метода и возвращение результата
        // System.out.println(); после выполнения оператора return код в методе не выполняется
    }
}
