import java.util.ArrayList;
import java.util.Scanner;
// import java.util.List;

public class App {
    public static void innitiate(){
        Book book1 = new Book(bookID++, "The Hobbit", "J.R.R. Tolkien", "Fantasy", 1937);
        Book book2 = new Book(bookID++, "The Lord of the Rings", "J.R.R. Tolkien", "Fantasy", 1954);
        Book book3 = new Book(bookID++, "The Silmarillion", "J.R.R. Tolkien", "Fantasy", 1977);

        // Add books to library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Create some users
        User user1 = new User("User1", users);
        User user2 = new User("User2", users);

        // Add users to users list
        users.add(user1);
        users.add(user2);

        // Create some librarians
        Librarian librarian1 = new Librarian("admin", "Librarian1", "admin", librarians);

        // library.printDetail("The Hobbit");
    }

    private static void printPick(){
        System.out.println("Welcome to the library system!");
        System.out.println("1. User");
        System.out.println("2. Librarian [Login required]");
        System.out.println("0. Exit");
        System.out.print(">> ");
    }

    private static void printMenuUser(){
        System.out.println("1. Search book");
        System.out.println("2. View all books");
        System.out.println("3. View avaiable books");
        System.out.println("4. View books by genre");
        System.out.println("5. View book detail");
        System.out.println("0. Return");
        System.out.print(">> ");
    }

    private static void printMenuLibrarian(){
        System.out.println("1. Search book");
        System.out.println("2. View all books");
        System.out.println("3. View avaiable books");
        System.out.println("4. View books by genre");
        System.out.println("5. View book detail");
        System.out.println("6. Add book");
        System.out.println("7. Remove book");
        System.out.println("8. Borrow book");
        System.out.println("9. Return book");
        System.out.println("10. View borrowed books");
        System.out.println("11. View borrowed books by user");
        System.out.println("12. View borrowed books by genre");
        System.out.println("13. Add User");
        System.out.println("14. View all users");
        System.out.println("15. Remove user");
        System.out.println("16. Add Librarian");
        System.out.println("17. View all librarians");
        System.out.println("0. Return");
        System.out.print(">> ");
    }

    private static Scanner input = new Scanner(System.in);
    private static int bookID = 1;
    private static ArrayList<User> users = new ArrayList<User>();
    private static ArrayList<User> librarians = new ArrayList<User>();
    private static int menu, pick;
    private static Library library = new Library();
    public static void main(String[] args) throws Exception {
        innitiate();
        // Switch case pick between user and librarian

        // User
        // 1. Search book
        // 2. View all books
        // 3. View avaiable books
        // 4. View books by genre
        // 5. View book detail

        // Librarian
        // The same as user
        // 6. Add book
        // 7. Remove book
        // 8. Borrow book
        // 9. Return book
        // 10. View borrowed books
        // 11. View borrowed books by user
        // 12. View borrowed books by genre
        // 13. Add User
        // 14. View all users
        // 15. Remove user
        // 16. Add Librarian
        // 17. View all librarians


        do{
            printPick();
            pick = input.nextInt(); input.nextLine();
            switch(pick){
                
                case 1:
                    printMenuUser();
                    menu = input.nextInt(); input.nextLine();
                    do{
                        switch(menu){
                            
                        }
                    }while(menu != 0);

                    break;
                case 2:
                    printMenuLibrarian();
                    menu = input.nextInt(); input.nextLine();
                    do{
                        switch(menu){
                            
                        }
                    }while(menu != 0);

                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                
                default:
                    System.out.println("Invalid input!");
                    break;
            }
            System.out.println("Press enter to continue...");
            input.nextLine();
        }while(pick != 0);
    }
}
