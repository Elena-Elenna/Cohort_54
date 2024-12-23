package lesson_26;

import lists.MyArrayList;

import java.util.Arrays;

public class TestList {
    public static void main(String[] args) {

        //Если не указать параметр типа, по умолчанию он будет Object
        MyArrayList arrayList = new MyArrayList<>();
        arrayList.add(1);

        MyArrayList<Integer> arrayList1 = new MyArrayList<>();
        arrayList1.add(3);

        MyArrayList<Integer> numbers = new MyArrayList<>();
        numbers.addAll(1,2,3,3,4,5,6,6);
        System.out.println(numbers);

        System.out.println(numbers.indexOf(4));
        System.out.println(numbers.remove(0));
        System.out.println(numbers);
        System.out.println(numbers.removeValue(2));
        System.out.println(numbers);


        MyArrayList<String> str = new MyArrayList<>();
        str.add("Java");
        str.addAll("C++", "Kotlin", "Scala");
        System.out.println(str);
        System.out.println(str.removeValue("Scala"));
        System.out.println(str);
        System.out.println(str.remove(1));


        numbers.addAll(10,20,30,40,50,60,70,80);
        System.out.println(numbers);

        System.out.println("--------------------------------------");
        Integer[] array = numbers.toArray();
        //Стирание типов в Java

        System.out.println("----------------------------------");
        MyArrayList<String> strings = new MyArrayList<>();
        strings.add("Java");
        String val = strings.get(0);
        System.out.println(val.toUpperCase());

        String[] arrayStr = strings.toArray();
        System.out.println(Arrays.toString(arrayStr));

        MyArrayList<Double> doub = new MyArrayList<>();
        Double[] doubles = doub.toArray();
        System.out.println(doubles);


    }
}
