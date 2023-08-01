public class DebitCard extends BankCard {

    public DebitCard(boolean cashBack, boolean bonus, boolean accumulation) {
        this.cashBack = cashBack;
        this.bonus = bonus;
        this.accumulation = accumulation;
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
        }
        return false;
    }

    @Override
    public void getAvailableFunds() {
        System.out.println("Own Cash: " + getBalance());
        if (cashBack) System.out.println("CashBack: " + getCashBackAmount());
        if (bonus) System.out.println("Bonus Points: " + getBonusPoints());
        if (accumulation) System.out.println("Accumulation amount: " + getAccumulationAmount());
    }


}
