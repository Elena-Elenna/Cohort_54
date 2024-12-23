package homework_07;
/*
Task 2
Запишите в 4 переменные случайные числа от 0 до 100.
Выведите все 4 числа на экран.
Программа должна определить максимальное из этих четырех чисел и вывести результат на экран.
Output:
Максимальное число: 33
 */

import java.util.Random;

public class Task_2 {
    public static void main(String[] args) {
        Random random = new Random();
        int var1 = random.nextInt(101);
        int var2 = random.nextInt(101);
        int var3 = random.nextInt(101);
        int var4 = random.nextInt(101);
        System.out.println(var1 + " | " + var2 + " | " + var3 + " | " +var4);
        int max = var1;
        if (var2 > max){ max = var2;}
        if (var3 > max){ max = var3;}
        if (var4 > max){ max = var4;}
        System.out.println("Максимальное число: " + max);



        //++++++++++++++++++++++++++++++++++++++++++++++++


        int v1 = random.nextInt(101);
        int v2 = random.nextInt(101);
        int v3 = random.nextInt(101);
        int v4 = random.nextInt(101);
        System.out.printf("%d | %d | %d | %d\n", v1, v2, v3, v4);

        int max1 = v1;
        if (v2 > max1) max1 = v2;
        if (v3 > max1) max1 = v3;
        if (v4 > max1) max1 = v4;
        System.out.println("max1: " + max1);
    }
}
