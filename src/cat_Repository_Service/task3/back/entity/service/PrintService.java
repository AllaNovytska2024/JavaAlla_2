package cat_Repository_Service.task3.back.entity.service;


import cat_Repository_Service.task3.back.entity.Cat;
import cat_Repository_Service.task3.back.entity.repository.CatRepository;

public class PrintService {

    private CatRepository repository;

    public PrintService(CatRepository repository) {
        this.repository = repository;
    }

    public void printData(){
        System.out.println("Список кошек и котов:");
        for (Cat cat : repository.findAll()){
            System.out.println("catId = " + cat.getCatId() + " Имя кошки / кота: " + cat.getName());
        }
    }
}