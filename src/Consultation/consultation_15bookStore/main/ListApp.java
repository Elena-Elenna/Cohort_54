package Consultation.consultation_15bookStore.main;

import consultation_15bookStore.main.model.CategoryGoods;
import consultation_15bookStore.main.model.Goods;

import java.util.ArrayList;

public class ListApp {
    public static void main(String[] args) {
        // мини хранилище
        int[] numberArray = new int[10];
        numberArray[0] = 24;
        numberArray[1] = 29;
        numberArray[2] = 31;

        String[] stringArray = new String[10];
        stringArray[0] = "Sergey";
        stringArray[1] = "Petr";
        stringArray[2] = "Ivan";

        String[] goodsArray = {"book", "pen", "pencil", "chocolate", "chips"};
        ArrayList<Goods> goodsList = new ArrayList<>();

        // создание товаров
        Goods goods1 = new Goods("Литовский", 3.25, CategoryGoods.BREAD);
        Goods goods2 = new Goods("Белорусский", 3.15, CategoryGoods.BREAD);
        Goods goods3 = new Goods("Французский", 2.95, CategoryGoods.BREAD);

        System.out.println(goodsList.size());
        // добавление товаров в хранилище
        goodsList.add(goods1);
        goodsList.add(goods2);
        goodsList.add(goods3);

        System.out.println(goodsList.size());
        for (Goods goods : goodsList) {
            System.out.println(goods);
        }
    }
}