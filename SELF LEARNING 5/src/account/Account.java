package account;

import java.util.ArrayList;

public class Account {
    protected int dayCount = 0;
    protected int monthCount = 0;
    protected double interest = 0;
    protected double balance = 0;
    protected ArrayList<Double> debits = new ArrayList<Double>();
    protected ArrayList<Double> credits = new ArrayList<Double>();

    public Account(double balance){
        this.balance = balance;
    }
    public Account() {

    }

    public void addInterest(){
        this.balance += this.balance * this.interest/12;
    }
    
    public void addDebit(double debit){
        this.debits.add(debit);
    }

    public void addCredit(double credit){
        this.credits.add(credit);
    }


    public int getDayCount() {
        return dayCount;
    }
    public void setDayCount(int dayCount) {
        this.dayCount = dayCount;
    }
    public int getMonthCount() {
        return monthCount;
    }
    public void setMonthCount(int monthCount) {
        this.monthCount = monthCount;
    }
    public double getInterest() {
        return interest;
    }
    public void setInterest(double interest) {
        this.interest = interest;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public ArrayList<Double> getDebits() {
        return debits;
    }
    public void setDebits(ArrayList<Double> debits) {
        this.debits = debits;
    }
    public ArrayList<Double> getCredits() {
        return credits;
    }
    public void setCredits(ArrayList<Double> credits) {
        this.credits = credits;
    }

    
}
