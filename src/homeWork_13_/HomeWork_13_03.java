package homeWork_13_;

import java.util.Scanner;

/*
@ data 03.06.2024
@ author Alla Novytska

Task 3
Подсчет гласных и согласных.
Напишите программу, которая просит пользователя ввести слово и подсчитывает количество гласных и согласных букв в этом слове.
 */
public class HomeWork_13_03 {


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите слово: ");

            String input = scanner.nextLine().toLowerCase();
            // Приводим к нижнему регистру
            int glasnie = 0;
            int soglasnie = 0;

            for (char c : input.toCharArray()) {
                if (c >= 'а' && c <= 'з') { // Проверяем, что символ - буква
                    if (c == 'а' || c == 'е' || c == 'и' || c == 'о' || c == 'у' || c == 'я') {
                        glasnie ++;
                    } else {
                        soglasnie++;
                    }
                }
            }

            System.out.println("Количество гласных: " + glasnie);
            System.out.println("Количество согласных: " + soglasnie);
        }
    }

