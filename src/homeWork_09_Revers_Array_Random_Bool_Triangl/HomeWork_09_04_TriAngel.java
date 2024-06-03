package homeWork_09_Revers_Array_Random_Bool_Triangl;
/*
@date 27.05.2024
@author Alla Novytska

Task4* опционально
Написать программу, выводящую на экран треугольник, состоящий из цифр от 1 до 6 такого вида:

1
12
123
1234
12345
123456
Копировать

 */

import java.util.Scanner;

public class HomeWork_09_04_TriAngel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк для треугольника: 6= ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        /*

        Введите количество строк для треугольника: 6 = 6
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
         */
    }
}
