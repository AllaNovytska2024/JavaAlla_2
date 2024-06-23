package person_Credit_Card_Utilits_All;

public class App1 {
    // BEGIN
    public static String getHiddenCard(String cardNumber, int starsCount) {
        var visibleDigitsLine = cardNumber.substring(12);
        return "*".repeat(starsCount) + visibleDigitsLine;
    }

    public static String getHiddenCard(String cardNumber) {
        return App1.getHiddenCard(cardNumber, 4);
    }
    // END
}
