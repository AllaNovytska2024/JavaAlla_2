package homeWork_09_Revers_Array_Random_Bool_Triangl;
/*
@date 27.05.2024
@author Alla Novytska

Задача 2
Написать метод, принимающий на вход целое число. Метод должен вывести на экран 2 в степени это
Число

класс Math для нахождения степени числа использовать нельзя ;)
 */
public class HomeWork_09_02_exponent {
    static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }

    public static void main(String[] args) {
        int base = 2;
        int exponent = 3;
        System.out.println(base + " в степени " + exponent + " равно " + power(base, exponent));
        }
    }
/*

Ответ консоли:
2 в степени 3 равно 8
 */
