package LibrarySystem;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Book {
    public String bookTitle;
    public String bookCode;
    public String bookAuthor;
    public int bookQty;

    public int bookQtyCopy;

    public int bookCount;
    Scanner input = new Scanner(System.in);

    ArrayList<Book> theBook = new ArrayList<>();

//    public Book(String bookCode){
//      this.bookCode = bookCode;
//    }
//
//    public Book(String bookTitle){
//        this.bookTitle = bookTitle;
//    }
//
//    public Book(String bookAuthor){
//        this.bookAuthor = bookAuthor;
//    }
//
//    public Book(int bookQty){
//        this.bookQty = bookQty;
//    }
//
//    public Book(int bookQtyCopy){
//        this.bookQtyCopy = bookQtyCopy;
//    }

    public void addBookNew(String newbookCode, String newbookTitle, String newbookAuthor, int newbookQty, int newbookQtyCopy) {
        do{
            System.out.println("Enter the Book Code [u must input 6 digit]:");
            newbookCode = input.next();
            input.nextLine();
        }while(newbookCode.length() != 6);

        do{
            System.out.println("Enter the Book Name:");
            newbookTitle = input.nextLine();
        }while(newbookTitle.isBlank());

        do {
            System.out.println("Enter the Book Author:");
            newbookAuthor = input.nextLine();
        }while(newbookAuthor.isBlank());

        do {
            System.out.println("Enter the Book Quantity:");
            newbookQty = input.nextInt();
            newbookQtyCopy = this.bookQty;
        }while(newbookQty == 0);

        this.bookCode = newbookCode;
        this.bookTitle = newbookTitle;
        this.bookAuthor = newbookAuthor;
        this.bookQty = newbookQty;
        this.bookQtyCopy = newbookQtyCopy;
//        theBook.add(bookCode, bookTitle, bookAuthor, bookQty ,bookQtyCopy);

    }

    public int compareBookObjects(Book b1, Book b2) {

        // If book name matches
        if (b1.bookTitle.equalsIgnoreCase(b2.bookTitle)) {

            // Printing book exists
            System.out.println(
                    "Book of this Name Already Exists.");
            return 0;
        }

        // if book serial matches
        if (b1.bookCode == b2.bookCode) {

            // Print book exists
            System.out.println(
                    "Book of this Serial No Already Exists.");

            return 0;
        }
        return 1;
    }

    public void checkBook(Book b) {

        for (int i = 0; i < bookCount; i++) {

            if (this.compareBookObjects(b, this.theBook.get(i)) == 0)
                return;
        }

        if (bookCount < 100) {

//            theBook.get(count) = b;
            bookCount++;
        }
        else {

            System.out.println(
                    "No Space to Add More Books.");
        }
    }

    public void updateBookQty() {

        System.out.println(
                "\t\t\t\tUPGRADE QUANTITY OF A BOOK\n");
        System.out.println("Enter Serial No of Book");

        String sNo = input.nextLine();

        for (int i = 0; i < bookCount; i++) {

            if (sNo.equals(theBook.get(i).bookCode)) {

                // Display message
                System.out.println(
                        "Enter No of Books to be Added:");

                int addingQty = input.nextInt();
                theBook.get(i).bookQty += addingQty;
                theBook.get(i).bookQtyCopy += addingQty;

                System.out.println("Book successfully added");
                return;
            }
            else {
                System.out.println("Please input the right serial code book!");
                return;
            }
        }
    }

    public void deleteBook(){
        System.out.println("Enter Serial No of Book");

        String sNo = input.nextLine();

        for (int i = 0; i < bookCount; i++) {

            if (sNo != theBook.get(i).bookCode){
                throw new IndexOutOfBoundsException("You input wrong serial number book!");
            } else {
                System.out.println("You're going to delete:");
                System.out.println(String.format("%s %s", sNo, theBook.get(bookCount).bookCode));
                System.out.println("Are you sure?");
                System.out.print("Answer (yes/no): ");
                String answer = input.nextLine();

                if(answer.equalsIgnoreCase("yes")) {
                    theBook.remove(theBook);

                    System.out.println("The book finished delete!");
                    pressEnterKeyToContinue();
                }
            }

//            if (sNo.equals(theBook.get(i).bookCode)){
//            }
        }
    }

    public void addBookNew() {
    }

    public void pressEnterKeyToContinue()
    {
        System.out.println("Press Enter key to continue...");
        Scanner s = new Scanner(System.in);
        s.nextLine();
    }
}
