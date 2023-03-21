public class Customer extends User {
    // Bronze, Silver, Gold
    private String membership = "Bronze";

    public Customer(String name, int id) {
        super(name, id);
    }

    public Customer() {

    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    
}
