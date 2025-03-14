package Lesson.lesson_23.transport;
/*
Абстрактный класс используется для написания классов,
не предназначенных для создания объектов этого класса
 */

public abstract class Vechikle {
    private Engine engine;

    //Абстрактный метод - это метод без реализации.
    // Только объявление метода(без тела).
    //Предназначен для переопределения в подклассах(наследниках)

    public abstract void startEngine();


    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    @Override
    public String toString() {
        return "Vechikle {" +
                "engine =" + engine +
                '}';
    }
}
