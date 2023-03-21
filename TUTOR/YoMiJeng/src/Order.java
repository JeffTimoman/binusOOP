public class Order {
    private String from;
    private String to;
    private String travelMethod;
    private int agentID;
    private int customerID;

    public Order(String from, String to, String travelMethod, int agentID, int customerID) {
        this.from = from;
        this.to = to;
        this.travelMethod = travelMethod;
        this.agentID = agentID;
        this.customerID = customerID;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getTravelMethod() {
        return travelMethod;
    }

    public void setTravelMethod(String travelMethod) {
        this.travelMethod = travelMethod;
    }

    public int getAgentID() {
        return agentID;
    }

    public void setAgentID(int agentID) {
        this.agentID = agentID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    
}
