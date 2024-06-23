package lesson_22a.printables;
/*
@date 13.06.2024
@author Alla Novytska
*/
import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

public interface Journal2 extends Printable {
    void print();

    void test();

    @Override
    int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException;
}
