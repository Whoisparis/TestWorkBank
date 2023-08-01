public class CreditCard extends BankCard {

    private double creditLimit; //кредитный лимит
    private double creditAvailable; //кредитные средства

    public CreditCard(double creditLimit, boolean cashBack, boolean bonus, boolean accumulation) {
        this.creditLimit = creditLimit;
        this.creditAvailable = creditLimit;
        this.cashBack = cashBack;
        this.bonus = bonus;
        this.accumulation = accumulation;
    }
    @Override
    public void deposit(double amount) {
        if ((creditAvailable + amount) >= creditLimit) {
             amount -= (creditLimit - creditAvailable);
             creditAvailable = creditLimit;
             balance += amount;
             accumulationAmount += (amount * 0.00005);
        } else {
            creditAvailable += amount;
            accumulationAmount += (amount * 0.00005);
        }
    }



    @Override
    public boolean pay(double amount) {
        if (amount <= balance) {
            balance -= amount;
            if (cashBack && (amount > 5000)) {
                cashBackAmount += (amount * 0.05);
            }
            if (bonus) bonusPoints += amount * 0.01;
            return true;
        } else if (amount <= balance + creditAvailable) {
            double remainCredit = amount - balance;
            balance = 0;
            creditAvailable -= remainCredit;
            if (cashBack && (amount > 5000)) {
                cashBackAmount += (amount * 0.05);
            }
            if (bonus) bonusPoints += amount * 0.01;
            return true;
        }
        return false;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public double getCreditAvailable() {
        return creditAvailable;
    }

    @Override
    public void getAvailableFunds() {
        System.out.println("Credit Limit: " + getCreditLimit());
        System.out.println("Credit Cash Available: " + getCreditAvailable());
        System.out.println("Own Cash: " + getBalance());
        if (cashBack) System.out.println("CashBack: " + getCashBackAmount());
        if (bonus) System.out.println("Bonus Points: " + getBonusPoints());
        if (accumulation) System.out.println("Accumulation amount: " + getAccumulationAmount());
    }

}
