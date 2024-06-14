package homeWork_22_Bank;

public abstract class BankAccount {
    private String firstName;
    private String lastName;
    private String ssn;
    protected double balance;
    private long accountNumber;

    public BankAccount(String firstName, String lastName, String ssn, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.balance = balance;
        this.accountNumber = generateAccountNumber();
    }

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
    }

    public BankAccount() {

    }

    private long generateAccountNumber() {
        return (long) (Math.random() * 9000000000L) + 1000000000L;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(firstName + " " + lastName + " deposited $" + amount + ". Current Balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(firstName + " " + lastName + " withdrew $" + amount + ". Current Balance: $" + balance);
        } else {
            System.out.println("Unable to withdraw $" + amount + " for " + firstName + " " + lastName + " due to insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public abstract void withdraw(float amount);


    // Определим класс BankAccount
    public class BankAccountPrivate {
        private String accountNumber; // Номер счета
        private String accountHolderName; // Имя владельца счета
        private double balance; // Баланс счета

        // Конструктор для инициализации объекта BankAccount
        public BankAccountPrivate(String accountNumber, String accountHolderName, double initialBalance) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = initialBalance;
        }

        // Метод для внесения денег на счет
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Внесено: " + amount + ". Новый баланс: " + balance);
            } else {
                System.out.println("Сумма внесения должна быть положительной.");
            }
        }

        // Метод для снятия денег со счета
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Снято: " + amount + ". Новый баланс: " + balance);
            } else {
                System.out.println("Недостаточно средств или некорректная сумма.");
            }
        }

        // Метод для проверки баланса счета
        public double checkBalance() {
            return balance;
        }

        // Геттер для получения номера счета
        public String getAccountNumber() {
            return accountNumber;
        }

        // Геттер для получения имени владельца счета
        public String getAccountHolderName() {
            return accountHolderName;
        }
    }
}