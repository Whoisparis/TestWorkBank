public abstract class BankCard {
    protected double balance;
    protected boolean bonus;
    protected boolean cashBack;
    protected boolean accumulation;
    protected double bonusPoints;
    protected double cashBackAmount;
    protected double accumulationAmount;
    public void deposit(double amount) {
        balance += amount;
        if (accumulation) accumulationAmount += (amount * 0.00005);
    }

    public double getBalance() {
        return balance;
    }

    public double getCashBackAmount() {
        return cashBackAmount;
    }

    public double getAccumulationAmount() {
        return accumulationAmount;
    }

    public abstract boolean pay(double amount);
    public abstract void getAvailableFunds();

    public  double getBonusPoints(){
        return bonusPoints;
    };


}
