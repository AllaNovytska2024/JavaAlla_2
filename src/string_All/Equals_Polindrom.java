package string_All;



public class Equals_Polindrom {


        public static boolean isPalindrome(String s) {
            int n = s.length();
            for (int i = 0; i < (n / 2); ++i) {
                if (s.charAt(i) != s.charAt(n - i - 1)) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            String s = "Raffar";
            if (isPalindrome(s)) {
                System.out.println("Строка является палиндромом.");
            } else {
                System.out.println("Строка не является палиндромом.");
            }
        }
    }

    /*
    Второй вариант:
    import org.apache.commons.lang3.StringUtils;

public class App {
    // BEGIN
    public static boolean isPalindrome(String word) {
        var reversedWord = StringUtils.reverse(word);
        return word.equalsIgnoreCase(reversedWord);
    }
    // END
}
     */


/*
var name1 = "java".toUpperCase(); // "JAVA"
var name2 = "java".toUpperCase(); // "JAVA"
name1.equals(name2); // true
https://replit.com/@hexlet/java-basics-logical-operations

Помимо equals(), в строки встроен метод equalsIgnoreCase(),
 который выполняет проверку по значению без учета регистра:

var name1 = "java".toUpperCase(); // "JAVA"
var name2 = "java".toLowerCase(); // "java"
name1.equalsIgnoreCase(name2); // true
==============================================
Помимо equals(), в строки встроен метод equalsIgnoreCase(), который выполняет проверку по значению без учета регистра:

var name1 = "java".toUpperCase(); // "JAVA"
var name2 = "java".toLowerCase(); // "java"
name1.equalsIgnoreCase(name2); // true
Иногда сравнение строк в Java ведет себя как сравнение значений, но никогда не делайте ставку на это. При изменении кода легко забыть поправить проверку и получить ошибку. Всегда используйте методы, когда нужно сравнивать по значению.

Задание
Реализуйте метод isPalindrome(), который определяет, является ли слово палиндромом или нет. Палиндром это слово, которое читается одинаково в обоих направлениях.

App.isPalindrome("шалаш"); // true
App.isPalindrome("ага"); // true
App.isPalindrome("хекслет"); // false

// Слова в метод могут быть переданы в любом регистре
App.isPalindrome("Ага"); // true
Для определения палиндрома, необходимо перевернуть строку и сравнить ее с исходной. Для этого воспользуйтесь методом StringUtils.reverse()

StringUtils.reverse("мама"); // "амам"

==================================


 */


