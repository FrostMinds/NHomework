package Homework8;

public class Book {
    private String title;
    private Author author;
    private int publishYear;

    public Book(Author author ,String title, int publishYear) {
        this.author = author;
        this.title = title;
        this.publishYear = publishYear;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublishYear() {
        return this.publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

}



