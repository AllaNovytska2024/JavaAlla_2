package book_User_Storage.task1;


import java.util.ArrayList;
import java.util.List;

public class BookStorage {

    public List<Book> createStorage(){
        Book book1 = new Book(1,"123-456-789", "таинственный остров","Жуль Верн");
        Book book2 = new Book(2,"222-333-444", "20 000 лье под водой","Жуль Верн");


        List<Book> books = new ArrayList<>();

        books.add(book1);
        books.add(book2);

        return books;
    }
}