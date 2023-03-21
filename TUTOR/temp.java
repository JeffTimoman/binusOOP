import java.util.Scanner;

public class temp {
    public static int fibbonaci(int x){
        if(x == 0){
            return 0;
        }else if(x==1){
            return 1;
        }else{
            return fibbonaci(x-1) + fibbonaci(x-2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int suku = 0;
        System.out.println("Masukan suku ke berapa : ");
        suku = input.nextInt();
        for(int i = 1 ; i <= suku; i++ ){
            System.out.println("%d", fibbonaci(i));
        }

    }
}