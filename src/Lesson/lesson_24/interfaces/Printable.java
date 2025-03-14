package Lesson.lesson_24.interfaces;
 /*
    Интерфейс - это ссылочный тип Java.
    Интерфейс - это совокупность абстрактных методов.
    Абстрактный класс - описывает свойства и поведения будущих объектов,
    а интерфейс - содержит только поведение, которое класс будет реализовывать.
    Интерфейсы косвенно абстрактны. нам не нужно использовать ключевое слово abstract.
    Все методы интерфейса косвенно абстрактны и публичные.
    В интерфейсе могут быть определены константы.
     */

public interface Printable {
    void print();  // пишутся без public и abstract.

    //в JDK 8 были добавлены методы по умолчанию.
    //Это методы, которые имеют реализацию по умолчанию,которая используется в случае
    //если класс реализующий интерфейс не переопределит этод метод.

    default void defaultMethod(){
        System.out.println("Default method from interface");
    }

    //Начиная с JDK 8 доступны статические методы в интерфейсе.
    static void staticMethod(){
        System.out.println("Static method from interface");
    }

    // Начиная с JDK 9 появилась возможность писать приватные методы.
    //Они могут быть статические и не статические.
    //Приватные методы не могут быть переопределены в классе.

    private void privateMrthod(){
        System.out.println("Private method from interface");
    }
}
