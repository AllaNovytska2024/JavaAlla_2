package lesson_24_Type_Erasure;

public class GenericClass {
    private Object value;

    public GenericClass(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}