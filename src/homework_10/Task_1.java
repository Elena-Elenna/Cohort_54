package homework_10;
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
        int[] array = {0, 1, 2, 3, 4, 5, 6};
        int [] array1 = {0, 1, 2};
        copyOfArray(array,7);
        copyOfArray(array1,7);

        //+++++++++++++++++++++++++++++++++++++++++++

        int[] numbers = {0, 1, 2, 3, 4, 5, 6};
        copyOfArra(numbers, 3);

        int[] numbers2 = {0, 1, 2};
        copyOfArra(numbers2, 5);

        int[] ints = null;
        copyOfArra(ints, 5);
    }

    public static void copyOfArray(int[] array, int lengArray){
        int[] newArray = new int[lengArray];
        for (int i = 0; i < lengArray; i++) {
            if (i < array.length) {
                newArray[i] = array[i];
            } else {
                newArray[i] = 0;
            }
        }
        System.out.print("[");
        for (int i =0; i < newArray.length; i++) {
            System.out.print(newArray[i] + (i < newArray.length - 1 ? ", " : "]\n"));
        }
    }
    //  +++++++++++++++++++++++++++++++++++++++++++++++++++++
    public static void copyOfArra (int[] array, int newLength) {
        if (array == null) {
            return;
        }
        int[] result = new int[newLength];

        System.out.println("длина source: " + array.length);
        System.out.println("длина result: " + result.length);

        for (int i = 0; i < array.length && i < result.length  ; i++) {
            System.out.println("Текущий индекс: " + i);
            result[i] = array[i];
        }
        System.out.println(Arrays.toString(result));
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
