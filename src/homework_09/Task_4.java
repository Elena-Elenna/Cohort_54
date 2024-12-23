package homework_09;
/*
Task4 * (опционально)
Написать программу, выводящую на экран треугольник, состоящий из цифр от 1 до 6 такого вида:
1
12
123
1234
12345
123456
 */


public class Task_4 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 6) {
            int j = 1;
            while (j <=i) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
