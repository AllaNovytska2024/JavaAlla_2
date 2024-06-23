package lesson_23_MyList;
/*
@ date 17.06.2024
@ author Alla Novytska
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class SimpleMyListApp {
    public static void main(String[] args) {



        SimpleMyList list = new SimpleMyList(105);
        System.out.println(list);

        SimpleMyList list1 = new SimpleMyList(  350);

        int sum = (int) list.getValue() + (int) list1.getValue();

        System.out.println(" Сумма: " + sum);

        SimpleMyList[] lists = new  SimpleMyList[7];
        lists[0] = list;
        lists[1] = list1;
        lists[2] = new SimpleMyList( 34 );
        lists[3] = new SimpleMyList(500 );
        lists[4] = new SimpleMyList(102 );
        lists[5] = new SimpleMyList(44 );
        lists[6] = new SimpleMyList( 55 );

        int sum1 = 0;
        for (int i =0; i < lists.length; i++){
            sum1 += (int) lists[i].getValue();
        }
        System.out.println(" Сумма1: " + sum1);




        SimpleMyList listStr = new SimpleMyList(" Many ");
        System.out.println(listStr);

        SimpleMyList listStr1 = new SimpleMyList(" Cat ");
        System.out.println(listStr1);

        SimpleMyList[] listStrs = new  SimpleMyList[7];
        listStrs[0] = listStr;
        listStrs[1] = listStr1;
        listStrs[2] = new SimpleMyList(" RUN " );
        listStrs[3] = new SimpleMyList(" WITH " );
        listStrs[4] = new SimpleMyList(" MOUSE " );
        listStrs[5] = new SimpleMyList(" PLAY " );
        listStrs[6] = new SimpleMyList( " TOGETHER " );



        System.out.println();

        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(15);
        myList.add(1, 20); // Добавление элемента 20 на позицию 1
        System.out.println(myList); // Вывод: [10, 20, 15]


        List<Integer> myLinkedList = new LinkedList<>();
        myLinkedList.add(700);
        myLinkedList.add(200);
        myLinkedList.add(333);
        System.out.println(myLinkedList); // Вывод: [700, 200, 333]
    }



}
