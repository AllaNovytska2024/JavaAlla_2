package math_Utils_All;


public class MathUtils {



    public static int sumOfInts(int x, int... ints) {
        int sum = x;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }


        return sum;
    }

}