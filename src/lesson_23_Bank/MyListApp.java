package lesson_23_Bank;
/*
@ date 17.06.2024
@ author Alla Novytska

 */

public class MyListApp {
    public static void main(String[] args) {


        Account < String > acc1 = new Account< String >(" 1234 ", 500);
        String acc1Id = acc1.getId();
        System.out.println(acc1Id);

        Account < Integer > acc2 = new Account< Integer >( 1234, 500);
        Integer acc2Id = acc2.getId();
        System.out.println(acc2Id);
    }
}
class Account <T>{
    private T id;
    private  int sum;

    Account(T id, int sum){
        this.id = id;
        this.sum = sum;
    }
    public T getId() {
        return id;
    }
    public int getSum() {
        return sum;
    }
    public void setSum(int sum) {
        this.sum = sum;
    }
}
