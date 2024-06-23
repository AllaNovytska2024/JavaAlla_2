package lesson_23_systems1;

public class BankApp {
    public static void main(String[] args) {

        BankAcc bank = new BankAcc("Bank1", 10000);
        EWallet wallet = new EWallet("E-Wallet", 500);

        System.out.println(bank);
        bank.withdrawMoney(500000);
        bank.withdrawMoney(500);
        System.out.println(bank.checkBalance());

        wallet.transferMoney(1_500);
        System.out.println(wallet);
    }
}
