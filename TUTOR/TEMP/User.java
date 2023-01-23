package LibrarySystem;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    Scanner input = new Scanner(System.in);
    Librarian theLibrarian = new Librarian();
    Student theStudent = new Student();
    String username,password;
    int checkLibrarian, checkStudent;

    ArrayList<User> theUser = new ArrayList<>();
public void login(){
    do {
        System.out.println("Enter the username: ");
        this.username = input.nextLine();
        System.out.println("Enter the password: ");
        this.password = input.nextLine();

        if (username.equals(theLibrarian.userLibrarian) && password.equals(theLibrarian.passLibrarian)) {
            System.out.println("Authentication Success");
            checkLibrarian = 1;
            pressEnterKeyToContinue();
            break;
        } else if (username.equals(theStudent.userStudent) && password.equals(theStudent.passStudent)) {
            System.out.println("Authentication Success");
            checkStudent = 1;
            pressEnterKeyToContinue();
            break;
        } else {
            System.out.println("Authentication Failed");
            System.out.println("Please input the correct username and Password!");
        }
    } while(checkLibrarian != 1 || checkStudent != 1);
}
    public void pressEnterKeyToContinue()
    {
        System.out.println("Press Enter key to continue...");
        Scanner s = new Scanner(System.in);
        s.nextLine();
    }





}
