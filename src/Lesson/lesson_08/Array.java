package Lesson.lesson_08;

import java.util.Random;

public class Array {
    public static void main(String[] args) {

        int[] array; // Объявление массива
        String[] strings;
        // int array1[]; // альтернативный способ объявления массива. Не рекомендуется использовать.

        array = new int[4]; // создание (инициализация массива типа int с 4 ячейками
        strings = new String[10]; // создали массив строк с 10 ячейками.

        int[] array2 = new int[8]; // Объявили и инициализировали массив int на 8 ячеек

        /*
                Значения по умолчанию:
                1. Для всех числовых типов (в том числе char) это будет 0 (0.0)
                2. Для boolean - false
                3. Для всех ссылочных типов - null (null - ничего)
         */

        boolean[] bools = new boolean[4];
        System.out.println("bools[3]: " + bools[3]);


        // Обращение к элементу массиву по индексу (номеру ячейки)
        int value = array2[0];
        System.out.println("array2[0]: " + value); // 0
        System.out.println("strings[2]: " + strings[2]); // null

        System.out.println("\n =========================");
        int[] numbers = new int[]{45, 56, -16, 45, 0, 159, 1444}; // явная инициализация массива
        int length = numbers.length; // длина массива (количество ячеек / элементов в массиве)
        System.out.println("длина массива (количество ячеек / элементов) в массиве numbers : " + length);

        int[] ints = {-10, 54, 32323, 444}; // Явная инициализация массива

        System.out.println("В 0 ячейке массива numbers находится число: " + numbers[0]);
        System.out.println("В 2 ячейке массива ints находится число: " + ints[2]);
        System.out.println("В 9 ячейке массива string находится число: " + strings[9]);

        System.out.println(ints); // Получим визуализированную ссылку на адрес в памяти (Heap) находится наш массив

        System.out.println("\n =====================");
        System.out.println("Распечатываем массив ints:");

        int i = 0;
        while (i < ints.length) {
            System.out.print(ints[i] + ", ");
            i++;
        }
        System.out.println();

        // [1, 3, 5, 6, 7]

        System.out.println("\n ====== Распечатываем массив красиво =======");
        String arrayToString = "[";
        i = 0;
        while (i < numbers.length) {
            arrayToString += numbers[i]; // приклеиваем текущее значение из массива

            // Проверяем, является ли элемент последним в массиве
            if (i != numbers.length - 1) {
                arrayToString += ", ";
            } else {
                arrayToString += "]";
            }

            i++;
        }
        System.out.println(arrayToString);

        System.out.println("\n =========== Присвоение значений элемента массива");
        int[] numbers2 = new int[10];

        numbers2[2] = 10; // Присвоение нового значения элементу массива с индексом 2
        System.out.println("numbers2[2]: " + numbers2[2]);

        // Заполнить массив случайными числами в диапазоне от 0 до 100
        Random random = new Random();

        int k = 0;
        System.out.print("[");
        while (k < numbers2.length) {
            numbers2[k] = random.nextInt(101);
            System.out.print(numbers2[k] + ", ");
            k++;
        }
        System.out.println("]\n");


        System.out.println("\n ===== Поиск минимального значения в массиве ======== ");
        i = 0;
        int min = numbers2[0];
        while (i < numbers2.length) {
            if (numbers2[i] < min) {
                min = numbers2[i];
            }
            i++;
        }
        System.out.println("минимальное значение в массиве: " + min);

    }
}
