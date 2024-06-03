package homeWork_05_BooleanScanner_Char_Lenght_Upper;

/*
@ data 21.05.2024
@ author Alla Novytska

Задача 2
Создайте строки:
"Ява"
"есть"
"А"
"Мощный"
"язык"
Склейте эти строки двумя разными способами, чтобы получить строку: "Java is a powerful language".
Выведите на экран получившуюся строку и её длину.
 */

public class HomeWork05_2 {


  public static void main(String[] args) {

    String a = "Java";
    String a1 = " ";
    String b = "is";
    String c = "a";
    String d = "powerful";
    String e = "language";
    System.out.println(a + a1 + b + a1 + c + a1 + d + a1 + e); // Java is a powerful language

// Вариант склеивания 1

      String concatStr = String.join(" " , a, b, c, d, e);
      System.out.println("concatStr: " + concatStr);
      // Ответ консоли - concatStr: Java is a powerful language

// Вариант склеивания 2  и добавила написание заглавными
// concatStrUpper: JAVA IS A POWERFUL LANGUAGE

    concatStr = a.concat(a1).concat(b).concat(a1).concat(c).concat(a1).concat(d).concat(a1).concat(e).toUpperCase(); // аналогично: str1 + str3
    System.out.println("concatStrUpper: " + concatStr);
    // Результат консоли - concatStrUpper: JAVA IS A POWERFUL LANGUAGE


// Длина строки   "Java is a powerful language"

    String letters = concatStr;

    int length = letters.length();
    System.out.println("letters: "+ letters.length());
    //Ответ консоли: letters: 27


    /*
    Задание 2.2
Замените в результирующей строке слово "powerful" на "super".
Создайте переменную типа с ответом на вопрос: содержит ли строка подстроку "age"?boolean
Выведите на экран значение этой переменной.
     */

    // Замена слов
String target = "Java is a powerful language";
    String output = target.replace("powerful", "super");
    System.out.println("output: " + output);
// Ответ консоли - output: Java is a super language




  }
}