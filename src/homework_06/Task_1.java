package homework_06;
/*
Task 1
Дан текст Programming is fun.
Напишите программу, которая проверяет, содержит ли эта строка слово “fun”,
и выведите результат в виде булевой переменной.
 */

public class Task_1 {
    public static void main(String[] args) {

        String text = "Programming is fun";
        boolean cont = text.contains("fun");
        System.out.println("contains \"fun\" : " + cont);

    }
}
