package TestTest;




class GenericForTest<T> {

    public T value;

    public GenericForTest(T value) {
        this.value = value;

    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "";
    }
}
