import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Library library = new Library(Book.getBooks());
        Library reader = new Library();
        String cmd = "";
        while (!"/quit".equals(cmd)) {
            System.out.println("Enter command:");
            cmd = scanner.next();
            if ("/quit".equals(cmd)) {
                System.out.println("Bye bye!");
                break;
            }
            else if ("/get".equals(cmd)) {
                changeBook(library, reader);
            }
            else if ("/put".equals(cmd)) {
                changeBook(reader, library);
            }
            else if ("/list".equals(cmd)) {
                System.out.println(reader);
            }
            else if ("/all".equals(cmd)) {
                System.out.println(library);
            }
            else {
                System.out.println("Unknown command");
            }
        }
    }

    private static void changeBook(Library library, Library reader) {
        String title = scanner.nextLine().trim();
        ArrayList<Book> books = library.getBook(title);
        if (books.size() == 0) {
            System.out.println("No such books");
            return;
        }
        System.out.println("Which one do you want to change?");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(i + 1 + ") " + books.get(i));
        }
        int ind = scanner.nextInt();
        System.out.println("Your book: " + books.get(ind - 1));
        reader.addBook(books.get(ind - 1));
        library.removeBook(books.get(ind - 1));
    }
}
