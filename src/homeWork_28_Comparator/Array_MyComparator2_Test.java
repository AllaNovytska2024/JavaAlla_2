package homeWork_28_Comparator;
import array_All.Array_My_Comparator2;

import java.util.Comparator;


public class Array_MyComparator2_Test extends array_All.Array_My_Comparator2 {
        public static void main(String[] args) {
            Comparator<Integer> comparator = new Array_My_Comparator2();

            Integer[] intA= {2, 4, 6, 8, 9, 7, 7, 5, 3, 1};
            // Примеры тестовых данных
            int result1 = comparator.compare(2, 4); // Ожидаемый результат: -1
            int result2 = comparator.compare(4, 6 ); // Ожидаемый результат: -1
            int result3 = comparator.compare(6, 8); // Ожидаемый результат: -1
            int result4 = comparator.compare(8, 9); // Ожидаемый результат:  1
            int result5 = comparator.compare(7, 6); // Ожидаемый результат:  1
            int result6 = comparator.compare(5, 2); // Ожидаемый результат:  1
            int result7 = comparator.compare(7, 6); // Ожидаемый результат:  1




            System.out.println("Результат 1: " + result1);
            System.out.println("Результат 2: " + result2);
            System.out.println("Результат 3: " + result3);
            System.out.println("Результат 4: " + result7);
            System.out.println("Результат 5: " + result5);
            System.out.println("Результат 6: " + result6);
            System.out.println("Результат 7: " + result7);
        }
    }


