public class CheckOut {
    private int bookID;
    private int userID;

    public CheckOut(int bookID, int userID) {
        this.bookID = bookID;
        this.userID = userID;
    }

    public CheckOut(){

    }
    public int getBookID() {
        return this.bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public int getUserID() {
        return this.userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
