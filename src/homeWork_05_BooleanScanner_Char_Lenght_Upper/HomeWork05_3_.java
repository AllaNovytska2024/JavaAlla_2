package homeWork_05_BooleanScanner_Char_Lenght_Upper;

import java.util.Scanner;

/*
@ data 24.05.2024
@ author Alla Novytska

Задача 3* (Опционально)
Попросите пользователя ввести строку чётной длины с клавиатуры.
Распечатайте два средних символа строки.
Например:

Для строки "string" результат будет "ri".
Для строки "code" результат будет "od".
Для строки "Practice" результат будет "ct".

 */




public class HomeWork05_3_
{
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        String word;
            System.out.println( " Введите слово или фразу! ");

        word = scanner.nextLine().toUpperCase();
            System.out.println( " Спасибо, вы ввели слово или фразу-  " + word);


        int index1 = word.length() / 2 - 1;
        System.out.println("Здесь вывело две средние буквы слова или фразы: " + word.charAt(index1) + word.charAt(index1 + 1));


/*
Ответ консоли-
Введите слово или фразу!
Я люблю тебя жизнь и надеюсь, что это взаимно! :)
 Спасибо, вы ввели слово или фразу-  Я ЛЮБЛЮ ТЕБЯ ЖИЗНЬ И НАДЕЮСЬ, ЧТО ЭТО ВЗАИМНО! :)
Здесь вывело две средние буквы слова или фразы: ДЕ

 */



    }
}
