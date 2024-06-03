package homeWork_08_Scan_Sum_Array_doWhile;
/*
@ data 25.05.2024
@  author ALLA NOVYTSKA

Задача 3
Создать массив целых чисел произвольной длины от 5 до 15. Заполнить массив случайными значениями от -50 до 50.

Вывести на экран:

Минимальное значение в массиве
Максимальное значение в массиве
Среднее арифметическое всех значений в массиве

 */
public class HomeWork_08_03_Array_ {
    public static void main(String[] args) {

        int[] array;
        int[] numbers = new int[]{10, 15, 20, 25, 30, 40, 50, 120, 1, 44};

        System.out.println(numbers);

        System.out.println(" На экране числа явной инициализации : 10, 15,20,25,30,40,50,120,1,44 ");

        int c = numbers[5];

        System.out.println(" В ячейке хранится число : " + c);


        int min = numbers[0];

        while (c < numbers.length) {
            if (numbers[c] < min) {
                min = numbers[c];
            }
            c++;
        }

        System.out.println("min значение в массиве: " + min);

        System.out.println("----------------- ");

        int max = numbers[0];

        while (c > numbers.length) {
            if (numbers[c] > max) {
                max = numbers[c];
            }
            c++;
        }
        System.out.println("max значение в массиве: " + max);
    }
// Не понимаю- что не так, почему не пропускает компиляцию дальше?


    }


