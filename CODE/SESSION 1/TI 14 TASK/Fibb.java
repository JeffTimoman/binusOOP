import java.util.Scanner;

public class Fibb{

    public static int fibb(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibb(n-1) + fibb(n-2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   
        int n = input.nextInt();
        System.out.println(fibb(n));
        input.close();
    }
}