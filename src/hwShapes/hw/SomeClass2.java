package hwShapes.hw;

class SomeClass2 {
    public static void main(String[] args) {
        int value = 0;
        boolean t = true;
        boolean f = false, b;
        b = t | (value++ == 0);
        b = f | ((value += 3) > 0);
        System.out.println(value);
    }
}