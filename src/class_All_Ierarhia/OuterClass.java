package class_All_Ierarhia;

public class OuterClass {
    private static int staticOuterField = 42;
    private int instanceOuterField = 25;

    static class StaticNestedClass {
        void display() {
            System.out.println("Inside static nested class");
            System.out.println("Static outer field " + staticOuterField);
            // System.out.println("Instance outer field " + instanceOuterField); Error - нет доступа к НЕ статике
        }
    }
}