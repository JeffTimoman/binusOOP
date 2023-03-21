package LibrarySystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(
                "############### Welcome to Binusian Library! ###############"
        );
        System.out.println(
                "                  Select from the Option :                "
        );
        System.out.println(
                "##########################################################"
        );

        int choice1, choice2;
        User callUser = new User();
        Student callStudent = new Student();
        Book callBook = new Book();
        Borrowing callBorrowing = new Borrowing();
        Extension callExtension = new Extension();
        Librarian callLibrarian = new Librarian();
        ListBook callListBook = new ListBook();


        callUser.login();

        if (callUser.checkStudent == 1) {

            do {
                System.out.println("Please choose the menu below :");
                System.out.println("Press 1 to Register");
                System.out.println("Press 2 to Check In Book");
                System.out.println("Press 3 to Check Out Book");
                System.out.println("Press 4 to View Book");
                System.out.println("Press 5 to Search Book");
                choice1 = input.nextInt();

                switch (choice1) {
                    //Case
                    case 1:
                        callStudent.studentRegister();
                        break;

                    case 2:
                        callBorrowing.checkInBook(callListBook);
                        break;

                    case 3:
                        callBorrowing.checkOutBook(callListBook);
                        break;

                    case 4:
                        callListBook.showBook();
                        break;

                    case 5:
                        System.out.println("Choose menu below: ");
                        System.out.println("1. Search book by Serial Book Code ");
                        System.out.println("2. Search book by Book Title1 ");

                        int choice3 = input.nextInt();
                        switch (choice3) {
                            case 1:
                                callStudent.searchByNo();
                                break;
                            case 2:
                                callStudent.searchByTitle();
                                break;
                        }
                        break;
                }
            } while (choice1 != 6);
            }

        else if (callUser.checkLibrarian == 1) {
            do{
                System.out.println("Please choose the menu below :");
                System.out.println("Press 1 to Add Book");
                System.out.println("Press 2 to Update Quantity Book");
                System.out.println("Press 3 to Delete Book");
                System.out.println("Press 4 to Show All Registered Student");
                choice2 = input.nextInt();

                switch (choice2){

                    //Case
                    case 1:
                        callBook.addBookNew(callBook.bookCode, callBook.bookTitle, callBook.bookAuthor, callBook.bookQty, callBook.bookQtyCopy);
                        break;
                    case 2:
                        callBook.updateBookQty();
                        break;
                    case 3:
                        callBook.deleteBook();
                        break;
                    case 4:
                        callLibrarian.showAllStudents();
                        break;
                }
            }while (choice2 != 5);
        }
    else {


        }
    }
}
