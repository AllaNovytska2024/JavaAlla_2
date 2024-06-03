package homeWork_07_Switch_Task;

/*
@ data 24.05.2024
@ author Alla Novytska

Задача 1
Перепишите решение задачи с использованием вместо :switchif-else

Напишите программу, которая предлагает пользователю
ввести число 1, 2 или 3.
 Программа должна выводить на экран
 введенное число прописью: "Один", "Два" или "Три".

*/

import java.util.Scanner;

public class HomeWork_07_1_Switch_ {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println(" В этом окне введите пожалуйста ЧИСЛО ДНЯ НЕДЕЛИ: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Вы ввели: " + choice);

        System.out.println("Спасибо, " + " Следуйте инструкциям на экране! :)");


        if (choice == 1) {
            System.out.println("ОДИН");
        } else if (choice == 2) {
            System.out.println("ДВА");
        } else if (choice == 3) {
            System.out.println("ТРИ");
        } else if (choice == 4) {
            System.out.println("ПОВТОРИТЕ ПОПЫТКУ! ВВЕДИТЕ ЦИФРУ ОТ 1 ДО 3");
        }
    }
}



           /*

        switch (choice) {
            case 1:
                System.out.println("ОДИН");
                break;
            case 2:
                System.out.println("ДВА");
                break;
            case 3:
                System.out.println("ТРИ");
                break;

            default:
                System.out.println("ПОВТОРИТЕ ПОПЫТКУ! ВВЕДИТЕ ЦИФРУ ОТ 1 ДО 3");
        }


        System.out.println("Продолжение программы");

    }

    }*/