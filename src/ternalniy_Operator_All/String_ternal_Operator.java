package ternalniy_Operator_All;

// С использованием тернарного оператора:
public class String_ternal_Operator {
    public static String convertString(String input) {
        return input.isEmpty() ? "" : (Character.isUpperCase(input.charAt(0)) ? input : new StringBuilder(input).reverse().toString());
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
===
Решение учителя:
import org.apache.commons.lang3.StringUtils;

public class App {
    // BEGIN
    public static String convertString(String str) {
        if (str.equals("")) {
            return "";
        }
        return Character.isUpperCase(str.charAt(0)) ? str : StringUtils.reverse(str);
    }
    // END
}
 */
