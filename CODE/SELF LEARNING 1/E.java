import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        int n = 5;
        int arr[][] = new int[n][n];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = input.nextInt();
            }
        }

        int T = input.nextInt();

        for (int t = 0; t < T; t++){
            int rowOrCol = input.nextInt();
            int index = input.nextInt();
            int add = input.nextInt();
            if (rowOrCol == 0){
                for (int i = 0; i < n; i++){
                    arr[index][i] += add;
                }
            }
            else{
                for (int i = 0; i < n; i++){
                    arr[i][index] += add;
                }
            }
        }

        int max = arr[0][0];
        int min = arr[0][0];
        int sum = 0;
        
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (arr[i][j] > max) max = arr[i][j];
                if (arr[i][j] < min) min = arr[i][j];
                sum += arr[i][j];
            }
        }
        System.out.print(sum + " " + min + " " + max);

        input.close();
    }
}
