package Person_internation_Phone_Emoji_All;

public class International_Phone {

        public static boolean isInternationalPhone(String phoneNumber) {
            return phoneNumber.startsWith("+");
        }

        public static void main(String[] args) {
            System.out.println(isInternationalPhone("89602223423")); // false
            System.out.println(isInternationalPhone("+79602223423")); // true
        }
    }

