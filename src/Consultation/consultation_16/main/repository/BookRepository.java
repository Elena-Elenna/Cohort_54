package Consultation.consultation_16.main.repository;

import consultation_16.main.model.Book;


import java.util.ArrayList;

public class BookRepository {

    // "БД" или хранилище
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public ArrayList<Book> getAllBooks() {
        return books;
    }
}
