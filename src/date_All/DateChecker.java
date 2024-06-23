package date_All;

import java.time.LocalDate;




    public class DateChecker {
        public static void main(String[] args) {
            System.out.println(notToday("2012-11-25")); // false
            System.out.println(notToday("2013-11-25")); // true
            System.out.println(notToday("2013-09-01")); // true
        }

        public static boolean notToday(String dateStr) {
            LocalDate currentDate = LocalDate.now();
            LocalDate inputDate = LocalDate.parse(dateStr);

            return !inputDate.isEqual(currentDate);

        }

    }
/*
В этом примере мы сначала получаем текущую дату с помощью LocalDate.now(),
а затем сравниваем её с переданной датой.
Если они не равны, то дата не сегодняшняя.
==========
Реализуйте метод notToday(), который проверяет что переданная дата это не сегодняшнее число:

// предположим сегодня 2012-11-25
notToday("2012-11-25"); // false
notToday("2013-11-25"); // true
notToday("2013-09-01"); // true
Для получения текущей даты в виде строки: LocalDate.now().toString().

====
import java.time.LocalDate;

public class App {
// BEGIN (write your solution here)
public static boolean notToday(String date){

var datenow = LocalDate.now().toString();
return !(datenow.equals(date));

}
// END
}
 */
