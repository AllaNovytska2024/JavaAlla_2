package lesson_22a.printables;
/*
@date 13.06.2024
@author Alla Novytska
*/

import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

public class Journal implements Journal2 {
    String name;
    int number;

    public Journal(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public void print() {
        System.out.println("Journal: " + name + " #" + number);
    }

    @Override
    public void test() {
        System.out.println("Journal test overload");
    }

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        return 0;
    }
}