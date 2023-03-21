import java.util.Scanner;

public class G {

    public static int dp[] = new int[100000];
    // Fibbonaci codes with DP
    public static int fibbonaci( int x){
        if(x == 0) return 0;
        if (x == 1) return 1;
        if (dp[x] != 0){
            return dp[x];
        }
        return fibbonaci(x - 1) + fibbonaci(x - 2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.printf("%d ", fibbonaci(i));
        }
        input.close();
    }
}
