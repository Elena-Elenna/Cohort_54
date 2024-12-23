package lesson_09;

public class TernaryOperator {
    public static void main(String[] args) {

        int x = -50; // Какое-то число, которое мы получили от пользователя

        String result;

        if (x > 0){
            result = "больше нуля";
        } else {
            result = "меньше или равно нуля";
        }

        System.out.println(result);

        // Тернарный оператор

        String result2 = (x > 0) ? "больше нуля" : "меньше или равно нуля";
    }
}
