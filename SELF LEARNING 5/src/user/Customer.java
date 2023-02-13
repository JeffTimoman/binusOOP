package user;

import java.util.ArrayList;

import account.Account;
import account.Deposito;
import account.Saving;

public class Customer extends User{


    private ArrayList<Account> accounts = new ArrayList<Account>();
    
    public Customer(String username, String password, String name) {
        super(username, password, name);
        
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public void removeAccount(Account account){
        accounts.remove(account);
    }
    
    public ArrayList<Saving> getAllSavings(){
        ArrayList<Saving> temp = new ArrayList<Saving>();
        for (Account account : accounts){
            if(account instanceof Saving){
                temp.add((Saving) account);
            }
        }
        return temp;
    }

    public ArrayList<Deposito> getAllDeposito(){
        ArrayList<Deposito> temp = new ArrayList<Deposito>();
        for (Account account : accounts){
            if(account instanceof Deposito){
                temp.add((Deposito) account);
            }
        }
        return temp;
    }

    public ArrayList<Account> getAllAcounts(){
        return accounts;
    }
}
