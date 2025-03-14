package Consultation.consultation_10;

import java.util.Arrays;

public class Consultation10 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};

        // Пример использования Arrays.sort() (без компаратора)
        System.out.println("Исходный массив чисел: " + Arrays.toString(numbers));
        // Сортируем массив по убыванию
        Arrays.sort(numbers);
        System.out.println("Отсортированный массив чисел: " + Arrays.toString(numbers));

        // Создаем массив строк
        String[] strings = {"apple", "banana", "orange", "Avocado", "apricot"};

        // Сортировка без компаратора (по лексикографическому порядку)
        System.out.println("Исходный массив чисел:" + Arrays.toString(strings));
        Arrays.sort(strings);
        System.out.println("Сортировка по умолчанию (лексикографическая): " + Arrays.toString(strings));

        // Пример использования Arrays.binarySearch()
        // Ищет число 5 в отсортированном массиве
        int index = Arrays.binarySearch(numbers, 5);
        System.out.println("Индекс числа 5: " + index); // Выведет индекс первого вхождения 5

        index = Arrays.binarySearch(numbers,10);

        if (index >= 0) {
            System.out.println("Индекс числа 10: " + index);
        } else {
            System.out.println("Число 10 в массиве отсутствует");
        }

        // Пример использования Arrays.equals()
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = {3, 2, 1};

        // Сравнивает два массива
        boolean isEqual1 = Arrays.equals(array1, array2);
        boolean isEqual2 = Arrays.equals(array1, array3);
        boolean isEqual3 = Arrays.equals(array2, array3);
        System.out.println("array1 равен array2: " + isEqual1);
        System.out.println("array1 равен array3: " + isEqual2);
        System.out.println("array2 равен array3: " + isEqual3);

        // Пример использования Arrays.copyOf()
        int[] originalArray = {7, 4, 8, 2, 9};
        int[] newArray = Arrays.copyOf(originalArray, 3);
        // Создает копию первых 3 элементов
        System.out.println("Оригинальный массив: " + Arrays.toString(originalArray));
        System.out.println("Копия массива: " + Arrays.toString(newArray));

        // Пример Arrays.copyOfRange
        // Создает копию элементов с индекса 1 (включительно) до 4 (исключительно)
        int[] newArray2 = Arrays.copyOfRange(originalArray, 1, 4);
        System.out.println("Копия части массива: " + Arrays.toString(newArray2));
    }
}
