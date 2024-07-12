package homeWork_42_Transaction;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*


Task 2 Средний
Дан список транзакций (Transaction) с полями
amount, type (DEBIT/CREDIT), timestamp.
Используя Stream API, вычислите общую сумму для дебетовых и кредитных транзакций отдельно,
а также найдите транзакцию с максимальной суммой.
 */
public class Task_2_A_Transaction {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction(100, "DEBIT", "2024-07-12T10:00:00"),
                new Transaction(200, "CREDIT", "2024-07-12T11:00:00"),
                new Transaction(150, "DEBIT", "2024-07-12T12:00:00"),
                new Transaction(300, "CREDIT", "2024-07-12T13:00:00")
        );

        double totalDebit = transactions.stream()
                .filter(t -> t.getType().equals("DEBIT"))
                .mapToDouble(Transaction::getAmount)
                .sum();

        double totalCredit = transactions.stream()
                .filter(t -> t.getType().equals("CREDIT"))
                .mapToDouble(Transaction::getAmount)
                .sum();

        Optional<Transaction> maxTransaction = transactions.stream()
                .max((t1, t2) -> Double.compare(t1.getAmount(), t2.getAmount()));

        System.out.println("Total Debit: " + totalDebit);
        System.out.println("Total Credit: " + totalCredit);
        maxTransaction.ifPresent(t -> System.out.println("Max Transaction: " + t));
    }
}
/*
Ответ консоли:
Total Debit: 250.0
Total Credit: 500.0
Max Transaction: Transaction{amount=300.0, type='CREDIT', timestamp='2024-07-12T13:00:00'}

 */