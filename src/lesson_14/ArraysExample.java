package lesson_14;

import java.util.Arrays;
import java.util.Random;

public class ArraysExample {
    public static void main(String[] args) {
        int[] array = {3,2,1,0};

        // Возвращает строковое представление массива
        String arrayToString = Arrays.toString(array);
        System.out.println(arrayToString);
        System.out.println(Arrays.toString(array));

        // sort - Сортирует указанный массив
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        //binarySearch - Бинарный поиск (массив должен быть отсортирован)
        // Возвращает индекс элемента, если не найден - возвращает отрицательное значение
        int index = Arrays.binarySearch(array,3);
        System.out.println("index: " + index);

        // [0,1,2,3,]
        // Метод проверяет равны ли два массива
        int[] test ={0,1,3,2};
        boolean iaArraysEquals = Arrays.equals(array,test);
        System.out.println("iaArraysEquals: " + iaArraysEquals);

        //Находит и возвращает индекс первого различия между массивами
        int mismatchIndex = Arrays.mismatch(array,test);
        System.out.println("mismatchIndex: " + mismatchIndex);

        //Многомерные массивы
        int[][] arrayD = new int[6][5];

        //Возвращает строковое представление многомерных массивов (включая вложенные массивы)

        System.out.println(Arrays.deepToString(arrayD));

        //Метод для сравнения по значению многомерных массивов
        int[][] arrayC = new int[6][5];
        arrayC[2][3] = 1;
        System.out.println(Arrays.deepEquals(arrayC,arrayD));
        System.out.println(Arrays.deepToString(arrayC));

        //Перебрать все значения одномерного массива
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();

        //Перебрать все значения двумерного массива
        for (int i = 0; i < arrayC.length; i++) {
            for (int j = 0; j < arrayC[i].length; j++){
                System.out.print(arrayC[i][j] + ", ");
            }
            System.out.println();
        }

        System.out.println("\n===============================\n");

        //copyOf - Метод копирует массив или его часть в новый массив
        int[] copyOfTest = Arrays.copyOf(test, 10);
        System.out.println(Arrays.toString(copyOfTest));

        int[] copyOfTest2 = Arrays.copyOf(test, 2);
        System.out.println(Arrays.toString(copyOfTest2));

        //Заполнение массива значением
        int[] arr = new int[5];

        //все ячейки
        Arrays.fill(arr, 10);

        //часть массива от стартового (включительно) индекса до конечного не (включительно)
        Arrays.fill(arr, 1, 4, 1000);
        System.out.println(Arrays.toString(arr));

        //Значение генерируется один раз. Весь массив заполняется одним значением
        Random random = new Random();
        Arrays.fill(arr, random.nextInt(1001));
        System.out.println(Arrays.toString(arr));

        //Очень гибкий инструмент для копирования всего массива или части масиива в другой массив
        int[] arr1 = {0, 1, 2, 3, 4};
        int[] copy = new int[10];
        System.arraycopy(arr1, 1, copy, 3, 2);
        System.out.println(Arrays.toString(copy));

        //Строка с гласными буквами
        String vowels ="eyuioaEYUIOA";

        //indexOf, contains
        // Буква -> знак пунктуации?
        //Принимает char -> возвращает true если символ - буква (любая буква почти любого алфавита)
        System.out.println(Character.isLetter('ы'));
    }
}
