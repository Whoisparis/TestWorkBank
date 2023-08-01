public class Main {
    public static void main(String[] args) {
        BankCard creditCard = new CreditCard(10000,true,true,true);
        creditCard.getAvailableFunds();

        creditCard.deposit(5000);
        creditCard.getAvailableFunds();

        creditCard.pay(5000);
        creditCard.getAvailableFunds();

        creditCard.pay(3000);
        creditCard.getAvailableFunds();

        creditCard.deposit(2000);
        creditCard.getAvailableFunds();

        creditCard.deposit(2000);
        creditCard.getAvailableFunds();

        BankCard debitCard = new DebitCard(true,true,true);
        debitCard.deposit(123041);
        BankCard debitCard2 = new DebitCard(true,false,false);
        debitCard2.deposit(10000);
        debitCard2.pay(10000);
        debitCard.getAvailableFunds();
        debitCard2.getAvailableFunds();

    }
}