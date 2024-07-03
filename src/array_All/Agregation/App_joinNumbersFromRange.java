package array_All.Agregation;

public class App_joinNumbersFromRange {
    public static String joinNumbersFromRange(int start, int finish) {
        // BEGIN (write your solution here)
       
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= finish; i++) {
            result.append(i);
        }
        return result.toString();

    }

}
/*
Задание
Реализуйте метод joinNumbersFromRange(), который объединяет все числа из диапазона в строку:

App.joinNumbersFromRange(1, 1); // "1"
App.joinNumbersFromRange(2, 3); // "23"
App.joinNumbersFromRange(5, 10); // "5678910"
 */