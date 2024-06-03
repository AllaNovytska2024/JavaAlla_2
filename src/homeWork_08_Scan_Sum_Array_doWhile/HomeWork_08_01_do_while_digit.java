package homeWork_08_Scan_Sum_Array_doWhile;
/*
@ data 25.05.2024
@  author ALLA NOVYTSKA

Задача 1
Распечатать все числа от 1 до 100, которые делятся на 5 без остатка, используя цикл do-while.

 */

public class HomeWork_08_01_do_while_digit {
    public static void main(String[] args) {

        int a = -1;

        do {
            if
            (a % 5 == 0)
                System.out.println( a + " ");
        a ++;
        }

     while (a<= 100);

/*

Ответ консоли-
0
5
10
15
20
25
30
35
40
45
50
55
60
65
70
75
80
85
90
95
100
 */

    }
}
