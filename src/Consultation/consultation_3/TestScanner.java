package Consultation.consultation_3;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Вы ввели имя: " + name);

        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Вы ввели целое число: " + number);

        System.out.println("Введите число c плавающей точкой: ");
        double numberDouble = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Вы ввели число c плавающей точкой: " + numberDouble);

    }
}
