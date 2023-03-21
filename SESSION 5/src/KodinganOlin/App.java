package KodinganOlin;

import java.util.Scanner;

class Nendoroid{
    private String name;
    private int price;
    private int sold = 0;
    private int stock;
    private String id = generateID();

    private String generateID(){
        String result = "";
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // Masukin cahracter 1 dan character 2;
        result += chars.charAt((int)(Math.random() * chars.length()));
        result += chars.charAt((int)(Math.random() * chars.length()));

        result += Integer.toString((int)(Math.random() * 9));
        result += Integer.toString((int)(Math.random() * 9));
        result += Integer.toString((int)(Math.random() * 9));

        return result;
    }
}

public class App {
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
