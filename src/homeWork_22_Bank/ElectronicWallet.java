package homeWork_22_Bank;

public class ElectronicWallet implements PaymentSystem {
    private double balance;

    public ElectronicWallet(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void transferMoney(double amount, String recipientAccount) {
        // Логика перевода средств на другой счет (для электронного кошелька)
        // ...
    }

    @Override
    public void withdrawMoney(double amount) {
        // Логика снятия со счета (для электронного кошелька)
        // ...
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}