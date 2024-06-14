import java.util.ArrayList;
import java.util.List;

// Define the Library class
public class add {
    // Private list to store books
    private List<String> books = new ArrayList<>();

    // Method to add a book to the library
    public void addBook(String book) {
        books.add(book);
    }

    // Method to remove a book from the library
    public void removeBook(String book) {
        books.remove(book);
    }
}
