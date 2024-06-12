package lesson_20.animals;

public class ZooApp {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.voice();

        Cat cat = new Cat();
        cat.eat();
        cat.voice();

        Hamster hamster = new Hamster();
        hamster.voice();
        hamster.voice("Hello!");
        // переопределение методов

        Dog dog = new Dog();
        dog.voice();

    }
}
