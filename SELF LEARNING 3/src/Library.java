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
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }

    public void printBooks(String genre) {
        List <Book> books = getBooks();
        books.sort((Book b1, Book b2) -> b1.getTitle().compareTo(b2.getTitle()));
        for (Book book : books) {
            if (book.getGenre().equals(genre)) {
                System.out.println(book.getTitle());
            }
        }
    }

    public void printDetail(String Title) {
        boolean found = false;
        List <Book> books = getBooks();
        for (Book book : books) {
            if (book.getTitle().equals(Title)) {
                System.out.println(book.getTitle() + " by " + book.getAuthor() + " (" + book.getPages() + " pages)" + " is " + (book.getIsAvailable() ? "available" : "not available"));
                found = true;
            }
        }
        if(!found)System.out.println("Book not found!");
    }
}
