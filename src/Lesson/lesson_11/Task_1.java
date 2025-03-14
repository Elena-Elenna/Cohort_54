package Lesson.lesson_11;
/*
Task 1
Написать метод со следующим функционалом:

На вход метод принимает массив целых чисел и число - длину нового массива.

Метод должен создать и распечатать массив заданной в параметрах длинны.

В начало массива должны быть скопированы элементы из входящего массива:

{0, 1, 2, 3, 4, 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}

{0, 1, 2} -> copyOfArray(array, 5) -> вывод на печать {0, 1, 2, 0, 0}

Arrays.copyOf() использовать нельзя. Суть задачи - написать собственную реализацию этого метода
 */

import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {
        // [0, 1, 2, 3, 4, 5, 6]
        int[] numbers = {0, 1, 2, 3, 4, 5, 6};

        copyOfArray(numbers, 3);

        int[] numbers2 = {0, 1, 2};
        copyOfArray(numbers2, 5);

        int[] ints = null;
        copyOfArray(ints, 5);
    }


    public static void copyOfArray(int[] array, int newLength) {

        if (array == null) {
            // В void оператор return заканчивает работу метода.
            return;
        }

        // [0, 0, 0, 0]
        int[] result = new int[newLength];

        /*
            Массив всегда при создании заполняется значениями по умолчанию
            числовые типы (в том числе char) -> 0 / 0.0
            boolean -> false
            ссылочные типы данных (в том числе String) -> null
         */

        System.out.println("длина source: " + array.length);
        System.out.println("длина result: " + result.length);

        // Цикл закончит свою работу как только i выйдет за границы любого из двух массивов
        for (int i = 0; i < array.length && i < result.length  ; i++) {
            System.out.println("Текущий индекс: " + i);
            result[i] = array[i];
        }

        // Метод возвращает строковое представление массива
//        String arrayStr = Arrays.toString(result);
//        System.out.println(arrayStr);
        System.out.println(Arrays.toString(result));

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

}
