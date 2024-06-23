package date_All;

import java.time.LocalDate;

// Определение метода
// Определение не вызывает и не выполняет метод
// Мы лишь говорим, что теперь такой метод существует
public class ShowCurrentDate {
    public static void main(String[] args) {

    }
    public static void showCurrentDate() {
        // Встроенный метод в Java для получения текущего времени и даты
        var currentDate = LocalDate.now();
        var text = "Today is: " + currentDate;
        System.out.println(text);
    }
}

// Вызов метода
// Обязательно указывать имя класса
// App.showCurrentDate(); // => Today is: 2021-10-25
