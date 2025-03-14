package Lesson.lesson_24.interfaces;

public class Journal implements Printable{
    private String name;
    private int number;

    public Journal( String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public void defaultMethod() {
        //Специфика обращения к интерфейсу в качестве "super"
//        Printable.super.defaultMethod();
        System.out.println("Default method from Journal");
    }

    @Override
    public void print() {
        System.out.println("Journal: " + name +" # " + number);
    }
}
