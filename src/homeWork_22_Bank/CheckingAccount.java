package homeWork_22_Bank;


// Подкласс CheckingAccount
public class CheckingAccount extends BankAccount {
    private float overdraftLimit;
    private float overdraftFee;
    private boolean firstName;
    private boolean lastName;

    public CheckingAccount(String firstName, String lastName, String ssn, float balance, float overdraftLimit, float overdraftFee) {
        super(firstName, lastName, ssn, balance);
        this.overdraftLimit = overdraftLimit;
        this.overdraftFee = overdraftFee;
    }

    @Override
    public void withdraw(float amount) {
        if (balance >= amount || (balance - amount) >= -overdraftLimit) {
            balance -= amount;
            System.out.println(firstName + " " + lastName + " withdrew $" + amount + ". Current Balance $" + balance);
        } else {
            System.out.println("Unable to withdraw $" + amount + " for " + firstName + " " + lastName + " due to insufficient funds.");
        }
    }
}
