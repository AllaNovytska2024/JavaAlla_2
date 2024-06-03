import java.util.ArrayList;
import java.util.List;

public class zz____1 {
    public static void main(String[] args) {
            int[] inputArray = {0, 13, -25, 11, 31, 55, 98, 11, 5};
            int[] primeNumbers = findPrimeNumbers(inputArray);

            System.out.print("Простые числа во входном массиве: ");
            for (int prime : primeNumbers) {
                System.out.print(prime + " ");
            }
        }

        public static int[] findPrimeNumbers(int[] inputArray) {
            List<Integer> primes = new ArrayList<>();

            for (int number : inputArray) {
                if (isPrime(number)) {
                    primes.add(number);
                }
            }

            // Преобразуем List<Integer> в int[]
            int[] primeArray = new int[primes.size()];
            for (int i = 0; i < primes.size(); i++) {
                primeArray[i] = primes.get(i);
            }

            return primeArray;
        }

        public static boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }

            return true;


    }
}
