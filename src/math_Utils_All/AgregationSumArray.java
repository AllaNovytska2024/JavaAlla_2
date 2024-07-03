package math_Utils_All;

/*
реализация метода multiplyNumbersFromRange() на языке Java,
 который перемножает числа в указанном диапазоне:
 */

public class AgregationSumArray {
    public static void main(String[] args) {
        System.out.println(multiplyNumbersFromRange(1, 5)); // 1 * 2 * 3 * 4 * 5 = 120
        System.out.println(multiplyNumbersFromRange(2, 3)); // 2 * 3 = 6
        System.out.println(multiplyNumbersFromRange(6, 100)); // 0
        System.out.println(multiplyNumbersFromRange(2, 9)); // 362880
        System.out.println(multiplyNumbersFromRange(98, 100)); // 970200
        System.out.println(multiplyNumbersFromRange(77, 95)); // 1677787136 (-6015572218627424256 =этот результ дает закоментированный результ)
        System.out.println(multiplyNumbersFromRange(6, 6)); // 6
    }
/*
    public static long multiplyNumbersFromRange(int min, int max) {
        long result = 1;
        for (int i = min; i <= max; i++) {
            result *= i;
        }
        return result;
    }
    */

    public static int multiplyNumbersFromRange(int start, int finish) {
        if (start > finish) {
            throw new IllegalArgumentException("Start should be less than or equal to finish.");
        }

        var i = start;
        var result = 1;
        while (i <= finish) {
            result *= i;
            i++;
        }
        return result;
    }
    /*
   Выше- реализует функцию multiplyNumbersFromRange, которая умножает все числа в заданном диапазоне.
   Вот небольшое объяснение:

Вы начинаете с инициализации переменных i и result.
Затем вы используете цикл while, чтобы перемножить все числа от start до finish.
В каждой итерации цикла вы умножаете текущее значение result на i и увеличиваете i на 1.
После завершения цикла вы возвращаете result.
Единственное, что я бы порекомендовал, это добавить проверку на случай, если start больше finish.
В этом случае можно вернуть 0 или бросить исключение, чтобы избежать некорректных результатов.

Выше незакоментированный пример с добавленной проверкой:
     */

}
/*
Метод multiplyNumbersFromRange() использует цикл for, чтобы перемножить все числа
 в заданном диапазоне, включая границы.

 */



