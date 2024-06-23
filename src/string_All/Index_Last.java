package string_All;

public class Index_Last {
    public static void main(String[] args) {


        // получить индекс последнего символа в слове:

        // Индексы начинаются с нуля
        var name = "Java";
        // Вызов метода и вычитание вместе!
        var lastIndex = name.length() - 1;
        System.out.println(lastIndex); // => 3

        System.out.println(name.length() - 1); // => 3
     //   Все это справедливо для любых методов, в том числе строковых:

        var name1 = "Java";
// toUpperCase() – переводит слово в верхний регистр
        System.out.println("Привет " + name1.toUpperCase()); // => Привет JAVA
    }
}
