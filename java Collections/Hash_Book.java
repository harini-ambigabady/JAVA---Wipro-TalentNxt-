import java.util.Objects;
import java.util.TreeSet;

class Book implements Comparable<Book> {
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

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    // Implementing compareTo method to define natural ordering
    @Override
    public int compareTo(Book other) {
        return Integer.compare(this.bookId, other.bookId);
    }

    // Overriding equals and hashCode methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookId == book.bookId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId);
    }
}

class BookDB {
    private TreeSet<Book> bookSet;

    // Constructor
    public BookDB() {
        bookSet = new TreeSet<>();
    }

    // Method to add a book
    public boolean addBook(Book book) {
        return bookSet.add(book);
    }

    // Method to remove a book by bookId
    public boolean removeBook(int bookId) {
        return bookSet.removeIf(book -> book.getBookId() == bookId);
    }

    // Method to show the price of a book by bookId
    public String showBookPrice(int bookId) {
        for (Book book : bookSet) {
            if (book.getBookId() == bookId) {
                return "Price for book ID " + bookId + ": $" + book.getPrice();
            }
        }
        return "Book not found.";
    }

    // Method to print all books
    public void printAllBooks() {
        for (Book book : bookSet) {
            book.displayBookDetails();
        }
    }
}
public class Hash_Book {
    public static void main(String[] args) {
        BookDB bookDB = new BookDB();

        // Adding books
        Book book1 = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        Book book2 = new Book(2, "To Kill a Mockingbird", "Harper Lee", 7.99);
        bookDB.addBook(book1);
        bookDB.addBook(book2);

        // Printing all books
        System.out.println("All Books:");
        bookDB.printAllBooks();

        // Showing book price
        System.out.println(bookDB.showBookPrice(1));

        // Removing a book
        System.out.println("Removing Book with ID 1: " + bookDB.removeBook(1));

        // Printing all books after removal
        System.out.println("All Books after removal:");
        bookDB.printAllBooks();
    }
}
