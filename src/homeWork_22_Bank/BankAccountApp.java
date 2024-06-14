package homeWork_22_Bank;

/*
Нужно дополнить логику внутри методов
 transferMoney() и withdrawMoney()
  для каждого класса.
 Убедитесь, что оба класса корректно выполняют каждую из операций.
 */

public class BankAccountApp {
    public static void main(String[] args)  {
        CheckingAccount checkingAccount = new CheckingAccount("Lidiia", "Kovalchuk", "123-45-6789", 1000, 1000, 25);
        checkingAccount.deposit(500);
        checkingAccount.withdraw(1500);

        };




}

