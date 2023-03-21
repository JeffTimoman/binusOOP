import java.util.Scanner;

public class D{

    public static void merge(double[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        double L[] = new double[n1];
        double R[] = new double[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] > R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(double[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double arr[] = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextDouble();
        }

        mergeSort(arr, 0, n - 1);
        double temp = arr[0];
        int rank = 1;
        for (int i = 0; i < n; i++){
            if (arr[i] != temp){
                rank = i + 1;
                temp = arr[i];
            }
            System.out.printf("%d %.2f\n", rank, arr[i]);
        }
        input.close();
    }
}