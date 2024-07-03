package Gr47_PR1_Realisation.src.inerface;

import Gr47_PR1_Realisation.src.inerface.model.Book;
import Gr47_PR1_Realisation.src.inerface.model.Reader;
import Gr47_PR1_Realisation.src.inerface.util.MyList;
import java.time.LocalDate;
import java.util.Optional;

public interface InterfaceLibrary {

    boolean takeBook(int id);
    boolean releaseBook(int id);

    Book createNewBook(String title, String author, int year);
    MyList<Book> findBookByTitle(String title);

    MyList<Book> findBooksByPartTitle(String partTitle);

    MyList<Book> getAllFreeBooks();
    MyList<Book> getAllBusyBook();

    Optional<Book> getBookById(int id);

    MyList<Book> getAllBooks();


    MyList<Book> getBooksByAuthor(String author);
    MyList<Book> getBooksActiveReader();
    MyList<Book> getBooksByReader(String readerName);
    MyList<Book> getBooksByStatus(boolean status);

    Reader getActiveReader();

    MyList<Reader> getAllReaders();
    Reader authorizationReader(String name, String password);
    void logout(); //**

    Reader createReader(String name, String password); //**
    Reader getReaderByBook(int bookId); //** TODO Test
    LocalDate getDateTaken(int id);
    long getBusyDaysForBook(int id);



}