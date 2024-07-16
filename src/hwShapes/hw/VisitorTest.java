package hwShapes.hw;

class VisitorTest {
    static int visitors = 0;

    public static void main(String[] args) {
        System.out.println("visitors online: " + visitors++);
        System.out.println("The number of visitors is " + visitors);
        System.out.println("The number of visitors is now " + ++visitors);
    }
}