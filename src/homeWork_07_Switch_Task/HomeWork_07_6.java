package homeWork_07_Switch_Task;

/*
@ data 24.05.2024
@ author Alla Novytska

Задача 6
Напишите программу, которая просит пользователя ввести слово "hello".
 Если пользователь вводит правильное слово, программа благодарит его и завершает работу.
  Если вводится неправильное слово, программа продолжает запрашивать ввод,
 пока не будет введено правильное слово.

Дополнительно: Подсчитайте количество попыток, потребовавшихся для ввода правильного слова,
и выведите это количество на экран.

 */

/*
public class HomeWork_07_6 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String hello = "hello";

        System.out.println("В этом окне введите слово: hello " + " Если вы введете неправильно, то у вас будет еще одна попытка. Спасибо что вы с нами :)");
        String name = scanner.nextLine();

        System.out.println("Спасибо, вы ввели слово " + name + " .Следуйте инструкциям на экране! :)");


        int length = name.length();
        System.out.println("Длина строки : " + name.length());
        //Ответ: Длина строки Имени с пробелами: 5

        //все переменные типа : одна хранит первый символ имени, другая — последний.char и т.д

        char i = 0; // 0, 1, 2, 3, 4... len-1
        while (i <= hello.length() - 1) {
            char ch = hello.charAt(i);
            System.out.println(ch + " | " + (int) ch);
            i++;


        /* Длина строки : 5
            h | 104
            e | 101
            l | 108
            l | 108
            o | 111


            int counter = 0;
            do
                System.out.println("Сколько попыток произвел пользователь: " + counter);

            number = scanner.nextInt();
                scanner.nextLine();
                counter++;
            while (number != 0 && counter < 50) ;
            {
                System.out.println("Вы ввели число с " + counter + " попытки!");
                System.out.println("Завершение программы");
                System.exit(0);

            }

            }



            }

        }

    }
                    */

