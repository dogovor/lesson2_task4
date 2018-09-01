import java.util.ArrayList;
import java.util.Objects;

public class Library {
    private final ArrayList<Book> library = new ArrayList<>();

    public void addBook(Book book) {
        library.add(book);
    }

    @Override
    public String toString() {
        return "Library{" +
                "library=" + library +
                '}';
    }

    public Library findAuthor(String author) {
        Library results = new Library();
        for (Book i : library) {
            if (Objects.equals(i.getAuthor(), author)) {
                results.addBook(i);
            }
        }
        return results;
    }

    public Library findPublishing(String publishing) {
        Library results = new Library();
        for (Book i : library) {
            if (Objects.equals(i.getPublishing(), publishing)) {
                results.addBook(i);
            }
        }
        return results;
    }

    public Library findAfterYear(int year) {
        Library results = new Library();
        for (Book i : library) {
            if (i.getPublishYear() >= year) {
                results.addBook(i);
            }
        }
        return results;
    }
}
