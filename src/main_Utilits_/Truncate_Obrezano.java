package main_Utilits_;

import static java.awt.SystemColor.text;

public class Truncate_Obrezano {
    public static String truncate(String text, int length) {
        if (text.length() > length) {
            return text.substring(0, length) + "...";
        } else {
            return text;
        }
    }

    public static void main(String[] args) {
        String originalText = "Life is nice";
        int maxLength = 7;
        String truncatedText = truncate(originalText, maxLength);
        System.out.println(truncatedText);
    }
}
/*
Давайте рассмотрим несколько способов обрезать строку в Java
и добавить в конец “…” с ссылкой на полный текст.

Используя метод substring() класса String: Метод substring()
 позволяет получить подстроку из заданной строки.
 Если указанная длина больше длины текста, мы просто возвращаем исходную строку.
  В противном случае возвращаем подстроку, начиная с индекса 0 и заканчивая (но не включая)
  символом с индексом length. Вот пример:
Java

public static String truncateUsingSubstringMethod(String text, int length) {
    if (text.length() <= length) {
        return text;
    } else {
        return text.substring(0, length) + "...";
    }
}
KI-generierter Code. Überprüfen und sorgfältig verwenden.
 Weitere Informationen zu häufig gestellten Fragen.
Используя метод split() класса String: Метод split()
 разбивает строку на части с помощью регулярного выражения.
 Мы можем использовать положительное обратное обозначение,
 чтобы совпадать с заданным количеством символов в начале строки:
Java

public static String truncateUsingSplitMethod(String text, int length) {
    String[] results = text.split("(?<=\\G.{" + length + "})");
    return results[0] + "...";
}
KI-generierter Code. Überprüfen und sorgfältig verwenden.
Weitere Informationen zu häufig gestellten Fragen.

Используя класс Pattern: Мы также можем использовать класс Pattern,
 чтобы скомпилировать регулярное выражение, которое совпадает с началом
 строки до определенного числа символов:
Java

import java.util.Optional;
import java.util.regex.Pattern;

public static String truncateUsingPattern(String text, int length) {
    Optional<String> result = Pattern.compile(".{1," + length + "}").splitAsStream(text)
            .findFirst();
    return result.orElse(text) + "...";
}
KI-generierter Code. Überprüfen und sorgfältig verwenden. Weitere Informationen zu häufig gestellten Fragen.

Теперь у вас есть несколько вариантов для обрезки строки и добавления “…” в конец.
 Вы можете выбрать тот, который лучше всего подходит для вашей задачи!
 */

