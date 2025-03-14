package Consultation.consultation_21.model;

public class Book implements Comparable<Book>{
    public static int counter = 1;
    private int id;
    private String title;
    private String author;
    private int year;
    private double price;
    private int pages;

    public Book(String title, String author, int year, double price, int pages) {
        this.id = counter++;
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
        this.pages = pages;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", pages=" + pages +
                '}';
    }

    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }
}
