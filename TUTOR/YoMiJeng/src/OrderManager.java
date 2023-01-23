import java.util.ArrayList;
public class OrderManager {
    private ArrayList<Order> orders = new ArrayList<Order>();

    public OrderManager(){
        
    }

    public void addOrder(Order order){
        orders.add(order);
    }

    public void removeOrder(Order order){
        orders.remove(order);
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }
}
