import java.util.ArrayList;

public class Book {
    private final String title;
    public String title(){ return title;}
    private final String description;
    public String description(){ return description;}
    private final String author;
    public String author(){ return author;}
    private final int year;
    public int year(){ return year;}

    public Book(String title, String description, String author, int year) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.year = year;
    }
    @Override
    public String toString() {
        return "Book " + "'" + title + "'" + " by " + author;
    }
    public static ArrayList<Book> getBooks() {
        // тут мог быть рандом
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Love","Description 1",
                "Artur Dissel", 2019));
        books.add(new Book("War","Description 2",
                "Jemmy Turn", 1980));
        books.add(new Book("Piece","Description 3",
                "Alice Sing", 1379));
        books.add(new Book("Economy","Description 4",
                "Rachel Buff", 1967));
        books.add(new Book("Computer science","Description 5",
                "Gordon Word", 1990));
        books.add(new Book("Finance","Description 6",
                "Chris Humm", 2001));
        books.add(new Book("Medicine","Description 7",
                "Another Person", 2020));
        return books;
    }
}
