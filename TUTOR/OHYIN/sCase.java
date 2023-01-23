import java.util.Scanner;


class Nendoroid{
    // Attributes
    // Constructor
    // Methods
}

public class sCase {
    private static int menu;
    private static Scanner input = new Scanner(System.in);

    public static void addNendoroid(){

    }

    public static void sellNendoroid(){

    }

    public static void viewNendoroid(){

    }

    public static void printMenu() {
        System.out.println("1. Add Nendoroid");
        System.out.println("2. Sell Nendoroid");
        System.out.println("3. View Nendoroid");
        System.out.println("4. Exit");
        System.out.print(">> ");
    }

    public static void main(String[] args) {

        do {
            printMenu();
            menu = input.nextInt(); input.nextLine();
            switch (menu) {
                case 1:
                    System.out.println("Add Nendoroid");
                    addNendoroid();
                    break;
                case 2:
                    System.out.println("Sell Nendoroid");
                    sellNendoroid();
                    break;
                case 3:
                    System.out.println("View Nendoroid");
                    viewNendoroid();
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
            System.out.print("Press to continue...."); input.nextLine();
        } while (menu != 4);
        
        input.close();
    }
}