package lesson_23_systems2;



public class BankSysApp {
    public static void main(String[] args) {

        BankAccount bankAccount= new BankAccount("Cyprus Bank", 50_000);
        System.out.println(bankAccount);

        bankAccount.withdrawMoney(1_000_000);
        System.out.println(bankAccount.withdrawMoney(1_000));
        System.out.println(bankAccount);

        System.out.println("=================Tranfer=======\n");

        BankAccount bankAccount1 = new BankAccount("A-Bank", 10_000);
        bankAccount1.transferMoney(14_000, bankAccount1);

        System.out.println(bankAccount);
        System.out.println(bankAccount1);

        System.out.println("\n===========BTC=======\n");

        ElectronicWallet wallet = new ElectronicWallet("Crypto wallet", 5);
        System.out.println(wallet);

        wallet.transferMoney(1, bankAccount);
        System.out.println(wallet);
        System.out.println(bankAccount);

        bankAccount1.transferMoney(30_000, wallet);
        bankAccount1.transferMoney(24_000, wallet);

        System.out.println(bankAccount1);
        System.out.println(wallet);
    }
}
