package homework_07;
    /*
    Task 1
Необходимо написать программу, которая предлагает пользователю ввести число на выбор: 1, 2 или 3.
Программа должна сказать, какое число ввёл пользователь: Один, Два, или Три (текстом)
     */

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 3");
        int number = scanner.nextInt();
        scanner.nextLine();

        if (number == 1){
            System.out.println("Введено число: Один");
        }else if (number == 2){
            System.out.println("Введено число: Два");
        }else if (number == 3){
            System.out.println("Введено число: Три");
        }else {
            System.out.println("Введено неправильное число");
        }


        //+++++++++++++++++++++++++++++++++++++++++++++


        System.out.println("ввести число на выбор: 1, 2 или 3");
        int input = scanner.nextInt();
        scanner.nextLine();
        switch (input) {
            case 1:
                System.out.println("Вы ввели один");
                break;
            case 2:
                System.out.println("Вы ввели два");
                break;
            case 3:
                System.out.println("Вы ввели три");
                break;
            default:
                System.out.println("Ваш ввод не корректен!");
        }

        if (input == 1 ) {
            System.out.println("Вы ввели один");
        } else if (input == 2) {
            System.out.println("Вы ввели два");
        } else if (input == 3) {
            System.out.println("Вы ввели три");
        }
//        else if (input == 4) {
//            System.out.println("Вы ввели четыре");
//        }
        else {
            System.out.println("вы ввели что-то другое!!");
        }
    }

}
