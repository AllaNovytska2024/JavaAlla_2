package array_All.printNameBySymbol;
/*
Обход строк
Циклы подходят не только для обработки чисел, но и при работе со строками.
В первую очередь благодаря возможности получить конкретный символ по его индексу.
Ниже пример кода, который распечатывает буквы каждого слова на отдельной строке:
 */

public class PrintNameBySymbol {
    public static String printNameBySymbol(String name) {
        var i = 0;

        // Такая проверка будет выполняться до конца строки
        // включая последний символ. Его индекс `length() - 1`.
        while (i < name.length()) {
            // Обращаемся к символу по индексу
            System.out.println(name.charAt(i));
            i += 1;
        }
        return name;
    }
}
/*
    var name = "Arya";
App.printNameBySymbol(name);
// "A"
// "r"
// "y"
// "a"
}

Самое главное в этом коде — поставить правильное условие в while. Это можно сделать сразу двумя способами:

i < name.length()
i <= name.length() - 1
Оба способа приводят к одному результату.
 */