package homeWork_22_Bank;

public interface PaymentSystem {
    
    void transferMoney(double amount, String recipientAccount);

    void withdrawMoney(double amount);

    double checkBalance();
}
