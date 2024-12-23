package homework_11;
/*
Task 4 * (Опционально)
Написать метод, который удаляет все вхождения заданного числа из массива
и возвращает новый массив без этого числа.
 */

import java.util.Arrays;

public class Task_4 {
    public static void main(String[] args) {


        // Примеры тестов
        double[] array1 = {1.0, 2.2, 3.3, -4.4, 2.2, 5.5, Double.NaN};
        double[] array2 = {};
        double[] array3 = null;

        // Тесты
        double[] result1 = removeElement(array1, 2.2); // Удалит все 2.2
        double[] result2 = removeElement(array2, 3.3); // Пустой массив
        double[] result3 = removeElement(array3, 1.1); // Null массив
        double[] result4 = removeElement(array1, -4.4); // Удаление отрицательного числа
        double[] result5 = removeElement(array1, Double.NaN); // Удаление NaN

        // Вывод результатов
        System.out.println(java.util.Arrays.toString(result1)); // [1.0, 3.3, -4.4, 5.5, NaN]
        System.out.println(java.util.Arrays.toString(result2)); // []
        System.out.println(java.util.Arrays.toString(result3)); // null
        System.out.println(java.util.Arrays.toString(result4)); // [1.0, 2.2, 3.3, 2.2, 5.5, NaN]
        System.out.println(java.util.Arrays.toString(result5)); // [1.0, 2.2, 3.3, -4.4, 2.2, 5.5]

        // ++++++++++++++++++++++++++++++++++++++++++++++

        int[] array = {2, 2, 3, 6, 7, 2, 5}; // 2
        int[] res = removeElement(array, 2);
        System.out.println(Arrays.toString(res));


    } // Methods area

    public static double[] removeElement(double[] array, double numberToRemove) {
        // Проверка на null
        if (array == null) {
            return null;
        }

        // Проверка на пустой массив
        if (array.length == 0) {
            return new double[0];
        }

        // Подсчет количества элементов, которые не равны numberToRemove
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            // Проверка на NaN и сравнение с числом с плавающей точкой
            if (array[i] != numberToRemove || (numberToRemove != numberToRemove)) {
                count++;
            }
        }

        // Создание нового массива нужного размера
        double[] resultArray = new double[count];
        int index = 0;

        // Заполнение нового массива элементами, которые не равны numberToRemove
        for (int i = 0; i < array.length; i++) {
            // Проверка на NaN и добавление в новый массив
            if (array[i] != numberToRemove || (numberToRemove != numberToRemove)) {
                resultArray[index] = array[i];
                index++;
            }
        }
        return resultArray;
    }

    // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public static int[] removeElement(int[] nums, int element) {
        // Сколько элементов мне нужно удалить?
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element) {
                count++;
            }
        }

        int[] result = new int[nums.length - count];

        for (int i = 0, idx = 0; i < nums.length; i++) {
            if (nums[i] != element) {
                // надо записывать
                result[idx] = nums[i];
                idx++;
            }
        }

        return result;
    }
}
