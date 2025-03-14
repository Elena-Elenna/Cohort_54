package Lesson.lesson_42;

import Lesson.lesson_41.Cat;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Streams_2 {

    /*
    Stream API - мощный инструмент, позволяющий обрабатывать наборы данных в декларативном стиле

    Stream (поток) - поток данных представляет собой последовательность элементов.
    Поток дает возможность поочередного получение элемента данных для обработки.
    Стримы могут быть созданы из различных источников (коллекции, массивы и так далее)

    Pipeline - последовательно операций, выполняемых на потоке

    Промежуточные операции (методы) - Это операции, которые преобразуют поток в другой поток (возвращают поток).
    Их может быть много (больше чем одна)

    Терминальные операции (методы) - Это операции, которые запускают обработку потока и закрывают его.
    После выполнения терминальной операции поток перестает быть доступным для дальнейшей обработки.
    Может быть ТОЛЬКО ОДИН терминальный метод

    Ленивые вычисления
    Стримы не выполняют промежуточные операции, пока на потоке не будет вызван терминальный метод.





     */


    /*
    Промежуточные методы:

    Stream<T> filter(Predicate<T> predicate) - оставляет в потоке только те элементы,
    для которых предикат вернет true
    Т.е. Оставляет элементы, удовлетворяющие условию (отбрасывает элементы НЕ удовлетворяющие условию)

    sorted() - сортирует поток в естественном порядке
    sorted(Comparator<T> comparator> - сортирует элементы с использованием компаратора

    Stream<R> map(Function<T, R> action) - преобразует элементы потока с использованием заданной функции,
    в том числе в другой тип данных

    Stream<T> peek(Consumer<T> action) - выполняет действие для каждого элемента потока. Как правило, не изменяющее элемент

    distinct() - Удаляет дубликаты из потока. Сравнивает (определяет равенство) методом equals()

    limit(long maxSize) - Ограничивает кол-во элементов потока. В потоке может быть не больше maxSize элементов

    skip(long n) - отбрасывает (пропускает) n элементов потока

   Stream<T>  mapToObj(Function() mapper) - преобразование примитивного типа данных в ссылочных при помощи
    заданной функции.

    boxed() - для преобразования потока примитивов (IntStream) в поток их соответствующих оберток(Stream<Integer)

    mapToInt - преобразует поток Stream<Integer> в поток примитивов IntStream



     */

    /*
    Терминальные методы

    R collect(Collector<T, A, R> collector) - преобразует элементы потока в разные виды коллекций или другие структуры данных.

    void forEach(Consumer<T> action) - выполняет заданное действие для каждого элемента потока

    Optional<T> min(Comparator<T> comparator) - элемент с минимальным значением в соответствии с компаратором
    Optional<T> max(Comparator<T> comparator) - элемент с максимальным значением в соответствии с компаратором

    long count() - возвращает количество элементов в потоке

    Optional<T> findFirst()- получить первый элемент потока
    Optional<T> findAny()- получить случайный элемент потока


     */


    public static void main(String[] args) {

//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
//        task9();
//        task10();
//        task11();
//        task12();
//        task13();
//        task14();
//        task15();
        task16();

    } // Methods area

    /**
     Преобразовать массив примитивов в коллекцию, используя StreamApi
     */
    private static void task16() {
        int[] ints = {1, 2, 3, 4, 5, 6, 7};

        // Stream<int> - не бывает! IntStream, DoubleStream - бывают потоки примитивов.
        List<Integer> integers = Arrays.stream(ints)
                .boxed()
                // работает автоупаковка int -> Integer
//                .mapToObj(i -> i)
//                .mapToObj(i-> Integer.valueOf(i))
                .collect(Collectors.toList());

        System.out.println(integers.size());

        // Получить из коллекции Integer - массив примитивов
        int[] intArray = integers.stream()
                //автораспаковка
                .mapToInt(i -> i)
                .toArray();

        System.out.println("массив: " + Arrays.toString(intArray));


    }

    /**
     получить самое маленькое число
     */
    private static void task15() {
        List<Integer> integers = List.of(5, 4, 14, 56, 32, 25, -1, -10, 0);

        Optional<Integer> first = integers.stream()
                .sorted()
//                .findFirst(); // Optional<T> получить первый элемент потока
                .findAny(); // Optional<T> получить случайны элемент потока

        int min = first.get();

        System.out.println("min = " + min);




    }

    /**
        Получить список из трех самых маленьких чисел из списка
     */
    private static void task14() {
            List<Integer> integers = List.of(5, 4, 14, 56, 32, 25, -1, -10, 0);

        // {0, 1, 2 ,56, 76, 88}
        List<Integer> smallest = integers.stream()
                .sorted()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("smallest: " + smallest);

        // Получить список чисел, отбросив 2 самых маленьких
        List<Integer> array = integers.stream()
                .sorted()
                .skip(2)
                .collect(Collectors.toList());

        System.out.println("array: " + array);
    }

    /**
     Посчитать количество четных чисел в списке используя StreamApi
     */
    private static void task13() {
        List<Integer> integers = List.of(5, 4, 14, 56, 32, 25, -1, -10, 0);

        long count = integers.stream()
                .filter(n -> n % 2 == 0)
                .count();

        System.out.println("Кол-во четных: " + count);
    }

    /**
         Найти самое длинное имя кота из списка котов
     */
    private static void task12() {
        List<Cat> cats = getListCats();
        /*
        1. Стрим Cat -> Stream имен
        2. Найти самое длинное имя (сравнивать имена по их длине)
         */

        Optional<String> longetNameOptional = cats.stream()
                .filter(Objects::nonNull) // проверка null объектов Cart
//                .map(cat ->  cat.getName())
                .map(Cat::getName)
                .filter(Objects::nonNull) // проверка имен на null
                .max(Comparator.comparing(String::length));
//                .max((name1, name2) -> Integer.compare(name1.length(), name2.length()));
//                .max((name1, name2) -> name1.length() - name2.length());

        if (longetNameOptional.isPresent()) {
            System.out.println(longetNameOptional.get());
        } else {
            System.out.println("Котов с имена не найдено");
        }

        String longestString = cats.stream()
                .map(Cat::getName)
                .max(Comparator.comparing(String::length))
                .orElse("");
//                .orElse(null);
        System.out.println(longestString);

    }


    /**
     Оставить только отрицательные числа и потом взять максимальное значение из оставшихся
     */
    private static void task11() {

        List<Integer> integers = List.of(5, 4, 14, 56, 32, 25, -1, -10, 0);


        // Я хочу найти максимальное отрицательное число в этом списке
        Optional<Integer> maxOpt = integers.stream()
                .filter(i -> i < 0)
                .max(Comparator.naturalOrder());

        System.out.println("max: " + maxOpt.orElse(null));

        System.out.println("\n=======================");


        Cat findMe = findCat("TEST");
//        System.out.println(findMe.getName());

        Optional<Cat> optionalCat = findOptionalCat("Bear");
        System.out.println(optionalCat);
        System.out.println("optionalCat.isPresent(): " + optionalCat.isPresent()); // вернет true, если в Optional завернут не-null (там есть значение)
        System.out.println("optionalCat.isEmpty(): " + optionalCat.isEmpty()); // вернет true, если в Optional пустой.  (там завернут null)

        if (optionalCat.isPresent()) {
            Cat cat = optionalCat.get(); // Возвращает значение, если оно присутствует. Если внутри null - будет исключение NoSuchElements (ошибка)
            System.out.println("Вытащили из optional котика: " + cat.getName());
        } else {
            System.out.println("Там завeрнут null");
        }

        // Возвращает значение, если оно присутствует. Если внутри null - вернет defaultValue
        Cat catDefault = optionalCat.orElse(new Cat("Default", 1, "white"));
        System.out.println(catDefault);
    }

    // ======== класс Optional -

    /**
     Используем Optional для указания, что из метода может вернуться Cat, но может вернуться и null
     */
    private static Optional<Cat> findOptionalCat(String name) {
        List<Cat> cats = getListCats();

        Cat result = null;
        for (Cat cat : cats) {
            if (cat.getName().equals(name)) {
                result = cat;
            }
        }

        // result ? cat | null
        // Создание объектов
        Optional.empty(); // Возвращает пустой Optional (завернут null)
        Optional.of(new Object()); // Возвращает Optional с ne-null значением. Завернуть null нельзя!!! (будет NPE)
        Optional.ofNullable(null); // возвращает Optional. Можно завернуть или значение, или null.

        return Optional.ofNullable(result);
    }

    private static Cat findCat(String name) {
        List<Cat> cats = getListCats();

        for (Cat cat : cats) {
            if (cat.getName().equals(name)) {
                return cat;
            }
        }

        return null;
    }

    /**
         Удалить дубликаты (повторяющиеся значения) из списка
     */
    private static void task10() {
        List<Integer> integers = Arrays.asList(10, 20, 30, 20, 30, 50, 0);

        List<Integer> unique = integers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("unique: " + unique);

        System.out.println("\n ====================");
        Cat cat = new Cat("Bear", 5, "braun");
        Cat cat1 = new Cat("Python", 7, "green");
        Cat cat2 = new Cat("Tiger", 3, "yellow");
        Cat cat3 = new Cat("Panda", 4, "black");
        Cat cat4 = new Cat("Panda", 4, "black");

        List<Cat> cats = new ArrayList<>(
                List.of(cat, cat1, cat2, cat3, cat4, cat)
        );

        cats.forEach(System.out::println);
        System.out.println();

        cats.stream()
                .distinct()
                .forEach(System.out::println);

    }

    /**
        создание стрима из Map
     */
    private static void task9() {

        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", -10);
        map.put("Cherry", 5);

        // Создание стрима из элементов entrySet
        map.entrySet().stream()
                .filter(entry -> entry.getValue() > 0)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        System.out.println("map: " + map);
    }


    /**
       Получить список кошек, имя которых длиннее 4 символов
     */
    private static void task8() {
        Cat cat = new Cat("Bear", 5, "braun");
        Cat cat1 = new Cat("Python", 7, "green");
        Cat cat2 = new Cat("Tiger", 3, "yellow");
        Cat cat3 = new Cat("Panda", 4, "black");

        Cat[] cats = {cat, cat1, null, cat2, cat3, new Cat(null, 10, "red")};


        // Arrays.stream(cats) - создает поток из элементов массива

        List<Cat> longCats = Arrays.stream(cats)
//                .filter(c -> c != null) // оставить в потоке только не null
//                .filter(c -> Objects.nonNull(c)) // оставить не null значения
                .filter(Objects::nonNull) // оставить не null значения
                .filter(c -> Objects.nonNull(c.getName())) // проверка какого-то поля на null
                .filter(c -> c.getName().length() > 4)
                .collect(Collectors.toList());

//        Objects.isNull(null); // вернет true, если параметр null
//        Objects.nonNull(null); // вернет true, если параметр НЕ null

        System.out.println(longCats);


    }

    private static void task7() {
        List<Cat> cats = getListCats();

        // Вывести на экран имена котов, чей вес меньше 5 кг.
        // Вывести на экран котов, после фильтрации

        Stream<String> catStream = cats.stream()
                .filter(c -> c.getWeight() < 5)
                .peek(cat -> System.out.println("After filter:" + cat))
                .map(cat -> cat.getName());
        /**
        peek - промежуточный метод. Используется в основном для отладки. Не прерывает поток.
        forEach - терминальный метод. Для выполнения действия с каждым элементов потока. Закрывает поток
         */

        catStream.forEach(name -> System.out.println(name));
//        catStream.forEach(System.out::println);

    }

    /**
         Получить список имен кошек, у которых имена короче 5 символов
     */
    private static void task6() {

        List<Cat> cats = getListCats();

        /*
        классически - методы фильтрации должны выполнятся в потоке как можно раньше
        Эффективность
         */
        List<String> names1 = cats.stream()
                .filter(cat -> cat.getName().length() < 5)
                .map(Cat::getName)
                .collect(Collectors.toList());

        System.out.println(names1);

        /*
        Читаемость, понимание кода
         */
        System.out.println("\n=====================");
        List<String> names2 = cats.stream()
                .map(Cat::getName)
                .filter(name -> name.length() < 5)
                .collect(Collectors.toList());

        System.out.println(names2);


    }

    private static void task5() {
        List<Cat> cats = getListCats();

        /*
        Получить список имен кошек, чей вес больше 4
        Создать поток
        Оставить кошек, чей вес больше 4
        Изменить тип потока Cat -> name (String)
        Собрать в список
        */

        List<String> names = cats.stream()
                .filter(cat -> cat.getWeight() > 4)
//                .map(cat -> cat.getName())
                .map(Cat::getName)
                .collect(Collectors.toList());

        System.out.println(names);

    }

    private static void task4() {
        List<Cat> cats = getListCats();

        // Получить список имен всех кошек

        Stream<String> namesStream = cats.stream()
                .map(cat -> cat.getName());

        List<String> catNames = cats.stream()
                .map(Cat::getName)
                .collect(Collectors.toList());

//        List<String> listName = new ArrayList<>();
//        for (Cat cat : cats) {
//            listName.add(cat.getName());
//        }

        System.out.println("names: " + catNames);

        // Изначальная коллекция не изменяется
        System.out.println(cats);
    }

    private static void task3() {
        List<Cat> cats = getListCats();

        // Оставить котов с именем, длиннее 4 символов
        Stream<Cat> stream = cats.stream()
                .filter(c -> c.getName().length() > 4);

        // Пока не запущен терминальный метод - промежуточные методы не выполняются
        List<Cat> longNames = stream.collect(Collectors.toList());

        System.out.println("longNames: " + longNames);
    }

    private static void task2() {
        List<Cat> cats = getListCats();

        // список кошек с весом больше 4
        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() > 4);

        // Терминальный метод
        List<Cat> fatCats = catStream.collect(Collectors.toList());
//        List<Cat> fatCats = catStream.toList(); // Java 17 or higher  .collect(Collectors.toList() = .toList()

        // Повторно использовать "закрытый" поток нельзя. Закрытый - на котором уже был вызван терминальный метод.
        // List<Cat> fatCats2 = catStream.sorted().collect(Collectors.toList()); // - будет ошибка (исключение)

        System.out.println(fatCats);

    }


    private static List<Cat> getListCats() {
        return List.of(
                new Cat("Bear", 5, "braun"),
                new Cat("Python", 7, "green"),
                new Cat("Tiger", 3, "yellow"),
                new Cat("Panda", 4, "black")
        );
    }


    private static void task1() {
        List<Integer> integers = List.of(-1, 12, 0, 5, 1, -15, 24, 0);
        // Получить список, содержащий все положительные числа из исходного списка
        // Список должен быть отсортирован в порядке возрастания


        List<Integer> result = new ArrayList<>();

        for (Integer num : integers) {
            if (num > 0) {
                result.add(num);
            }
        }

        result.sort(Comparator.naturalOrder());

        System.out.println("result: " + result);

        // У всех коллекций есть метод .stream() создающий поток (стрим) из элементов коллекции.

        List<Integer> integerList = integers.stream() // создание потока из элементов коллекции List
                .filter(num -> num > 0) // фильтрация элементов потока
                .sorted() // сортировка элементов в естественном порядке
                .collect(Collectors.toList()); // собирает элементы потока в коллекцию List

        System.out.println("integerList: " + integerList);

        // Pipeline
        //integers.stream().filter(num -> num > 0)
    }
}
