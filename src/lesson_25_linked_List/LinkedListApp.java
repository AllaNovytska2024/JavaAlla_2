package lesson_25_linked_List;

public class LinkedListApp {
    public static void main(String[] args) {

        MyLinkedList<Integer> linkedList = new MyLinkedList<>() {
            @Override
            public Integer removeFirst() {
                return 0;
/*
если нужно преобразовать строку в число?
Ну, любую строку в число преобразовать нельзя.
Но вот если строка состоит только из цифр, то все-таки можно.
Для этого есть специальный метод у класса Integer.

Выглядит эта команда так:

int x = Integer.parseInt(строка);
Где int x – это объявление целочисленной переменной x, а строка
 — это число заданное в виде строки (строка состоящая из цифр).
 String str = "123";
int number = Integer.parseInt(str);
number содержит число 123;
int number = Integer.parseInt("321");
number содержит число 321
int number = Integer.parseInt("321" + 0);
number содержит число 3210
int number = "321";
Не скомпилируется: переменная типа int, а значение типа String
 */

            }
        };

        System.out.println(linkedList);

        linkedList.add(0);
        System.out.println(linkedList);

        linkedList.addFirst(-1);
        System.out.println(linkedList);

        linkedList.add(1);
        System.out.println(linkedList);

        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);

        linkedList.addFirst(-2);
        linkedList.addFirst(-3);
        System.out.println(linkedList);

        linkedList.addAll(7, 8, 9);
        System.out.println(linkedList);

        System.out.println("linkedList.size(): " + linkedList.size());
        System.out.println("linkedList.isEmpty(): " + linkedList.isEmpty());

        System.out.println("\n ========================= \n");
        linkedList.add(-1);
        System.out.println(linkedList);

        System.out.println("linkedList.indexOf(100): " + linkedList.indexOf(100));
        System.out.println("linkedList.indexOf(-1): " + linkedList.indexOf(-1));

        System.out.println("linkedList.lastIndexOf(-1): " + linkedList.lastIndexOf(-1));

        MyLinkedList<String> stringsList = new MyLinkedList<>() {
            @Override
            public String removeFirst() {
                return "";
            }
        };

        stringsList.addAll("Java");

        System.out.println("stringsList.lastIndexOf(Java): " + stringsList.lastIndexOf("Java"));
        System.out.println("stringsList.lastIndexOfV2(Java): " + stringsList.lastIndexOfV2("Java"));


        System.out.println(linkedList);
        Integer val = linkedList.get(15);
        System.out.println(val);

        System.out.println("linkedList.lastIndexOf(-1): " + linkedList.lastIndexOf(-1));
        System.out.println(linkedList);
    }
}