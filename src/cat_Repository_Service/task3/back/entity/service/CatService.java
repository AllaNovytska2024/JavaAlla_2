package cat_Repository_Service.task3.back.entity.service;


import cat_Repository_Service.task3.back.entity.Cat;
import cat_Repository_Service.task3.back.entity.repository.CatRepository;

public class CatService {

    private CatRepository repository;

    public CatService(CatRepository repository) {
        this.repository = repository;
    }

    public Cat createNewCat(String catName){
        // проведем проверку (валидацию) имени кота (не пустая, не содержит спецсимволы и ...)

        Cat savedCat = repository.addCat(new Cat(0,catName));

        System.out.println(savedCat);

        return savedCat;
    }


}