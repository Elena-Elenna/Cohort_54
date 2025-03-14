package Home_Work.homework_36.teacherHW.task_2;

import Lesson.lesson_36.Car;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Sergey Bugaenko
 * {@code @date} 11.02.2025
 */

public class CarsApp {
    public static void main(String[] args) {
        Car[] cars = new Car[6];

        cars[0] = new Car("Alfa", 2021, 120);
        cars[1] = new Car("BMW", 2000, 190);
        cars[2] = new Car("Citroen", 2018, 190);
        cars[3] = new Car("VW", 2021, 250);
        cars[4] = new Car("Ferrari", 2024, 300);
        cars[5] = new Car("Ferrari", 2021, 250);


        // Доп дз по желанию:
        // Отсортировать машины по году выпуска, если год равен - отсортировать по модели в обратном порядке
        Arrays.sort(cars, Comparator.comparing(Car::getYear).thenComparing(Car::getModel, Comparator.reverseOrder()));
        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println("\n===============\n");

       // Работа с null значениями в поле (если они есть)

        Arrays.sort(cars, Comparator.comparing(Car::getYear).thenComparing(Car::getModel, Comparator.nullsFirst(Comparator.reverseOrder())));

        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println("\n===============\n");

        // Отсортировать машины по году выпуска, если год равен - отсортировать по максимальной скорости в порядке возрастания
        Arrays.sort(cars, Comparator.comparing(Car::getYear).thenComparing(Car::getMaxSpeed));
        for (Car car : cars) {
            System.out.println(car);
        }


    }
}
