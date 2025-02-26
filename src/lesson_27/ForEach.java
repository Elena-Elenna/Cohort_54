package lesson_27;

import utils.MyArrayList;
import utils.MyList;

import java.util.Iterator;

public class ForEach {
    public static void main(String[] args) {
        MyList<String> list = new MyArrayList<>();

        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("C++");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }
        System.out.println("++++++++++++++++++++++++++++");
        /*
         ЦИКЛ forEach
         Коллекция - это то что мы перебераем
         for (ТипПеременной : коллекция) {
         // Действие с переменной
         }
         */
        for (String s : list){
            System.out.println(s);
        }

        System.out.println("-------------------------------");
        MyList<Integer> list1 = new MyArrayList<>();
        System.out.println(list1);
        System.out.println("-----------------------------------");
        list1.addAll(1,2,3,4,5,6);
        for (Integer element : list1){
            System.out.println(element + 100);
        }

    }
}
