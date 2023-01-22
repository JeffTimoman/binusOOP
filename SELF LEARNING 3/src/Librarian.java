import java.util.ArrayList;

public class Librarian extends User{
    public Librarian(String name, String password, ArrayList<User> users){
        super(name, password, users);
    }

    public void addBook(Library library, Book book){
        library.addBook(book);
    }

    public void removeBook(Library library, Book book){
        library.removeBook(book);
    }
}
