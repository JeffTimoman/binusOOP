import java.util.Scanner;

public class E {

    public static int power(int x, int y){
        int sum = 1;
        for (int i = 0; i < y; i++){
            sum *= x;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = 0, y = 0;
        do{
            try{
                System.out.print("Enter value of x : ");
                x = input.nextInt();
                System.out.print("Enter value of y : ");
                y = input.nextInt();
                if (x < 0 || y < 0) System.out.println("X and Y should be greater than 0");
            }catch (Exception e){
                System.out.println("Invalid Input");
                input.nextLine();
            }
        }while(x < 0 || y < 0);
        System.out.printf("%d power to %d is %d", x, y, power(x, y));
        input.close();
    }
}
