package Consultation.consultation_15bookStore.main;

import consultation_15bookStore.main.controller.BookController;

import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        BookController bookController = new BookController();
        bookController.run();

    }

}
