package Consultation.consultation_15bookStore.main.repository;

import consultation_15bookStore.main.model.Book;
import consultation_15bookStore.main.utils.MyArrayList;
import consultation_15bookStore.main.utils.MyList;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    private MyList<Book> books = new MyArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }
    public ArrayList<Book> getAllBooks() {
        return (ArrayList<Book>) books;
    }

}
