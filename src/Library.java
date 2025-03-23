
import java.util.List;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) throws InvalidBookException {
        if (book == null) {
            throw new InvalidBookException("Book should not be null");
        }
        books.add(book);
    }

    private Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void borrowBook(String title) throws BookNotFoundException, EmptyLibraryException {
        if (books == null || books.isEmpty()) {
            throw new EmptyLibraryException("Library is empty, nocbooks to borrow");
        }
        Book book = findBook(title);
        if (book == null) {
            throw new BookNotFoundException("Book with title " + title + "not found.");
        }
        System.out.println("The book borrows succusfully!");
        toString();
    }

    public void returnBook(String title) throws BookNotFoundException {
        if (findBook(title) == null)
            throw new BookNotFoundException("Cannot return. Book with title" + title + "not found.");

    System.out.println("The book was returned successfully!");
    toString();
    }
    public void listBooks() throws EmptyLibraryException{
        if(books == null || books.isEmpty()){
            throw new EmptyLibraryException("Library is empty.");
        }
        System.out.println("Library's books:");
        for(Book book : books){
            System.out.println(toString());
        }
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
