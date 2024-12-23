package homework_11;
/*
Task 1
Написать метод, который считает сумму всех элементов в массиве.
Task 2
Написать метод, который находит среднее значение элементов в массиве (среднее арифметическое).
 */

public class Task_1_2 {
    public static void main(String[] args) {
        double[] array = {1, 1, 1, 1, 1};
        System.out.println("\nСумма всех элементов массива: " + summaArray(array));

        double[] array1 = {-1, -0.25, 1, 1, 1};
        System.out.println("\nСумма всех элементов массива: " + summaArray(array1));

        double[] array2 = null;
        System.out.println("\nСумма всех элементов массива: " + summaArray(array2));

        double[] array3 = new double[0];
        System.out.println("\nСумма всех элементов массива: " + summaArray(array3));

        double average = summaArray(array);
        System.out.println("\nСреднее арифметическое: " + average);

        double average1 = summaArray(array1);
        System.out.println("\nСреднее арифметическое: " + average1);

        // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = sumArray(arr);
        System.out.println("Сумма элементов в массиве: " + sum);

        double averag = averageArray(arr);
        System.out.println("Среднее значение: " + averag);


    } // Methods area

    public static double summaArray(double[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        double summa = 0;
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i < array.length - 1 ? ", " : "]"));
            summa += array[i];
        }
        return summa/array.length  ;
    }


    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public static int sumArray(int[] arr) {
        if (arr == null || arr.length == 0) return 0; // не лучший вариант, но другого пока нет

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // sum = sum + arr[i]
        }

        return sum;
    }

    public static double averageArray(int[] arr) {
        if (arr == null || arr.length == 0) return 0;

        return sumArray(arr) / (double) arr.length;
    }
}
