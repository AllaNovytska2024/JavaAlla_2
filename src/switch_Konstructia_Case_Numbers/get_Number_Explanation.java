package switch_Konstructia_Case_Numbers;

public class get_Number_Explanation {
    public static String getNumberExplanation(int number) {
        switch (number) {
            case 666:
                return "devil number";
            case 42:
                return "answer for everything";
            case 7:
                return "prime number";
            default:
                return "just a number";
        }
    }

    public static void main(String[] args) {
        System.out.println(getNumberExplanation(8));   // just a number
        System.out.println(getNumberExplanation(666)); // devil number
        System.out.println(getNumberExplanation(42));  // answer for everything
        System.out.println(getNumberExplanation(7));   // prime number
    }
}

/*
Решение учителя:
public class App {
    // BEGIN
    public static String getNumberExplanation(int number) {
        switch (number) {
            case 666:
                return "devil number";
            case 7:
                return "prime number";
            case 42:
                return "answer for everything";
            default:
                return "just a number";
        }
    }
    // END
}
====
Задание
Реализуйте метод getNumberExplanation(),
 который принимает на вход число и возвращает объяснение этого числа.
 Если для числа нет объяснения, то возвращается just a number.
 Объяснения есть только для следующих чисел:

666 - devil number
42 - answer for everything
7 - prime number
Примеры вызова функции:

App.getNumberExplanation(8);   // just a number
App.getNumberExplanation(666); // devil number
App.getNumberExplanation(42);  // answer for everything
App.getNumberExplanation(7);   // prime number

 */