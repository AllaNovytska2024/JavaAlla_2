package homeWork_07_Switch_Task;

/*
@ date 24.05.2024
@ author Alla Novytska

Задача 2
Напишите программу с использованием оператора :switch

Программа просит пользователя ввести
число от 1 до 7.
Если число равно 1, выводим на консоль "Понедельник",
2 — "Вторник" и так далее.
Если 6 или 7 — "Выходной".

*/

import java.util.Random;

public class HomeWork_07_2_Swich {

    public static void main(String[] args) {

        Random random = new Random() ;

        int choice = random.nextInt(9) + 1;

        // В неделе 7 дней, однако на любой цифровой клавиатуре ввода есть 10 цифр.
        // ПОЭТОМУ  добавлено условие, чтобы показать пользователю,
        // что он выбрал несуществующий день недели и что программа не зависла.
        // Программа работает, но нужно повторить ввод цифры, соответствующей правильному дню недели.

        System.out.println("choice: " + choice);

        switch (choice) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6, 7:
                System.out.println("Выходной");
                break;

            case 8, 9, 0:
                System.out.println("Такого дня недели нет");
        }

        }


    }
