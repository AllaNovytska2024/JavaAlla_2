package homeWork_09_Revers_Array_Random_Bool_Triangl;
/*
@date 27.05.2024
@author Alla Novytska

Задача 3
Заполните массив 50 случайными числами от 1 до 100.
Программа должна найти, и вывести на экран все простые числа.
Посчитайте сколько получилось таких чисел в массиве.
Простое число - число, которое делится на цело только на 1 и само себя.

Пример простых чисел: 3, 5, 7, 11, 13 и т.д.
 */

import java.util.Random;

public class HomeWork_09_03_Massiv_Random_Boolean {
    public static void main(String[] args) {

        int[] array = new int[50];
        Random random = new Random();

        // Заполняем массив случайными числами от 1 до 100
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        // Печатаем все числа в массиве
        System.out.println("Сгенерированный массив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // Проверяем каждое число на простоту и выводим простые числа
        int primeCount = 0;
        for (int num : array) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                primeCount++;
            }
        }

        System.out.println("\n\nВсего простых чисел в массиве: " + primeCount);
    }

    // Метод для проверки, является ли число простым
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }

/*

Сгенерированный массив:
1 100 60 52 48 50 36 23 84 100 42 55 99 46 14 17 72 19 19 42 7 44 11 87 8 6 42 74 94 39 55 3 35 6 51 50 20 90 65 85 59 50 35 33 93 18 60 63 59 33

23 17 19 19 7 11 3 59 59

Всего простых чисел в массиве: 9

 */

}
