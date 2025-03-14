package Consultation.consultation_16.main;

import consultation_16.main.controller.BookController;

public class LibraryApp {
    public static void main(String[] args) {
        BookController bookController = new BookController();
        bookController.run();
    }

}
