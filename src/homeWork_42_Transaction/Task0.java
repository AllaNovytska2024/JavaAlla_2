package homeWork_42_Transaction;/*
@date 12.07.2024
@author Sergey Bugaienko
*/

/*
Task 0
Разбейте строку на слова, используя в качестве разделителя пробел.
Используя функцию reduce верните суммарное количество букв в словах,
которые длиннее 4 символов

String text = "Hello, world and good afternoon";
int countLetters = countLetters(text);
System.out.println("countLetters: " + countLetters);
 */

import java.util.Arrays;

public class Task0 {
    public static void main(String[] args) {
        String text = "Hello, world and good afternoon";
        int countLetters = countLetters2(text);
        System.out.println("countLetters: " + countLetters);
    }

    private static int countLetters(String text) {
        //Option 1
        String[] words = text.replaceAll("[^a-zA-Z ]", "").split("\\s+");

        return Arrays.stream(words)
                .map(String::length)
                .filter(i -> i > 4)
                .reduce(0, Integer::sum);
//                .reduce(0, (i1, i2) -> i1 + i2);
    }

    private static int countLetters2(String text) {
        // Option 2
        String[] words = text.split("\\s+");

        long count = Arrays.stream(text.split("\\s+"))
                .filter(word -> word.length() > 4)
                .flatMapToInt(String::chars)
                .mapToObj(i -> (char) i)
                .peek(ch -> System.out.print(ch + ", "))
                .filter(Character::isAlphabetic)
                .count();

        return (int) count;


    }
}