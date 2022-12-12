import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();
    public Library() {}

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> getBook(String title) {
        ArrayList<Book> ans = new ArrayList<>();
        for (Book book : books) {
            if (book.title().equals(title)) ans.add(book);
        }
        return ans;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    @Override
    public String toString() {
        String str = "Books:\n";
        for (var book : books) {
            str += book.toString() + "\n";
        }
        return str;
    }
}
