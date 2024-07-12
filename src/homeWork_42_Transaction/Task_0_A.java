package homeWork_42_Transaction;

import java.util.Arrays;

/*
@ date 12.07.2024
@ author Alla Novytska

Task 0
Разбейте строку на слова, используя в качестве разделителя пробел.
Используя функцию reduce верните суммарное количество букв в словах,
 которые длиннее 4 символов

String text = "Hello, world and good afternoon";
int countLetters = countLetters(text);
System.out.println("countLetters: " + countLetters);
==
// Output:
countLetters: 19
 */
public class Task_0_A {
    public static void main(String[] args) {
        String text = "hello, world and good afternoon";
        int countLetters = countLetters(text);
        System.out.println("countLetters: " + countLetters);
    }

    public static int countLetters(String text) {
        return Arrays.stream(text.split(" "))
                // Удаляем все, кроме букв
                .map(word -> word.replaceAll("[^a-zA-Z]", ""))
                // Фильтруем слова и оставляем слова длиной больше 4
                .filter(word -> word.length() > 4)
                .mapToInt(String::length)
                // Суммируем буквы после выполнения условий задачи
                .reduce(0, Integer::sum);
    }
}
/*
Ответ консоли:
countLetters: 19
 */