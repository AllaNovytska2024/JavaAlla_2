public class Delenie5_Counter_7 {

    public static void main(String[] args) {

        int count = 0;
        int number = 1;

        while (count < 7) {
            if (number % 5 == 0) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}

    /*
    Ответ консоли-
5
10
15
20
25
30
35

     */




