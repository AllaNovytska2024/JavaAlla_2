package cat_Repository_Service.task3.back.entity.repository;


import cat_Repository_Service.task3.back.entity.Cat;

import java.util.ArrayList;
import java.util.List;

public class CatRepository {

    private List<Cat> cats;
    private Integer catCounter = 0;

    public CatRepository() {
        this.cats = new ArrayList<>();
    }

    public Cat addCat(Cat newCat) {
        newCat.setCatId(++catCounter);
        cats.add(newCat);
        return newCat;
    }

    public List<Cat> findAll(){
        return cats;
    }

    public Cat findById(Integer id){
        for (Cat cat : cats){
            if (cat.getCatId() == id) {
                return cat;
            }
        }

        return null;
    }
}