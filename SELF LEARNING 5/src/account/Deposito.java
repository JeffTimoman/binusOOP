package account;

public class Deposito extends Account{

    private int depositMonths = 0;

    public Deposito(double balance, int depositMonths){
        super(balance);
        this.depositMonths = depositMonths;
        setDepositoInterest(depositMonths);
    }
    private void setDepositoInterest(int depositMonths){
        if (depositMonths == 3){
            this.interest = 0.03;
        }else if(depositMonths == 6){
            this.interest = 0.0325;
        }else if(depositMonths == 12){
            this.interest = 0.035;
        }
    }

    public int getDepositMonths() {
        return depositMonths;
    }

    @Override
    public String toString(){
        int rekeningDay = 30*monthCount + dayCount;
        return Double.toString(balance) + " (" + Integer.toString(rekeningDay) +" days)";
    }

}
