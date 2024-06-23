package ternalniy_Operator_All;
//С использованием обычного if-else:
public class String_if_else {
    public static String convertString(String input) {
        if (input.isEmpty()) {
            return ""; // Возвращаем пустую строку, если входная строка пуста
        }

        char firstChar = input.charAt(0);
        if (Character.isUpperCase(firstChar)) {
            return input; // Возвращаем исходную строку, если первая буква заглавная
        } else {
            return new StringBuilder(input).reverse().toString(); // Переворачиваем строку, если первая буква не заглавная
        }
    }

    public static void main(String[] args) {
        System.out.println(convertString("Hello")); // "Hello"
        System.out.println(convertString("hello")); // "olleh"
        System.out.println(convertString("")); // ""
    }
}
/*
Оба варианта выполняют требуемые действия: переворачивают строку,
если первая буква не заглавная, и возвращают исходную строку,
если первая буква заглавная.
 */
