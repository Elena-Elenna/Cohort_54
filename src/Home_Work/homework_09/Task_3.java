package Home_Work.homework_09;
/*
Task 3 * (Опционально)
Заполните массив 50 случайными числами от 1 до 100.
Программа должна найти, и вывести на экран все простые числа.
Посчитайте сколько получилось таких чисел в массиве.
Простое число - число, которое делится на цело только на 1 и само себя.
Пример простых чисел: 3, 5, 7, 11, 13 и т.д.
 */

import java.util.Random;

public class Task_3 {
    public static void main(String[] args) {
        int[] numbers = new int[50]; // Массив на 50 элементов
        Random rand = new Random();
        int primeCount = 0; // Для подсчета количества простых чисел
        int i = 0;

        while (i < numbers.length) { // Заполняем массив случайными числами от 1 до 100
            numbers[i] = rand.nextInt(100) + 1; // Генерация числа от 1 до 100
            i++;
        }
        System.out.println("Простые числа в массиве:");
        i = 0; // Сбрасываем счетчик i, чтобы пройтись по массиву заново

        while (i < numbers.length) { // // Проходим по каждому элементу массива
            int num = numbers[i];
            if (isPrime(num)) { // Если число простое
                System.out.print(num + " ");
                primeCount++; // Увеличиваем счетчик простых чисел
            }
            i++;
        }
        System.out.println("\nКоличество простых чисел: " + primeCount);
    }

    // Метод для проверки, является ли число простым
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false; // Число меньше 2 не может быть простым
        }
        int divisor = 2;
        while (divisor <= num / 2) {
            if (num % divisor == 0) {
                return false; // Нашли делитель, значит число не простое
            }
            divisor++;
        }
        return true; // Если делителей нет, число простое
    }
}
