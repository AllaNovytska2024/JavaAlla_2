package while_Cikl;

public class While_Cikl {
    public static void main(String[] args) {
        // Print numbers in reverse
        int n = 4;
        while (n >= 1) {
            System.out.println(n);
            n--;
        }
        System.out.println("finished!");
    }
}
/*
Решение учителя:
public class App {
    public static void printNumbers(int firstNumber) {
        // BEGIN
        var i = firstNumber;
        while (i >= 1) {
            System.out.println(i);
            i = i - 1;
        }
        System.out.println("finished!");
        // END
    }
}
=====
Давайте модифицируем метод printNumbers(), чтобы он выводил числа в обратном порядке.
 Вам нужно инициализировать счётчик максимальным значением и уменьшать его до нижней границы.
Вот пример решения на JavaScript:
 */