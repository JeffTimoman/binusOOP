import java.util.Scanner;

public class A{
    private static void printing(int n){
        for(int i = 0; i < n; i++){
            System.out.printf("%d ", i+1);
        }
    }
    public static void main(String[] args){
        System.out.println("Nais");
        Scanner input = new Scanner(System.in);
        int n = 0;
        try {
            System.out.print("Enter a number to print : ");
            n = input.nextInt();
        } catch (Exception e) {
            System.out.println("You have entered a wrong input");
            input.nextInt();
        }
        printing(n);
        input.close();
    }
}