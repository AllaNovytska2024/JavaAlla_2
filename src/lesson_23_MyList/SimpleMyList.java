package lesson_23_MyList;
/*
@ date 17.06.2024
@ author Alla Novytska

 */


public class SimpleMyList {
    private Object value;

    public SimpleMyList(Object value) {
        this.value = value;
    }
    public Object getValue() {
        return value;
    }
    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SimpleMyList{" +
                "value=" + value +
                '}';
    }

}
