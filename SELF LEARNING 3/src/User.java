import java.util.ArrayList;

public class User {
    private String name;
    private int ID;

    public User(int ID, String name) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String toString() {
        return "Name: " + name + " ID: " + ID;
    }
}
