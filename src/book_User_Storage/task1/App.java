package book_User_Storage.task1;

import java.util.List;

public class App {
    public static void main(String[] args) {

        // ------ создание всех необходимых классов для работы приложения ----
        BookStorage storage = new BookStorage();



        // ------- использование методов для решения каждой конкретной задачи ----
        List<Book> books = storage.createStorage();


        // ------- вывод информации пользователю -----

        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }





    }
}
