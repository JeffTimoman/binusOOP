import java.util.Scanner;

class Answer3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, r;
        n = input.nextInt();
        r = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        r %= n;
        for (int i = 0; i < r; i++){
            int temp = arr[n - 1];
            for (int j = 0; j < n - 1; j++){
                arr[n - 1 - j] = arr[n - 2 - j];
            }
            arr[0] = temp;
        }

        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        input.close();
    }
}