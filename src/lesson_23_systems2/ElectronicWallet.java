package lesson_23_systems2;

public class ElectronicWallet extends VusaMember implements PaymentSystem {

    public String walletTitle;
    private double balance;

    public ElectronicWallet(String walletTitle, double balance) {
        super("BTC");
        this.walletTitle = walletTitle;
        this.balance = balance;
    }

    @Override
    public boolean transferMoney(double amountBtc, PaymentSystem recipient) {
        if (amountBtc > balance) {
            System.out.printf("Недостаточно средств: (transfer: %.2f | balance: %.2f) \n", amountBtc, balance);
            return false;
        }
        if (recipient.getCurrency().equals("BTC")) {
            balance -= amountBtc;
            recipient.depositTransfer(amountBtc);
            System.out.printf("Успех! Перевод %.2f BTC (%s) -> %s\n", amountBtc, walletTitle, recipient.getTitle());
            return true;
        } else if (recipient.getCurrency().equals("EUR")) {
            //Конвертировать BTC to EUR
            double amountEur = amountBtc * getCurseBTC();
            balance -= amountBtc;
            recipient.depositTransfer(amountEur);
            System.out.printf("Успех! Перевод %.2f BTC (%s) -> %.2f EUR (%s)\n", amountBtc, walletTitle, amountEur, recipient.getTitle());
            return true;
        }
        System.out.println("Что-то пошло не так с валютой счета получателя");
        return false;
    }

    @Override
    public boolean withdrawMoney(double amount) {
        if (amount > balance) {
            System.out.println("Недостаточно средств для вывода: " + amount);
            return false;
        }
        balance -= amount;
        System.out.println("Успешно снято сщ счета" + amount + "BTC");
        return true;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public void depositTransfer(double amount) {
        balance += amount;
    }

    @Override
    public String getTitle() {
        return walletTitle;
    }

    @Override
    public String toString() {
        return "ElectronicWallet{" +
                "walletTitle='" + walletTitle + '\'' +
                ", balance=" + String.format("%.8f", balance) +
                '}';
    }
}

