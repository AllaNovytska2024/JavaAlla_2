package homeWork_41_API;

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        task4();
    }

    private static void task4() {
        List<Integer> integers = List.of(1, 6, 12, 7, 4, -11, 25, 12, 25, -15, -39, -40, 10, 0);

        List<Integer> evenDoubledNumbers = integers.stream()
                .filter(i -> i != 0)
                .filter(i -> i % 2 == 0) // фильтрация четных чисел
                .map(i -> i * 2) // умножение на 2
                .collect(Collectors.toList());

        System.out.println(evenDoubledNumbers);
    }
}