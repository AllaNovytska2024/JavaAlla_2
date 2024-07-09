package homeWork_36_Compare;
/*
@ date 04.07.2024
@ author Alla Novytska

Task 2
Создайте два списка. Один на реализации ArrayList, второй на LinkedList.
Заполните их 5_000 одинаковыми случайными значениями от 0 до 1_000.
Создайте 4 метода, принимающий реализацию интерфейса List.

В первом методе - получение всех значений элементов списка по его индексу.
Второй метод - вставка 2_000 новых значений по случайному индексу
(диапазон индексов от 0 до размера списка).

Третий метод - удалить 1_000 элементов по случайному индексу. (диапазон индексов от 0 до размера коллекции)
Удалить 1_000 элементов по значению (диапазон случайных значений от 0 до 10_000)
Все методы должны возвращать время, затраченное на выполнение метода в миллисекундах.

Сравните для каждого из списка время выполнения каждого метода.
И сравните время последовательного выполнения всех методов для каждой реализации List-а.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;



public class ListComparison_Delete_Id_Value_Time_II {
    public static void main(String[] args) {
        // //Создайте два списка.создаем списки
        int listSize = 5000;
        //Один на реализации ArrayList,
        List<Integer> arrayList = new ArrayList<>();
        //Второй на реализации LinkedList.
        List<Integer> linkedList = new LinkedList<>();
        Random random = new Random();

        // Заполняем списки их 5_000 одинаковыми случайными значениями от 0 до 1000.
        for (int i = 0; i < listSize; i++) {
            int randomValue = random.nextInt(1001);
            arrayList.add(randomValue);
            linkedList.add(randomValue);
        }


        //Заполните  значениями от 0 до 1_000.

        System.out.println("arrayList.size(): " + arrayList.size());
        System.out.println("linkedList.size(): " + linkedList.size());
//Создайте 4 метода, принимающий реализацию интерфейса List.
        // Метод 1: Получение всех значений элементов списка по индексу
        long startTime = System.nanoTime();
        for (int i = 0; i < listSize; i++) {
            int valueFromArrayList = arrayList.get(i);
     //       int valueFromLinkedList = linkedList.get(i);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Метод 1: Получение значений по индексу заняло: " + duration + " нс");

        // Метод 2: Вставка 2000 новых значений по случайному индексу
        startTime = System.nanoTime();
        for (int i = 0; i < 2000; i++) {
            int randomIndex = random.nextInt(listSize);
            arrayList.add(randomIndex, random.nextInt(1001));
      //      linkedList.add(randomIndex, random.nextInt(1001));
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Метод 2: Вставка новых значений заняло: " + duration + " нс");

        // Метод 3: Удаление 1000 элементов по случайному индексу
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            int randomIndex = random.nextInt(listSize);
            arrayList.remove(randomIndex);
     //       linkedList.remove(randomIndex);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Метод 3: Удаление по индексу заняло: " + duration + " нс");

        // Метод 4: Удаление 1000 элементов по случайному значению
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            int randomValue = random.nextInt(1001);
            arrayList.remove(Integer.valueOf(randomValue));
      //      linkedList.remove(Integer.valueOf(randomValue));
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Метод 4: Удаление по значению заняло: " + duration + " нс");
    }
}
/*
Ответ консоли:
Метод 1: Получение значений по индексу заняло 45_336_600 нс
Метод 2: Вставка новых значений заняла .......42_105_200 нс
Метод 3: Удаление по индексу заняло ..........21_063_900 нс
Метод 4: Удаление по значению заняло .........69_599_900 нс
 */