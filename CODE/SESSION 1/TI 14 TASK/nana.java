import java.util.Scanner;

public class nana {
    public static void main(String[] args) {
        int x = 0;

        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Enter a number : ");
            x = input.nextInt();
            System.out.println("This Works!");
        }catch (Exception e){
            System.out.println("Invalid Input");
        }

        input.close();
        System.out.println(x);

        // String namString = "Hello";
    }   
}

// Task:
// Get a name from the user, the length should be at least 5 character.
// If the length is less than 5, ask the user to enter a name again.
// Input GPA from the user, the GPA should be between 0 and 4 + valid.
// If the GPA is not valid, ask the user to enter a GPA again.
//Ex : A, B, C, D, F is not valid.