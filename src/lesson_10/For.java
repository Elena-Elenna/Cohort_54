package lesson_10;

import java.util.Random;

public class For {
    public static void main(String[] args) {

        /*
        for (<Блок инициализации> ; <Блок проверок / условие выхода>; <Блок изменений>) {
            // Тело цикла
        }
         */

        // Вывести все числа от 0 до 10
        int j = 0;
        while (j <= 10) {
            System.out.print(j + ", ");
            j++;
        }

        System.out.println();
        System.out.println("End while loop");


        for (int i = 0; i <= 10; i++) {
            // Тело цикла
            System.out.print(i + ", ");
        }

        System.out.println();
        System.out.println("End loop for");

        System.out.println("\n ============================= \n");

        // Запустится бесконечный цикл
        // Для цикла for ни один из блоков не является обязательным.
//        for (; ; ) {
//            System.out.println("Hello World");
//        }


        int x = 5;
        for (x = 0; x >= 0; x = x + 1_000_000) {
            System.out.print(x + ", ");
        }

        System.out.println();
        System.out.println("х после цикла: " + x);
        System.out.println("End #2");

        // В блоке инициализации может быть переменная любого типа

        for (String str = "Hello"; str.length() < 10; str += "$") {
            System.out.println(str);
        }


        System.out.println("\n =================== \n");
        // Мы можем инициализировать несколько переменных
        // В блоке изменений мы также можем менять несколько переменных

        int k = 14;
        for (int a = 0, f = 1; k >= 0 && f < 10; k--, a = ++a + k, f++) {
            System.out.println(k + " : "  + a + " : " + f);
        }

        System.out.println("\n ================= ");
        // Создать массив целых чисел случайной длины в диапазоне от 5 до 15.
        // Заполнить массив случайными числами от -50 до 50 включительно

        Random random = new Random();
        int[] ints = new int[random.nextInt(11) + 5]; // получаем случайную длину
        System.out.println("Длина массива: " + ints.length);

        // Начиная c JDK 17 доступно задавать две границы диапазона
//        int rand = random.nextInt(4, 11);
//        System.out.println("rand: " + rand);

        System.out.print("[");
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(101) - 50; // (0..100) - 50 -> (-50, 50)
            System.out.print(ints[i] + (i < ints.length - 1 ? ", " : "]\n"));
        }

        // random.nextInt(11) + 5
        // min 0...10
        // 0 + 5 -> 5
        // 7 + 5 -> 12
        // max 10 + 5 -> 15

        // random.nextInt(101) - 50;
        // min 0 - 50 -> -50
        // 30 - 50 -> -20
        // 50 - 50 -> 0
        // max 100 - 50 -> 50


        System.out.println("\n ================= \n");

        // continue, break

        for (int i = 0; i < 7; i++) {

            if (i == 5) continue;
            // continue - прервать текущую итерацию цикла и перейти к следующей
            // Мы перейдем в блок изменения переменных, потом в блок проверки условия
            // В текущей итерации после вызова continue все операторы в теле цикла будут пропущены

            System.out.print(i + ", ");
        }



        System.out.println();
        System.out.println("\n =================");

        for (int i = 0; i < 7; i++) {

            if (i == 3) break;
            // break заканчивает текущую итерацию цикла и весь цикл (завершает работу цикла)
            // после вызова break следующие итерации цикла выполнены не будут
            System.out.print(i + ", ");
        }


        System.out.println();
        System.out.println("\n ===================");

        // continue и break работаю аналогичным образом в циклах while

        j = 0;
        while (j < 7) {

            if (j == 3) {
                j++;
                continue;
            }

            System.out.print(j + "; ");
            j++;
        }
        System.out.println();
        System.out.println("End while");
    }
}
