package homeWork_07_Switch_Task;

/*
@ data 24.05.2024
@ author Alla Novytska

Задача 5
Используйте цикл для решения задачи:while

Распечатайте 7 чисел от 1 до 100, которые делятся на 5 без остатка.

 */

public class HomeWork_07_5 {
    public static void main(String[] args) {

        int count = 0;
        int number = 1;

        while (count < 7) {
            if (number % 5 == 0) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}

    /*
    Ответ консоли-
5
10
15
20
25
30
35

     */


