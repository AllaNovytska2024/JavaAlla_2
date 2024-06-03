package homeWork_08_Scan_Sum_Array_doWhile;

import java.util.Scanner;

/*
@ data 25.05.2024
@  author ALLA NOVYTSKA
Программа запрашивает у пользователя ввод произвольного числа. Вывести сумму цифр этого числа.

Пример:

567432 -> 5+6+7+4+3+2 -> 27

 */
public class HomeWork_08_02_Scan_Sum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println( " В этом окне введите Ваше счастливое число: ");

        int intA = scanner.nextInt();
        System.out.println(" Спасибо, вы ввели число: " + intA );




         int sum =0;
         while (intA !=0) {
             sum += (intA % 10);
              intA /= 10;
         }

        System.out.println( "Мы получили сумму вашего счастливого числа: " + sum + " УДАЧИ!");

/*

В этом окне введите Ваше счастливое число:
7777
 Спасибо, вы ввели число: 7777
Мы получили сумму вашего счастливого числа: 28 УДАЧИ!
 */

    }
}
