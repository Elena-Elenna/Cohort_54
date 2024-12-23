package homework_09;
/*
Task 1
Написать метод, принимающий массив целых чисел
и распечатывающий массив в обратной последовательности.
{1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]
Перегрузить метод, если в него приходит индекс,
то часть массива слева до этого индекса распечатывается в обычном порядке,
а начиная с этого индекса в обратном:
{1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]
Еще одна перегрузка: метод принимает массив и булевый флаг.
Если флаг == true -> печатает массив в обратном порядке
Если флаг == false -> печатает массив в прямом порядке

 */

public class Task_1 {
    public static void main(String[] args) {

        int[] array = {1, 4, 3, 6, 7};
        arrayInt(array);
        arrayInt(array,2);
        arrayInt(array, true);
        arrayInt(array,false);


        int[] array1 = {1, 4, 3, 6, 7};
        printReverseArray(array1, 2);

        System.out.println("\nprintReverseArray(array1);");
        printReverseArray(array1);

        System.out.println("\nprintReverseArray(array1, true): ");
        printReverseArray(array1, true);

        System.out.println("\nprintReverseArray(array1, false): ");
        printReverseArray(array1, false);



    } // Methods area

    public static void arrayInt(int[] array) {
        int i = array.length - 1; //  вывод массива в обратном порядке
        System.out.print("[");
        while (i >= 0) {
            System.out.print(array[i]);
            if (i != 0) {
                System.out.print(", ");
            }
            i--;
        }
        System.out.println("]");
    }
    public static void arrayInt(int[]array,int index) {
        int i = 0; //до индекса в прямом порядке
        System.out.print("[");
        while (i < index) {
            System.out.print(array[i]);
            if (i != index -1) System.out.print(", ");
            i++;
        }
        int k = array.length - 1; // после индекса в обратном
        while (k >= index) {
            if (k < array.length) System.out.print(", ");
            System.out.print(array[k]);
            k--;
        }
        System.out.print("]\n");
    }
    public static void arrayInt(int[] array, boolean flag) {
        if (flag) {
            int i = array.length -1;
            System.out.print("[");
            while (i >= 0) {
                System.out.print(array[i]);
                if (i != 0) System.out.print("; ");
                i--;
            }
            System.out.print("]\n");
        } else {
            int k = 0;
            System.out.print("[");
            while (k < array.length) {
                System.out.print(array[k]);
                if(k != array.length - 1) System.out.print("; ");
                k++;
            }
            System.out.print("]");
        }

        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    }
    public static void printReverseArray(int[] array, boolean flag) {
        if (flag) {
            printReverseArray(array);
        } else {
            printReverseArray(array, array.length - 1);
        }
    }

    public static void printReverseArray(int[] array) {
        // Перебрать все индексы от большего к меньшему и вывести элементы
        printReverseArray(array, 0);
    }

    public static void printReverseArray(int[] arr, int index) {
        System.out.print("[");
        // Печатаю все элементы под индексами от 0 до index в прямой последовательности
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + ", ");
        }
        // 2, 3, 4 -> 4, 3, 2
        // Печатаю все элементы под индексами от arr.length - 1 до index (вкл) в обратном порядке
        for (int i = arr.length - 1; i >= index; i--) {
            System.out.print(arr[i] + (i != index ? ", " : "]\n"));
        }
    }
}
