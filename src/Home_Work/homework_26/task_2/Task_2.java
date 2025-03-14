package Home_Work.homework_26.task_2;
/*
Task 2. * Опционально
Обобщенный статический метод “Печать двух списков”
Напишите обобщенный статический метод printTwoLists,
который принимает два параметра типа MyArrayList и MyArrayList, и выводит элементы обоих списков.
Требования:
Метод должен быть обобщенным по двум типам T и U.
Элементы списков могут быть разных типов.

Пример использования:
MyArrayList<String> names = new MyArrayList<>();
names.add("Alice");
names.add("Bob");

MyArrayList<Integer> scores = new MyArrayList<>();
scores.add(85);
scores.add(92);

printTwoLists(names, scores);
 */


import utils.MyArrayList;

public class Task_2 {
    public static void main(String[] args) {
        MyArrayList<String> stringMyArrayList = new MyArrayList<>();
        stringMyArrayList.add("Alise");
        stringMyArrayList.add("Bob");

        MyArrayList<Integer> integerMyArrayList = new MyArrayList<>();
        integerMyArrayList.add(85);
        integerMyArrayList.add(92);

        MyArrayList<String> str = new MyArrayList<>();
        str.add("A");
        str.add("B");

        MyArrayList<Integer> integ = new MyArrayList<>();
        integ.add(100);
        integ.add(50);

        printTwoLists(stringMyArrayList,integerMyArrayList);
        System.out.println("______________________________");
        printTwoLists(stringMyArrayList, str);
        System.out.println("__________________________");
        printTwoLists(integerMyArrayList, integ);


    }


    public static <T, U> void printTwoLists(MyArrayList<T> list, MyArrayList<U> list1){
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

    }
}
