package TestTest;

public class App {


    public static void main(String[] args) {


        try {
            GenericForTest<String> genericOne;
            genericOne = new GenericForTest("Hello");
            GenericForTest<StringBuilder> genericTwo;
            genericTwo = new GenericForTest<>(new StringBuilder("World"));

            String stringOne = genericOne.getValue();
            String stringTwo = genericTwo.toString();
            System.out.println(stringOne + " " + stringTwo);
        } catch (Exception e) {
            System.out.println("FAIL");
        }

    }
}
