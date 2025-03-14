package Lesson.lesson_26.methods;

import utils.MyArrayList;
import utils.MyList;

public class App {
    public static void main(String[] args) {

        Integer[] integers = {1, 2, 3, 4, 5, 6};
        String[] strings = {"a", "b", "c", "d"};
        Double[] doubles = {1.0, 2.0, 3.0, 4.0};

        String str = UtilsGeneric.printArray(integers);
        System.out.println(str);

        String str1 = UtilsGeneric.printArray(strings);
        System.out.println(str1);

        String str2 = UtilsGeneric.printArray(doubles);
        System.out.println(str2);

        System.out.println("---------------------");
        UtilsGeneric.swap(doubles, 0, 3);
        System.out.println(UtilsGeneric.printArray(doubles));

        double sum = UtilsGeneric.sum(integers);
        System.out.println(sum);

        sum = UtilsGeneric.sum(doubles);
        System.out.println(sum);

        MyList<Integer> integerMyList = new MyArrayList<>();
        integerMyList.addAll(1,2,3,4);
        double summa = UtilsGeneric.listSum(integerMyList);
        System.out.println(summa);

        MyList<String> stringMyList = new MyArrayList<>();
//        summa = UtilsGeneric.listSum(stringMyList);  ошибка компиляции

        UtilsGeneric.addNumbers(integerMyList);
        System.out.println(integerMyList);
    }
}
