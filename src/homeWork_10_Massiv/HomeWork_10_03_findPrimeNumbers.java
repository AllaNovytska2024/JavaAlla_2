package homeWork_10_Massiv;

import java.util.ArrayList;
import java.util.List;

/*
@date 29.05.2024
@author Alla Novytska

Задача 3
Написать метод, принимающий на вход массив целых чисел.
Метод должен вернуть массив, состоящий только из простых чисел,
присутствующих в изначальном массиве

вход -> {0, 13, -25, 11, 31, 55, 98, 11, 5} -> выход {13, 11, 31, 11, 5}
 */

// Этот код определяет метод findPrimeNumbers,
// который принимает входной массив и возвращает массив простых чисел.
// Мы используем isPrime для проверки, является ли число простым.
// Затем мы преобразуем List<Integer> в int[] для возврата результата.
// Ваш ожидаемый выходной массив будет содержать простые числа из входного массива: {13, 11, 31, 11, 5}

public class HomeWork_10_03_findPrimeNumbers {

    public static void main(String[] args) {
        int[] inputArray = {0, 13, -25, 11, 31, 55, 98, 11, 5};
        int[] primeNumbers = findPrimeNumbers(inputArray);

        System.out.print("Простые числа во входном массиве: ");
        for (int prime : primeNumbers) {
            System.out.print(prime + " ");
        }
    }

    public static int[] findPrimeNumbers(int[] inputArray) {
        List<Integer> primes = new ArrayList<>();

        for (int number : inputArray) {
            if (isPrime(number)) {
                primes.add(number);
            }
        }

        // Преобразуем List<Integer> в int[]
        int[] primeArray = new int[primes.size()];
        for (int i = 0; i < primes.size(); i++) {
            primeArray[i] = primes.get(i);
        }

        return primeArray;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;

    }
}

/*

Ответ консоли-
Простые числа во входном массиве: 13 11 31 11 5

 */





