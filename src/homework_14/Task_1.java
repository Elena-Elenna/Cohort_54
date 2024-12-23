package homework_14;
/*
Task 1
Сумма четных чисел
Напишите метод, который вычисляет сумму всех четных чисел в массиве.
 */

import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr));
        System.out.println("Сумма четных чисел: " + sumOfEvenNumbers(arr));

    } //Methods area
    public static int sumOfEvenNumbers(int[] array) {
        if (array == null || array.length == 0) return 0;

        int summa = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) summa += array[i];
        }
        return summa;
    }
}
