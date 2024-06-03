package homeWork_03;
/*
@ date 20.05.2024
@ author Alla Novytska;
 */

public class HomeWork03_3 {
    public static void main(String[] args) {
        int a = 1000;
        int b= 500;
        int korgAb = (a+b);
        int discount = ( a+b)*10/100;
        int resultPay = (( a + b ) - discount);
        int payDanke = (  resultPay);
        System.out.println("Korg a+b: " + korgAb  + " EURO; -discount:  " +   discount + " EURO;  " + "payDanke: " + payDanke + " EURO."+ " VIELEN DANK!");

    }
}
