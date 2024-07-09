package homeWork_36_Compare;
/*
@ date 04.07.2024
@ author Alla Novytska

Task 1
Напишите метод, который принимает на вход две реализации интерфейса List.
Метод должен возвращать список состоящий из элементов, которые присутствуют в обеих коллекциях.
====
Принимает два списка и возвращает новый список, содержащий общие элементы.
 */
import java.util.ArrayList;
import java.util.List;

public class List_Intersection_Integer {
    public static <T> List<T> findIntersection(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>();
        for (T item : list1) {
            if (list2.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 75, 98);
        List<Integer> list2 = List.of(3,98, 4, 5, 6, 7, -10, 75);

        List<Integer> intersection = findIntersection(list1, list2);
        System.out.println("Intersection: " + intersection);
    }
}
// Intersection: [3, 4, 5, 75, 98]