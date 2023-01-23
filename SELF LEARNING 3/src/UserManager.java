import java.util.ArrayList;

public class UserManager {

    private static ArrayList<User> users = new ArrayList<User>();
    private static ArrayList<Librarian> librarians = new ArrayList<Librarian>();

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user){
        users.remove(user);
    }

    public void addLibrarian(Librarian librarian) {
        librarians.add(librarian);
    }

    public void printUsers() {
        users.sort((User u1, User u2) -> u1.getID() - u2.getID());
        System.out.printf("%-5s | %-30s\n", "ID", "Name");
        for (User user : users) {
            System.out.printf("%-5d | %-30s\n", user.getID(), user.getName());
        }
    }
    public boolean validateUsername(String username){
        for (Librarian librarian : librarians) {
            if (librarian.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }
    public void printLibrarians() {
        System.out.printf("%-5s | %-30s | %-20s\n", "ID", "Name", "Username");
        for (Librarian librarian : librarians) {
            System.out.printf("%-5d | %-30s | %-20s\n", librarian.getID(), librarian.getName(), librarian.getUsername());
        }
    }

    public User getUser(int ID) {
        users.sort((User u1, User u2) -> u1.getID() - u2.getID());
        for (User user : users) {
            if (user.getID() == ID) {
                return user;
            }
        }
        return null;
    }

    public boolean validateLogin(String username, String password) {
        librarians.sort((Librarian l1, Librarian l2) -> l1.getID() - l2.getID());
        for (Librarian librarian : librarians) {
            if (librarian.getUsername().equals(username) && librarian.checkPass(password)) {
                return true;
            }
        }
        return false;
    }

}
