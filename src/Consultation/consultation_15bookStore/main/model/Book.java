package Consultation.consultation_15bookStore.main.model;

public class Book {
    public static int counter = 1;
    private int id;
    private String title;
    private String author;
    private double price;
    private int year;

    User borrower;

    public Book(String title, String author, double price, int year) {
        this.id = counter++;
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
//        this.borrower = null;
    }

    public User getBorrower() {
        return borrower;
    }

    public void setBorrower(User borrower) {
        this.borrower = borrower;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(final String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(final int year) {
        this.year = year;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id = " + id +
                ", title = '" + title + '\'' +
                ", author = '" + author + '\'' +
                ", price = " + price +
                ", year = " + year +
                '}';
    }
}
