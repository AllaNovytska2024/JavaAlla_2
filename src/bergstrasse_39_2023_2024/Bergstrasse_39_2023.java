package bergstrasse_39_2023_2024;
/*

@ data 25.04.2024
@ author Alla Novytska

Расчет оплаты за 2023 год за ГАЗ.
Для двух раздельных квартиросъемщиков, с общей оплатой за газ.
Каждый платит 50% от начисленной суммы.
Пенсионеру оплачивает 50% суммы оплаты за Газ Социаламт и перечисляет на компанию ГАЗОПОСТАВЩИК.
Работнику оплачивает 50% суммы оплаты за ГАЗ Джобцентр, начисляя суммы на банковский счет.
Работник самостоятельно переводит деньги за ГАЗ на счет ГАЗОПОСТАВЩИКА.

Нужно рассчитать поступление сумм отдельно от обоих.
Нужно посчитать как и когда были получены и перечислены суммы на счет ГАЗОПОСТАВЩИКА.
Вывести результаты начисленных, полученных на счет и оплаченных сумм каждого участника на счет ГАЗОПОСТАВЩИКА за 2023.
Вывести остаток недоплаченных или переплаченных сумм.


 */

// package Bergstrasse_39_2023;

public class Bergstrasse_39_2023 {

    public static void main(String[] args) {

        double Aug2023_Lidiia = 0;
        double Aug2023_Alla = 0;
        double summAug2023 = Aug2023_Alla + Aug2023_Lidiia;
        System.out.println(" Август 2023 Lidiia и Alla оплатили вместе : " + summAug2023+ " Euro" );

        double Sep2023_Lidiia = 0;
        double Sep2023_Alla = 83.50;
        double summSep2023 = Sep2023_Alla + Sep2023_Lidiia;
        System.out.println(" Сентябрь 2023 Lidiia и Alla оплатили вместе : " + summSep2023 + " Euro ");
        double summVsegoAvgSen = summAug2023+ summSep2023;
        System.out.println( "Сумма уплаченная за авг и сент вместе на Сентябрь 2023: " + summVsegoAvgSen + " Euro ");


        double Oct2023_Lidiia = 0;
        double Oct2023_Alla = 83.50;
        double summOct2023 = Oct2023_Alla + Oct2023_Lidiia;
        System.out.println(" Октябрь 2023 Lidiia и Alla оплатили вместе : " + summOct2023 + " Euro ");
        double summVsegoAvgSenOct = summAug2023 + summSep2023 + summOct2023;
        System.out.println( "Сумма уплаченная за авг, сен, окт вместе на Октябрь 2023: " + summVsegoAvgSenOct + " Euro ");

        double Nov2023_Lidiia = 0;
        double Nov2023_Alla = 83.50;
        double summNov2023 = Nov2023_Alla + Nov2023_Lidiia;
        System.out.println(" Ноябрь 2023 Lidiia и Alla оплатили вместе : " + summNov2023 + " Euro ");
        double summVsegoAvgSenOctNov = summAug2023 + summSep2023 + summOct2023 + summNov2023;
        System.out.println( "Сумма уплаченная за авг, сен,окт, ноя вместе на Ноябрь 2023: " + summVsegoAvgSenOctNov + " Euro ");

        double Dec2023_Lidiia = 0;
        double Dec2023_Alla = 83.50;
        double summDec2023 = Dec2023_Alla + Dec2023_Lidiia;
        System.out.println(" Декабрь 2023 Lidiia и Alla оплатили вместе : " + summDec2023 + " Euro ");
        double summVsegoAvgSenOctNovDec = summAug2023 + summSep2023 + summOct2023 + summNov2023 + summDec2023;
        System.out.println( "Сумма уплаченная за авг,сен,окт,ноя,дек вместе на Декабрь 2023: " + summVsegoAvgSenOctNovDec + " Euro ");


        double Oplata2023_priceLidiia = 668 /2;

        System.out.println( " Должна была оплатить в 2023 Социал за Lidiia:  " + Oplata2023_priceLidiia);

        double summJan2024 =668 - 634.82;
        System.out.println( " Сумма, переплаченная в 2023 и перешедшая в 2024 или необходимо вернуть : " + summJan2024);
        double minusJan2024 = 83.50 + 73;
        System.out.println( " Сумма оплаченная в январе за 2024-  " + minusJan2024);


    }
}
