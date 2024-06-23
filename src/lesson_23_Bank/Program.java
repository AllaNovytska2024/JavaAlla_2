package lesson_23_Bank;
/*
@ date 17.06.2024
@ author Alla Novytska

 */
public class Program {
    public static void main(String[] args) {
        Account2<String> acc1 = new Account2<String>( "1235rwr", 5000);
        Account2<String> acc2 = new Account2<String>("2373", 4300);
        System.out.println(" Id 1 : " + acc1.getId() + " " + "Сумма : " + acc1.getSum());
        System.out.println(" Id 2 : " + acc2.getId() + " " + "Сумма : "  + acc2.getSum());
    }

}
interface  Accountable<T>{
    T getId();
    int getSum();
    void setSum(int sum);
}
class Account2 <T> implements Accountable<T >{
    private  T id;
    private  int sum;

    Account2 (T id, int sum){
        this.id = id;
        this.sum = sum;
    }
    public T getId(){
        return id;
    }
    public int getSum(){
        return sum;
    }
    public void setSum (int sum){
        this.sum = sum;

        Printer printer= new Printer();
        String[] people = {"Tom", "Alice", "Sam", "Kate", "Bob", "Helen"};
        Integer[] numbers = { 23, 4, 5, 2, 13, 456, 4};
        printer.<String>print(people);
        printer.<Integer>print(numbers);
    }
}


class Printer{
    public <T> void print(T[] items){
        for (T item: items){
            System.out.println(item );
        }


    }

}