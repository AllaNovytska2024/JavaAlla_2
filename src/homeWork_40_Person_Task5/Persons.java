package homeWork_40_Person_Task5;

public class Persons {

    private String name;
    private int age;
    private String sity;

    public Persons(String name, int age, String sity) {
        this.name = name;
        this.age = age;
        this.sity = sity;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sity='" + sity + '\'' +
                '}';
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

    public String getSity() {
        return sity;
    }

    public void setSity(String sity) {
        this.sity = sity;
    }
}


