import java.util.Scanner;

public class Scanner_Langht {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" В этом окне введите фразу: ");

        String string = scanner.nextLine();
        System.out.println(" Спасибо, вы ввели фразу: " + string);

        // далее пробуем распечатать наклейки с нумерацией по типу Task1, Task2, ...

        int length = string.length();

        System.out.println("Длина строки : " + string.length());


        //Ответ: Длина строки Имени с пробелами: ____

        char lastChar = string.charAt(string.length() - 1);
        System.out.println("lastChar: " + lastChar);


    }
}
