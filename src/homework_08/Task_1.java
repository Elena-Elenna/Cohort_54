package homework_08;
       /*
        Task 1
Найдите произведение всех чисел от 1 до 10 включительно.
Результат выведите на экран
         */

public class Task_1 {
    public static void main(String[] args) {

        int summa = 1;
        int i = 1;
        while (i <= 10){
            summa = summa * i;
            i++;
        }
        System.out.println("Произведение всех чисел = " + summa);


        // ++++++++++++++++++++++++++++++++++++++++++++++++++++++

        long mult = 1;
        int x = 1;
        while (x <= 10){
            mult *=x;
            x++;
        }
        System.out.println("Произведение всех чисел = " + mult);
    }
}
