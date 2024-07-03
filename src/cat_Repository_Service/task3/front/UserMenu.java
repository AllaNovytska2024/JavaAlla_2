package cat_Repository_Service.task3.front;

import cat_Repository_Service.task3.back.entity.service.CatService;
import cat_Repository_Service.task3.back.entity.service.PrintService;

import java.util.Scanner;



public class UserMenu {

    private CatService service;
    private PrintService printService;

    public UserMenu(CatService service, PrintService printService) {
        this.service = service;
        this.printService = printService;
    }

    public void start(){

        /*
        меню:
        1) добавление нового коты
        2) вывод информации о всех котах
        3) поиск кота по id
        4) поиск кота по имени
        ....
         */

        while (true) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя кошки: ");
            String catName = scanner.nextLine();
            service.createNewCat(catName);
            printService.printData();

        }

    }
}