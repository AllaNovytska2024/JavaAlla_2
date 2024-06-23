package person_All;

public class isPensioner {

        public static boolean isPensioner(int age) {
            return age >= 60;
        }

        public static void main(String[] args) {
            System.out.println(isPensioner(75));
            System.out.println(isPensioner(18));
        }
    }

