package Consultation.consultation_11.bookstore;

public class Book {
    private final String title;
    private Author author;

    // constructor, getters, setters
    public Book(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getInfo() {
        String info = "Наименование: " + getTitle();

        if (author != null) {
            info += "\nАвтор: " + author.getName();
        }
        return info;
    }
}
