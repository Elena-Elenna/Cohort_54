package Consultation.consultation_21;

import consultation_21.model.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookExample {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954, 22.99, 1178));
        books.add(new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 1997, 16.99, 223));
        books.add(new Book("The Hobbit", "J.R.R. Tolkien", 1937, 19.99, 310));

        // 1. Сортировка книг с использованием естественного порядка (Comparable)
        Collections.sort(books);

//        Вывод отсортированных книг
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println("===============================");
        // Сокращенная версия
        //        books.forEach(System.out::println);

        // 2. Сортировка книг с использованием компаратора (Comparator) по году издания
        Comparator<Book> yearComparator = new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return Integer.compare(book1.getYear(), book2.getYear());
            }
        };

        books.sort(yearComparator);
        System.out.println("Сортировка по году издания (анонимный класс): ");
        for (Book book : books) {
            System.out.println(book);
        }

        // 3. Сортировка книг с использованием компаратора (Comparator) по цене
        Comparator<Book> priceComparator = (book1, book2) -> Double.compare(book1.getPrice(), book2.getPrice());
        books.sort(priceComparator);
        System.out.println("Сортировка по цене (lambda): ");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
