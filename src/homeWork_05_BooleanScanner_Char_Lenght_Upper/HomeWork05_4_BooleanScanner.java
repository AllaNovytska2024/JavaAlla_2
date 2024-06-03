package homeWork_05_BooleanScanner_Char_Lenght_Upper;
/*
@ data 22.05.2024
@ author Alla Novytska

Задача 4
Попросите пользователя ввести целое число с клавиатуры.
Ваша программа должна вывести строку в формате:
Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
Число: 3 четное: false; кратно 3: true; четное и кратное 3: false
Копировать
Проверьте работу вашей программы, вводя разные числа. Убедитесь в правильности выдаваемой строки.
 */

import java.util.Scanner;

public class HomeWork05_4_BooleanScanner {
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" В этом окне введите пожалуйста ЦЕЛОЕ ЧИСЛО: ");

        int didgital = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Вы ввели: " + didgital);

        System.out.println("Спасибо, " + " Следуйте инструкциям на экране! :)");


         boolean booldidgital =  true;
         booldidgital = false;

         booldidgital =((didgital % 3 )== 0 );

        System.out.println(" Введенное число кратно 3 : " + booldidgital);

        booldidgital = (didgital % 2== 0 );

        System.out.println(" Введенное число кратно 2 : " + booldidgital);

        booldidgital = (didgital % 2== 0 )& (didgital % 3 == 0);

        System.out.println(" Введенное число кратно и 3 и 2 :  " + booldidgital);

       /* Ответы консоли-
  В этом окне введите пожалуйста ЦЕЛОЕ ЧИСЛО:
151
Вы ввели: 151
Спасибо,  Следуйте инструкциям на экране! :)
 Введенное число кратно 3 : false
 Введенное число кратно 2 : false
 Введенное число кратно и 3 и 2 :  false

  В этом окне введите пожалуйста ЦЕЛОЕ ЧИСЛО:
300
Вы ввели: 300
Спасибо,  Следуйте инструкциям на экране! :)
 Введенное число кратно 3 : true
 Введенное число кратно 2 : true
 Введенное число кратно и 3 и 2 :  true

        */


       /*




        boolean boolVar = true;
        boolVar = false;
        boolVar = (didgital2 == didgital3);

        System.out.println(didgital2 + " == " + didgital3 + " -> " + boolVar);

        boolVar=  (didgital3 != didgital2);
        System.out.println(didgital2 + " != " + didgital3 + " -> " + boolVar);

        boolVar=  (didgital2 >= didgital3);

        System.out.println(didgital2 + " >= " + didgital3 + " -> " + boolVar);

        boolVar=  (didgital2 >= didgital3);

        System.out.println(didgital2 + " >= " + didgital3 + " -> " + boolVar);

        boolean b1 = true & true;
        b1 = (didgital3!= didgital) & (didgital2 > didgital3);
        System.out.println("true & true -> " + b1);
        // Ответ : true & true -> true

        boolean b2 = true & false;
        b2 = (didgital3 < didgital) & (didgital < didgital3);

        System.out.println("true & false -> " + b2 );
        // Ответ : true & false -> false

*/

    }
}
