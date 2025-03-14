package Lesson.lesson_36;

import java.util.Comparator;

public class CarSpeedCompartor implements Comparator<Car> {
    @Override
    public int compare(Car c1, Car c2) {
        return c1.getMaxSpeed() - c2.getMaxSpeed();
    }
}
