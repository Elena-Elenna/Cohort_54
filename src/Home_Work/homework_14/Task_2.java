package Home_Work.homework_14;
/*
Task 2
Найти второе по величине число в массиве
Напишите метод, который находит второе по величине число в массиве целых чисел.
 */

import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) {

        int[] array = {0,-1,-4};
        System.out.println(findPenultimateMax(array));

    } //Methods area
    public static Integer findPenultimateMax(int[] array){
        if (array == null || array.length == 0 || array.length < 2) return null;

        Arrays.sort(array);
        int max = array[array.length - 1];
        for (int i = array.length -2; i >= 0; i--) {
            if (array[i] < max) return array[i];
        }
        return null;
    }
}
