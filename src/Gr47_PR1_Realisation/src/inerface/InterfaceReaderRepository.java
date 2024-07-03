package Gr47_PR1_Realisation.src.inerface;

import Gr47_PR1_Realisation.src.inerface.model.Book;
import Gr47_PR1_Realisation.src.inerface.model.Reader;
import Gr47_PR1_Realisation.src.inerface.util.MyList;


public interface InterfaceReaderRepository {

    MyList<Reader> getAllReaders();
    Reader getReaderByEmail(String name);
    void save(Reader reader); //**
    boolean isReaderEmailExist(String name);
    void takeBook(Book book, Reader reader);
    void releaseBook(Book book, Reader reader);
}