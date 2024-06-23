package homeWork_28_Comparator;


import java.util.Arrays;
import java.util.Comparator;

public class Array_My_Comparator2 implements Comparator<Integer> {
        @Override
        public int compare(Integer a, Integer b) {
            // Проверяем, является ли a четным числом
            boolean isEvenA = a % 2 == 0;
            // Проверяем, является ли b четным числом
            boolean isEvenB = b % 2 == 0;

            // Сравниваем числа в соответствии с условиями
            if (isEvenA && isEvenB) {
                // Оба числа четные - сравниваем их по возрастанию
                return a.compareTo(b);
            } else if (!isEvenA && !isEvenB) {
                // Оба числа нечетные - сравниваем их по убыванию
                return b.compareTo(a);
            } else {
                // Одно число четное, другое - нечетное
                // Четное число должно идти перед нечетным
                return isEvenA ? -1 : 1;
            }
        }

    public static void main(String[] args) {

        Integer[] intA = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };



        Arrays.sort(intA, new Array_My_Comparator2());
        System.out.println( Arrays.toString(intA));
        // ->[2, 4, 6, 8, 9, 7, 7, 5, 3, 1] // Outpur

    }
   }
/*
MyComparator2 для сортировки массива целых чисел в указанном порядке.

Для начала, нам понадобится два условия:

Четные целые числа должны идти перед нечетными числами в порядке возрастания.
Нечетные целые числа должны идти после четных в порядке убывания.
Давайте создадим класс MyComparator2, который будет реализовывать
интерфейс Comparator<Integer>. Вот как это можно сделать:
Задача:
 Напишите MyComparator2 с методом сравнения для сортировки массива
  целых чисел в следующем порядке:
Четные целые числа должны идти перед нечетными числами в порядке возрастания.
Нечетные целые числа должны идти после четных в порядке убывания
 */