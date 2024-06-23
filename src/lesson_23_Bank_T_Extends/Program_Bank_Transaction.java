package lesson_23_Bank_T_Extends;
/*
@ date 17.06.2024
@ author Alla Novytska

 */
public class Program_Bank_Transaction {
    public static void main(String[] args) {

        Transaction.Account acc1 = new Transaction.Account( "1876", 4500);
        Transaction.Account acc2 = new Transaction.Account( "3476", 1500);

        Transaction<Transaction.Account> tran1 = new  Transaction<Transaction.Account>(acc1,acc2, 4000);
        tran1.execute();
        tran1 = new  Transaction<Transaction.Account>(acc1, acc2, 4000);
        tran1.execute();
    }
}
interface  Accountable<T>{
    T getId();
    int getSum();
    void setSum(int sum);
}



class Transaction<T extends Transaction.Account>{
    private T from;
    private T to;
    private int sum;

    Transaction(T from, T to, int sum){
        this.from = from;
        this.to = to;
        this.sum = sum;
    }
    public void execute(){
        if (from.getSum() > sum){
            from.setSum(from.getSum() - sum);
            to.setSum(to.getSum() + sum);
            System.out.printf("Account %s: %d \nAccount %s: %d \n", from.getId(), from.getSum(), to.getId(), to.getSum());
        } else{
            System.out.printf(" Operation is invalid ");
        }

    }
    static class Account {
        private String id;
        private int sum;

        Account (String id, int sum){
            this.id = id;
            this.sum = sum;
        }
        public String getId(){ return id;}
        public int getSum(){return sum;}
        public void setSum(int sum){this.sum = sum;}
    }
}
