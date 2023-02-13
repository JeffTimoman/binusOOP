package user;

import java.util.ArrayList;

public class User{
    protected String username, password, name;
    protected int userID = getID();
    private static int id;
    public User(String username, String password, String name){
        this.username = username;
        this.password = password;
        this.name = name;
    }

    private int getID(){
        return ++id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean validateLogin(String username, String password){
        if(this.username.equals(username) && this.password.equals(password)){
            return true;
        }
        return false;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        User.id = id;
    }
}