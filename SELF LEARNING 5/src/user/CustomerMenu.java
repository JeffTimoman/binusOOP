package user;

import java.util.ArrayList;
import java.util.Scanner;

import account.Deposito;
import account.Saving;

public class CustomerMenu {
    private Customer customer;
    private static Scanner input = new Scanner(System.in);

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
        int pick;
        do{
            System.out.print("Pick account type : \t1. Saving \n\t2. Deposito\n");
            System.out.print(">> ");
            pick = input.nextInt(); input.nextLine();
        }while(pick != 1 && pick != 2);

        if (pick == 1){
            System.out.print("Enter initial balance : ");
            double balance;
            do{
                balance = input.nextDouble(); input.nextLine();
            }while(balance < 0);
            Saving saving = new Saving(balance);
            customer.addAccount(saving);
        }else if (pick == 2){
            System.out.print("Enter initial balance : ");
            double balance;
            do{
                balance = input.nextDouble(); input.nextLine();
            }while(balance < 0);
            System.out.print("Enter term [3, 6, 12] : ");
            int term;
            do{
                term = input.nextInt(); input.nextLine();
            }while(term != 3 && term != 6 && term != 12);
            Deposito deposito = new Deposito(balance, term);
            customer.addAccount(deposito);
        } 
    }

    public void addMoneyToAccount(){
        ArrayList<Saving> savings = customer.getAllSavings();
        int i = 1;
        if (savings.size() == 0){
            System.out.println("No saving account found!");
            return;
        }
        System.out.println("Savings: " + savings.size() + " accounts");
        for (Saving saving : savings){
            System.out.println("\t" + i + ". : " + saving);
        }

        int pick;
        do{
            System.out.print("Pick account : ");
            pick = input.nextInt(); input.nextLine();
        }while(pick < 1 || pick > savings.size());

        Saving saving = savings.get(pick - 1);
        double amount;
        do{
            System.out.print("Enter amount : ");
            amount = input.nextDouble(); input.nextLine();
        }while(amount < 0);
        saving.addBalance(amount);
    }

    public void withDrawMoney(){
        ArrayList<Saving> savings = customer.getAllSavings();
        int i = 1;
        if (savings.size() == 0){
            System.out.println("No saving account found!");
            return;
        }
        System.out.println("Savings: " + savings.size() + " accounts");
        for(Saving saving : savings){
            System.out.println("\t"+ i + ". " + saving);
            i++;
        }

        int pick;
        do{
            System.out.print("Pick account : ");
            pick = input.nextInt(); input.nextLine();
        }while(pick < 1 || pick > savings.size());

        Saving saving = savings.get(pick - 1);
        double amount;
        do{
            System.out.print("Enter amount : ");
            amount = input.nextDouble(); input.nextLine();
        }while(amount < 0);

        saving.withDraw(amount);
    }
    
    public void depositoSimulation(){
        ArrayList<Deposito> depositos = customer.getAllDeposito();

        if (depositos.size() == 0){
            System.out.println("No deposito account found!");
            return;
        }
        int i = 1;
        System.out.println("Depositos: " + depositos.size() + " accounts");
        for(Deposito deposito : depositos){
            System.out.println("\t"+ i + ". " + deposito);
            i++;
        }

        int pick;
        do{
            System.out.print("Pick account : ");
            pick = input.nextInt(); input.nextLine();
        }while(pick < 1 || pick > depositos.size());

        Deposito deposito = depositos.get(pick - 1);
        double depositoBalance = deposito.getBalance();
        System.out.println("Month " + deposito.getMonthCount() + " : " + depositoBalance);
        for (i = deposito.getMonthCount(); i < deposito.getDepositMonths(); i++){
            depositoBalance += depositoBalance * deposito.getInterest()/12;
            System.out.printf("Month %d : %.2f\n", i + 1, depositoBalance);
        }
    }
    
    public void withDrawFromDeposito(){
        ArrayList<Deposito> depositos = customer.getAllDeposito();

        if (depositos.size() == 0){
            System.out.println("No deposito account found!");
            return;
        }
        int i = 1;
        System.out.println("Depositos: " + depositos.size() + " accounts");
        for(Deposito deposito : depositos){
            System.out.println("\t"+ i + ". " + deposito);
            i++;
        }

        int pick;
        do{
            System.out.print("Pick account : ");
            pick = input.nextInt(); input.nextLine();
        }while(pick < 1 || pick > depositos.size());

        Deposito deposito = depositos.get(pick - 1);
        deposito.withDraw();
        customer.removeAccount(deposito);
        System.out.println("Deposito account removed!");
    }

    public void printMenu(){
        System.out.println("Customer Menu!");
        System.out.println("1. View Account");
        System.out.println("2. Create New Account");
        System.out.println("3. Add Money to Account");
        System.out.println("4. View Account History");
        System.out.println("5. Withdraw Money from Account");
        System.out.println("6. Deposito(Account) Simulation");
        System.out.println("7. Withdraw Money from Deposito");
        System.out.println("0. Exit");
        System.out.print(">> ");
    }

    public void viewAccountHistory(){
        ArrayList <Saving> savings = customer.getAllSavings();
        ArrayList <Deposito> depositos = customer.getAllDeposito();
        System.out.println("Account History");
        System.out.println("Savings: " + savings.size() + " accounts");
        int i = 1;
        for (Saving saving : savings){
            System.out.println("\t" + i + ". " + saving);
            ArrayList<Double> debits = saving.getDebits();
            ArrayList<Double> credits = saving.getCredits();
            System.out.println("\t\tDebits: " + debits.size() + " transactions");
            for (int j = 0; j < debits.size(); j++){
                System.out.println("\t\t\t" + (j + 1) + ". " + debits.get(j));
            }

            System.out.println("\t\tCredits: " + credits.size() + " transactions");
            for (int j = 0; j < credits.size(); j++){
                System.out.println("\t\t\t" + (j + 1) + ". " + credits.get(j));
            }
            i++;
        }
    }

    public void run(){
        int menu;
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
                    System.out.println("Add Money to Account");
                    addMoneyToAccount();
                    break;
                case 4:
                    System.out.println("View Account History");
                    viewAccountHistory();
                    break;
                case 5:
                    System.out.println("Withdraw Money from Account");
                    withDrawMoney();
                    break;
                case 6:
                    System.out.println("Deposito Simulation");
                    depositoSimulation();
                    break;
                case 7 : 
                    System.out.println("Withdraw Money from Deposito");
                    withDrawFromDeposito();
                    break;
                case 0:
                    break;
            }
            if(menu != 0){
                System.out.print("Press enter to continue..."); input.nextLine();
            }
        }while(menu != 0);
    }

    public CustomerMenu(){

    }   
}
