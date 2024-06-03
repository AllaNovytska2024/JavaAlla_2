package homeWork_11_Sum_v_Massive;

import java.util.Random;

/*
@date 30.05.2024
@author Alla Novytska

Задача 2
Написать метод, который находит среднее значение элементов в массиве (среднее арифметическое).
 */
public class HomeWork_11_02_ {
    public static void main(String[] args) {

        int [] numbers = new int[8];

        Random random = new Random();
        for ( int i = 0; i < numbers.length; i++ ) {
            numbers [i] = random.nextInt(11) +1 ;
            System.out.print( numbers [i] + " ; ");
        }
    }
}
