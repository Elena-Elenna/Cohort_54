package Lesson.lesson_36;

public class Car implements Comparable<Car> {
    private String model;
    private int year;
    private int maxSpeed;

    public Car(String model, int year, int maxSpeed) {
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car {" +
                "model = '" + model + '\'' +
                ", year = " + year +
                ", maxSpeed = " + maxSpeed +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // Метод, который сравнивает текущий объект с car1
    @Override
    public int compareTo(Car car1) {
        return this.year - car1.getYear();
    }

    // this - car1 ->

    /**
    a vs b - кто больше
    a < b -> отрицательное значение
    a > b -> метод должен вернуть положительное значение
    a == b -> метод вернет 0
     */

}
