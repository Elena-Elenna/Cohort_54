package Home_Work.homework_08;
      /*
        Task 5 * (Опционально)
Программа запрашивает у пользователя ввод произвольного числа. Вывести сумму цифр этого числа.

Пример:

567432 -> 5+6+7+4+3+2 -> 27
         */

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {

        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        System.out.println("\n======== Ohtion 1 ==============");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите произвольное число");
        int input = scanner.nextInt();
        scanner.nextLine();

        if (input < 0) {
            input = input * -1;
        }

        int num2 = input; // копирую значения для обработки во втором варианте решения

        int sum = 0;

        while (input > 0) {
            int currentDigit = input % 10;
            sum += currentDigit;
            System.out.print(currentDigit + " + ");
            input = input /10;
        }
        System.out.println("= " + sum);

        System.out.println("\n========= Option 2 ================" );

        String numStr = "" + num2; //простой способ преобразовать число в строку

//        numStr = String.valueOf(num2);
        int len = numStr.length();
        int sum2 = 0;

        while (len > 0) {
            int pow =(int) Math.pow(10, len - 1); // 10 в степени (длинна -1)
            int digit = num2 / pow; // получаем самую левую цифру
            sum2 += digit;
            System.out.print(digit + " + ");
            num2 = num2 % pow; //Отрезаем уже полученую цифру
            len--;
        }
        System.out.println(" = " + sum2);
    }
}
