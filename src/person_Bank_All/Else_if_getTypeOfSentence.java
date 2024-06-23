package person_Bank_All;

public class Else_if_getTypeOfSentence {

    /*
    Задание
На электронной карте Вестероса, которую реализовал Сэм, союзники Старков отображены зеленым кружком, враги — красным, а нейтральные семьи — серым.

Напишите для Сэма метод whoIsThisHouseToStarks(), который принимает на вход фамилию семьи и возвращает одно из трех значений: "friend", "enemy", "neutral".

Правила определения:

Друзья ("friend"): "Karstark", "Tally"
Враги ("enemy"): "Lannister", "Frey"
Любые другие семьи считаются нейтральными
Примеры вызова:

App.whoIsThisHouseToStarks("Karstark"); // "friend"
App.whoIsThisHouseToStarks("Frey");     // "enemy"
App.whoIsThisHouseToStarks("Joar");     // "neutral"
App.whoIsThisHouseToStarks("Ivanov");   // "neutral"
     */
    public static String whoIsThisHouseToStarks(String familyName) {
        switch (familyName) {
            case "Karstark":
            case "Tally":
                return "friend";
            case "Lannister":
            case "Frey":
                return "enemy";
            default:
                return "neutral";
        }
    }

    public static void main(String[] args) {
        System.out.println(whoIsThisHouseToStarks("Karstark")); // "friend"
        System.out.println(whoIsThisHouseToStarks("Frey"));     // "enemy"
        System.out.println(whoIsThisHouseToStarks("Joar"));     // "neutral"
        System.out.println(whoIsThisHouseToStarks("Ivanov"));   // "neutral"
    }
}


