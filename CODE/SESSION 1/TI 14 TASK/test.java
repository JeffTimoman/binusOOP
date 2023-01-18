import java.util.Scanner;

public class test{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 0;
        do{
            try{
                System.out.print("a: ");
                a = input.nextInt();
                System.out.print("b: ");
                b = input.nextInt();
                if(a>b){
                    System.out.println("A harus lebih kecil dibanding B");
                }
            }catch(Exception e){
                System.out.println("Invalid input");
                input.nextLine();
            }
        }while(a>b);

        int sum = 1;
        for(int i = 0 ; i <= b; i++){
            sum = sum * a;
        }

        System.out.println("Hasil power = "+sum);
    }
}