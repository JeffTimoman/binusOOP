public class Agent extends User{
    private String username;
    private String password;

    public Agent(String name, int id, String username, String password) {
        super(name, id);
        this.username = username;
        this.password = password;
    }

    public Agent() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean validatePassword(String password){
        if (this.password.equals(password)){
            return true;
        }
        return false;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}