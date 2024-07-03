package cat_Repository_Service.task3.back.entity;

public class Cat {

    private int catId;
    private String name;

    public Cat(int catId, String name) {
        this.catId = catId;
        this.name = name;
    }

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catId=" + catId +
                ", name='" + name + '\'' +
                '}';
    }
}