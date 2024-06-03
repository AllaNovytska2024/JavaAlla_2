package homeWork_13_;
/*
@ data 03.06.2024
@ author Alla Novytska

Сумма четных чисел
Напишите метод, который вычисляет сумму всех четных чисел в массиве.
 */
public class HomeWork_13_01_Sum_2 {
    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int num : numbers )
            if ( num % 2 == 0)  {
            sum += num ;

        }
        return sum;
    }



    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9};
        int result = calculateSum(num);
        System.out.println(" Массив чисел в переменной num = {1,2,3,4,5,6,7,8,9}" );
        System.out.println(" Сумма четных чисел массива  равна : " + result );
    }

}

/*
Ответ консоли-
Массив чисел в переменной num = {1,2,3,4,5,6,7,8,9}
 Сумма четных чисел массива  равна : 20

 */


