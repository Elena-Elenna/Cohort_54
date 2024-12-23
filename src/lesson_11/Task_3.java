package lesson_11;
/*
Task 3
Написать метод, принимающий на вход массив целых чисел.
Метод должен вернуть массив, состоящий только из простых чисел, присутствующих в изначальном массиве
 */

import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {
        int[] array = {0, 13, -25, 11, 31, 55, 67, 98, 11, 5, 100003};

        int[] primeArray = getArrayOnlyWithPrime(array);
        System.out.println(Arrays.toString(primeArray));
    }

    public static int[] getArrayOnlyWithPrime(int[] numbers) {

        /*
        1. Посчитать кол-во простых чисел в массиве -> count
        2. Создать массив нужной длины (count)
        3. Записать в массив все простые числа
        4. Вернуть из метода массив
         */

        // Считаем простые числа
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i])) {
                count++;
            }
        }

        // Если простые числа не найдены -> возвращаю пустой массив
        if (count == 0) return new int[0];


        // Создадим массив, в котором будут хранится простые числа
        int[] result = new int[count];

        // Заполняем его простыми числами
        for (int i = 0, idxPrime = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i])) {
                result[idxPrime] = numbers[i];
                idxPrime++;
            }
        }

        return result;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        // n -> Простое, число, которое делится только на 1 и само себе без остатка.
        // 2, 3, 4...n-1;
        //  100 -> 2..99 -> 2...10
        // 67 -> 2..66 ->
        // Math.sqrt - взять квадратный корень числа
        System.out.println("Проверяем: " + number);
        for (int i = 2; i <= Math.sqrt(number); i++) {
            System.out.print(i + ", ");
            if (number % i == 0) return false;
        }
        System.out.println();
        return true;
    }
}
