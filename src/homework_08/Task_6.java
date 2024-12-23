package homework_08;
   /*
        Task 6
Создать массив целых чисел произвольной длины от 5 до 15. Заполнить массив случайными значениями от -50 до 50.
Вывести на экран:
Минимальное значение в массиве
Максимальное значение в массиве
Среднее арифметическое всех значений в массиве
         */

import java.util.Random;

public class Task_6 {
    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();
        int i = 0;
        while (i < array.length) {
            array[i] = random.nextInt(101) - 50;
            i++;
        }

        int min = array[0];
        int max = array[0];
        int sum = 0;

        i = 0;
        while (i < array.length) {
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
            sum += array[i];
            i++;
        }

        double average = (double) sum / array.length;

        System.out.println("Массив: ");
        i = 0;
        while (i < array.length) {
            System.out.print(array[i] + ", ");
            i++;
        }

        System.out.println("\nМинимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее арифметическое: " + average);

        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


        int len = random.nextInt(11) + 5;

        int[] array1 = new int[len];

        int i1 = 0;
        System.out.print("[");
        while (i1 < array1.length) {
            array1[i1] = random.nextInt(101) - 50; // [-50, 50]
            System.out.print(array1[i1] + ((i1 < array1.length -1) ? ", " : "]\n"));

//            if (i1 < array1.length -1) {
//                System.out.print(", ");
//            } else {
//                System.out.print("]");
//            }

            i1++;
        }

        int min1 = array1[0];
        int max1 = array1[0];
        int sum1 = 0;

        i1 = 0;
        while (i1 < array1.length) {
            sum1 += array1[i1];

            if (array1[i1] > max1) max1 = array1[i1];
            if (array1[i1] < min1) min1 = array1[i1];

            i1++;
        }

        System.out.println("min1: " + min1);
        System.out.println("max1: " + max1);
        System.out.println("sum1: " + sum1);
        System.out.println("average: " + sum1 / (double) array1.length);
    }
}
