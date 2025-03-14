package Consultation.consultation_4;

public class Consultation04 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        double price = 9.59;
        double discont = 0.13;
        double priceWithDiscont = price - (price * discont);

        boolean result = a > b;

        String text1 = "Hello";
        String text2 = "Hello";
        String text3 = new String("Hello");

        result = text1 == text2;

        //        System.out.println("result = " + result + " fdgdsfg " + a);
//        System.out.println("Переменная а: " + a + "; b: " + b + ".");

//        System.out.printf("Переменная а: %d; b: %d.", a, b);
//        System.out.printf("%nСумма = %d.", (a + b));
//        System.out.printf("%nСумма = %d.", (a + b));
//        System.out.println();
        System.out.println("Цена: " + price);
        System.out.println("Скидка: " + discont);
//        System.out.println("Итого: " + priceWithDiscont);
        System.out.printf("Итого: %.2f", priceWithDiscont);


//        System.out.printf("");
    }
}
