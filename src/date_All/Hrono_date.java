package date_All;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import java.time.Month;

public class Hrono_date {



        public static void main(String[] args) {
            // BEGIN
            LocalDate dateFrom = LocalDate.of(2017, Month.MAY, 24);
            LocalDate dateTo = LocalDate.of(2017, Month.JULY, 29);
            long noOfDaysBetween = ChronoUnit.DAYS.between(dateFrom, dateTo);
            System.out.println(noOfDaysBetween);
            // END
        }
    }

