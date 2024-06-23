package array_All;

public class Sum_Aray_int_2 {
/*
    Сумма четных чисел
    метод, который вычисляет сумму всех четных чисел в массиве.
 */

        public static void main(String[] args) {
            int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

            System.out.println(sumArray(testArray));
        }


        public static int sumArray(int[] array) {
            if (array == null) {
                return 0;
            }

            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) { // проверка на четность числа
                    sum += array[i];
                }
            }
            return sum;

        }
    }

