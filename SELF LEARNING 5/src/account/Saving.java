package account;

public class Saving extends Account{
    private double moneyPulled = 0;

    public double getMoneyPulled() {
        return moneyPulled;
    }
    
    public void addDayCount(int dayCount){
        this.dayCount += dayCount;
        this.moneyPulled = 0;
        while(this.dayCount >= 30){
            this.dayCount -= 30;
            this.monthCount++;
            addInterest();
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

    public void withDraw(double money){

        if (money+moneyPulled > 10000000){
            System.out.println("You can't withdraw more than 10.000.000 in a month!");
            return;
        }

        if (money > this.balance){
            System.out.println("Balance is not enough!");
            return;
        }
        this.balance -= money;
        this.moneyPulled += money;
        System.out.println("Withdraw " + money + " from your account");
        addMoneyPulled(money);
        addCredit(money);
    }


    public double addMoneyPulled(double moneyPulled) {
        return this.moneyPulled += moneyPulled;
    }

    public void setMoneyPulled(double moneyPulled) {
        this.moneyPulled = moneyPulled;
    }

    public Saving(double balance){
        super(balance);
        this.interest = 0.025;
    }   

    public Saving(){
        super();
        this.interest = 0.025;
    }

    @Override
    public String toString(){
        int rekeningDay = 30*monthCount + dayCount;
        return Double.toString(balance) + " (" + Integer.toString(rekeningDay) +" days)";
    }
}
