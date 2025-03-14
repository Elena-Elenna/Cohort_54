package Lesson.lesson_12;

import java.util.Arrays;

public class ArraysUtils {
    public static void main(String[] args) {

        int[] numbers = {34, 21, 67, 41, 10, 80, 0, 87, 99, 38, 57, 3, 77};

        int index = linearSearch(numbers, 50);
        System.out.println("index: " + index);

        if (index >= 0) {
            System.out.println("Число в массиве есть");
        }

        if (index == -1) {
            System.out.println("Число в массиве не найдено");
        }

        int minIdx = minIndex(numbers);
        System.out.println("minIdx: " + minIdx);

        System.out.println("\n ======== Сортировка ============ \n");
        System.out.println("До сортировки:" + Arrays.toString(numbers));
        sortSelection(numbers);

        System.out.println("После сортировки: " + Arrays.toString(numbers));

        int idxBinary = binarySearch(numbers, 200);
        System.out.println("idxBinary: " + idxBinary);
    }

    /*
    Метод линейного поиска элемента массива
    Осуществляется перебором всех элементов массива и сравниванием с искомым значением
    Если значение найдено - возвращаем индекс элемента массива
    Если не найдено - возвращаем минус -1.
     */

    public static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        // Ни один элемент не равен искомому - возвращаем минус 1
        return -1;
    }

    // Метод ищет минимальное значение по всему массиву и возвращает его индекс
    public static int minIndex(int[] arr) {
        int min = arr[0];
        int minIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }



    // Метод ищет минимальное значение в части массива от стартового индекса и до конца массива.
    // И возвращает его индекс

    public static int minIndex(int[] arr, int startIndex) {
        int min = arr[startIndex];
        int minIndex = startIndex;

        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }


    /*
    Сортировка выбором
    Выбирается минимальный элемент массива
    Минимальное значение меняется местами с первым элементом
    Вторая итерация - выбирается мин элемент в оставшейся части массива
    меняется местами с первым элементом из оставшейся части массива
     */

    public static void sortSelection(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int localMin = minIndex(array, i);

            int temp = array[i];
            array[i] = array[localMin];
            array[localMin] = temp;
        }

    }

    public static int binarySearch(int[] array, int target) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex;

        int counter = 0;

        // Проверка, что часть массива можно разделить
        while (startIndex <= endIndex) {
            counter++;

            // Вычислить средний индекс
            middleIndex = startIndex + (endIndex - startIndex) / 2;

            // Сравниваем значение в среднем индексе с искомым
            if (array[middleIndex] == target) {
                System.out.println("Найдено за " + counter + " шагов");
                return middleIndex;
            }


            // Если значения не равны - определяем какую половину массива мы отбросим
            if (array[middleIndex] > target) {
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }
        }

        // Если цикл закончился (не осталось частей массива, которые можно поделить пополам)
        // значит искомое значение в массиве отсутствует
        System.out.println("Значение не найдено! Шагов сделано: " + counter);
        return -1;

    }
}
