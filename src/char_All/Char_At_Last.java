package char_All;

public class Char_At_Last {
    public static void main(String[] args) {
        var text = "Never forget what you are, for surely the world will not";
        var FirstIndex = text.charAt(0);
        var LastIndex = text.length() - 1;
        var charLast = text.charAt(LastIndex); // Исправлено: использование charAt

        System.out.println("First: " + FirstIndex + "\n" + "Last: " + charLast);
    }

}
