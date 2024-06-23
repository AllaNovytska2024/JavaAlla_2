package array_All;

import java.util.Arrays;
import java.util.Comparator;

/*
MyComparator, реализующий Comparator с методом сравнения для сортировки массива
 целых чисел в следующем порядке:

Четные целые числа должны идти перед нечетными числами
Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
[2, 4, 6, 8, 1, 3, 5, 7, 7, 9] // Output
 */

public class Array_Numbers_Comporator implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        // Сначала сравниваем четность чисел
        boolean isEvenA = a % 2 == 0;
        boolean isEvenB = b % 2 == 0;
        if (isEvenA && !isEvenB) {
            return -1; // a идет перед b
        } else if (!isEvenA && isEvenB) {
            return 1; // b идет перед a
        } else {
            // Если оба числа четные или оба нечетные, сравниваем их значения
            return a.compareTo(b);
        }
    }

    public static void main(String[] args) {
        Integer[] a = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
        Integer[] b = { 2, 4, 6, 8, 10 }; // Пример непустого массива b

        // Используйте вашу реализацию compare для сортировки массива a
        Arrays.sort(a, new Array_Numbers_Comporator());

        // Вывод отсортированного массива a
        System.out.println(Arrays.toString(a)); //->-> [2, 4, 6, 8, 1, 3, 5, 7, 7, 9]
    }
}
 /*
Для создания MyComparator, который реализует интерфейс Comparator
и сортирует массив целых чисел так, чтобы четные числа шли перед нечетными.
 Метод compare(Integer a, Integer b) сравнивает два целых числа.
 Вот как это работает:
Сначала проверяется, являются ли оба числа четными или оба нечетными.
Если одно из чисел четное, а другое нечетное,
то возвращается -1 (a идет перед b) или 1 (b идет перед a),
в зависимости от того, какое число четное.
Если оба числа четные или оба нечетные, то сравниваются их значения с помощью метода compareTo.
 */