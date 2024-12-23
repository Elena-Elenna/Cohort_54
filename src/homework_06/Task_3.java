package homework_06;
/*
Task 3
Попросите пользователя ввести целое число с клавиатуры.
Ваша программа должна вывести строку в формате:
Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
Число: 3 четное: false; кратно 3: true; четное и кратное 3: false
Проверьте работу вашей программы, вводя разные числа. Убедитесь в правильности выдаваемой строки.
 */

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        boolean b = a % 2 == 0;
        boolean c = a % 3 == 0;
        boolean d = (a % 2 == 0) & (a % 3 == 0);
        System.out.println("Число: "+a+"; четное: "+b+
                "; кратно 3: "+c+"; четное и кратное 3: "+d);

        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


        System.out.println("Введите целое число: ");
        int input = scanner.nextInt();
        scanner.nextLine();

        boolean isEven = input % 2 == 0;
        boolean isDevByThree = input % 3 == 0;
        boolean isTwice = isEven && isDevByThree;

        System.out.printf("Число: %d четное: %s; кратно 3: %s; четное и кратное 3: %s\n",
                input, isEven, isDevByThree, isTwice);

    }
}
