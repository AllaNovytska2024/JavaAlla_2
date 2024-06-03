package main_Utilits_;

import java.util.Random;

public class Sum_Massiv_Random_ {

        public static void main(String[] args) {


            int [] numbers =new int[15];
            //создали массив случ.чисел из 15 элементов

            Random random = new Random();
            // заполняем случайными числами

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(100) + 1;
                System.out.println( "Числа в массиве : " +  numbers [i] + ";");
            }

            int sum =0;
            for ( int i =0; i<numbers.length; i++){
                sum += numbers[i];
            }
            System.out.println(" Получили сумму элементов массива случайных чисел  : " + sum);
        }
    }

