package main_Utilits_;

import java.util.Arrays;

public class Main_Utils_Test {
    public static void main(String[] args) {

        int[] ints = {25, 11, 53, 16, 25, 14, 25, 11, 53, -8, 77, 0};

        Arrays_Util.sortArray(ints);

        Arrays_Util.printArray(ints);

        System.out.println(Arrays_Util.linearSearch(ints, 77));
        System.out.println(Arrays_Util.linearSearch(ints, 100));

        int[] testInts = Arrays_Util.fillTestArray(1_000_000);

//        ArraysUtil.sortArray(testInts);
        Arrays.sort(testInts);
        System.out.println("Sort done");

        System.out.println(Arrays_Util.binarySearch(ints, 100));

        System.out.println(Arrays_Util.binarySearch(testInts, 2000));
        System.out.println(Arrays_Util.linearSearch(testInts, 2000));


    }
}
