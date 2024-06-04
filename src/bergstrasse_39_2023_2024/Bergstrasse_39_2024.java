package Bergstrasse_39_2023_2024;
/*
@ data 25.05.2024
@ author ALLA NOVYTSKA

Расчет оплаты за 2024 год за ГАЗ.
Для двух раздельных квартиросъемщиков, с общей оплатой за газ.
Каждый платит 50% от начисленной суммы.
Пенсионеру оплачивает 50% суммы оплаты за Газ Социаламт и перечисляет на компанию ГАЗОПОСТАВЩИК.
Работнику оплачивает 50% суммы оплаты за ГАЗ Джобцентр, начисляя суммы на банковский счет.
Работник самостоятельно переводит деньги за ГАЗ на счет ГАЗОПОСТАВЩИКА.

Нужно рассчитать поступление сумм отдельно от обоих.
Нужно посчитать как и когда были получены и перечислены суммы на счет ГАЗОПОСТАВЩИКА.
Вывести результаты начисленных, полученных на счет и оплаченных сумм каждого участника на счет ГАЗОПОСТАВЩИКА за 2024.
Вывести остаток недоплаченных или переплаченных сумм.
 */
public class Bergstrasse_39_2024  {
        public static void main(String[] args) {
            double Jan_2024_Lidiia = 83.50 + 73.00;
            double Jan_2024_Alla = 0;
            double summ_Jan_2024_opl = Jan_2024_Alla + Jan_2024_Lidiia;
            System.out.println(" Январь 2024 Lidiia и Alla оплатили вместе включая 73,00 свет,газ : " + summ_Jan_2024_opl+ " Euro" );

            double Feb_2024_Lidiia = 83.50;
            double Feb_2024_Alla = 0;
            double summ_Feb_2024_opl = Feb_2024_Alla + Feb_2024_Lidiia;
            System.out.println(" Февраль 2024 Lidiia и Alla оплатили вместе газ : " + summ_Feb_2024_opl+ " Euro" );

            double Mar_2024_Lidiia = 83.50;
            double Mar_2024_Alla = 0;
            double summ_Mar_2024_opl = Mar_2024_Alla + Mar_2024_Lidiia;
            System.out.println(" Март 2024 Lidiia и Alla оплатили вместе газ : " + summ_Mar_2024_opl + " Euro" );

            double Apr_2024_Lidiia = 83.50;
            double Apr_2024_Alla = 160.00;
            double summ_Apr_2024_opl = Apr_2024_Alla + Apr_2024_Lidiia;
            System.out.println(" Апрель 2024 Lidiia и Alla оплатили вместе газ : " + summ_Apr_2024_opl + " Euro" );

            double May_2024_Lidiia = 82.50;
            double May_2024_Alla = 0;
            double summ_May_2024_opl = May_2024_Alla + May_2024_Lidiia;
            System.out.println(" Май 2024 Lidiia и Alla оплатили вместе газ : " + summ_May_2024_opl + " Euro" );

            double Jun_2024_Lidiia = 0;
            double Jun_2024_Alla = 0;
            double summ_Jun_2024_opl = Jun_2024_Alla + Jun_2024_Lidiia;
            System.out.println(" Июнь 2024 Lidiia и Alla оплатили вместе газ : " + summ_Jun_2024_opl + " Euro" );

            double Jul_2024_Lidiia = 0;
            double Jul_2024_Alla = 0;
            double summ_Jul_2024_opl = Jul_2024_Alla + Jul_2024_Lidiia;
            System.out.println(" Июль 2024 Lidiia и Alla оплатили вместе газ : " + summ_Jul_2024_opl + " Euro" );

            double Aug_2024_Lidiia = 0;
            double Aug_2024_Alla = 0;
            double summ_Aug_2024_opl = Aug_2024_Alla + Aug_2024_Lidiia;
            System.out.println(" Август 2024 Lidiia и Alla оплатили вместе : " + summ_Aug_2024_opl + " Euro" );

            double Sep_2024_Lidiia = 0;
            double Sep_2024_Alla = 0;
            double summ_Sep_2024_opl = Sep_2024_Alla + Sep_2024_Lidiia;
            System.out.println(" Сентябрь 2024 Lidiia и Alla оплатили вместе : " + summ_Sep_2024_opl + " Euro ");

            double Oct_2024_Lidiia = 0;
            double Oct_2024_Alla = 0;
            double summ_Oct_2024_opl = Oct_2024_Alla + Oct_2024_Lidiia;
            System.out.println(" Октябрь 2024 Lidiia и Alla оплатили вместе : " + summ_Oct_2024_opl + " Euro ");

            double Nov_2024_Lidiia = 0;
            double Nov_2024_Alla = 0;
            double summ_Nov_2024_opl = Nov_2024_Alla + Nov_2024_Lidiia;
            System.out.println(" Ноябрь 2024 Lidiia и Alla оплатили вместе : " + summ_Nov_2024_opl + " Euro ");

            double Dec_2024_Lidiia = 0;
            double Dec_2024_Alla = 0;
            double summ_Dec_2024_opl = Dec_2024_Alla + Dec_2024_Lidiia;
            System.out.println(" Декабрь 2024 Lidiia и Alla оплатили вместе : " + summ_Dec_2024_opl + " Euro ");

            double summVsego_jan_do_dec_2024 = summ_Jan_2024_opl + summ_Feb_2024_opl + summ_Mar_2024_opl + summ_Apr_2024_opl + summ_May_2024_opl + summ_Jun_2024_opl + summ_Jul_2024_opl + summ_Aug_2024_opl + summ_Sep_2024_opl + summ_Oct_2024_opl + summ_Nov_2024_opl + summ_Dec_2024_opl;
            System.out.println( "*** Сумма уплаченная за янв, фев, мар, апр, май, июн, июл, авг,сен,окт,ноя,дек вместе на Декабрь 2024: " + summVsego_jan_do_dec_2024 + " Euro ***");




            double Oplata2023_priceLidiia = 668 /2;

            System.out.println( " Должна была оплатить в 2023 Социал за Lidiia:  " + Oplata2023_priceLidiia);

            double summJan2024 = 668 - 634.82;
            System.out.println( " Сумма, переплаченная в 2023 и перешедшая в 2024 или необходимо вернуть : " + summJan2024);



            double minusJan2024 = 83.50 + 73;
            System.out.println( " Сумма оплаченная в январе за 2024-  " + minusJan2024);

            double summOstat2023 = summJan2024 + minusJan2024;
            System.out.println( " Сумма переплаты в 2023 + сумма января 83,50 +73,00 електрОшибка: " + summOstat2023);



        }
    }





