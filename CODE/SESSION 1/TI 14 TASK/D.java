import java.util.Scanner;


public class D {
    public static int main(int x, int y){
        int sum = 0;
        for (int i = x; i <= y; i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = 0, y = 0;
        do{
            try{
                System.out.print("Enter x: ");
                x = input.nextInt();
                System.out.print("Enter y: ");
                y = input.nextInt();
                if (x > y){
                    System.out.println("x must be less than y");
                }
            }
            catch(Exception e){
                System.out.println("Invalid input");
                input.nextLine();
            }
        }
        while(x > y);
        System.out.println("Sum: " + main(x, y));
        input.close();
    }    
}
