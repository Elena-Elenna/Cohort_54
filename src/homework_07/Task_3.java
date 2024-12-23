package homework_07;
/*
Task 3 (Повышенной сложности, опционально)
Программа предлагает пользователю ввести четырехзначное число.
Ввод осуществляется только в формате строки (String).
Если введенное значение не является четырехзначным числом,
должно выводиться сообщение об ошибке, и программа завершает работу.
Проверить, является ли число "счастливым билетом".
Для этого нужно сравнить сумму первых двух цифр с суммой последних двух цифр.
Примеры:
Число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое.
Число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым.
 */

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите четырехзначное число");
        String number = scanner.nextLine();
        System.out.println("Пользователь ввел: " + number);
        if (number.length() == 4) {
            int v1 = number.charAt(0) - 48;
            int v2 = number.charAt(1) - 48;
            int v3 = number.charAt(2) - 48;
            int v4 = number.charAt(3) - 48;
            System.out.println(v1 + "|" + v2 + "|" + v3 + "|" + v4);
            if ((v1 + v2) == (v3 + v4)) {
                System.out.println("Счастливый билет");
            } else {
                System.out.println("Не счастливый билет");
            }
        } else {
            System.out.println("Ошибка. Введите четырехзначное число");
        }

        // ++++++++++++++++++++++++++++++++++++++++++++++++


        System.out.println("Введите четырехзначное число");
        String digitStr = scanner.nextLine();

        // Option 1
        if (digitStr.length() != 4) {
            // Строка состоит не из 4 символов
            System.out.println("выводится сообщение об ошибке");
        } else {

//            System.out.println(digitStr + 1000);
            // Строка из 4-ч символов. Код обработки этой строки
            // 0...9 -> 48 - 57;

//            int char1 = digitStr.charAt(0) - 48;
//            int char2 = digitStr.charAt(1) - 48;
//            int char3 = digitStr.charAt(2) - 48;
//            int char4 = digitStr.charAt(3) - 48;

            // Проверка, что символ является цифрой
            if (digitStr.charAt(0) < 48 || digitStr.charAt(0) > 57) {
                System.out.println("Введено не число");
            }

            if (digitStr.charAt(0) + digitStr.charAt(1) == digitStr.charAt(2)  + digitStr.charAt(3)) {
                System.out.println("Счастливый билет!");
            } else {
                System.out.println("Билет не счастливый");
            }
        }

        //Option 2
        if (digitStr.length() == 4) {
            // Код обработки строки
            // Строка кода может вызвать аварийное завершение программы при некорректном вводе
            int input = Integer.parseInt(digitStr);
//            System.out.println(input + 1000);

            // 1234 / 10 -> 123; % 10 -> 4
            int digit0 = input % 10;
            input = input / 10;

            // 123
            int digit1 = input % 10;
            input = input / 10;

            // 12
            int digit2 = input % 10;
            int digit3 = input / 10;

            System.out.printf("Цифры %d, %d, %d, %d\n", digit0, digit1, digit2, digit3);

            if (digit0 + digit1 == digit2 + digit3) {
                System.out.println("Вариант 2. Число счастливое!");
            } else {
                System.out.println("Вар2. Не счастливое");
            }

        }
        else {
            System.out.println("Вы ввели не 4-значное число");
        }

    }
}
