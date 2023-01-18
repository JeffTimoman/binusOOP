import java.util.Scanner;

public class H {
    // Function to count HCF
    public static int gdb(int x, int y){
        if (y == 0){
            return x;
        }else{
            return gdb(y, x % y);
        }
    }
    public static void main(String[] args) {
        int x = 0, y = 0;
        boolean flag = false;
        Scanner input = new Scanner(System.in);
        do{
            try{
                System.out.print("Enter X : ");
                x = input.nextInt();
                System.out.print("Enter Y : ");
                y = input.nextInt();
                flag = true;
            }catch(Exception E){
                System.out.println("Input is invalid!");
                input.nextLine();
            }
        }while(!flag);

        if (y < x){
            int temp = x;
            x = y;
            y = temp;
        }
        
        int result = (x * y)/gdb(x, y);
        
        System.out.printf("%d", result);
        input.close();
    }
}
