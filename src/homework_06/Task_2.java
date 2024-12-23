package homework_06;
/*
Task 2
Создайте две переменные типа int.
В первую переменную запишите случайное значение от 0 до 50.
Во вторую переменную случайное значение от 0 до 100.
(опционально) Во вторую переменную случайное значение от -20 до 30.
Проверьте:
равны ли переменные,
не равны ли они,
больше ли a, чем b,
и меньше ли b, чем a.
Выведите результат на экран.
 */

import java.util.Random;

public class Task_2 {
    public static void main(String[] args) {

        Random random = new Random();
        int a = random.nextInt(51);
        int b = random.nextInt(101);
        int c = random.nextInt(51)-20;
        System.out.println("число от -20 до 31: " + c);

        boolean var = a == b;
        boolean var1 = a != b;
        boolean var2 = a > b;
        boolean var3 = a < b;

        System.out.println("число от 0 до 50: " + a);
        System.out.println("число от 0 до 100: " + b);
        System.out.println("var: "+var+"; var1: "+var1+"; var2: "+var2+"; var3: "+var3);


        //++++++++++++++++++++++++++++++++++++++++++++++


        int a1 = random.nextInt(51); // [0,1..49,50]
        int b1 = random.nextInt(101); // [0...100]
        b1 =  random.nextInt(51) - 20; // [0...50] -> 0 - 20 -> -20; 20 -20 -> 0; 50 - 20 -> 30; [-20, 30]

        System.out.println("a1: " + a1);
        System.out.println("b1: " + b1);

        boolean check = a1 == b1;
        System.out.println(a1 + " == " + b1 + " -> " + check);

        check = a1 != b1;
        System.out.println(a1 + " != " + b1 + " -> " + check);

        check = a1 > b1;
        System.out.println(a1 + " > " + b1 + " -> " + check);

        check = b1 < a1;
        System.out.println(b1 + " < " + a1 + " -> " + check);

    }
}
