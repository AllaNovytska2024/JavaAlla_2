package main_Utilits_;

public class Sum_Massiv_Inicializi_ {

            public static int calculateSum(int[] numbers) {
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            return sum;
        }



            public static void main(String[] args) {
            int[] numbers = {1,2,3,4};
            int result = calculateSum(numbers);
            System.out.println(" Массив чисел в переменной numbers = {1,2,3,4}" );
            System.out.println(" Сумма элементов массива равна : " + result );
        }

        }



