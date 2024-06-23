package lesson_23_systems1;



/*Платежные системы

Создайте интерфейс PaymentSystem с методами
transferMoney() (перевод средств на другой счет),
withdrawMoney() (снятие со счета) и
checkBalance() (остаток на счете).

Реализуйте классы BankAccount и ElectronicWallet, которые реализуют данный интерфейс.
Убедитесь, что каждый класс корректно выполняет каждую из операций.
 */
public interface PaySystem {

    void transferMoney(double amount);

    void withdrawMoney(double drawMoney);


    double checkBalance();

    }



