import java.util.ArrayList;

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

    public AppManager(){

    }
}
