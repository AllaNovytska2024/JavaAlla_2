package homeWork_37_Set_TreeSet;

import java.util.*;

/*
@ data 05.07.2024
@ author Alla Novytska

Task 1
Напишите метод, принимающий строку и возвращающий
Список ее слов без повторений,
отсортированный в порядке увеличения длин слов.

Если строки имеют одинаковую длину
- сортировать в естественном порядке

public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(StringUtil.getUniqueSortedWords(testString));
    }
Copy
// Output:
[для, слов, строка, которые, Тестовая, удаления, повторяются]
 */


import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;


public class WordSorter_Set_String_Alla {
    //метод, который принимает список (List) и возвращает список, состоящий только из уникальных элементов этого списка
    public static <T> List<T> getUniqueList(List<T> list) {
        // получить set, состоящий из уникальных элементов списка
        Set<T> set = new LinkedHashSet<>(list);
        // вернуть новый список, содержащий все элементы сет-а
        return new ArrayList<>(set);

    }
    public static void main(String[] args) {

        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";

        List<String> startValues = List.of("Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!");
        System.out.println(startValues);

        Set<String> strings = new HashSet<>(startValues);
        System.out.println("Не поддерживает порядок добавления элементов strings set: " + strings);


        Set<String> linkedSet1 = new LinkedHashSet<>(startValues);

     //   System.out.println("Сохраняет порядок добавления элементов strings linked set: " + LinkedSet1 );

        SortedSet<String> treeSet1 = new TreeSet<>(startValues); // Естественный порядок сортировки. Будут добавлены все уникальные элементы из коллекции
        System.out.println("*Естественный порядок сортировки. \n*Будут добавлены все уникальные элементы из коллекции \n в treeSet1: " + treeSet1);

        System.out.println("start Values: " + startValues);
        List<String> resultList = getUniqueList(startValues);
        System.out.println("result: " + resultList);







    }



}
/*
    Контракт между hashCode() и equals()
    1. Если два объекта равны по методу equals, то их хеш-коды тоже должны быть равны
    2. Если хеш-коды двух объектов различны, то объекты точно не равны между собой.
    (Обратное не всегда верно - разные объекты могут иметь одинаковый хеш-код - коллизия)
     */