

public class zz_28_05 {

    public static void  reverse(int[] arr) {
        int n = arr.length;
        int[] reversedArray = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            reversedArray[j - 1] = arr[i];
            j = j - 1;
        }
        System.out.println("Reversed array is:");
        for (int k = 0; k < n; k++) {
            System.out.print(reversedArray[k] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 6, 7};
        reverse(arr);
    }
}
