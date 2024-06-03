public class String_Array_Min_Max {


        public static String[] findMinMaxStrings(String[] inputArray) {
            if (inputArray == null || inputArray.length == 0) {
                return new String[0]; // Возвращаем пустой массив, если входной массив пуст или null
            }

            String shortest = inputArray[0];
            String longest = inputArray[0];

            for (String str : inputArray) {
                if (str.length() < shortest.length()) {
                    shortest = str;
                }
                if (str.length() > longest.length()) {
                    longest = str;
                }
            }

            return new String[]{shortest, longest};
        }

        public static void main(String[] args) {
            String[] inputArray = {"apple", "banana", "grape", "kiwi", "orange"};
            String[] result = findMinMaxStrings(inputArray);

            System.out.println("Shortest string: " + result[0]);
            System.out.println("Longest string: " + result[1]);
        }
    }

