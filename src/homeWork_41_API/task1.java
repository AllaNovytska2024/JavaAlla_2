package homeWork_41_API;

import java.util.List;
import java.util.stream.Collectors;/*
@ data 11.07.2024
@ author Alla Novytska

Task 1
Из списка целых чисел выделите те значения, которые больше 10;
отсортируйте эти значения по значению последней цифры в числе и
выведите результат на экране
 */
public class task1 {

    public static void main(String[] args) {
        task3();
    }


    private static void task3() {
        // Получить список всех чисел больше 10 из списка.
        List<Integer> integers = List.of(1, 12, 7, -11, 25, 12, 25, -15, -39, 10, 0);

        List<Integer> integerList = integers.stream()
                .filter(i -> i > 10)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(integerList);
    }
}
