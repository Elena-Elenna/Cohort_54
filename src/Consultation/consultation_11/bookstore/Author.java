package Consultation.consultation_11.bookstore;

import java.util.Arrays;

public class Author {
    private final String name;
    private Book[] books;

    // constructors
    public Author(String name, Book[] booksList) {
        this.name = name;
        books = booksList;
    }

    public Author(String name) {
        this.name = name;
    }

    // getters, setters
    public String getName() {
        return name;
    }

    // Метод добавления книги в массив книг автора
    public void addBook(Book book) {
        Book[] newBooks;
        if (books != null && books.length > 0) {
            newBooks = Arrays.copyOf(books, books.length + 1);
            newBooks[books.length] = book;
        } else {
            newBooks = new Book[] { book };
        }
        books = newBooks;
    }

    // Метод получения книг автора в строковом представлении из массива книг
    public String getBooks() {
        String titleBooks = "";
        for(int i = 0; i < books.length; i++) {
            if (i < books.length - 1) {
                titleBooks += books[i].getTitle() + ", ";
            } else {
                titleBooks += books[i].getTitle();
            }
        }
        return titleBooks;
    }

    // Метод для получения информации об авторе и его
    // произведениях с помощью StringBuilder
    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Автор: ");
        sb.append(getName());
        sb.append("\n");
        sb.append("Произведения: ");
        sb.append(getBooks());
        return sb.toString();
    }
}
