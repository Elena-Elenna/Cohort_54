package lesson_36;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    public static void main(String[] args) {

        int[] ints = new int[]{9, 5, 1, 5, 2, 0, 15, 10};
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));

        Car[] cars = new Car[6];
        cars[0] = new Car("Alfa", 2021, 120);
        cars[1] = new Car("BMW", 2000, 190);
        cars[2] = new Car("Citroen", 2018, 190);
        cars[3] = new Car("VW", 2021, 250);
        cars[4] = new Car("Ferrari", 2024, 300);
        cars[5] = new Car("Ferrari", 2021, 250);

        System.out.println(Arrays.toString(cars));
        Arrays.sort(cars);
        System.out.println(Arrays.toString(cars));

        /**
         Интерфейс Comparable (с английского можно перевести как "сравнимый")
         Интерфейс Comparator<T> -
        /*
        int compare(T o1, T o2)
         */
        System.out.println("===================== \n");
        CarSpeedCompartor carSpeedCompartor = new CarSpeedCompartor();
        Arrays.sort(cars, carSpeedCompartor);
        System.out.println(Arrays.toString(cars));

        /**
         String и Integer уже имеют встроенную логику сравнения, т.е.
         реализуют интерфейс Comparable
         */

        System.out.println("===================== \n");
        Arrays.sort(cars, new CarModelComparator());
        System.out.println(Arrays.toString(cars));

        System.out.println("===================== \n");
        /**
        Анонимный класс - это класс, для создания объекта на лету - без явного объявления нового класса.
        Используются когда необходим одноразовый объект.
         */

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getModel().compareTo(car2.getModel());
            }
        });

        /**
         Сравнение машин по году выпуска в порядке возрастания,
         если год совпадает - сравнить такие машины по модели в порядке убывания
         */
        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            // 10 vs 20 -> -1 : 20 vs 10 -> 1 : 15 vs 15 -> 0
            public int compare(Car c1, Car c2) {
                int yearCompare = c1.getYear() - c2.getYear();

                if (yearCompare != 0) {
                    return yearCompare;
                } else {
                    // Обратный порядок сортировки
                    // 20 vs 10 -> 1 : 10 vs 20 -> -1 : 15 vs 15 -> 0
                    return c2.getModel().compareTo(c1.getModel());
                }
            }
        });

        System.out.println(Arrays.toString(cars));

        System.out.println("===================== \n");
        // отсортировать машины по году выпуска в обратном порядке
        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            // 1900 vs 1950 -> -1
            public int compare(Car c1, Car c2) {
                // 1950 - 1900 -> +1
                return c2.getYear() - c1.getYear();
//                return (c1.getYear() - c2.getYear()) * (-1); // Тоже будет работать, но так не пишут
            }
        });

        System.out.println(Arrays.toString(cars));
        System.out.println("===================== \n");

        /**
        Функциональный интерфейс - это интерфейс, который имеет РОВНО ОДИН абстрактный метод
         (метод который нужно реализовать, если мы имплементирует интерфейс)
         Интерфейс Comparator с Java 8 стал функциональным интерфейсом,
         что позволяет использовать лямбда-выражения для его реализации

         Лямбда-выражения это краткий способ записи анонимных функций в Java
         В лямбда используется компактный синтаксис для определения функций / методов.
         Синтаксис включает в себя -> (стрелку) и тело функции
         Лямбда-выражения во многих случаях могут заменить анонимные классы и реализацию на лету функциональных - интерфейсов
         */

        Arrays.sort(cars, (c1, c2) -> {
            return c2.getYear() - c1.getYear();
        });

        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars, (c1, c2) -> c2.getYear() - c1.getYear());
        System.out.println(Arrays.toString(cars));

        System.out.println("===================== \n");

        // Отсортировать машины по максимальной скорости в порядке убывания.
        // Если скорость совпадает - отсортировать по году - естественный порядок (от младшей к старшей)

        Comparator<Car> carComparator = (c1, c2) -> {
//            int speedComp = c2.getMaxSpeed() - c1.getMaxSpeed();
            // Отсутствие риска переполнения типа
            int speedComp = Integer.compare(c2.getMaxSpeed(), c1.getMaxSpeed());
            System.out.println("Speed: " + speedComp);

            if (speedComp == 0) {
                return Integer.compare(c1.getYear(), c2.getYear());
            }
            return speedComp;
        };

        Arrays.sort(cars, carComparator);
        System.out.println(Arrays.toString(cars));

        System.out.println("==================== \n");

//         Статические методы интерфейса Comparator
        Comparator<Car> byModel = Comparator.comparing(Car::getModel);

        Arrays.sort(cars, byModel);
        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars, Comparator.comparing(Car::getYear));
        System.out.println(Arrays.toString(cars));

        // Отсортировать по году выпуска в порядке убывания
        Arrays.sort(cars, Comparator.comparing(Car::getYear, Comparator.reverseOrder()));
        // Альтернативный способ
        Arrays.sort(cars, Comparator.comparing(Car::getYear).reversed());

        System.out.println("===================\n");

        // Отсортируй по модели. Если модели равны, то отсортируй такие машины по убыванию года выпуска
        Arrays.sort(cars, Comparator.comparing(Car::getModel).thenComparing(Car::getYear, Comparator.reverseOrder()));
        System.out.println(Arrays.toString(cars));

        // Доп дз по желанию:
        // Отсортировать машины по году выпуска, если год равен - отсортировать по модели в обратном порядке
        // Отсортировать машины по году выпуска, если год равен - отсортировать по максимальной скорости в порядке возрастания
    }
}
