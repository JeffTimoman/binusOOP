import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        String str = "";
        Scanner input = new Scanner(System.in);
        str = input.nextLine();
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                break;
            }
            i++;
            j--;
        }
        if (i >= j) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        input.close();
    }    
}
