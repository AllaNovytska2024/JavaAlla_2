package homeWork_10_Massiv;
/*
@date 29.05.2024
@author Alla Novytska

Задача 2
Написать метод, принимающий на вход массив строк.
 Метод должен вернуть массив, состоящий из самой короткой
 и самой длинной строки изначального массива.
 */

//


public class HomeWork_10_02_StringArrayMinMax {
    public static String[] findMinMaxStrings(String[] inputArray) {


        if (inputArray == null || inputArray.length == 0)  {
            return new String[0]; // Возвращаем пустой массив, если входной массив пуст или null
        }

        String shortest = inputArray[0];
        String longest = inputArray[0];

        for (String str : inputArray) {




            if (str.length() < shortest.length()) {
                shortest = str;
            }
            if (str.length() > longest.length()) {
                longest = str;
            }
        }

        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        String[] inputArray = {" Alla ", " ела ", " кашу ", " и ", " смотрела ", " ТВ"};
        String[] result = findMinMaxStrings(inputArray);


System.out.println(" Массив строк входящий {\" Alla \", \" ела \", \" кашу \", \" и \", \" смотрела \", \" ТВ\"} ");

        System.out.println("Короткая строка массива строк: " + result[0]);
        System.out.println("Наидлиннейшая строка массива строк : " + result[1]);
    }
}
/*
Ответ консоли-
Массив строк входящий {" Alla ", " ела ", " кашу ", " и ", " смотрела ", " ТВ"}
Короткая строка массива строк:  и
Наидлиннейшая строка массива строк :  смотрела
 */