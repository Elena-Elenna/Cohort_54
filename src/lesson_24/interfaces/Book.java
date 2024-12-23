package lesson_24.interfaces;
//Класс реализует(имплементирует) интерфейс.
//Если класс не реализовал все абстрактные методы интерфейса,
//он обязан объявить себя абстрактным.

public class Book implements Printable{

    private String title;
    private String author;


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void uniqueMethod(){
        System.out.println("uniqueMethod");
    }

    @Override
    public void print() {
        System.out.printf("Название книги: %s (%s)\n", title, author);
    }
}
