package homeWork_37_Set_TreeSet;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordSorter_Set_II {
    public static void main(String[] args) {
        String testString = "тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        List<String> uniqueSortedWords = getUniqueSortedWords(testString);
        System.out.println(uniqueSortedWords);
    }

    public static List<String> getUniqueSortedWords(String input) {
        // Разбиваем строку на слова, удаляем повторения и сортируем по длине
        return Arrays.stream(input.split("\\s+"))
                .distinct()
                .sorted((word1, word2) -> {
                    int lengthComparison = Integer.compare(word1.length(), word2.length());
                    return lengthComparison != 0 ? lengthComparison : word1.compareTo(word2);
                })
                .collect(Collectors.toList());
    }
}
/*
Ответ консоли ИИ (не полное решение):
[для, слов,, строка, которые, "строка", тестовая, удаления, удаления!, повторяются.]
 */