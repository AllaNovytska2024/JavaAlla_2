package homeWork_13_;

import java.util.Random;

/*
@ data 03.06.2024
@ author Alla Novytska

Task 2
Найти второе по величине число в массиве
Напишите метод, который находит второе по величине число в массиве целых чисел.
 */
public class HomeWork_13_02_mAx_z {
    public static void main(String[] args) {




    //Создать массив из 10 целых чисел и заполнить его случайным значениями от 0..100;
    Random random = new Random();

    int[] nums = new int[10];

        int i = 0;

        System.out.print("[");
        while (i < nums.length) {
        nums[i] = random.nextInt(101);
        System.out.print(nums[i] + ((i != nums.length -1) ? ", " : "]"));
        i++;
    }
        System.out.println();

    // Найти максимальное значение в массиве

    int c = 0;
    int max = nums[0];

        while (c < nums.length) {
        if (nums[c] > max) {
            max = nums[c];
        }
        c++;
    }

        System.out.println(" max значение в массиве: " + max);
int c max


}
 }

 /*
 Ответ консоли-

[12, 74, 62, 26, 56, 80, 31, 20, 77, 17]
 max значение в массиве: 80

  */