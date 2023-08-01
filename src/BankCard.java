public abstract class BankCard {
    protected double balance; //баланс карты
    protected boolean bonus; //функция накопления бонусов
    protected boolean cashBack; //функция кэшбека
    protected boolean accumulation; //функция накопления
    protected double bonusPoints; //количество бонусов
    protected double cashBackAmount; // количества кэшбэка
    protected double accumulationAmount; // количество накоплений
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
