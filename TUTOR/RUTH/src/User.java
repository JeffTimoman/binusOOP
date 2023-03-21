public class User {
    private String name;
    private String email;
    private String password;
    private int user_type;

    public User(String name, String email, String password, int user_type) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.user_type = user_type;
    }

    public User(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUser_type() {
        return user_type;
    }

    
}
