import java.util.Scanner;

public class Welcome{
    public static void main(String[] args){
        System.out.println("Welcome to Java Programming");
        int a = 10;
        System.out.println("Value of a is: "+ a);
        double b = 22.0/7.0;
        System.out.printf("Value of b is: %.2f\n", b);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Name : " + name);

        switch(name){
            case "Jefferson":
                System.out.println("Welcome Jefferson!");
                break;
            default : 
                System.out.println("Welcome Guest!");
                break;
        }
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("loop " + (i + 1));
        }
        
    }
}