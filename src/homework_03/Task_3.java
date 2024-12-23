package homework_03;

public class Task_3 {
    public static void main(String[] args) {

        /*
    Task 3 * (Опционально)
    Пусть цена товара A составляет 1000 Euro, а товара B составляет 500 Euro.
    Если клиент покупает товары вместе, то на них действует скидка 10% на всю покупку.
    Выведите на экран значение переменной, которая соответствует стоимости товаров A+B со скидкой.
    Отдельно выведите на экран сумму скидки для этой покупки (в деньгах).
    */
        double priseA = 1000.00;
        double priseB = 500.00;
        double summa = priseA + priseB;
        double skidka = summa * 0.10;
        double zena = summa - skidka;

        System.out.println("Skidka: " + skidka);
        System.out.println("Zena: " + zena);


        // +++++++++++++++++++++++++++++++++++++++++++++++++

        double priceA = 1000;
        double priceB = 500;
        double discount = 10;
        double discountMoney = (priceA + priceB) * discount / 100;
        double priceWithDiscount = priceA + priceB - discountMoney;
        System.out.println("discountMoney: " + discountMoney);
        System.out.println("priceWithDiscount: " + priceWithDiscount);

        double priceWithDiscount2 = (priceA + priceB) * (100 - discount) / 100;
        System.out.println("priceWithDiscount2: " + priceWithDiscount2);

    }
}
