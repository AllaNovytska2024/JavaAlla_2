package homeWork_40_Predicate_Function_Consumer_Stream;

import lesson_40_Consumer_Predicate_Function.Cat;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
@ date 09.07.2024
@ author Alla Novytska

Task 1
Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.
Используйте несколько предикатов для фильтрации списка чисел,
где числа должны быть четными, больше 10 и меньше 100
 */
public class Task1_Stream {

    public static void main(String[] args) {

        Task1_Stream();
    }
    private static void Task1_Stream() {
        List<Integer> integers = List.of(5, 4, 14, 50, 32, 24, 66, 7,-1, 9, 99, 98, 101, 300);
        List<Integer> integerList = integers.stream()
                .filter(i -> i > 10 && i < 100)
                .filter(i -> i % 2 == 0)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(integerList);
    }
}

/*
Ответ консоли:
[14, 24, 32, 50, 66, 98]
 */