package lesson_38;

import java.util.*;

public class Set {
    /**
     Контракт между equals() и hashCode()
     Для корректной работы хэш-коллекции есть важное правило, состоящее из трех условий.
     1. Если два объекта равны по методу equals, то их хеш-коды тоже должны быть равны.
     2. Если хеш-коды двух объектов различны, то объекты точно не равны по equals.
     Обратное не всегда верно. Разные объекты (не равные) могут иметь одинаковый хеш-код (коллизия)
     3. При многократных вызовах метода hashCode()
     на неизмененном объекте каждый раз должен возвращаться одинаковый результат (хеш-код)

      */
    public static void main(String[] args) {

        // Конструкторы
        java.util.Set<Integer> set = new HashSet<>(); // Создает пустой хеш-сет емкостью 16 и коэффициент заполнения 0.75
        set = new HashSet<>(20); // Создает пустой хеш-сет c указанной емкостью
        // Принимает коллекцию - создает новый сет, содержащий уникальные элементы из указанной коллекции
        set = new HashSet<>(List.of(1, 2, 3, 5, 6, 6, 6, 5, 3, 6, 0));

        System.out.println("Set: " + set);

        List<Integer> startValues = new ArrayList<>(List.of(15, 1, 2, 3, 4, 3, 8, 6, 15, 7, 0, 16, 32));
        System.out.println("StartValues: " + startValues);

        /**
         HashSet - не поддерживает порядок добавления элементов
         */
        java.util.Set<Integer> integers = new HashSet<>(startValues);
        System.out.println("Set: " + integers);

        /**
         LinkedHashSet - сохраняет порядок добавления элементов
         */
        java.util.Set<Integer> linkedSet = new LinkedHashSet<>(startValues);
        System.out.println("LinkedSet: " + linkedSet);

        /**
                     Методы интерфейса Set
        1. boolean add(E e) - добавление элемента
         */

        System.out.println("integers.add(100): " + integers.add(100)); // true - элемент добавлен.
        System.out.println(integers);
        System.out.println("integers.add(100) #2: " + integers.add(100)); // false - элемент НЕ добавлен, т.к. такое значение уже есть (дубликат)
        System.out.println(integers);

        System.out.println("\n==================\n");

        /**
         2. boolean remove(Object obj) - удаляет элемент по значению
         */
        System.out.println("integers.remove(100): " + integers.remove(100)); // true
        System.out.println(integers);

        /**
         3. boolean contains(Object o) - проверяет присутствие значения в множестве
         */
        System.out.println("integers.contains(100): " + integers.contains(100));
        System.out.println("integers.contains(32): " + integers.contains(32));

        /**
        4. int size() - кол-во элементов
        5. isEmpty()
        6. clear() - удаляет все элементы
        */

        System.out.println("\n====================\n");

        /**
         7. iterator() - возвращает итератор для элементов set-a
          Наличие итератора, позволяет перебирать все элементы циклом for-each
         */
        for (Integer value: integers) {
            System.out.print(value + ", ");
        }

        System.out.println();


        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.print(value + ", ");
        }
        System.out.println();

        /*
        Убрать дубликаты.
        Написать метод, который принимает список и возвращает список,
        состоящий только из уникальных элементов начального списка
         */

        System.out.println("\n===================\n");
        System.out.println(startValues);
        List<Integer> resultList = getUniqueList(startValues);
        System.out.println(resultList);


        System.out.println("\n===================\n");

        /**
          SortedSet Конструкторы
          Пустой = Конструктор по умолчанию - естественный порядок сортировки
         */
        SortedSet<Integer> sortedSet = new TreeSet<>(); // пустое, упорядоченное множество. Сортировка в естественном порядке
        sortedSet.add(100);
        sortedSet.add(32);
        sortedSet.add(150);
        sortedSet.add(125);
        System.out.println("SortedSet: " + sortedSet);

        /**
         Конструктор с компаратором, определяющим порядок хранения элементов
         */
        SortedSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder()); // Обратный естественному порядок сортировки
        treeSet.addAll(startValues);
        treeSet.add(10);
        System.out.println(treeSet);

        treeSet = new TreeSet<>((i1, i2) -> i2 - i1);
        treeSet = new TreeSet<>((i1, i2) -> Integer.compare(i2, i1));
        treeSet.addAll(startValues);
        System.out.println(treeSet);

        /**
        1. first() - возвращает самый первый (самый левый) (наименьший по мнению Comparator-а)
         */
        System.out.println("treeSet.first(): " + treeSet.first());

        /**
        2. last() - возвращает последний
         */
        System.out.println("treeSet.last(): " + treeSet.last());

        /**
        3. SortedSet<E> headSet(E element) - возвращает часть множества, элементы которого строго меньше чем element
         */
        SortedSet<Integer> headSet = treeSet.headSet(8);
        System.out.println("treeSet.headSet(8): " + headSet);

        /**
        4. SortedSet tailSet(E element) - элементы больше или равно element
         */
        SortedSet<Integer> tailSet = treeSet.tailSet(8);
        System.out.println("treeSet.tailSet(8): " + tailSet);

        /**
         5. comparator() - Возвращает компаратор
          вернет null если используется естественный порядок
         */
        test();
    }

    private static void test() {
        String testStr = "Тестовая строка, со словами!";
        // Заменяем все НЕбуквы на пустоту с помощью регулярного выражения
        String newStr = testStr.replaceAll("[^a-zA-Z0-9а-яА-Я ]", "");
        System.out.println(newStr);

        // Преобразования строки в массив слов
        String[] words = newStr.split(" ");
        System.out.println(Arrays.toString(words));

        // Arrays.asList(T[] array) - преобразует массив в список
        List<String> list = Arrays.asList(words);
        System.out.println(list);
    }

    private static <T> List<T> getUniqueList(List<T> list) {
        // Получить set, состоящий из уникальных элементов списка
        java.util.Set<T> set = new LinkedHashSet<>(list);
        // вернуть новый список, содержащий все элементы set-а
        return new ArrayList<>(set);
    }
}
