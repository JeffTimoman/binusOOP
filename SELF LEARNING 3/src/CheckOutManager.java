import java.util.ArrayList;

public class CheckOutManager {
    private static ArrayList<CheckOut> checkOuts = new ArrayList<CheckOut>();

    public void addCheckOut(CheckOut checkOut) {
        checkOuts.add(checkOut);
    }

    public int getCheckOutsSize() {
        return checkOuts.size();
    }
    public void printCheckOuts() {
        for (CheckOut checkOut : checkOuts) {
            System.out.println(checkOut.toString());
        }
    }

    public CheckOut getCheckOut(int bookID) {
        for (CheckOut checkOut : checkOuts) {
            if (checkOut.getBookID() == bookID) {
                return checkOut;
            }
        }
        return null;
    }

    public void removeCheckOut(CheckOut checkOut) {
        checkOuts.remove(checkOut);
    }

    public int countCheckOutByUser(int userID) {
        int count = 0;
        for (CheckOut checkOut : checkOuts) {
            if (checkOut.getUserID() == userID) {
                count++;
            }
        }
        return count;
    }


}
