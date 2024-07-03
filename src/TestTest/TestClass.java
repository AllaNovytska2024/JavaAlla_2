package TestTest;

public class TestClass {

    public static void main(String[] args) {
        try {
            new ABC().printStrToLowerCase();
            new ABC().setStr2("Hello");
            new ABC().printSrt2ToLowerCase();
        } catch (NullPointerException e) {
            System.out.println("FAIL");
        }
    }
}

class ABC {

    public String str = "ABC";
    public String str2;

    public ABC() {
        str = "CBA";
    }

    void printStrToLowerCase() {
        System.out.println(str.toLowerCase());
    }

    void printSrt2ToLowerCase() {
        System.out.println(str2.toLowerCase());
    }

    void setStr2(String newValue) {
        str2 = newValue;
    }
}