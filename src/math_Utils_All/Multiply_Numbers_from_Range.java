package math_Utils_All;
/*
Метод multiplyNumbersFromRange() принимает начальное и конечное значения диапазона (включая границы)
 и возвращает произведение всех чисел в этом диапазоне.
 */
public class Multiply_Numbers_from_Range {
    public static void main(String[] args) {
        System.out.println(multiplyNumbersFromRange(1, 5)); // 1 * 2 * 3 * 4 * 5 = 120
        System.out.println(multiplyNumbersFromRange(2, 3)); // 2 * 3 = 6
        System.out.println(multiplyNumbersFromRange(6, 6)); // 6
    }

    public static int multiplyNumbersFromRange(int start, int end) {
        int result = 1;
        for (int i = start; i <= end; i++) {
            result *= i;
        }
        return result;
    }
}
/*
Задание
Реализуйте метод multiplyNumbersFromRange(), который перемножает числа
в указанном диапазоне включая границы диапазона.
Пример вызова:

App.multiplyNumbersFromRange(1, 5); // 1 * 2 * 3 * 4 * 5 = 120
App.multiplyNumbersFromRange(2, 3); // 2 * 3 = 6
App.multiplyNumbersFromRange(6, 6); // 6
 */