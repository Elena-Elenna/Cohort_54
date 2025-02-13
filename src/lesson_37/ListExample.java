package lesson_37;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        /**
         Конструкторы
         Конструкторы ArrayList
         */

        List<Integer> list = new ArrayList<>(); // Создает пустой список (с начальной емкостью под капотом 10 элементов)
        list = new ArrayList<>(50); // Пустой список с указанной емкостью
        list = new ArrayList<>(List.of(1, -10, 5, 0, 25,-100)); // Принимает коллекцию
        // Создает список, содержащий все элементы указанной коллекции (копирование элементов из другой коллекции)

        /**
         Конструкторы LinkedList
         */
        list = new LinkedList<>(); // Создает пустой список (внутренняя реализация - двусвязный список)
        list = new LinkedList<>(List.of(1, -10, 5, 0, 25,-100)); // Создает список, содержащий все элементы указанной коллекции

        /**
                    Методы интерфейса List

         1. boolean add(E e) - добавляет элемент в конец списка
         */

        list.add(1000);
        list.add(-100);
        System.out.println("list: " + list);

        /**
        2. void add(int index, E element) - добавляет элемент на указанную позицию
         */
        list.add(3, 500);
        System.out.println("list: " + list);

        /**
        3. E get(int index) - возвращает элемент по индексу
         */
        int value = list.get(5);
        System.out.println("value: " + value);

        /**
        4. E remove(int index) - удаляет элемент по указанному индексу, возвращает старое значение
         */
        System.out.println(list.remove(5));
        System.out.println("list: " + list);

        /**
        5. boolean remove(Object obj) -  Метод удаления по значению (из интерфейса Collection) -
         принимает Object (ссылочный тип)
         */
//        System.out.println(list.remove(0));
        System.out.println(list.remove(Integer.valueOf(0)));
        System.out.println("list: " + list);

        // indexOf
        // lastIndexOf
        // sort(Comparator)
        // List<E> subList()
    }
}
