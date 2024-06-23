package lesson_23_MyList;
/*
@ date 17.06.2024
@ author Alla Novytska

 */

import lesson_23_generics.TestGen;

public class TestMyListGen <K,V> {

    private K key;
    private V value;

    public TestMyListGen(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "TestMyListGen{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public static void main(String[] args) {
        TestGen<Integer, String> testGen = new TestGen<>(4500, "Cat and Dog");
        int key = testGen.getKey();
        String value = testGen.getValue();
    }
}

