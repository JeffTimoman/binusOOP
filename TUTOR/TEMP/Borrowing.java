package LibrarySystem;

import java.util.Scanner;

public class Borrowing {

    Student myStudent = new Student();
    Book myBook = new Book();

    Scanner input = new Scanner(System.in);

    public static int count = 0;

    public int isStudent() {
        System.out.println("Enter reg Number\n");

        String regNum = input.nextLine();

        for (int i = 0; i < count; i++) {
            if (myStudent.theStudent.get(i).regNum.equalsIgnoreCase(regNum)) {
                return i;
            }
        }
        System.out.println("Student is No Registered\n");
        System.out.println("Get Registered First\n");
        return -1;
    }

    public void checkOutBook(ListBook listBook){
        int studentIndex = this.isStudent();

        if (studentIndex != -1){
            System.out.println("checking out");

            listBook.showBook();
            Book b = listBook.checkOutBook();

            System.out.println("checking out");
            if (b != null){
                if (myBook.theBook.get(studentIndex).bookCount
                        <= 3) {

                }
                    System.out.println("adding book");
                    myStudent.theStudent.get(studentIndex).borrowedBooks[myBook.theBook.get(studentIndex).bookCount]
                            = b;
                    myBook.theBook.get(studentIndex).bookCount++;
            }
        }
    }

    public void checkInBook(ListBook listBook){
        int studentIndex = this.isStudent();

        if (studentIndex != -1){
            System.out.println("Serial Number\t\t\tBook Name\t\t\tAuthor Name");

            Student s = myStudent.theStudent.get(studentIndex);

            for (int i = 0; i < myBook.bookCount; i++) {

                System.out.println(s.borrowedBooks[i].bookCode + "\t\t\t"
                                    + s.borrowedBooks[i].bookTitle + "\t\t\t"
                                    + s.borrowedBooks[i].bookAuthor);

            }
            System.out.println("Enter Serial Number of Book to be Checked In:");

            String sNo = input.nextLine();

            for (int i = 0; i < myBook.bookCount; i++) {
                if (sNo.equals(s.borrowedBooks[i].bookCode)){
                    listBook.checkInBook(s.borrowedBooks[i]);
                    s.borrowedBooks[i] = null;

                    return;
                }

            }

            System.out.println("Book of Serial No" + sNo + "not Found");
        }
    }
}
