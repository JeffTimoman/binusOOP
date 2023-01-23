import java.util.Scanner;
// import java.util.List;

public class App {

    public static void addLibrarian(){
        System.out.printf("Enter librarian name: ");
        String name = input.nextLine();
        System.out.printf("Enter librarian username: ");
        String username = input.nextLine();

        userManager.validateUsername(username);

        System.out.printf("Enter librarian password: ");
        String password = input.nextLine();

        Librarian librarian = new Librarian(librarianID++, name, username, password);
        userManager.addLibrarian(librarian);
    }
    public static void removeUser(){
        userManager.printUsers();
        System.out.printf("Enter user id: ");
        int user_id = input.nextInt(); input.nextLine();
        User user = userManager.getUser(user_id);

        if (user == null){
            System.out.println("User doesn't exist");
            return;
        }

        if (checkOutManager.countCheckOutByUser(user_id) > 0){
            System.out.println("User has borrowed books!");
            return;
        }

        userManager.removeUser(user);
        System.out.println("User removed successfully");
    }
    public static void addUser(){
        System.out.printf("Enter user name: ");
        String name = input.nextLine();
        User user = new User(userID++, name);
        userManager.addUser(user);
    }
    public static void returnBook(){
        if (library.getBooks().size() == 0){
            System.out.println("No borrowed books");
            return;
        }

        library.printBorrowedBooks();
        System.out.printf("Enter book id: ");
        int book_id = input.nextInt(); input.nextLine();
        Book book = library.getBook(book_id);

        if (book == null){
            System.out.println("Book doesn't exist");
            return;
        }

        if (book.isIsAvailable()){
            System.out.println("Book is not borrowed!");
            return;
        }

        book.setIsAvailable(true);
        CheckOut checkOut = checkOutManager.getCheckOut(book_id);
        checkOutManager.removeCheckOut(checkOut);
    }
    public static void borrowBook(){
        library.printBooks();
        System.out.printf("Enter book id: [%d-%d]: ", library.getBooks().get(0).getId(), library.getBooks().get(library.getBooks().size() - 1).getId());
        int book_id = input.nextInt(); input.nextLine();
        Book book = library.getBook(book_id);
        
        if (book == null){
            System.out.println("Book doesn't exist");
            return;
        }

        if (!(book.isIsAvailable())){
            System.out.println("Book is not available");
            return;
        } 

        userManager.printUsers();
        System.out.printf("Enter user id : ");
        int user_id = input.nextInt(); input.nextLine();
        User user = userManager.getUser(user_id);

        if (user == null){
            System.out.println("User is not avaiable!");
            return;
        }

        if (checkOutManager.countCheckOutByUser(user_id) >= 3){
            System.out.println("User has reached the maximum number of books.");
            return;
        }

        // Checkout books
        book.setIsAvailable(false);
        CheckOut checkout = new CheckOut(book_id, user_id);
        checkOutManager.addCheckOut(checkout);
    }
    public static void removeBook(){
        library.printBooks();
        System.out.printf("Enter book id: [%d-%d]: ", library.getBooks().get(0).getId(), library.getBooks().get(library.getBooks().size() - 1).getId());
        int id = input.nextInt();
        input.nextLine();
        Book book = library.getBook(id);

        if (book == null){
            System.out.println("Book doesn't exist");
            return;
        }
        
        if (!(book.isIsAvailable())){
            System.out.println("Book is not available");
            return;
        }

        library.removeBook(book);
        System.out.println("Book removed successfully");
    }
    public static void addBook(){
        System.out.print("Enter book title: ");
        String title = input.nextLine();
        System.out.print("Enter book author: ");
        String author = input.nextLine();
        System.out.print("Enter book genre: ");
        String genre = input.nextLine();
        System.out.print("Enter book pages: ");
        int pages = input.nextInt();
        input.nextLine();
        Book book = new Book(bookID++, title, author, genre, pages);
        library.addBook(book);
    }
    public static boolean login(){
        System.out.print("Enter username: ");
        String username = input.nextLine();
        System.out.print("Enter password: ");
        String password = input.nextLine();
        return userManager.validateLogin(username, password);
    }
    public static void bookSearch(){
        System.out.print("Enter book title: ");
        String title = input.nextLine();
        Book book = library.getBook(title);
        if (book != null) {
            System.out.println("Book found!");
            library.printBookDetail(book);
        } else {
            System.out.println("Book not found!");
        }
    }
    public static void bookSearchGenre(){
        System.out.print("Enter book genre: ");
        String genre = input.nextLine();
        library.printBooksByGenre(genre);
    }
    public static void innitiate(){
        Book book1 = new Book(bookID++, "The Hobbit", "J.R.R. Tolkien", "Fantasy", 1937);
        Book book2 = new Book(bookID++, "The Lord of the Rings", "J.R.R. Tolkien", "Fantasy", 1954);
        Book book3 = new Book(bookID++, "The Silmarillion", "J.R.R. Tolkien", "Fantasy", 1977);

        // Add books to library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        //Add some users
        User user1 = new User(userID++, "John Doe");
        User user2 = new User(userID++, "Jane Doe");

        userManager.addUser(user1);
        userManager.addUser(user2);

        // Print users
        // userManager.printUsers();

        // Add some librarians
        Librarian librarian1 = new Librarian(librarianID++, "John Doe", "admin", "admin");

        userManager.addLibrarian(librarian1);

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
        System.out.println("5. Add book");
        System.out.println("6. Remove book");
        System.out.println("7. View borrowed books");
        System.out.println("8. Borrow book");
        System.out.println("9. Return book");
        System.out.println("10. Add User");
        System.out.println("11. View all users");
        System.out.println("12. Remove user");
        System.out.println("13. View all librarians");
        System.out.println("14. Add Librarian");
        System.out.println("0. Return");
        System.out.print(">> ");
    }
    
    private static Scanner input = new Scanner(System.in);
    private static int bookID = 1, userID = 1, librarianID = 1;
    private static int menu, pick;
    private static Library library = new Library();
    private static UserManager userManager = new UserManager();
    private static CheckOutManager checkOutManager = new CheckOutManager();
    public static void main(String[] args) throws Exception {
        innitiate();
        do{
            printPick();
            pick = input.nextInt(); input.nextLine();
            if (pick == 1){
                do{
                    printMenuUser();
                    menu = input.nextInt(); input.nextLine();
                    switch (menu) {
                        case 1:
                            System.out.println("Search book By Title");
                            bookSearch();
                            break;
                        case 2:
                            System.out.println("View all books!");
                            library.printBooks();
                            break;
                        case 3:
                            System.out.println("View avaiable books!");
                            library.printAvailableBooks();
                            break;
                        case 4:
                            System.out.println("View books by genre!");
                            bookSearchGenre();
                            break;
                        default:
                            break;
                    }
                    System.out.print("Press to continue . . .");
                    input.nextLine();
                }while(menu != 0);
            }else if(pick == 2){
                boolean isLogin = login();
                System.out.println("isLogin: " + isLogin);
                if (!isLogin) {
                    System.out.println("Login failed!");
                    continue;
                }
                do{
                    printMenuLibrarian();
                    menu = input.nextInt(); input.nextLine();
                    switch (menu) {
                        case 1:
                            System.out.println("Search book By Title");
                            bookSearch();
                            break;
                        case 2:
                            System.out.println("View all books!");
                            library.printBooks();
                            break;
                        case 3:
                            System.out.println("View avaiable books!");
                            library.printAvailableBooks();
                            break;
                        case 4:
                            System.out.println("View books by genre!");
                            bookSearchGenre();
                            break;
                        case 5 : 
                            System.out.println("Add book");
                            addBook();
                            break;
                        case 6:
                            System.out.println("Remove book");
                            removeBook();
                            break;
                        case 7:
                            System.out.println("View borrowed books");
                            library.printBorrowedBooks();
                            break;
                        case 8:
                            System.out.println("Borrow book");
                            borrowBook();
                            break;
                        case 9 : 
                            System.out.println("Return book");
                            returnBook();
                            break;

                        case 10: 
                            System.out.println("Add User");
                            addUser();
                            break;
                        
                        case 11:
                            System.out.println("View all users");
                            userManager.printUsers();
                            break;
                        
                        case 12: 
                            System.out.println("Remove user");
                            removeUser();
                            break;
                        case 13:
                                System.out.println("View all librarians");
                                userManager.printLibrarians();
                                break;
                        case 14: 
                            System.out.println("Add Librarian");
                            addLibrarian();
                            break;
                        default:
                            break;
                    }
                    System.out.print("Press to continue . . .");
                    input.nextLine();
                }while(menu != 0);
            }else{
                System.out.println("Invalid input!");
            }
        }while(pick != 0);
        System.out.print("Press to continue . . .");
        input.nextLine();
    }
}
