import java.util.Scanner;

import account.Deposito;
import account.Saving;
import user.Customer;
import user.CustomerMenu;

public class Main {
    private static CustomerMenu customerMenu = new CustomerMenu();
    
    private static void innit(){
        Customer customer = new Customer("customer", "customer", "Customer");
        customer.addAccount(new Saving(1000));
        customer.addAccount(new Deposito(10000, 12));
        AppManager.addCustomer(customer);
        
    }

    private static Customer validateCustomer(String username, String password){
        return AppManager.validateLogin(username, password);
    }

    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception{
        int menu;
        innit();
        do{
            System.out.println("Bank ABC System");
            System.out.println("1. Login");
            System.out.println("2. Add Days Passed");
            System.out.println("0. Exit");
            System.out.print(">> ");
            menu = input.nextInt(); input.nextLine();

            switch(menu){

                case 1: 
                    System.out.print("Enter username: ");
                    String username = input.nextLine();
                    System.out.print("Enter password: ");
                    String password = input.nextLine();
                    Customer customer = validateCustomer(username, password);
                    if (customer == null){
                        System.out.println("Invalid username or password");
                        break;
                    }
                    System.out.println("Login successful!");
                    customerMenu.setCustomer(customer);
                    customerMenu.run();
                    break;
                case 2: 
                    int days;
                    do{
                        System.out.print("Enter days passed [0-100]: ");
                        days = input.nextInt(); input.nextLine();
                    }while(days < 0 || days > 100);
                    AppManager.addDaysPassed(days);
                    break;
                case 0:
                    break;
            }
            System.out.print("Press enter to continue..."); input.nextLine();
        }while(menu != 0);
    }
}