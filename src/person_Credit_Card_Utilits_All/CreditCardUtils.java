package person_Credit_Card_Utilits_All;
/*
В этом коде мы проверяем, что входной номер карты состоит из 16 цифр,
 затем получаем последние 4 цифры и скрываем первые 12 символов с помощью звездочек.
  Вы можете изменить количество звездочек, передав второй аргумент метода getHiddenCard()
  ===
  Реализуйте метод getHiddenCard(), который принимает на вход номер кредитки (состоящий из 16 цифр)
  в виде строки и возвращает его скрытую версию, которая может использоваться на сайте для отображения.
   Если исходная карта имела номер 2034399002125581, то скрытая версия выглядит так ****5581.
    Другими словами, функция заменяет первые 12 символов, на звездочки.
    Количество звездочек регулируется вторым необязательным параметром.
   Значение по умолчанию — 4.
 */
public class CreditCardUtils {
    public static String getHiddenCard(String cardNumber, int numStars) {


        // Проверяем, что номер карты состоит из 16 цифр
        if (cardNumber == null || cardNumber.length() != 16 || !cardNumber.matches("\\d+")) {
            throw new IllegalArgumentException("Некорректный номер карты");
        }

        // Получаем последние 4 цифры номера карты
        String lastFourDigits = cardNumber.substring(12);

        // Создаем строку из звездочек
        String stars = "*".repeat(Math.max(0, numStars));

        // Скрываем первые 12 символов номера карты
        String hiddenCard = stars + lastFourDigits;

        return hiddenCard;
    }

    public static void main(String[] args) {
        System.out.println(getHiddenCard("2034399002125581", 8)); // "**5678"
        System.out.println(getHiddenCard("2034399002125581", 3)); // "***5678"
        System.out.println(getHiddenCard("20343990021255819999")); // "****5678"
        System.out.println(getHiddenCard("2034399002125581", 1)); // "*1100"
    }

    private static boolean getHiddenCard(String number) {
        return false;
    }
}