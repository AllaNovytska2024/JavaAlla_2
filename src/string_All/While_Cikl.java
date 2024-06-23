package string_All;

import static method_All.Method_.printNumbers;

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
Давайте модифицируем метод printNumbers(), чтобы он выводил числа в обратном порядке.
 Вам нужно инициализировать счётчик максимальным значением и уменьшать его до нижней границы.
Вот пример решения на JavaScript:
 */