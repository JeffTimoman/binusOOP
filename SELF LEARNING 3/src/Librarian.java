import java.util.ArrayList;

public class Librarian extends User{
    private String username;
    private String password;

    public Librarian(int ID, String name, String username, String password) {
        super(ID, name);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean checkPass(String password) {
        return this.password.equals(password);
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
