package string_All;
 // рабочая
/*
            String input = "heXlet";
            var capitalized = input.substring(0, 1).toUpperCase()+ input.substring(1).toLowerCase();
        System.out.println(capitalized); => Hexlet
 */

public class CapitalizeWords {
    public static void main(String[] args) {
        String input = "heXlet";
        String output = capitalizeWords(input);
        System.out.println(output); // Выведет "Hexlet"
    }

    public static String capitalizeWords(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder result = new StringBuilder();
        String[] words = input.split("\\s+"); // Разделяем строку на слова по пробелам

        for (String word : words) {
            if (!word.isEmpty()) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                String restOfWord = word.substring(1).toLowerCase();
                result.append(firstChar).append(restOfWord).append(" ");
            }
        }

        return result.toString().trim(); // Удаляем лишний пробел в конце
    }
}