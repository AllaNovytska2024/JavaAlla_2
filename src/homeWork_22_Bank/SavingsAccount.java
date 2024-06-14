package homeWork_22_Bank;

public abstract class SavingsAccount extends BankAccount {
    private double interestRate; // Процентная ставка

    public SavingsAccount(String accountNumber, String accountHolderName, double initialBalance, double interestRate) {
        super(accountNumber, accountHolderName, initialBalance); // Вызов конструктора суперкласса
        this.interestRate = interestRate;

    }
    // Метод для начисления процентов на баланс
    public void applyInterest() {
        double interest = checkBalance() * interestRate / 100;
        deposit(interest); // Добавляем проценты к балансу
        System.out.println("Проценты начислены: " + interest + ". Новый баланс: " + checkBalance());
    }
    private double checkBalance() {
        return getBalance(); // Возвращает текущий баланс
    }

    public static void main(String[] args) {
        SavingsAccount katiaAccount = new SavingsAccount("123456", "Katia Drossel", 1000, 2.5) {
            @Override
            public void withdraw(float amount) {
                System.out.println();

            }

        };

        SavingsAccount mashaAccount = new SavingsAccount("789012", "Masha Dudka", 1500, 3.0) {
            @Override
            public void withdraw(float amount) {
                System.out.println();

            }
        };

        SavingsAccount leonidAccount;
        leonidAccount= new SavingsAccount("345678", "Leonid Gosman", 2000, 2.0) {

            @Override
            public void withdraw(float amount) {
                System.out.println();

            }
        };

        // Пример начисления процентов
        katiaAccount.applyInterest();
    }

}