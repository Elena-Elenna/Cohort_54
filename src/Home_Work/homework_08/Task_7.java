package Home_Work.homework_08;
  /*
        Task 7
Дан массив целых чисел. Поменять местами элементы с максимальным и минимальным значениями.
Пример:{ 5, 6, -25, 0, 31, -15 } -> { 5, 6, 31, 0, -25, -15 }
         */

public class Task_7 {
    public static void main(String[] args) {
        int[] array = {5, 6, -25, 0, 31, -15};

        int min = 0;
        int max = 0;
        int i = 1;

        while (i < array.length) {
            if (array[i] < array[min]) min = i;
            if (array[i] > array[max]) max = i;
            i++;
        }
        System.out.print("Массив: ");
        i = 0;
        while (i < array.length) {
            System.out.print(array[i] + ", ");
            i++;
        }
        System.out.println();

        int x = array[min];
        array[min] = array[max];
        array[max] = x;

        System.out.print("Измененный масив: ");
        i = 0;
        while (i < array.length) {
            System.out.print(array[i] + ", ");
            i++;
        }

        //++++++++++++++++++++++++++++++++++++++++++++++++

        int[] aray = {5, 6, -25, 0, 31, -15};

        int minIndex = 0;
        int maxIndex = 0;

        int k = 0;
        while (k < aray.length) {

            if (aray[k] > aray[maxIndex]) maxIndex = k;
            if (aray[k] < aray[minIndex]) minIndex = k;
            k++;
        }
        System.out.println("minIndex = " + minIndex + ", число: " + aray[minIndex]);
        System.out.println("maxIndex = " + maxIndex + ", число: " + aray[maxIndex]);

        //swap

        int temp = aray[minIndex];
        aray[minIndex] = aray[maxIndex];
        aray[maxIndex] = temp;

        k = 0;

        while (k < aray.length){
            System.out.print(aray[k] + ", ");
            k++;
        }
        System.out.println();
    }
}
