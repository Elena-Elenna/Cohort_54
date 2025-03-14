package Consultation.consultation_15bookStore.main.controller;

import consultation_15bookStore.main.model.Book;
import consultation_15bookStore.main.repository.BookRepository;
import consultation_15bookStore.main.service.BookService;

import java.util.List;
import java.util.Scanner;

public class BookController {
    private BookRepository bookRepository;
    private BookService bookService;


    public BookController() {
        this.bookRepository = new BookRepository();
        this.bookService = new BookService(bookRepository);
    }


    private void waitRead(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Для продолжения нажмите Enter...");
        scanner.nextLine();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1.Add book");
            System.out.println("2. Get info the book");
            System.out.println("3. Update book");
            System.out.println("4. Delete book");
            System.out.println("5. Print all books");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println(" Add new book");
                    waitRead();
                    addBook(scanner);
                    break;
                case 2:
                    System.out.println(" Get info the book");
                    waitRead();
                    break;
                case 3:
                    System.out.println(" Update book");
                    waitRead();
                    break;
                case 4:
                    System.out.println(" Delete book");
                    waitRead();
                    break;
                case 5:
                    System.out.println(" Print all books");
                    waitRead();
                    break;
                case 6:
                    System.exit(0);
                    waitRead();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

    }
    private void addBook(Scanner scanner) {
        System.out.println("Enter book title: ");
        String title = scanner.nextLine();

        System.out.println("Enter book author: ");
        String author = scanner.nextLine();

        System.out.println("Enter book price: ");
        double price = scanner.nextDouble();

        System.out.println("Enter book year: ");
        int year = scanner.nextInt();

        // Add book from data
        Book book = new Book(title, author, price, year);
        bookService.addBook(book);
        System.out.println(book);

    }

    private void printAllBooks() {
        List<Book> allBooks = bookService.getAllBooks();
        if (allBooks.isEmpty()) {
            for (Book book : allBooks) {
                System.out.println(book);
            }
            System.out.println("No books found.");
        }
    }

}
