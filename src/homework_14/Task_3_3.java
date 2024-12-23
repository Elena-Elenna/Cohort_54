package homework_14;
/*
Task 3
Подсчет гласных и согласных
Напишите программу, которая просит пользователя ввести слово
и подсчитывает количество гласных и согласных букв в этом слове.
 */

import java.util.Scanner;

public class Task_3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово");
        String strin = scanner.nextLine();
        String vowel = "eyuioaуеыаоэяиюöäü";
        String consonant = "qwrtpsdfghjklzxcvbnmцкнгшщзхъфвпрлджчсмтьбß";

        int vowel1 = 0;
        int consonant1 = 0;
        char a;
        for (int i = 0; i < strin.length(); i++){
            a = strin.toLowerCase().charAt(i);
            if (vowel.indexOf(a) >= 0) vowel1++;
            if (consonant.indexOf(a) >= 0) consonant1++;
        }
        System.out.println("Гласные: " + vowel1);
        System.out.println("Согласные: " + consonant1);

    }
}
