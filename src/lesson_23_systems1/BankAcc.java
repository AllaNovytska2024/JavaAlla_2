package lesson_23_systems1;

public class BankAcc implements  PaySystem {

    private  String title;
    private double balance;

    public BankAcc(String  title, double balance){
        this.title = title;
        this.balance = balance;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public void transferMoney(double amount){
        if (amount > balance) return;
        System.out.println(" Банк " + title + ". Перевод " + amount);
        balance -= amount;
    }
    @Override
    public void withdrawMoney(double drawMoney){
        if (drawMoney > balance){
            System.out.println(" Недостаточно денег на счету для снятия " + drawMoney);
            return;
        }
        System.out.println(" Банк " + title + ". Вывод средств со счета " + drawMoney);
        balance -= drawMoney;
    }
    @Override
    public double checkBalance(){
        return balance;
    }

    @Override
    public String toString() {
        return " BankAcc { " +
                "title= '" + title + '\'' +
                ", balance = " + balance +
                '}';
    }
}



