package homeWork_05_BooleanScanner_Char_Lenght_Upper;
/*
@ data 21.05.2024
@ author Alla Novytska

Задача 1
Напишите программу, которая будет просить у пользователя ввести его имя с клавиатуры.
Используя , сохраните имя в переменную типа .ScannerString
Выведите на экран количество символов в имени пользователя.
Создайте две переменные типа : одна должна хранить первый символ имени, другая — последний.char
Выведите на экран десятичный код (код символа в десятичной системе счисления) первого и последнего символа имени.
 */

import java.util.Scanner;

public class HomeWork05_1_CharScannerLengthUpper {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("В этом окне введите Имя и Фамилию: ");
        String name = scanner.nextLine();

        System.out.println("Спасибо, " + name + " .Следуйте инструкциям на экране! :)");

        // Выводим количество букв в

        int length = name.length();
        System.out.println("Длина строки имени с пробелом: "+ name.length());
        //Ответ: Длина строки Имени с пробелами: 13


        //две переменные типа : одна хранит первый символ имени, другая — последний.char
        char firstChar = name.charAt(0);
        System.out.println("firstChar: " + firstChar);

        char lastChar = name.charAt(name.length() - 1);
        System.out.println("lastChar: " + lastChar);
        // Ответ-
        //firstChar: A = kod 65
        //lastChar: a = kod 97


        //Выведите на экран десятичный код (код символа в десятичной системе счисления) первого и последнего символа имени.

        System.out.println(0 + firstChar); // int + char = int
        System.out.println(0+lastChar);
        System.out.println("int из чара дал коды символов в 10 системе 'A' и 'a' в имени Alla Novytska : " + (int) firstChar + " " + (int) lastChar);

        /*
         Результат на консоли-
         В этом окне введите Имя и Фамилию:
         Alla Novytska
         Спасибо, Alla Novytska .Следуйте инструкциям на экране! :)
         Длина строки имени с пробелом: 13
         firstChar: A
         lastChar: a
         65
         97
         int из чара дал коды символов в 10 системе 'A' и 'a' в имени Alla Novytska : 65 97
         */
    }
}
