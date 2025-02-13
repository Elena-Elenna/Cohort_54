package lesson_37;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {

        /**
         Интерфейс Collection гарантирует наличие базовых методов для всех расширяющих его интерфейсов
         Это позволяет единообразно обрабатывать различные типы коллекций
         Создаем коллекцию строк
         Ссылка типа интерфейса -> набор доступных методов + ссылку на объект какого класса может хранить эта переменная
         Справа мы можем подставить объекты разных классов (получить разные реализации этого интерфейса)
         */
        Collection<String> strings = new ArrayList<>();

        /**
                  Методы:
         1. int size() - возвращает кол-во элементов в коллекции
         */
        System.out.println("strings.size(): " + strings.size());

        /**
         2. boolean isEmpty() - возвращает true, если коллекция пустая
         */
        System.out.println("strings.isEmpty(): " + strings.isEmpty());

        /**
        3. boolean add(T t) - добавляет элемент в коллекцию
         */
        strings.add("Java");
        System.out.println("strings.add(\"Python\"): " + strings.add("Python"));

        /**
        4. Переопределенный метод toString для красивого вывода элементов коллекции
         */
        System.out.println(strings);

        /**
        5. Метод .of() - это статический метод в нескольких интерфейсах и классах. Был введен в Java 9
           Создает неизменяемый экземпляр коллекции из предоставленных элементов
           Доступен для List, Set, Map
         */

        Collection<Integer> integers = List.of(0, 1, 2, 3, 5, 6);
        System.out.println("integers: " + integers);
        // integers.add(7); // попытка модифицировать (изменить) неизменяемую коллекцию приведет в ошибку (Исключительная ситуация)

      /*
        strings.add("JS");
        strings.add("Go Land");
        strings.add("Ruby");
       */

        /**
        6. addAll(Collection<? extends T> col) - добавляет все элементы из указанной коллекции. (СЛОЖЕНИЕ)
         */
        strings.addAll(List.of("JS", "Go Land", "Ruby"));

        System.out.println(strings);

        System.out.println("\n===================\n");

        /**
         Вычитание
        7. removeAll(Collection<?> col) - удаляет все элементы содержащиеся в коллекции col (параметр)
         из коллекции на которой вызван метод
         */
        Collection<Integer> numbers = new ArrayList<>();
        numbers.addAll(List.of(0, 1, 2, 3, 4, 5, 3, 3));

        System.out.println("numbers: " + numbers);
        numbers.removeAll(List.of(3, 2, 1));

        System.out.println("numbers.removeAll(List.of(3, 2, 1)): " + numbers);

        /**
          Пересечение
         8. retainAll(Collection<?> col) - Оставляет в коллекции вызова только те элементы, которые содержаться в коллекции col.
          Удаляет из коллекции вызова элементы, которые НЕ содержаться в коллекции col
          [3, 3, 2, 2, 1] retainAll [3, 2] -> [3, 3, 2, 2]
         */

        Collection<Integer> colA = new ArrayList<>();
        Collection<Integer> colB = new ArrayList<>();
        colA.addAll(List.of(10, 20, 30, 20, 40, 50, 60));
        colB.addAll(List.of(20, 30, 40, 100));
        System.out.println("colA: " + colA);
        System.out.println("colB: " + colB);
        colA.retainAll(colB);
        System.out.println("colA.retainAll(colB): " + colA);
//        colB.retainAll(colA);
//        System.out.println("colB: " + colB);

        /**
        9. boolean remove(Object obj) - удаляет элемент из коллекции. Возвращает true, если элемент был удален
         */
        System.out.println("colA.remove(100): " + colA.remove(100));
//        colA.retainAll(List.of(20)); // если нужно удалить все вхождения
        System.out.println("colA.remove(20): " + colA.remove(20)); // Удалит одно значение
        System.out.println("colA: " + colA);

        /**
        10. clear() удаляет все элементы из коллекции
         */
        colA.clear();
        System.out.println("colA: " + colA);
    }
}
