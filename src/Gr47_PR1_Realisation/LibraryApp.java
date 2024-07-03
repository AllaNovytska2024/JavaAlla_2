package Gr47_PR1_Realisation;
/*
@date 01.03.2024
@author Sergey Bugaienko
*/


import Gr47_PR1_Realisation.src.inerface.repository.BookRepository;
import Gr47_PR1_Realisation.src.inerface.repository.ReaderRepository;
import Gr47_PR1_Realisation.src.inerface.service.LibraryService;



public class LibraryApp {
    public static void main(String[] args) {

        BookRepository bookRepository = new BookRepository();
        ReaderRepository readerRepository = new ReaderRepository();

        LibraryService service = new LibraryService(bookRepository, readerRepository);

        view.Menu menu = new view.Menu(service);
        menu.run();

    }


}