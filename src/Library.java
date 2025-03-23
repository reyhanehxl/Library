
import java.util.List;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        Book book = new Book();
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
        if (books.isEmpty()) {
            throw new EmptyLibraryException("Library is empty, nocbooks to borrow");
        }
        if (findBook(title) == null) {
            throw new BookNotFoundException("Book with title " + title + "not found.");
        }
        System.out.println("The book borrows succusfully!");
        toString();
    }

    public void returnBook(String title) throws BookNotFoundException {
        if (findBook(title) == null)
            throw new BookNotFoundException("Cannot return. Book with title" + title + "not found.");

    System.out.println("The book returned Succusfully!");

    toString();
    }
    public void listBooks() throws EmptyLibraryException{
        if(books.isEmpty()){
            throw new EmptyLibraryException("Library is empty.");
        }
        for(Book book : books){
            System.out.println(toString());
        }
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
