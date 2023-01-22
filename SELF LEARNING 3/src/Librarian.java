import java.util.ArrayList;

public class Librarian extends User{
    private String username;
    private String password;
    public Librarian(String username, String name, String password, ArrayList<User> users){
        super(name, users);
        this.password = password;
    }

    public void addBook(Library library, Book book){
        library.addBook(book);
    }

    public void removeBook(Library library, Book book){
        library.removeBook(book);
    }

    public String getPassword() {
        return this.password;
    }

    public boolean checkPassword(String password){
        return this.password.equals(password);
    }
}
