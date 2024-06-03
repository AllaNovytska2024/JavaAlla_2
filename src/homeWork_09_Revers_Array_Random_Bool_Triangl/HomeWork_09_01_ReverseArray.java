package homeWork_09_Revers_Array_Random_Bool_Triangl;
/*
@date 27.05.2024
@author Alla Novytska

Задача 1
Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.

{1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]
Копировать
Перегрузить метод, если в него приходит индекс, то часть массива слева до этого индекса распечатывается в обычном порядке, а начиная с этого индекса в обратном:

{1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]
Копировать
Еще одна перегрузка: метод принимает массив и булевый флаг. Если флаг == true -> печатает массив в обратном порядке Если флаг == false -> печатает массив в прямом порядке


 */

public class HomeWork_09_01_ReverseArray {
    static void reverse(int[] arr) {
        int n = arr.length;
        int[] reversedArray = new int[n];
        for (int i = 0; i < n; i++) {
            reversedArray[n - i - 1] = arr[i];
        }
        System.out.println("Reversed array is:");
        for (int k = 0; k < n; k++) {
            System.out.print(reversedArray[k] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 6, 7};
        reverse(arr);
    }
}
/*

Ответ консоли:
Reversed array is:
7 6 3 4 1
 */
