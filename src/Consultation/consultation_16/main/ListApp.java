package Consultation.consultation_16.main;

import consultation_16.main.model.CategoryGoods;
import consultation_16.main.model.Goods;

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

        String[] goodsArray  = {"book", "pen", "pencil", "chocolate", "milk", "juice", "chips"};
        ArrayList<Goods> goodsList = new ArrayList<>();

        // создание товаров
        Goods goods1 = new Goods("Литовский", CategoryGoods.BREAD, 3.25);
        Goods goods2 = new Goods("Белорусский", CategoryGoods.BREAD, 3.15);
        Goods goods3 = new Goods("Французский", CategoryGoods.BREAD, 2.95);

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