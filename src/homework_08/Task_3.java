package homework_08;
        /*
        Task 3
Используйте цикл while для решения задачи:
Распечатайте все числа от 1 до 100, которые делятся на 5 без остатка.
         */

public class Task_3 {
    public static void main(String[] args) {

        int number = 1;
        while (number <= 100) {
            if (number % 5 == 0) {
                System.out.println("Делятся на 5 без остатка: " + number );
            }
            number++;
        }


        /*
        Task 3.1 * (Опционально)
Распечатайте первые 7 чисел от 1 до 100, которые делятся на 5 без остатка.
         */
        int numb = 1;
        int x = 0;
        while (numb <= 100 && x < 7) {
            if (numb % 5 == 0) {
                System.out.println("первые 7 чисел: " + numb);
                x++;
            }
            numb++;
        }

        // +++++++++++++++++++++++++++++++++++++++++++++++++++

        int i = 1;
        int count = 0;

        while (i <= 100 && count < 7){
            System.out.println("Проверяю число: " + i);
            if(i % 5 == 0){
                System.out.print(i + ", \n");
                count++;
                i += 5;
            } else {
                i++;

            }
        }
    }
}
