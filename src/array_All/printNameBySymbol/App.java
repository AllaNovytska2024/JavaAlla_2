package array_All.printNameBySymbol;

import book_User_Storage.task1.task2.UserService;

import static array_All.printNameBySymbol.PrintNameBySymbol.printNameBySymbol;

public class App {
    public static void main(String[] args) {
        var name = "Arya";
       PrintNameBySymbol printNameBySymbol = new PrintNameBySymbol();


        System.out.println(printNameBySymbol(name));



    }
}