

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

public class ListComparison_Delete_Id_Value_Time {


    private static Random random = new Random();
    public static void indexation(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int elem = list.get(i);
        }
    }

    public static void insertion(List<Integer> list) {
        for (int i = 0; i < 2000; i++) {
            list.add(random.nextInt(1001));
        }
    }
    public static void deletion(List<Integer> list) {
        for (int i = 0; i < 1000; i++) {
            list.remove(random.nextInt(list.size()));
        }
    }
    public static void deletionValue(List<Integer> list) {
        for (int i = 0; i < 1000; i++) {
            list.remove(Integer.valueOf(random.nextInt(1001)));
        }
    }


    public static void main(String[] args) {
        int listSize = 5000; // Создаем списки на 5_000 одинаковыми случайными значениями.
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();


        // Заполнение списков случайными значениями от 0 до 1000
        for (int i = 0; i < listSize; i++) {
            int randomValue = random.nextInt(1001);
            arrayList.add(randomValue);
            linkedList.add(randomValue);
        }

        // Метод 1: Получение всех значений элементов списка по индексу
        long startTime = System.nanoTime();
        indexation(arrayList);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Метод 1: Получение значений по индексу из массива заняло: " + duration + " нс");

        startTime = System.nanoTime();
        //indexation(linkedList);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Метод 1: Получение значений по индексу из связного списка заняло: " + duration + " нс");

        // Метод 2: Вставка 2000 новых значений по случайному индексу
        startTime = System.nanoTime();
        insertion(new ArrayList<>(arrayList));
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Метод 2: вставка элементов в массив заняло: " + duration + " нс");

        startTime = System.nanoTime();
        insertion(new LinkedList<>(linkedList));
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Метод 2: вставка элементов связного списка заняло: " + duration + " нс");


        // Метод 3: Удаление 1000 элементов по случайному индексу
        startTime = System.nanoTime();
        deletion(new ArrayList<>(arrayList));
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Метод 3: удаление элементов в массив заняло: " + duration + " нс");

        startTime = System.nanoTime();
        deletion(new LinkedList<>(linkedList));
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Метод 3: удаление элементов связного списка заняло: " + duration + " нс");


        // Метод 4: Удаление 1000 элементов по случайному значению
        startTime = System.nanoTime();
        deletionValue(new ArrayList<>(arrayList));
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Метод 4: удаление элементов по значению массив заняло: " + duration + " нс");

        startTime = System.nanoTime();
        deletionValue(new LinkedList<>(linkedList));
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Метод 4: удаление элементов по значению связного списка заняло: " + duration + " нс");

    }
}
/*
Ответ консоли:
Метод 1: Получение значений по индексу заняло 45_336_600 нс
Метод 2: Вставка новых значений заняла .......42_105_200 нс
Метод 3: Удаление по индексу заняло ..........21_063_900 нс
Метод 4: Удаление по значению заняло .........69_599_900 нс
 */