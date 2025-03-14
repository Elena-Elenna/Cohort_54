package Home_Work.homework_14;
/*
Task 3
Подсчет гласных и согласных
Напишите программу, которая просит пользователя ввести слово
и подсчитывает количество гласных и согласных букв в этом слове.
 */

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово");
        String str = scanner.nextLine();

        int vowels = 0;
        int consonants = 0;
        String vowels1 = "euioayYEUIOA";
        for (int i = 0; i < str.length(); i++){
            char a = str.charAt(i);

            if (Character.isLetter(a)){ // Проверяем что символ является буквой
                if (vowels1.indexOf(a) >= 0 ){ // Определяем какая это буква
                    // возвращаем индекс вхождения символа в строку
                    //если символ найден - то ветрнется индекс символа в строке
                    //если символ не найден - метод вернет -1.
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Гласные: " + vowels);
        System.out.println("Согласные: " + consonants);

    }
}
