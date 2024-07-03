package cat_Repository_Service.task3;

import cat_Repository_Service.task3.back.entity.repository.CatRepository;
import cat_Repository_Service.task3.back.entity.service.CatService;
import cat_Repository_Service.task3.back.entity.service.PrintService;
import cat_Repository_Service.task3.front.UserMenu;


public class App {
    public static void main(String[] args) {
        CatRepository repository = new CatRepository();
        CatService service = new CatService(repository);
        PrintService printService = new PrintService(repository);

        UserMenu menu = new UserMenu(service,printService);

        menu.start();
    }
}