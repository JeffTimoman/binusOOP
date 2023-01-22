import java.util.ArrayList;

public class User {
    private String name;
    private String ID;

    private void autoSetID(){
        String tempID = "";
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < 4; i++) {
            tempID += chars.charAt((int)(Math.random() * 26));
        }
        for (int i = 0; i < 3; i++) {
            tempID += (int)(Math.random() * 10);
        }
        this.ID = tempID;
    }

    public User(String name, ArrayList<User> users){
        this.name = name;
        this.autoSetID();

        for (User user : users) {
            if (user.getID().equals(this.ID)) {
                this.autoSetID();
            }
        }
    }

    public User(){
        throw new IllegalArgumentException("You must enter a name and password");
    }

    // Getters and Setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String toString(){
        return "Name: " + this.name + " ID: " + this.ID;
    }
}
