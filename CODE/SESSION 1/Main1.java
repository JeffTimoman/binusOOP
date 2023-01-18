import java.util.Scanner;
// import java.util.*;

public class Main1{

    public static double countArea(double radius){
        return radius * 3.14 * 3.14;
    }
    public static void main(String[] args){
        System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input radius : ");
        double radius = scanner.nextDouble();
        double result = countArea(radius);
        System.out.printf("%f", result);
        scanner.close();
    }


    
}