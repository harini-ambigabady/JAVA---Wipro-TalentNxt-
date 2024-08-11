import java.util.Map;
import java.util.TreeMap;
class Book {
    private int bookId;
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters and Setters
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to print book details
    public void displayBookDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}

class Library {
    private TreeMap<Integer, Book> bookCollection;

    // Constructor
    public Library() {
        bookCollection = new TreeMap<>();
    }

    // Method to add a book
    public boolean addBook(Book book) {
        if (bookCollection.containsKey(book.getBookId())) {
            return false; // Book ID already exists
        }
        bookCollection.put(book.getBookId(), book);
        return true;
    }

    // Method to remove a book by bookId
    public boolean removeBook(int bookId) {
        return bookCollection.remove(bookId) != null;
    }

    // Method to show the price of a book by bookId
    public String showBookPrice(int bookId) {
        Book book = bookCollection.get(bookId);
        if (book != null) {
            return "Price for book ID " + bookId + ": $" + book.getPrice();
        }
        return "Book not found.";
    }

    // Method to print all books
    public void printAllBooks() {
        for (Map.Entry<Integer, Book> entry : bookCollection.entrySet()) {
            entry.getValue().displayBookDetails();
        }
    }
}
public class MAp_book {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books
        Book book1 = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        Book book2 = new Book(2, "To Kill a Mockingbird", "Harper Lee", 7.99);
        library.addBook(book1);
        library.addBook(book2);

        // Printing all books
        System.out.println("All Books:");
        library.printAllBooks();

        // Showing book price
        System.out.println(library.showBookPrice(1));

        // Removing a book
        System.out.println("Removing Book with ID 1: " + library.removeBook(1));

        // Printing all books after removal
        System.out.println("All Books after removal:");
        library.printAllBooks();
    }
}
