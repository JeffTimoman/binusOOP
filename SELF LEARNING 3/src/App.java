import java.util.ArrayList;
import java.util.Scanner;
// import java.util.List;

public class App {
    private static Scanner input = new Scanner(System.in);
    private static int bookID = 1;
    private static ArrayList<User> users = new ArrayList<User>();

    private static Library library = new Library();
    public static void innitiate(){
        Book book1 = new Book(bookID++, "The Hobbit", "J.R.R. Tolkien", "Fantasy", 1937);
        Book book2 = new Book(bookID++, "The Lord of the Rings", "J.R.R. Tolkien", "Fantasy", 1954);
        Book book3 = new Book(bookID++, "The Silmarillion", "J.R.R. Tolkien", "Fantasy", 1977);

        // Add books to library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Create some users
        User user1 = new User("User1", "password", users);
        User user2 = new User("User2", "password", users);

        // Add users to users list
        users.add(user1);
        users.add(user2);

        library.printDetail("The Hobbit");
        input.close();
    }
    public static void main(String[] args) throws Exception {
        innitiate();
    }
}
