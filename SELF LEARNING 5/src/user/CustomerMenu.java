package user;

import java.util.ArrayList;
import java.util.Scanner;

import account.Deposito;
import account.Saving;

public class CustomerMenu {
    private Customer customer;

    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    public void viewAccount(){
        System.out.println("View Account");
        ArrayList<Saving> savings = customer.getAllSavings();
        ArrayList<Deposito> depositos = customer.getAllDeposito();
        System.out.println("Savings: " + savings.size() + " accounts");
        int i = 1;
        for (Saving saving : savings){
            System.out.println("\t" + i + ". : " + saving);
        }
        i = 1;
        System.out.println("Depositos: " + depositos.size() + " accounts");
        for (Deposito deposito : depositos){
            System.out.println("\t" + i + ". : " + deposito);
        }
    }

    public void createNewAccount(){
        viewAccount();
        Scanner input = new Scanner(System.in);
        int pick;
        do{
            System.out.print("Pick account type : \t1. Saving \n\t2. Deposito\n");
            System.out.print(">> ");
            pick = input.nextInt(); input.nextLine();
        }while(pick != 1 && pick != 2);

        if (pick == 1){
            System.out.print("Enter initial balance: ");
            double balance;
            do{
                balance = input.nextDouble(); input.nextLine();
            }while(balance < 0);
            Saving saving = new Saving(balance);
            customer.addAccount(saving);
        }else if (pick == 2){
            System.out.print("Enter initial balance: ");
            double balance = input.nextDouble(); input.nextLine();
            System.out.print("Enter term (in months): ");
            int term = input.nextInt(); input.nextLine();
            Deposito deposito = new Deposito(balance, term);
            customer.addAccount(deposito);
        } 
        System.out.print("Pick account type : \t1. Saving \n\t2. Deposito");
        input.close();
    }

    public void printMenu(){
        System.out.println("Customer Menu!");
        System.out.println("1. View Account");
        System.out.println("2. Create New Account");
        System.out.println("3. Add Money to Account");
        System.out.println("4. Withdraw Money from Account");
        System.out.println("5. Deposito(Account) Simulation");
        System.out.println("0. Exit");
        System.out.print(">> ");
    }

    public void run(){
        int menu;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Welcome " + customer.getName() + "!"); 
            printMenu();
            menu = input.nextInt(); input.nextLine();
            switch(menu){
                case 1:
                    System.out.println("View Account");
                    viewAccount();
                    break;
                case 2:
                    System.out.println("Create New Account");
                    createNewAccount(); 
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    break;
            }
            System.out.print("Press enter to continue..."); input.nextLine();
        }while(menu != 0);
        input.close();
    }

    public CustomerMenu(){

    }   
}
