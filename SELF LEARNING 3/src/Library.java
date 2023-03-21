import java.util.List;
import java.util.ArrayList;

public class Library {
    private List<Book> books = new ArrayList<Book>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
    
    public void printBooks() {
        List <Book> books = getBooks();
        books.sort((Book b1, Book b2) -> b1.getId() - b2.getId());
        System.out.printf("%-5s | %-30s | %-30s | %-20s | %-10s | %-10s |", "ID", "Title", "Author", "Genre", "Pages", "Available");
        System.out.println();
        for (Book book : books) {
            System.out.printf("%-5s | %-30s | %-30s | %-20s | %-10s | %-10s |", book.getId(), book.getTitle(), book.getAuthor(), book.getGenre(), book.getPages(), book.getIsAvailable());
            System.out.println();
        }

    }

    public void printBooksByGenre(String genre) {
        List <Book> books = getBooks();
        books.sort((Book b1, Book b2) -> b1.getId() - b2.getId());
        System.out.printf("%-5s | %-30s | %-30s | %-20s | %-10s | %-10s |", "ID", "Title", "Author", "Genre", "Pages", "Available");
        System.out.println();
        for (Book book : books) {
            if (((book.getGenre()).toLowerCase()).equals((genre).toLowerCase())) {
                System.out.printf("%-5s | %-30s | %-30s | %-20s | %-10s | %-10s |", book.getId(), book.getTitle(), book.getAuthor(), book.getGenre(), book.getPages(), book.getIsAvailable());
                System.out.println();
            }
        }
    }

    public void printAvailableBooks() {
        List <Book> books = getBooks();
        books.sort((Book b1, Book b2) -> b1.getId() - b2.getId());
        System.out.printf("%-5s | %-30s | %-30s | %-20s | %-10s | %-10s |", "ID", "Title", "Author", "Genre", "Pages", "Available");
        System.out.println();
        for (Book book : books) {
            if (book.getIsAvailable()) {
                System.out.printf("%-5s | %-30s | %-30s | %-20s | %-10s | %-10s |", book.getId(), book.getTitle(), book.getAuthor(), book.getGenre(), book.getPages(), book.getIsAvailable());
                System.out.println();
            }
        }
    }

    public void printBookDetail(Book book){
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Genre: " + book.getGenre());
        System.out.println("Pages: " + book.getPages());
        System.out.println("Available: " + book.getIsAvailable());
    }

    public Book getBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public Book getBook(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    public void borrowBook(Book book) {
        book.setIsAvailable(false);
    }

    public void printBorrowedBooks(){
        // Sort the book by id
        List <Book> books = getBooks();
        books.sort((Book b1, Book b2) -> b1.getId() - b2.getId());
        System.out.printf("%-5s | %-30s | %-30s | %-20s | %-10s | %-10s |", "ID", "Title", "Author", "Genre", "Pages", "Available");
        System.out.println();
        for (Book book : books) {
            if (!book.getIsAvailable()) {
                System.out.printf("%-5s | %-30s | %-30s | %-20s | %-10s | %-10s |", book.getId(), book.getTitle(), book.getAuthor(), book.getGenre(), book.getPages(), book.getIsAvailable());
                System.out.println();
            }
        }
    }
}
