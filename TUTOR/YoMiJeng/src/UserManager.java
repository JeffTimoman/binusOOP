import java.util.ArrayList;

public class UserManager {
    private ArrayList<Customer> customers = new ArrayList<Customer>();
    private ArrayList<Agent> agents = new ArrayList<Agent>();
    private int customerID = 1, agentID = 1;
    
    public UserManager(){

    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public void addAgent(Agent agent){
        agents.add(agent);
    }

    public void removeCustomer(Customer customer){
        customers.remove(customer);
    }

    public void removeAgent(Agent agent){
        agents.remove(agent);
    }

    public int getCustomerID() {
        return customerID;
    }

    public int getAgentID() {
        return agentID;
    }
}
