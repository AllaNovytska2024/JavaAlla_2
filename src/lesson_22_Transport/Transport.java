package lesson_22_Transport;

/*
@date 13.06.2024
@author Alla Novytska
*/

public abstract class Transport {

    protected int capacity;

    public Transport(int capacity) {
        this.capacity = capacity;
    }

    abstract void takePassenger();

    public int getCapacity() {
        return capacity;
    }
}
