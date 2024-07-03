package array_All;

import static java.awt.SystemColor.text;

public class AgregationNumbersinString {

// metod repeat
    /*
    Агрегация применяется не только к числам, но и к строкам.

При агрегации строка формируется динамически, то есть заранее неизвестно, какого она размера
 и что будет содержать. Представьте себе метод, который умеет умножать строку —
 то есть он повторяет ее указанное количество раз:

App.repeat("hexlet", 3); // "hexlethexlethexlet"
     */

        public static String repeat (String text,int times){
            // Нейтральный элемент для строк – пустая строка
            var result = "";
            var i = 1;

            while (i <= times) {
                // Каждый раз добавляем строку к результату
                result = result + text;
                i = i + 1;
            }

            return result;
        }


    }

/*
    // Для вызова repeat("hexlet", 3);
    var result = "";
    result = result + "hexlet"; // "hexlet"
    result = result + "hexlet"; // "hexlethexlet"
    result = result + "hexlet"; // "hexlethexlethexlet"

 */
