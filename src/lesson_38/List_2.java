package lesson_38;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class List_2 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1, 10, 100, -5, 0, 100, 11, 54));


        /**
           Поиск элемента по значению - возвращает индекс
         1. int indexOf(Object obj) - первое вхождение
         2. int lastIndexOf(Object obj) - последнее вхождение
         */


        System.out.println("list.indexOf(100): " + list.indexOf(100));
        System.out.println("list.lastIndexOf(100): " + list.lastIndexOf(100));
        System.out.println("list.indexOf(-10000)): " + list.indexOf(-10000));
        System.out.println("list.indexOf(\"String\"): " + list.indexOf("String"));

        /**
        3. void sort(Comparator<? super E> comparator) - сортирует список с использованием указанного компаратора
         */

        list.sort((i1, i2) -> Integer.compare(i2, i1));

        System.out.println(list);

        list.sort(Integer::compare);

        list.sort(Comparator.naturalOrder());

        System.out.println(list);

        /**
         4. List<E> subList(int idxFrom, int idxTo) - возвращает список из элементов,
            находящихся на позициях от idxFrom до idxTo
         */

        List<Integer> subList = list.subList(1, 5);
        System.out.println("list.subList(1, 5): " + subList);
    }
}
