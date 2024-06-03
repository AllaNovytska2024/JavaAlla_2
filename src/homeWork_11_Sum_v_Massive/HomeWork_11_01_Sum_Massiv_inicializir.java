package homeWork_11_Sum_v_Massive;
/*
@date 30.05.2024
@author Alla Novytska

Задача 1
Написать метод, который считает сумму всех элементов в массиве.
 */

public class HomeWork_11_01_Sum_Massiv_inicializir {

    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }



    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        int result = calculateSum(numbers);
        System.out.println(" Массив чисел в переменной numbers =  {1, 2, 3, 4}" );
        System.out.println(" Сумма элементов массива равна : " + result);
    }
}

