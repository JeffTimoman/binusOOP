import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 0;
        do{
            try{
                System.out.println("a: ");
                a = input.nextInt();
                System.out.println("b: ");
                b = input.nextInt();
                if(a > b){
                    System.out.println("A harus lebih kecil dibandingkan B");
                }
            }catch(Exception e){
                System.out.println("Input invallid");
                input.nextLine();
            }
        }while(a > b);
        
        int sum = 0;
        for(int i = a ; i <= b; i++ ){
            sum = sum + i;
        }

        System.out.println("Hasil : "+sum);
        input.close();
    }
}