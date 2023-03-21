package account;

public class Deposito extends Account{

    private int depositMonths = 0;

    public Deposito(double balance, int depositMonths){
        super(balance);
        addDebit(balance);
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

    public void addDaysPassed(int days){
        this.dayCount += days;
        while(this.dayCount >= 30){
            this.dayCount -= 30;
            this.monthCount++;
            addInterest();
        }
    }

    public int getDepositMonths() {
        return depositMonths;
    }

    public void withDraw(){
        double pullFee = 50000; 
        if (this.dayCount + this.monthCount*30 < this.depositMonths*30){
            double fee = this.balance * 0.001 ;
            if (this.balance - fee - pullFee< 0){
                System.out.println("Cannot withdraw, balance is not enough to withdraw with fee!");
                return;
            }
            System.out.println("Withdraw " + this.balance + " from your account (fee: " + (fee+pullFee) + ")");
        }

        System.out.println("Withdraw " + this.balance + " from your account (fee: " + pullFee + ")");
        this.balance = 0;
        this.dayCount = 0;
        this.monthCount = 0;
    }



    @Override
    public String toString(){
        int rekeningDay = 30*monthCount + dayCount;
        return Double.toString(balance) + " (" + Integer.toString(rekeningDay) +" days)";
    }

}
