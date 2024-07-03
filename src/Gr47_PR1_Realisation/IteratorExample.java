package Gr47_PR1_Realisation;/*
@date 06.03.2024
@author Sergey Bugaienko
*/


import Gr47_PR1_Realisation.src.inerface.util.MyLinkedList;
import Gr47_PR1_Realisation.src.inerface.util.MyList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        MyList<Integer> list = new MyLinkedList<>();
        list.addAll(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value);
        }

        for (Integer value: list){
            System.out.println(value);
        }
    }
}