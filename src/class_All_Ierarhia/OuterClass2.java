package class_All_Ierarhia;

public class OuterClass2 {

    void myMethod() {
        class LocalInnerClass {
            void display() {
                System.out.println("Inside local inner class");
            }
        }

        LocalInnerClass localInnerObject = new LocalInnerClass();
        localInnerObject.display();
    }
}