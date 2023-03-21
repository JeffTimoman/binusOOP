import java.util.ArrayList;

import account.Account;
import account.Deposito;
import account.Saving;
import user.Customer;

public class AppManager {
    private static ArrayList <Customer> customers = new ArrayList<Customer>();

    public static void addCustomer(Customer customer){
        customers.add(customer);
    }

    public static Customer validateLogin(String username, String password){
        for (Customer customer : customers) {
            if(customer.validateLogin(username, password)){
                return customer;
            }
        }
        return null;
    }

    public static void addDaysPassed(int days){
        for (Customer customer : customers) {
            for (Account account : customer.getAllAcounts()) {
                if (account instanceof Saving){
                    ((Saving) account).addDaysPassed(days);
                }

                if (account instanceof Deposito){
                    ((Deposito) account).addDaysPassed(days);
                }
            }
        }
    }

    public AppManager(){

    }
}
