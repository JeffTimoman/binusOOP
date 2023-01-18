
import java.util.Scanner;
import java.util.Arrays;
public class test2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        print(s);        
        String name = "Jefferson Timotius";
        String name2 = "Jefferson Timotius";

        if (name == name2) System.out.println("Equal");
        else System.out.println("Not Equal");

        System.out.println(name.substring(0, 9)); 
    }

    public static void print() {
        System.out.println("Hello World");
    }

    private static void print(String s) {
        System.out.println(s);
    }
}

// CONST : FINAL