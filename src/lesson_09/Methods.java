package lesson_09;

import java.util.Random;

public class Methods {
    public static void main(String[] args) {

        sayHello();
        sayHello();
        sayHello();

        String string = "Java";
        System.out.println(string.length());

        System.out.println("\n==============");

        printChars(string);
        System.out.println("\n==============");
        printChars("Python!!!");

        System.out.println("\n==============");

        char ch = 'A';
        printDecimalCodeOfChar(ch);
        printDecimalCodeOfChar('d');
        printDecimalCodeOfChar('C');

        System.out.println("\n==============");

        int[] array = {1, 45, 76, 54, 89, 452, 0, 45};
        printArray(array);

        array[3] = 100001;
        array[0] = -10000000;

        printArray(array);
        int[] array2 = {1, 2, 3, 4, 681, 6544, -678, 9000, 543, 54, 33};
        printArray(array2);

        /*
        ПЕРЕГРУЗКА методов

        В пределах одного класса может быть два и более методов с одинаковым именем,
        но разным набором параметров. Порядок параметров имеет значение.
         */

        String[] strings = {"Java", "Python", "Hello", "World"};

        printArray(strings);
        System.out.println("\n==============");

        // Написать метод, который выводит в консоль числа от 1 до N
        printNumbers(6);

        // Написать метод, который выводит в консоль числа от X до Y
        printNumbers(3, 8);

        printNumbers("Java", 3);
        printNumbers(100, "Python!");


        System.out.println("\n========================\n");

        int temp = 55;
        changeMe(temp);

        System.out.println(temp);

        int[] arr = {1, 2, 3, 4, 5};
        changeMe(arr);
        printArray(arr);

        String java = "Java";
        changeMe(java);
        System.out.println(java);


        int[] arr2 = new int[10];
        printArray(arr2);
        fillArrayWithRandom(arr2, 101);
        printArray(arr2);
    } //Methods area

    public static void fillArrayWithRandom(int[] array, int bound) {
        Random rand = new Random();
        int i = 0;
        while (i < array.length) {
            array[i] = rand.nextInt(bound);
            i++;
        }
    }

    public static void changeMe(String str) {
        str = str + "!!!";
    }

    public static void changeMe(int[] array) {
        array[0] = 100_000_000;
    }

    public static void changeMe(int x){
        x = 100;
    }



    public static void printNumbers(String str, int x){
        System.out.println("Option 2!!!");
    }

    public static void printNumbers(int x, String str) {
        System.out.println("Option 1!!!");
    }

    public static void printNumbers(int x, int y) {
        int i = x;
        while (i <= y){
            System.out.print(i + ", ");
            i++;
        }
        System.out.println();
    }

    public static void printNumbers(int number){
        int i = 1;
        while (i <= number){
            System.out.print(i + ", ");
            i++;
        }
        System.out.println();
    }

    public static void printArray(String[] strings) {
        System.out.print("[");
        int i = 0;
        while (i < strings.length) {
            System.out.print(strings[i] + (i < strings.length - 1 ? ", " : "]\n"));
            i++;
        }
    }

    // Метод который красиво выводит массив в консоль
    public static void printArray(int[] array) {
        System.out.print("[");
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + (i < array.length - 1 ? ", " : "]\n"));
            i++;
        }
    }

    // Выводит на экран десятичный код символа
    public static void printDecimalCodeOfChar(char ch) {
        System.out.println((int) ch);
    }

    // Распечатать се символы строки в отдельной строке
    public static void printChars(String str) {
        int i = 0;
        while (i < str.length()) {
            char ch = str.charAt(i);
            System.out.println(ch);
            i++;
        }
    }


    // Метод без возвращаемого значения (void - метод)
    public static void sayHello() {
        // Тело метода
        System.out.println("Hello World!");
    }
}
