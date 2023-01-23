package LibrarySystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    String studentName;
    String regNum;

    ArrayList<Student> theStudent = new ArrayList<>();
    Book myBook = new Book();
    Book borrowedBooks[] = new Book[3];
    public int count;

    public String userStudent = "userMaster@binus.ac.id";
    public String passStudent = "studentbinus123";

    Scanner input = new Scanner(System.in);

    public void studentRegister() {
        do {
            // Print statement
            System.out.println("Enter Student Name:");
            // This keywords refers to current instance
            this.studentName = input.nextLine();
        }while(studentName.isEmpty());

        do{
            // Print statement
            System.out.println("Enter Registration Number [u must input 6 digit]:");
            this.regNum = input.nextLine();
        }while(regNum.length() != 6);

        System.out.println("Student successfully registered!");
        pressEnterKeyToContinue();
    }

    public void searchByNo() {

        //menampilkaan pesan
        System.out.println("\t\t\t\t SEARCH BY SERIAL BOOK NUMBER\n");

        String sNo;
        System.out.println("Enter Serial Number of Book\n");
        sNo = input.nextLine();

        int flag = 0;
        System.out.println("No Serial\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");
        for (int i = 0; i < count; i++) {
            if (sNo.equals(myBook.theBook.get(i).bookCode)) {
                System.out.println(myBook.theBook.get(i).bookCode
                        + "\t\t" + myBook.theBook.get(i).bookTitle
                        + "\t\t" + myBook.theBook.get(i).bookAuthor
                        + "\t\t" + myBook.theBook.get(i).bookQtyCopy
                        + "\t\t" + myBook.theBook.get(i).bookQty);
                flag++;
                return;
            }
        }
        if (flag == 0)
            System.out.println("No Book for Serial No" + sNo + "Found.");

        pressEnterKeyToContinue();
    }

    public void searchByTitle() {

        System.out.println("\t\t\t\t SEARCH BY TITLE BOOK\n");

//        input.nextLine();

        System.out.println("Enter the Title Book\n");
        String bookTittle = input.nextLine();

        int flag = 0;

        System.out.println("No Serial\t\tName\t\tAuthor\t\tAvailable Qtyt\t\tQty");

        for (int i = 0; i < count; i++) {
            if (bookTittle.equals(myBook.theBook.get(i).bookTitle)) {
                System.out.println(myBook.theBook.get(i).bookCode
                        + "\t\t" + myBook.theBook.get(i).bookTitle
                        + "\t\t" + myBook.theBook.get(i).bookAuthor
                        + "\t\t" + myBook.theBook.get(i).bookQtyCopy
                        + "\t\t" + myBook.theBook.get(i).bookQty);

                flag++;
            }
        }

        if (flag == 0)
            System.out.println("No Books " + bookTittle + "Found");

        pressEnterKeyToContinue();
    }

    public void pressEnterKeyToContinue()
    {
        System.out.println("Press Enter key to continue...");
        Scanner s = new Scanner(System.in);
        s.nextLine();
    }
}