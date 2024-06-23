package lesson_23_systems2;

public interface PaymentSystem {
    boolean transferMoney(double amount, PaymentSystem recipient);
    boolean withdrawMoney(double amount);
    double checkBalance();

    void depositTransfer(double amount);
    String  getCurrency();
    String getTitle();

}
