package LibrarySystem;

import java.util.ArrayList;

public class Librarian {

    ArrayList<Librarian> theLibrarian = new ArrayList<>();

    public String userLibrarian = "adminMaster@binus.ac.id";
    public String passLibrarian = "adminbinus101";


   Book mybook = new Book();
   Student myStudent = new Student();

    public void showAllStudents() {
        // Printing student name and
        // corresponding registered number
        System.out.println("Student Name\t\tReg Number");
        for (int i = 0; i < myStudent.count; i++) {

            System.out.println(myStudent.theStudent.get(i).studentName
                    + "\t\t"
                    + myStudent.theStudent.get(i).regNum);
        }
    }


}
