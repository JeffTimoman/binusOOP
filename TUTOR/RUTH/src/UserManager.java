import java.util.ArrayList;

public class UserManager {
    private ArrayList <User> users = new ArrayList<User>();

    public void addUser(User user){
        users.add(user);
    }

    public void removeUser(User user){
        users.remove(user);
    }

    public User getUser(String username){
        for (User user : users) {
            if (user.getName().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public ArrayList<User> getUsers(){
        return users;
    }

    public void printAllLibrarian(){
        for (User user : users) {
            if (user.getUser_type() == 1) {
                System.out.println(user.getName());
            }
        }
    }

    public void printAllStudent(){
        for (User user : users) {
            if (user.getUser_type() == 2) {
                System.out.println(user.getName());
            }
        }
    }
}
