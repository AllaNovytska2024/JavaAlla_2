package person_Bank_All;

public class Ton_Messages {
    public static String getSentenceTone(String sentence) {
        String upperCaseSentence = sentence.toUpperCase();
        if (upperCaseSentence.equals(sentence)) {
            return "scream";
        } else {
            return "normal";
        }
    }

    public static void main(String[] args) {
        System.out.println(getSentenceTone("Hello")); // "normal"
        System.out.println(getSentenceTone("WOW"));   // "scream"
    }
}
/*
В данной реализации мы сначала преобразуем исходную строку в верхний регистр с помощью toUpperCase().
 Затем сравниваем её с исходной строкой: если они равны, то это “вопль” (scream),
иначе — “нормальное предложение” (normal).
====
Задача:
Реализуйте метод getSentenceTone(), который принимает строку и определяет тон предложения.
Если все символы в верхнем регистре, то это вопль — scream. В ином случае — нормальное предложение — normal.

Примеры вызова:

App.getSentenceTone("Hello"); // "normal"
App.getSentenceTone("WOW");  // "scream"
Алгоритм:

Сгенерируйте строку в верхнем регистре на основе строки-аргумента с помощью toUpperCase().
Сравните её с исходной строкой:
Если строки равны, значит, строка-аргумент в верхнем регистре
В ином случае — строка-аргумент не в верхнем регистре
 */
