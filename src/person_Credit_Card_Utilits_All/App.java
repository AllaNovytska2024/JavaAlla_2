package person_Credit_Card_Utilits_All;

public class App {
    


    public static Object getHiddenCard(String number) {
        var actual = App.getHiddenCard("2034399002125581");

        return actual;
    }

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



}