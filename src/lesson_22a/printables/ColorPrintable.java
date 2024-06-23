package lesson_22a.printables;
/*
@date 13.06.2024
@author Alla Novytska
*/

public interface ColorPrintable extends Printable{

    void colorPrint();
    // Без строки 11 интерфейс получит дефолтную реализацию метода от Printable
    void test();
}
