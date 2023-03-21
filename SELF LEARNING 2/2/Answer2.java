import java.util.Scanner;

class Answer2{

    public static void validations(int a, int b) {
        if (b == 0){
            throw new ArithmeticException("B should not be zero");
        }
        
        if (a < b){
            throw new ArithmeticException("A should be bigger than B");
        }
    }

    public static int check_test(int a, int b){
        return a / b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0, b = 0;
        do{
            try {
                System.out.print("Enter a: ");
                a = input.nextInt();
                System.out.print("Enter b: ");
                b = input.nextInt();
                validations(a, b);
                break;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }while(true);
        

        System.out.println("The answer is :" + check_test(a, b));
        input.close();
    }
}