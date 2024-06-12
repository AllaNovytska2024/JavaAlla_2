package homeWork_16_Dog_Jump_Calculator;

import java.util.Scanner;

/*
@ date 06.05.2024
@ author Alla Novytska

Task 1
Класс "Калькулятор" Создайте класс Calculator,
который будет предоставлять базовые арифметические операции:
сложение, вычитание, умножение и деление.
Класс должен содержать: Статические методы для каждой операции,
 принимающие два аргумента и возвращающие результат операции.
 */
public class HomeWork_16_01_Calculator {
        static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int num1 = getInt();
            int num2 = getInt();
            char operation = getOperation();
            int result = calc(num1, num2, operation);
            System.out.println("Результат операции: " + result);
        }

        public static int getInt() {
            System.out.println("Введите число:");
            int num;
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
            } else {
                System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
                scanner.next(); // рекурсия
                num = getInt();
            }
            return num;
        }

        public static char getOperation() {
            System.out.println("Введите операцию (+, -, *, /):");
            char operation;
            if (scanner.hasNext()) {
                operation = scanner.next().charAt(0);
            } else {
                System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
                scanner.next(); // рекурсия
                operation = getOperation();
            }
            return operation;
        }

        public static int calc(int num1, int num2, char operation) {
            int result;
            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Деление на ноль недопустимо. Повторите ввод.");
                        result = calc(num1, num2, getOperation()); // рекурсия
                    }
                    break;
                default:
                    System.out.println("Операция не распознана. Повторите ввод.");
                    result = calc(num1, num2, getOperation()); // рекурсия
            }
            return result;
        }
    }