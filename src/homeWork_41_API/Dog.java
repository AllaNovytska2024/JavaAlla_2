package homeWork_41_API;

public class Dog {
    private String name;
    private int age;
    private String color;
    private String city;

    public Dog(String name, int age, String color, String city) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
